<%-- 
    Document   : form-contrato
    Created on : 18/12/2019, 19:37:36
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <title>Contrato</title>
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
                <h1 class="titulo">Cadastrar Contrato</h1>
                <form action="/SistemaProposta/input?action=CadastrarContrato" method="Post">
                    <label for="contrato">Contrato</label>

                    <input type="text" name="contrato" value="">

                    <label for="cod-cliente">Cliente</label>
                    <input type="text" name="cod-cliente" value="">

                    <label for="cod-assessoria">Assessoria</label>
                    <input type="text" name="cod-assessoria" value="">

                    <label for="cod-administradora">Administradora</label>
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