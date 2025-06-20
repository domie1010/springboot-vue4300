<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="产品编号" prop="chanpinbianhao">
          <el-select :disabled="ro.chanpinbianhao" @change="chanpinbianhaoChange" v-model="ruleForm.chanpinbianhao" placeholder="请选择产品编号">
            <el-option
                v-for="(item,index) in chanpinbianhaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.chanpinbianhao" label="产品编号" prop="chanpinbianhao">
              <el-input v-model="ruleForm.chanpinbianhao" 
                placeholder="产品编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="产品名称" prop="chanpinmingcheng">
          <el-input v-model="ruleForm.chanpinmingcheng" 
              placeholder="产品名称" clearable  :readonly="ro.chanpinmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="产品名称" prop="chanpinmingcheng">
              <el-input v-model="ruleForm.chanpinmingcheng" 
                placeholder="产品名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="产品类型" prop="chanpinleixing">
          <el-input v-model="ruleForm.chanpinleixing" 
              placeholder="产品类型" clearable  :readonly="ro.chanpinleixing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="产品类型" prop="chanpinleixing">
              <el-input v-model="ruleForm.chanpinleixing" 
                placeholder="产品类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="生产数量" prop="shengchanshuliang">
          <el-input v-model="ruleForm.shengchanshuliang" 
              placeholder="生产数量" clearable  :readonly="ro.shengchanshuliang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="生产数量" prop="shengchanshuliang">
              <el-input v-model="ruleForm.shengchanshuliang" 
                placeholder="生产数量" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="产品特色" prop="chanpintese">
          <el-input v-model="ruleForm.chanpintese" 
              placeholder="产品特色" clearable  :readonly="ro.chanpintese"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="产品特色" prop="chanpintese">
              <el-input v-model="ruleForm.chanpintese" 
                placeholder="产品特色" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="产品规格" prop="chanpinguige">
          <el-input v-model="ruleForm.chanpinguige" 
              placeholder="产品规格" clearable  :readonly="ro.chanpinguige"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="产品规格" prop="chanpinguige">
              <el-input v-model="ruleForm.chanpinguige" 
                placeholder="产品规格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="适用范围" prop="shiyongfanwei">
          <el-input v-model="ruleForm.shiyongfanwei" 
              placeholder="适用范围" clearable  :readonly="ro.shiyongfanwei"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="适用范围" prop="shiyongfanwei">
              <el-input v-model="ruleForm.shiyongfanwei" 
                placeholder="适用范围" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="工艺名称" prop="gongyimingcheng">
          <el-select :disabled="ro.gongyimingcheng" v-model="ruleForm.gongyimingcheng" placeholder="请选择工艺名称">
            <el-option
                v-for="(item,index) in gongyimingchengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="工艺名称" prop="gongyimingcheng">
	      <el-input v-model="ruleForm.gongyimingcheng"
                placeholder="工艺名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="工序名称" prop="gongxumingcheng">
          <el-select :disabled="ro.gongxumingcheng" @change="gongxumingchengChange" v-model="ruleForm.gongxumingcheng" placeholder="请选择工序名称">
            <el-option
                v-for="(item,index) in gongxumingchengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.gongxumingcheng" label="工序名称" prop="gongxumingcheng">
              <el-input v-model="ruleForm.gongxumingcheng" 
                placeholder="工序名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="登记时间" prop="dengjishijian">
          <el-input v-model="ruleForm.dengjishijian" 
              placeholder="登记时间" clearable  :readonly="ro.dengjishijian"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="登记时间" prop="dengjishijian">
              <el-input v-model="ruleForm.dengjishijian" 
                placeholder="登记时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工工号" prop="yuangonggonghao">
          <el-input v-model="ruleForm.yuangonggonghao" 
              placeholder="员工工号" clearable  :readonly="ro.yuangonggonghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工工号" prop="yuangonggonghao">
              <el-input v-model="ruleForm.yuangonggonghao" 
                placeholder="员工工号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="员工姓名" prop="yuangongxingming">
          <el-input v-model="ruleForm.yuangongxingming" 
              placeholder="员工姓名" clearable  :readonly="ro.yuangongxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="员工姓名" prop="yuangongxingming">
              <el-input v-model="ruleForm.yuangongxingming" 
                placeholder="员工姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="生产计划" prop="shengchanjihua">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.shengchanjihua" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.shengchanjihua" label="生产计划" prop="shengchanjihua">
                    <span v-html="ruleForm.shengchanjihua"></span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(255, 255, 255, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"30px 0 0 0 ","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"rgba(48, 208, 182, 1)","addEditBoxColor":"rgba(255, 255, 255, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(48, 208, 182, 1)","uploadIconFontColor":"rgba(48, 208, 182, 1)","textareaBorderColor":"rgba(48, 208, 182, 1)","btnCancelBgColor":"rgba(170, 170, 170, 1)","selectLableColor":"rgba(48, 208, 182, 1)","btnSaveBorderStyle":"double","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"double","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"rgba(48, 208, 182, 1)","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(255, 255, 255, 1)","dateBorderColor":"rgba(48, 208, 182, 1)","dateIconFontColor":"rgba(48, 208, 182, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"rgba(48, 208, 182, 1)","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"rgba(48, 208, 182, 1)","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"30px 0 0 0 ","inputBgColor":"rgba(255, 255, 255, 1)","inputLableFontSize":"14px","uploadLableColor":"rgba(48, 208, 182, 1)","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(48, 208, 182, 1)","inputBorderColor":"rgba(48, 208, 182, 1)","uploadBorderColor":"rgba(48, 208, 182, 1)","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"5px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(255, 255, 255, 1)","btnSaveBorderWidth":"5px"},
      id: '',
      type: '',
      ro:{
	chanpinbianhao : false,
	chanpinmingcheng : false,
	chanpinleixing : false,
	shengchanshuliang : false,
	chanpintese : false,
	chanpinguige : false,
	shiyongfanwei : false,
	shengchanjihua : false,
	gongyimingcheng : false,
	gongxumingcheng : false,
	dengjishijian : false,
	yuangonggonghao : false,
	yuangongxingming : false,
      },
      ruleForm: {
        chanpinbianhao: '',
        chanpinmingcheng: '',
        chanpinleixing: '',
        shengchanshuliang: '',
        chanpintese: '',
        chanpinguige: '',
        shiyongfanwei: '',
        shengchanjihua: '',
        gongyimingcheng: '',
        gongxumingcheng: '',
        dengjishijian: '',
        yuangonggonghao: '',
        yuangongxingming: '',
      },
          chanpinbianhaoOptions: [],
          gongyimingchengOptions: [],
          gongxumingchengOptions: [],
      rules: {
          chanpinbianhao: [
                { required: true, message: '产品编号不能为空', trigger: 'blur' },
          ],
          chanpinmingcheng: [
          ],
          chanpinleixing: [
          ],
          shengchanshuliang: [
                { required: true, message: '生产数量不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          chanpintese: [
          ],
          chanpinguige: [
          ],
          shiyongfanwei: [
          ],
          shengchanjihua: [
          ],
          gongyimingcheng: [
          ],
          gongxumingcheng: [
          ],
          dengjishijian: [
          ],
          yuangonggonghao: [
          ],
          yuangongxingming: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {



  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='chanpinbianhao'){
            this.ruleForm.chanpinbianhao = obj[o];
	    this.ro.chanpinbianhao = true;
            continue;
          }
          if(o=='chanpinmingcheng'){
            this.ruleForm.chanpinmingcheng = obj[o];
	    this.ro.chanpinmingcheng = true;
            continue;
          }
          if(o=='chanpinleixing'){
            this.ruleForm.chanpinleixing = obj[o];
	    this.ro.chanpinleixing = true;
            continue;
          }
          if(o=='shengchanshuliang'){
            this.ruleForm.shengchanshuliang = obj[o];
	    this.ro.shengchanshuliang = true;
            continue;
          }
          if(o=='chanpintese'){
            this.ruleForm.chanpintese = obj[o];
	    this.ro.chanpintese = true;
            continue;
          }
          if(o=='chanpinguige'){
            this.ruleForm.chanpinguige = obj[o];
	    this.ro.chanpinguige = true;
            continue;
          }
          if(o=='shiyongfanwei'){
            this.ruleForm.shiyongfanwei = obj[o];
	    this.ro.shiyongfanwei = true;
            continue;
          }
          if(o=='shengchanjihua'){
            this.ruleForm.shengchanjihua = obj[o];
	    this.ro.shengchanjihua = true;
            continue;
          }
          if(o=='gongyimingcheng'){
            this.ruleForm.gongyimingcheng = obj[o];
	    this.ro.gongyimingcheng = true;
            continue;
          }
          if(o=='gongxumingcheng'){
            this.ruleForm.gongxumingcheng = obj[o];
	    this.ro.gongxumingcheng = true;
            continue;
          }
          if(o=='dengjishijian'){
            this.ruleForm.dengjishijian = obj[o];
	    this.ro.dengjishijian = true;
            continue;
          }
          if(o=='yuangonggonghao'){
            this.ruleForm.yuangonggonghao = obj[o];
	    this.ro.yuangonggonghao = true;
            continue;
          }
          if(o=='yuangongxingming'){
            this.ruleForm.yuangongxingming = obj[o];
	    this.ro.yuangongxingming = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.yuangonggonghao!=''&&json.yuangonggonghao){
                this.ruleForm.yuangonggonghao = json.yuangonggonghao
	    		this.ro.yuangonggonghao = true;
		}
		if(json.yuangongxingming!=''&&json.yuangongxingming){
                this.ruleForm.yuangongxingming = json.yuangongxingming
	    		this.ro.yuangongxingming = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.$http({
              url: `option/chanpinxinxi/chanpinbianhao`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.chanpinbianhaoOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
            this.$http({
              url: `option/gongyixianlu/gongyimingcheng`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.gongyimingchengOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
            this.$http({
              url: `option/gongxuxinxi/gongxumingcheng`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.gongxumingchengOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
    },
    // 下二随
    chanpinbianhaoChange () {
      this.$http({
        url: `follow/chanpinxinxi/chanpinbianhao?columnValue=`+ this.ruleForm.chanpinbianhao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.chanpinmingcheng){
                this.ruleForm.chanpinmingcheng = data.data.chanpinmingcheng
              }
              if(data.data.chanpinleixing){
                this.ruleForm.chanpinleixing = data.data.chanpinleixing
              }
              if(data.data.chanpintese){
                this.ruleForm.chanpintese = data.data.chanpintese
              }
              if(data.data.chanpinguige){
                this.ruleForm.chanpinguige = data.data.chanpinguige
              }
              if(data.data.shiyongfanwei){
                this.ruleForm.shiyongfanwei = data.data.shiyongfanwei
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 下二随
    gongxumingchengChange () {
      this.$http({
        url: `follow/gongxuxinxi/gongxumingcheng?columnValue=`+ this.ruleForm.gongxumingcheng,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.chanpinmingcheng){
                this.ruleForm.chanpinmingcheng = data.data.chanpinmingcheng
              }
              if(data.data.chanpinleixing){
                this.ruleForm.chanpinleixing = data.data.chanpinleixing
              }
              if(data.data.chanpintese){
                this.ruleForm.chanpintese = data.data.chanpintese
              }
              if(data.data.chanpinguige){
                this.ruleForm.chanpinguige = data.data.chanpinguige
              }
              if(data.data.shiyongfanwei){
                this.ruleForm.shiyongfanwei = data.data.shiyongfanwei
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `shengchanjihua/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.shengchanjihua = this.ruleForm.shengchanjihua.replace(reg,'../../../springboot55nqb/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {



























var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "shengchanjihua/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `shengchanjihua/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.shengchanjihuaCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `shengchanjihua/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.shengchanjihuaCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.shengchanjihuaCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
