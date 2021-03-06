<%-- 
    Document   : form-proposta
    Created on : 19/12/2019, 20:49:34
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
    </head>
    <body>
        <header class="header">
            <c:import url="../menu.jsp"/>
        </header>
        <main class="main">
            <div class="container">

                <h1 class="titulo">Cadastrar Proposta</h1>
                <form action="/SistemaProposta/input?action=CadastrarProposta" method="Post">

                    <div class="dadosProposta">
                        <label for="idDivida">cod Divida</label>
                        <input id="idDivida" type="text" name="idDivida" value="">
                        <label for="vlrPrincipal">R$ Principal</label>
                        <input id="vlrPrincipal" type="text" name="principal" value="">

                        <label for="vlrMultas">R$ Multas</label>
                        <input id="vlrMultas" type="text" name="multas" value="">

                        <label for="vlrJuros">R$ Juros</label>
                        <input id="vlrJuros" type="text" name="juros" value="">

                        <label for="vlrDespesas">R$ Despesas</label>
                        <input id="vlrDespesas" type="text" name="despesas" value="">

                        <label for="percHonorarios">% Honorarios</label>
                        <input id="percHonorarios" type="text" name="perc-honorarios" value="">

                        <div class="tipo-proposta">
                            <input id="rd-quitacao"type="radio" name="tipo-proposta" value="Quitacao">
                            <label for="rd-quitacao">Quitação</label>
                            <input id="rd-atualizacao" type="radio" name="tipo-proposta" value="Atualizacao">
                            <label for="rd-atualizacao">Atualização</label>
                        </div>
                        <label for="qtdParcela">Qtd Parcela</label>
                        <input id="qtdParcela" type="text" name="qtd-parcela" value="">




                    </div>
                    <div class="buttons">
                        <button type="button" name="button">Cancelar</button>
                        <button type="submit" name="button">Salvar</button>
                    </div>
                </form>
            </div>

        </main>
    </body>
</html>
