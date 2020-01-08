<%-- 
    Document   : form-lista-proposta
    Created on : 22/12/2019, 14:22:31
    Author     : Thiago
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <title>Lista Propostas</title>
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/menu.css">
        <link rel="stylesheet" href="css/lista-analise.css">
        <link href="https://fonts.googleapis.com/css?family=PT+Sans&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Overpass&display=swap" rel="stylesheet">
    </head>

    <body>


        <header class="header">
            <c:import url="../menu.jsp"/>
        </header>

        <main class="main">
            <div class="container">
                <div class="filtros">

                    <input type="text" class="contrato" name="" value="" placeholder="Contrato">

                    <input type="text" class="selecao" name="" value="" placeholder="Administradora">
                    <input type="text" class="selecao" name="" value="" placeholder="Assessoria">


                    <input type="date" name="" value="" class="data">

                    <button type="button" name="button" class="buscar">Buscar</button>
                    <button type="reset" name="button" class="limpar">Limpar</button>
                </div>


                <table>
                    <thead>
                        <tr>
                            <th>Administradora</th>
                            <th>Assessoria</th>
                            <th>Cliente</th>
                            <th>Data</th>
                            <th>Valor</th>
                            <th>Status</th>
                            <th>Abrir</th>
                        </tr>
                    </thead>
                    <tbody>


                        <c:forEach items="${lista}" var="p">
                            <tr class="proposta">
                                <td class="tdAdministradora">
                                    <c:out value="${p.getDivida().getContrato().getAdministradora().getNome()}"/>
                                </td>
                                <td class="tdAssessoria">
                                    <c:out value="${p.getDivida().getContrato().getAssessoria().getNome()}"/>
                                </td>
                                <td class="tdCliente">
                                    <c:out value="${p.getDivida().getContrato().getCliente().getNome()}"/>
                                </td>
                                <td class="tdAData"><c:out value="${p.getDtProposta()}"/></td>
                                <td class="tdValor"><c:out value="${p.getVlrPrincipal()}"/></td>
                                <td class="tdStatus"><c:out value="${p.getStatusProposta().getStatusProposta()}"/></td>
                                <td class="tdAbrir">
                                    <a href="/SistemaProposta/input?action=AnaliseProposta&idProposta=${p.getId()}">
                                        <img src="img/arquivo.png" alt="icon de uma pagina" class="imgAbrir" >
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>


                    </tbody>
                </table>

            </div>
        </main>

    </body>



