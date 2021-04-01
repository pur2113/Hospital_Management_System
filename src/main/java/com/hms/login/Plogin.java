package com.hms.login;
import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/Plogin")
public class Plogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Plogin() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String driverName = "";
        String connectionUrl = "";
        String dbName = "";
        String userId = "";
        String password = "";
        String pwdd=null;
        String name=request.getParameter("uname");

        String psswd=request.getParameter("pwd");
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
            statement=connection.createStatement();
            String sql ="SELECT password FROM tablename where name='"+name+"'";

            resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                pwdd=resultSet.getString("password");
            }
            if(psswd.equalsIgnoreCase(pwdd)) {
                session.setAttribute("Name",name);
                request.getRequestDispatcher("patient html").forward(request, response);
            }

            else {
                request.setAttribute("error", "Invalid username/password.");
                request.getRequestDispatcher("login html").forward(request, response);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }}
