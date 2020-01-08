<%-- 
    Document   : newjsp
    Created on : 16/12/2019, 19:22:46
    Author     : Thiago
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <title>Cliente</title>
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/divida.css">
        <link rel="stylesheet" href="css/menu.css">
        <link rel="stylesheet" href="css/style.css">
        <link href="https://fonts.googleapis.com/css?family=PT+Sans&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Overpass&display=swap" rel="stylesheet">

    </head>
    <body>
        <header class="header">
            <c:import url="../menu.jsp"/>
        </header>

        <main class="main">
            <div class="container">
                <h1 class="titulo">Cadastrar Cliente</h1>
                
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
            <div class="buttons">
                <button type="button" name="button">Cancelar</button>
                <button type="submit" name="button">Salvar</button>
            </div>
        </main>

    </body>
</html>
