const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootaj3l6/",
            name: "springbootaj3l6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootaj3l6/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "点滴筹"
        } 
    }
}
export default base
