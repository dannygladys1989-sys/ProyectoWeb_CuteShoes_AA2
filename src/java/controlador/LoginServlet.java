/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {

@Override
protected void doPost(
HttpServletRequest request,
HttpServletResponse response)

throws ServletException,IOException{

String correo=
request.getParameter("correo");

String clave=
request.getParameter("clave");

if(correo.equals("admin@gmail.com")
&&
clave.equals("123")){

response.sendRedirect(
"catalogo.jsp"
);

}else{

response.sendRedirect(
"login.jsp"
);

}

}

@Override
protected void doGet(
HttpServletRequest request,
HttpServletResponse response)

throws ServletException,IOException{

response.getWriter()
.println(
"Metodo GET funcionando"
);

}

}
