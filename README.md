<p align="center">
<img src="https://guicai-1310088046.cos.ap-guangzhou.myqcloud.com/image%2F%E9%AC%BC%E8%84%B8.png" alt="image-20230623213937364" style="zoom:50%;" align="center" />
</p>

<p align="center">
<a>
    <img src="https://img.shields.io/badge/Spring Boot-2.7.0-brightgreen.svg" alt="Spring Boot">
    <img src="https://img.shields.io/badge/MySQL-8.0.20-orange.svg" alt="MySQL">
    <img src="https://img.shields.io/badge/Java-1.8.0-blue.svg" alt="Java">
    <img src="https://img.shields.io/badge/MyBatis--Plus-3.5.2-blue.svg" alt="MyBatis-Plus">
    <img src="https://img.shields.io/badge/gson-2.9.0-blue.svg" alt="gson">
    <img src="https://img.shields.io/badge/Hutool-5.8.8-green.svg" alt="Hutool">
    <img src="https://img.shields.io/badge/commons_lang3-3.12.0-brightgreen.svg" alt="commons-lang3">
    <img src="https://img.shields.io/badge/dubbo-3.0.9-blue.svg" alt="dubbo">
    <img src="https://img.shields.io/badge/MyBatis-2.2.2-yellow.svg" alt="MyBatis">
    <img src="https://img.shields.io/badge/nacos_client-2.1.0-blue.svg" alt="nacos-client">
</a>
</p>

# API开放接口平台

一个API开放接口平台，用户可以在线调试

作者： 🌟  [鬼才之刺]( [guicaizhici (鬼才之刺) (github.com)](https://github.com/guicaizhici) )

# 项目介绍

 提供API接口供开发者调用的平台，基于Sring Boot后端 + React 前端的全栈微服务项目。

用户可以注册登录，开通接口调用权限，用户可以调用接口，并且每次调用会进行统计。管理员可以发布接口、下线接口、接入接口，以及可视化接口的调用情况、数据。 还能使用客户端SDK轻松在代码中调用接口。

### 主页（浏览接口）

![1](https://guicai-1310088046.cos.ap-guangzhou.myqcloud.com/image%2Fapi%2Fca5482ddce832815f4fb2d120615d18.png)

### 接口管理

![](https://guicai-1310088046.cos.ap-guangzhou.myqcloud.com/image%2Fapi%2F60466d2c37db3902311a10e0bb22d55.png)

### 在线调试

![](https://guicai-1310088046.cos.ap-guangzhou.myqcloud.com/image%2Fapi%2Ff085eb5da8e7d249b850556f4113ed6.png)

### 返回随机获取一句鸡汤调用接口的结果

![](https://guicai-1310088046.cos.ap-guangzhou.myqcloud.com/image%2Fapi%2F93619db84729c8cdd9da7cdf08be861.png)

### 返回QQ登录状态调用接口的结果

![](https://guicai-1310088046.cos.ap-guangzhou.myqcloud.com/image%2Fapi%2F3392b7a512632a080fa985ceebfa992.png)

### 项目结构图

![1711679945036](https://guicai-1310088046.cos.ap-guangzhou.myqcloud.com/image%2Fapi%2F21b647b5c8ad981f145135a1e0f051c.jpg)

# 技术选型

## 后端

- Spring Boot 2.7.0
- MySQL 数据库
- Dubbo 分布式（RPC、Nacos）
- Spring Cloud Gateway 微服务网关
- API 签名认证（Http 调用）
- Swagger + Knife4j 接口文档
- Spring Boot Starter（SDK 开发）
- MyBatis-Plus 及 MyBatis X 自动生成
- Hutool、Apache Common Utils、Gson 等工具库

## 前端

- React 18
- Ant Design Pro 5.x 脚手架
- Ant Design & Procomponents 组件库
- Umi 4 前端框架
- OpenAPI 前端代码生成

# 快速启动

## 后端

按照applicationg.yml配置自己的环境即可， 执行sql目录下ddl.sql 

## 前端

环境要求：Node.js >= 18

安装依赖：

```
yarn or  npm install
```

启动：

```
yarn run dev or npm run start:dev
```

部署：

```
yarn build or npm run build
```

