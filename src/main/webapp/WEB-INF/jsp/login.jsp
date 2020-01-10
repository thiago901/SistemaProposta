<%-- 
    Document   : login
    Created on : 09/01/2020, 20:13:36
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="pt" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Login</title>

    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/login.css">
    <link href="https://fonts.googleapis.com/css?family=Questrial&display=swap" rel="stylesheet">
  </head>
  <body class="body">

    <div class="container">
      <div class="info">
        <div class="img"></div>
        <h1 class="titulo">Sistema de Proposta</h1>
        <p class="detalhes">Lorem ipsum dolor sit amet, consectetur a
        dipisicing elit, sed do eiusmod tempor incididunt ut
        labore et dolore magna aliqua. Ut enim ad minim veniam,
        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
        cillum dolore eu fugiat nulla pariatur.
        Excepteur sint occaecat cupidatat non proident, sunt in
        culpa qui officia deserunt mollit anim id est laborum.</p>
      </div>
      <div class="login">
          
        <form class="form" action="/SistemaProposta/input?action=Login" method="post">
          <div class="field login">
              <label for="">Login</label>
              <input type="text" name="login" value="">
          </div>

          <div class="field password">
            <label for="">Senha</label>
            <input type="password" name="senha" value="">

          </div>
          <div class="botoes">
            <button type="submit" name="button">Entrar</button>
            <button type="submit" name="button">Cancelar</button>
          </div>


        </form>
      </div>
    </div>



  </body>
</html>
