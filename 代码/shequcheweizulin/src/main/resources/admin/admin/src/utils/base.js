const base = {
    get() {
        return {
            url : "http://localhost:8080/shequcheweizulin/",
            name: "shequcheweizulin",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shequcheweizulin/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区车位租赁系统"
        } 
    }
}
export default base
