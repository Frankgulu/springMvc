<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login.html" method="post">

姓名：<input type="text" name="userName" /><br />
密码：<input type="text" name="password" /><br />

<input type="submit" value="提交" />

<br />

</form>

=============================<a></a>
<form action="upload" enctype="multipart/form-data" method="post">
<input type="file" name="file"/>

<input type="submit">上传文件</input>


</form>
</body>
</html>