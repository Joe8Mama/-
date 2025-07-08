# 图片协作平台
## 项目简介  

基于  Spring Boot + Redis + COS + AI + WebSocket  构建的智能协作图片云平台。涵盖公共、私有、团队共享图库模块。用户可上传检索图片，管理员负责审核管理。支持个人批量管理、多维检索及企业团队实时协同编辑。项目可应用于素材网站、相册等场景，并借助分布式存储与多级缓存保障性能稳定。

## 项目架构![架构图](https://github.com/user-attachments/assets/4dfd0c85-ec20-4c76-8176-03588ffce74a)

## 核心功能

所有注册用户都可以在公共图库上传图片素材，并可通过检索功能获取想要的图片

![image](https://github.com/user-attachments/assets/f0b6385c-7cf5-4948-883d-6a111984f413)

管理员可审核并管理上传的图片，以及进行批量上传图片操作，还可对平台内的图片进行分析

![image](https://github.com/user-attachments/assets/56e67232-9b11-4b6a-ad1d-ea559bf975d8)

![Screenshot 2025-07-08 134752](https://github.com/user-attachments/assets/606d61be-a831-4223-92e6-9b20275b3b35)

![image](https://github.com/user-attachments/assets/93b7167d-3170-44ba-ac11-7ccf1bb54119)

普通用户可创建私有空间将图片上传，对空间内图片执行检索、编辑等操作 

![image](https://github.com/user-attachments/assets/03fec6e0-3922-4f04-9f4e-395c041ba370)

用户可开通团队空间邀请其他用户加入，共享空间内图片并一同**实时编辑图片**

![Screenshot 2025-07-08 141827](https://github.com/user-attachments/assets/f2458174-7fcf-4807-8a55-d5cb764586aa)

![Screenshot 2025-07-08 141936](https://github.com/user-attachments/assets/c451759d-a8a1-45ae-88db-fc69cdb5e321)

![Screenshot 2025-07-08 142228](https://github.com/user-attachments/assets/625911ea-b4ef-474a-ad4f-95e16813d76d)

## 技术选型

### 后端

- Java Spring Boot 框架
- MySQL 数据库 + MyBatis-Plus 框架 + MyBatis X 
- Redis 分布式缓存 + Caffeine 本地缓存
- Jsoup 数据抓取
- COS 对象存储
- ShardingSphere 分库分表
- Sa-Token 权限控制
- WebSocket 双向通信
- Disruptor 高性能无锁队列
- JUC 并发和异步编程
- AI 绘图大模型接入
- 策略模式、模板方法模式和门面模式等设计模式

### 前端

- Vue 3 框架
- Vite 打包工具
- Ant Design Vue 组件库
- Axios 请求库
- Pinia 全局状态管理
