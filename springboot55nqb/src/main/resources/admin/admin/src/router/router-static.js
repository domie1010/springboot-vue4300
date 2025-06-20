import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import bumenxinxi from '@/views/modules/bumenxinxi/list'
    import yuangong from '@/views/modules/yuangong/list'
    import chanpinxinxi from '@/views/modules/chanpinxinxi/list'
    import xiaoshoudingdan from '@/views/modules/xiaoshoudingdan/list'
    import shengchanjihua from '@/views/modules/shengchanjihua/list'
    import gongyixianlu from '@/views/modules/gongyixianlu/list'
    import wuliaoxinxi from '@/views/modules/wuliaoxinxi/list'
    import gongxuxinxi from '@/views/modules/gongxuxinxi/list'
    import kehuxinxi from '@/views/modules/kehuxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/bumenxinxi',
        name: '部门信息',
        component: bumenxinxi
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/chanpinxinxi',
        name: '产品信息',
        component: chanpinxinxi
      }
      ,{
	path: '/xiaoshoudingdan',
        name: '销售订单',
        component: xiaoshoudingdan
      }
      ,{
	path: '/shengchanjihua',
        name: '生产计划',
        component: shengchanjihua
      }
      ,{
	path: '/gongyixianlu',
        name: '工艺线路',
        component: gongyixianlu
      }
      ,{
	path: '/wuliaoxinxi',
        name: '物料信息',
        component: wuliaoxinxi
      }
      ,{
	path: '/gongxuxinxi',
        name: '工序信息',
        component: gongxuxinxi
      }
      ,{
	path: '/kehuxinxi',
        name: '客户信息',
        component: kehuxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
