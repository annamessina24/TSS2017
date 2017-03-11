<%@ page import ="java.sql.*" %>
<%
    String user = request.getParameter("username");    
    String pwd = request.getParameter("password");
    
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myshop", "root", "");
    
    Statement st = con.createStatement();
    
    //ResultSet rs;
    
    int i = st.executeUpdate("insert into users(username, password, regdate) values ('" + user + "','" + pwd + "', CURDATE())");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>