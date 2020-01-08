<%-- 
    Document   : form-assessoria
    Created on : 17/12/2019, 18:35:16
    Author     : Thiago
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <title>Assessoria</title>
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
            <h1 class="titulo">Cadastrar Assessoria</h1>
            
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
            <div class="buttons">
                <button type="button" name="button">Cancelar</button>
                <button type="submit" name="button">Salvar</button>
            </div>
        </main>

    </body>
</html>