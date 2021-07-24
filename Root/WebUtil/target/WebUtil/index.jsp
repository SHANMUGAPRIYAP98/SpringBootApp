<%@page import="com.srm.stringutil.StringDemo"%>
<%@page import="com.srm.dateutil.DateDemo"%>
<html>
<body>
<h2>Hello World!</h2>
<% out.println(DateDemo.displayDate()); %>
<% out.println(StringDemo.reverseString("hello")) ;%>
</body>
</html>
