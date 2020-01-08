<%-- 
    Document   : form-cadastro-administradora
    Created on : 16/12/2019, 19:28:40
    Author     : Thiago
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <title>Administradora</title>

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
                <h1 class="titulo">Cadastrar Administradora</h1>

                <form action="/SistemaProposta/input?action=CadastrarAdministradora" method="Post">
                    <label for="nomeAdministradora">Administradora</label>
                    <input type="text" name="nomeAdministradora" value="">

                    <label for="cnpj">CNPJ</label>
                    <input type="text" name="cnpj" value="">

                    <button type="submit" name="button">Salvar</button>
                </form>
                <div class="buttons">
                    <button type="button" name="button">Cancelar</button>
                    <button type="submit" name="button">Salvar</button>
                </div>
            </div>
        </main>

    </body>
</html>
