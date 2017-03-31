<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="Bean.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>ks系统欢迎您</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
     <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">


<link rel="stylesheet"
	href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- jquery表单前端验证 -->
<script
	src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script
	src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
   <style>
        <!--
        body {
            background:url(img/b.jpg) ;
        }
        .modal-dialog{
            margin-top: 100px;
            margin-left: auto;
            margin-right: auto;
            height: 200px;
            width:500px;
           
			border-radius: 8px;
			 box-shadow: 0 0 15px #222;
            background: -moz-linear-gradient(top, #fff, #efefef 8%);
            background: -webkit-gradient(linear, 0 0, 0 100%, from(#f6f6f6), to(#f4f4f4));
			 padding: 
			color: #000;
           
            background: white;
            font: 11px/1.5em 'Microsoft YaHei';
        }


       
        -->
    </style>
</head>
<body class="login-layout light-login">
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h2 class="text-center">
				湖北中医药大学学生考试系统
			</h2>
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
				</div>
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					
						
					<ul class="nav navbar-nav navbar-right">
						<li>
							<button class="btn btn-primary" type="button" id="buLogin">登录</button>

						</li>
                        <li>
							<button class="btn btn-primary" type="button" id="buRegister">注册</button>
						</li>
						
					</ul>
				</div>
			</nav>
			<table class="table">
				<thead>
					<tr>
						<th>
							学号
						</th>
						<th>
							学生姓名
						</th>
						<th>
							章节
						</th>
						<th>
							分数
						</th>
						<th>
							日期时间
						</th>
					</tr>
				</thead>
				<tbody>
		<% ArrayList<Testcore> list = Testcore.findTestcore();
		for (Testcore testcore : list) {%>
		<tr ><td class="success"><% out.print(testcore.getSno());%></td>
		<td class="error"><% out.print(testcore.getSname());%></td>
		<td class="warning"><%out.print(testcore.getZhangjie()); %></td>
		<td class="info"><%out.print(testcore.getScore());%></td>
		<td class="success"><% out.print(testcore.getCompeledtime());%></td>
			</tr>
			<%	
			
		}%>				
				</tbody>
			</table>
		</div>
	</div>
</div>

<!--  登录模块-->
<div class="modal" id="mymodal">
    <div class="modal-dialog">
        <div class="modal-content">
            
			<div class="modal-body">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
				<h4 class="modal-title">请登录</h4>
				 <section class="loginBox row-fluid">
        <div class="tabbable" id="tabs-634549">
            <ul class="nav nav-tabs">
                <li>
                    <a href="#panel-60560" data-toggle="tab">教师</a>
                </li>
                <li class="active">
                    <a href="#panel-549981" data-toggle="tab">学生</a>
                </li>
               <li>
						 <a href="#panel-344183" data-toggle="tab">系统管理员</a>
			   </li>

            </ul>
            <div class="tab-content">

                <div class="tab-pane" id="panel-60560">
                    <form id="formforlogin" method="post"
                          action="${pageContext.request.contextPath }/servlet/LoginServlet">
                       <DIV><input type="text" name="account" placeholder="教师编号"/></DIV>
                        <DIV>
                            <input type="password" name="userpassword" placeholder="密码"/>
                        </DIV>
                        <DIV class="span6"><label><input type="checkbox" name="rememberme" />下次自动登录</label></DIV>
                        <DIV class="span1"><input type="submit" value=" 登录 " class="btn btn-primary" id="login"/></DIV>
                    </form>	 			</div>
                <div class="tab-pane active" id="panel-549981">
                    <form id="formforlogin" method="post"
                         action="LoginServlet?type=2">
                        <DIV><input type="text" name="account" placeholder="学号"/></DIV>
                        <DIV>
                            <input type="text" name="userpassword" placeholder="密码"/>
                        </DIV>
                        <DIV class="span6"><label><input type="checkbox" name="rememberme" />下次自动登录</label></DIV>
                        <DIV class="span1"><input type="submit" value=" 登录 " class="btn btn-primary" id="login"/></DIV>
                    </form>
                </div>
                 	<div class="tab-pane" id="panel-344183">

                    <form id="formforlogin" method="post"
                         action="LoginServlet?type=3">
                        <DIV><input type="text" name="account" placeholder="管理员账号"/></DIV>
                        <DIV>
                            <input type="text" name="userpassword" placeholder="密码"/>
                        </DIV>
                        <DIV class="span6"><label><input type="checkbox" name="rememberme" />下次自动登录</label></DIV>
                        <DIV class="span1"><input type="submit" value=" 登录 " class="btn btn-primary" id="login"/></DIV>
                    </form>
                </div>
            </div>
        </div>
    </section><!-- /loginBox -->
			</div>
			
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!--注册弹出框-->
<div class="modal" id="myregistermodal">
    <div class="modal-dialog">
        <div class="modal-content">
            
			<div class="modal-body">
            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
				<h4 class="modal-title">请注册</h4>
				 <section class="loginBox row-fluid">
        <div class="tabbable" id="tabs-634549">
            <ul class="nav nav-tabs">
                <li>
                    <a href="#panel-60560" data-toggle="tab">教师</a>
                </li>
                <li class="active">
                    <a href="#panel-549981" data-toggle="tab">学生</a>
                </li>
              

            </ul>
            <div class="tab-content">

                <div class="tab-pane" id="panel-60560">
                    <form id="formforregister" method="post"
                          action="LoginServlet?type=1">
                       <DIV><input type="text" name="account" placeholder="教师编号"/></DIV>
                        <DIV>
                            <input type="password" name="password" placeholder="密码"/>
                        </DIV>
                        <DIV class="span6"><label><input type="checkbox" name="rememberme" />下次自动登录</label></DIV>
                        <DIV class="span1"><input type="submit" value=" 注册 " class="btn btn-primary" id="login"/></DIV>
                    </form>	 			</div>
                <div class="tab-pane active" id="panel-549981">
                    <form id="formforlogin" method="post"
                         action="LoginServlet?type=2">
                        <DIV><input type="text" name="account" placeholder="学号"/></DIV>
                        <DIV>
                            <input type="text" name="userpassword" placeholder="密码"/>
                        </DIV>
                        <DIV class="span6"><label><input type="checkbox" name="rememberme" />下次自动登录</label></DIV>
                        <DIV class="span1"><input type="submit" value=" 注册 " class="btn btn-primary" id="login"/></DIV>
                    </form>
                </div>
                 	
            </div>
        </div>
    </section><!-- /loginBox -->
			</div>
			
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-transition.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-modal.js"></script>
<script>
  $(function(){
    $("#buLogin").click(function(){
      $("#mymodal").modal("toggle");
    });
  });
   $(function(){
    $("#buRegister").click(function(){
      $("#myregistermodal").modal("toggle");
    });
  });
</script>


</body>
</html>
