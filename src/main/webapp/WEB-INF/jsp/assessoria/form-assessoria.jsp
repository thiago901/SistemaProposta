<%-- 
    Document   : form-assessoria
    Created on : 17/12/2019, 18:35:16
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="utf-8">
    <title>Assessoria</title>

  </head>
  <body>
    <div class="tela-fundo"></div>
    <div class="main">
      <h1>Assessoria</h1>
      <form action="/SistemaProposta/input?action=CadastrarAssessoria" method="Post">
        <label for="nomeAssessoria">Assessoria</label>
        <input type="text" name="nomeAssessoria" value="">

        <label for="cnpj">CNPJ</label>
        <input type="text" name="cnpj" value="">
        
        <label for="administradora">Cod -Administradora</label>
        <input type="text" name="cod-administradora" value="">

        <button type="submit" name="button">Salvar</button>
      </form>
    </div>

  </body>
</html>