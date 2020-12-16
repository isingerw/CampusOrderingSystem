# 校园订餐系统

# Campus-Ordering-System

<p align="center">
    <a href="https://singer-1300001977.file.myqcloud.com/%E4%B8%AA%E4%BA%BA%E4%BA%91%E8%B5%84%E6%BA%90/logo222.png">
        <img src="https://singer-1300001977.file.myqcloud.com/%E4%B8%AA%E4%BA%BA%E4%BA%91%E8%B5%84%E6%BA%90/logo222.png">
    </a>
</p>

---

<p align="center">
    <a href="https://gitee.com/singerw_admin/campus-ordering-system/blob/master/LICENSE">
        <img src="https://img.shields.io/badge/license-Apache%202-blue.svg">
    </a>
    <a href="https://gitee.com/singerw_admin/campus-ordering-system#">
        <img src="https://badgen.net/badge/stars/%E2%98%85%E2%98%85%E2%98%85%E2%98%85%E2%98%86">
    </a>
        <a href="https://gitee.com/singerw_admin/campus-ordering-system#">
        <img src="https://badgen.net/github/forks/micromatch/micromatch">
    </a>
    <a href="https://gitee.com/singerw_admin">
        <img src="https://badgen.net/https/cal-badge-icd0onfvrxx6.runkit.sh">
    </a>
        <a href="https://blog.singerw.com/">
        <img src="https://badgen.net/badge/icon/rss?icon=rss&label">
    </a>
</p>



## 系统概要



## 功能实现

#### 1. 模块1

-  前台主要功能有：用户注册、用户登录、我的购物车、我的订单、商品评论、校园资讯

#### 2. 模块2

-  后台主要功能有：用户管理、商品管理、订单管理、评论管理、资讯管理等

## 技术选型

### 后台技术选型

- SpringBoot(Spring、SpringMVC)
- MyBatis
- Thymeleaf

### 前端技术选型

- Layui
- jQuery

### 开发环境

- 操作系统：Windows 10
- 编程语言: Java 8
- 开发工具: IDEA、Navicat、Git
- 项目构建: Maven 3.3.9
- 服务器：Tomcat 8.5
- 数据库: MySQL
- 代码托管平台: Gitee

### 部署环境

- 操作系统: CentOS 7.4
- 编程语言: Java 8
- 服务器: Tomcat 8.5、Nginx 1.12.2
- 数据库: MySQL、Redis

###### 部署步骤

1. 将项目导入到Idea开发工具中
2. mysql新建数据库singer，复制sql建表语句执行导入
3. 修改源码中\src\main\resources\jdbc.properties数据库配置文件，修改1-3行，配置为本机数据库地址
4. 将项目放入tomcat容器中，并启动项目
5. 浏览器访问地址
   前台访问路径：http://localhost:8080/fore/foreIndex
   登录账号：张欣 登录密码：795200
   后台访问地址：http://localhost:8080/login
   登录账号：admin  登录密码：795200