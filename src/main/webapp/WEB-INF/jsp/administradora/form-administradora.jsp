<%-- 
    Document   : form-cadastro-administradora
    Created on : 16/12/2019, 19:28:40
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="utf-8">
    <title>Administradora</title>

  </head>
  <body>
    <div class="tela-fundo"></div>
    <div class="main">
      <h1>Administradora</h1>
      <form action="/SistemaProposta/input?action=CadastrarAdministradora" method="Post">
        <label for="nomeAdministradora">Administradora</label>
        <input type="text" name="nomeAdministradora" value="">

        <label for="cnpj">CNPJ</label>
        <input type="text" name="cnpj" value="">

        <button type="submit" name="button">Salvar</button>
      </form>
    </div>

  </body>
</html>
