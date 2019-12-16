<%-- 
    Document   : newjsp
    Created on : 16/12/2019, 19:22:46
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="utf-8">
    <title>Cliente</title>

  </head>
  <body>
    <div class="tela-fundo"></div>
    <div class="main">
      <h1>Cliente</h1>
      <form action="/SistemaProposta/input?action=CadastrarCliente" method="Post">
        <label for="nomeCliente">Nome</label>
        <input type="text" name="nomeCliente" >

        <label for="cnpj-cpf">CNPJ/CPF</label>
        <input type="text" name="cnpj-cpf" >

        <label for="uf">UF</label>

        <input type="text" name="uf">

        <label for="cidade">Cidade</label>
        <input type="text" name="cidade" >



        <button type="submit" name="button">Salvar</button>
      </form>
    </div>

  </body>
</html>
