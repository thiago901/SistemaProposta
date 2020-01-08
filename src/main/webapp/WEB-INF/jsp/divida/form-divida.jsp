<%-- 
    Document   : form-divida
    Created on : 19/12/2019, 19:28:29
    Author     : Thiago
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <title>Inadimplencia</title>
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
                <h1 class="titulo">Cadastrar Divida</h1>
                <form action="/SistemaProposta/input?action=CadastrarDivida" method="Post">
                    <div class="busca-grupo-cota">
                        <label for="idNumContrato">Número do Contrato</label>
                        <input id="idNumContrato" type="text" name="num-contrato" value="">
                        <button type="button" name="button">Buscar</button>
                    </div>
                    <div class="dados-divida">
                        <div>
                            <label for="vlrPrincipal">R$ Principal</label>
                            <input id="vlrPrincipal" type="number" name="principal" value="">
                        </div>
                        <div>
                            <label for="vlrMultas">R$ Multas</label>
                            <input id="vlrMultas" type="number" name="multas" value="">
                        </div>
                        <div>
                            <label for="vlrJuros">R$ Juros</label>
                            <input id="vlrJuros" type="number" name="juros" value="">
                        </div>
                        <div>
                            <label for="vlrDespesas">R$ Despesas</label>
                            <input id="vlrDespesas" type="number" name="despesas" value="">
                        </div>
                        <div>
                            <label for="percHonorarios">% Honorarios</label>
                            <input id="percHonorarios" type="number" name="perc-honorarios" value="">
                        </div>
                        <div>
                            <label for="vlrCategoria">R$ Categoria</label>
                            <input id="vlrCategoria" type="number" name="categoria" value="">
                        </div>
                        <div>
                            <label for="vlrSaldoDev">R$ Saldo Dev.</label>
                            <input id="vlrSaldoDev" type="number" name="perc-saldo-devedor" value="">
                        </div>
                        <div>
                            <label for="vlrPOS">R$ POS</label>
                            <input id="vlrPOS" type="number" name="POS" value="">
                        </div>
                        <div>
                            <label for="vlrDebBem">R$ Debitos do Bem</label>
                            <input id="vlrDebBem" type="number" name="debitos-bem" value="">
                        </div>
                        <div>
                            <label for="dtAtraso">Data de Atraso</label>
                            <input id="dtAtraso" type="text" name="dt-atraso" value="">
                        </div>
                    </div>
                </form>
                <div class="buttons">
                    <button type="button" name="button">Cancelar</button>
                    <button type="submit" name="button">Salvar</button>
                </div>
            </div>
        </main>
    </body>
</html>
