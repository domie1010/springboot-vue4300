<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
	  style="background: transparent;"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="员工工号" prop="yuangonggonghao">
          <el-input v-model="ruleForm.yuangonggonghao" readonly              placeholder="员工工号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="员工姓名" prop="yuangongxingming">
          <el-input v-model="ruleForm.yuangongxingming"               placeholder="员工姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='yuangong'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yuangongxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='yuangong'"  label="部门" prop="bumen">
          <el-select v-model="ruleForm.bumen"  placeholder="请选择部门">
            <el-option
                v-for="(item,index) in yuangongbumenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="职位" prop="zhiwei">
          <el-input v-model="ruleForm.zhiwei"               placeholder="职位" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item  v-if="flag=='yuangong'" label="入职时间" prop="ruzhishijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.ruzhishijian" 
                type="date"
                placeholder="入职时间">
            </el-date-picker> 
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yuangong'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      yuangongxingbieOptions: [],
      yuangongbumenOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.yuangongxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/bumenxinxi/bumenmingcheng`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yuangongbumenOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    onUpdateHandler() {
      if((!this.ruleForm.yuangonggonghao)&& 'yuangong'==this.flag){
        this.$message.error('员工工号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'yuangong'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.yuangongxingming)&& 'yuangong'==this.flag){
        this.$message.error('员工姓名不能为空');
        return
      }
      if( 'yuangong' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
      if( 'yuangong' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
      if( 'yuangong' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
