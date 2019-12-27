# jwt_demo

demo for spring boot security with JWT

借鉴了 [江南一点雨](https://juejin.im/user/57d679af0bd1d000585012a7) 的 [教程](https://mp.weixin.qq.com/s?__biz=MzI1NDY0MTkzNQ==&mid=2247487270&idx=2&sn=dcc3bb1660145cb2ff3ce3cecd85b012&chksm=e9c35d46deb4d4500f2b918ec0d5168f4e6fe929d71be094ff5568c43d1135aad570021adb2d&scene=21#wechat_redirect)

致力于实现一个 支持 JWT 的最小 Spring Boot Security 项目

---

与原教程做了如下改动:

1. 修正 JwtFilter 当不存在 authorization 时的 Bug

2. 更换接口方法签名

3. 编写 VS Code Rest Client 插件 的 REST 接口文件

4. Todo : 使用数据库储存账号
