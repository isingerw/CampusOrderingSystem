<%--
  Created by IntelliJ IDEA.
  User: singer
  Date: 2020/11/27
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="../include/publicMeta.jsp"%>
<%@include file="../include/publicHeader.jsp"%>
<%@include file="../include/publicMenu.jsp"%>


<section class="Hui-article-box">
    <nav class="breadcrumb"><i class="Hui-iconfont"></i> <a href="/index" class="maincolor">首页</a>
        <span class="c-999 en">&gt;</span>
        <span class="c-666">我的桌面</span>
        <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
    <div class="Hui-article">
        <article class="cl pd-20">
            <center><p class="f-30 text-success">欢迎使用泉信校园点餐平台</p></center>
        </article>

        <footer class="footer">
            <p>Copyright &copy; 2020 <a href="#">Singer</a> All Rights Reserved</p>
            <p>感谢<a href="#">（川建国组）</a>全体成员：林东 方圆 张欣</p>
            <p> 感谢<a href="https://gitee.com/" target="_blank" title="gitee"> Gitee.com </a>提供代码托管，本后台系统由 <a href="http://www.h-ui.net/" target="_blank" title="H-ui前端框架"> H-ui前端框架 </a>提供前端技术支持</p>        </footer>
    </div>
</section>

<%@include file="../include/publicFooter.jsp"%>
</body>
</html>