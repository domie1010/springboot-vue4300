const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot55nqb/",
            name: "springboot55nqb",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "MES生产制造执行系统"
        } 
    }
}
export default base
