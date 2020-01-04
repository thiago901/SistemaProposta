<%-- 
    Document   : form-proposta
    Created on : 19/12/2019, 20:49:34
    Author     : Thiago
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title>Proposta</title>
        <link rel="stylesheet" type="text/css" href="css/reset.css">
        <link rel="stylesheet" type="text/css" href="css/analise-proposta.css">
        <link href="https://fonts.googleapis.com/css?family=PT+Sans&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Overpass&display=swap" rel="stylesheet">
    </head>

    <body>
        <header class="header">
            <img src="img/icon-menu-close.svg" alt="">
            <ul class="menu">
                <li>Acao 1</li>
                <li>Acao 2</li>
                <li>Acao 3</li>
                <li>Acao 4</li>
                <li>Acao 5</li>
                <li><a href="input?action=FormPropostaLista">Listar Propostas</a></li>
            </ul>
        </header>
        <main class="main">

            <section class="proposta">
                <p class="status">Status: <c:out value="${p.getStatusProposta().getStatusProposta()}"/></p>
                <section class="group-dados-gerais group">
                    <div>
                        <h6>Grupo e Cota</h6>
                        <h5><c:out value="${p.getDivida().getContrato().getNumContrato()}"/></h5>
                    </div>
                    <div>
                        <h6>Assessoria</h6>
                        <h5><c:out value="${p.getDivida().getContrato().getAssessoria().getNome()}"/></h5>
                    </div>
                    <div>
                        <h6>Administradora</h6>
                        <h5><c:out value="${p.getDivida().getContrato().getAdministradora().getNome()}"/></h5>
                    </div>
                </section>
                <section class="group-dados-divida group">

                    <div>
                        <h6>R$ Principal</h6>
                        <h5><c:out value="${p.getDivida().getVlrPrincipal()}"/></h5>
                    </div>
                    <div>
                        <h6>R$ Multas</h6>
                        <h5><c:out value="${p.getDivida().getVlrMultas()}"/></h5>
                    </div>
                    <div>
                        <h6>R$ Juros</h6>
                        <h5><c:out value="${p.getDivida().getVlrJuros()}"/></h5>
                    </div>
                    <div>
                        <h6>R$ Despesas</h6>
                        <h5><c:out value="${p.getDivida().getVlrDespesas()}"/></h5>
                    </div>
                    <div>
                        <h6>% Honorarios</h6>
                        <h5><c:out value="${p.getDivida().getPercHonorarios()}"/></h5>
                    </div>
                    <div>
                        <h6>R$ Categoria</h6>
                        <h5><c:out value="${p.getDivida().getVlrCategoria()}"/></h5>
                    </div>
                    <div>
                        <h6>% Saldo Devedor</h6>
                        <h5><c:out value="${p.getDivida().getPercSaldoDevedor()}"/></h5>
                    </div>
                    <div>
                        <h6>R$ POS</h6>
                        <h5><c:out value="${p.getDivida().getVlrPos()}"/></h5>
                    </div>
                    <div>
                        <h6>R$ Debitos do Bem</h6>
                        <h5><c:out value="${p.getDivida().getVlrDebitoBem()}"/></h5>
                    </div>
                    <div>
                        <h6>Dias em Atraso</h6>
                        <h5><c:out value="${p.getDivida().getDtAtraso()}"/></h5>
                    </div>

                </section>
                <section class="group-dados-proposta-mensagem">
                    <section class="group-dados-proposta group">

                        <div>
                            <h6>R$ Principal</h6>
                            <h5><c:out value="${p.getVlrPrincipal()}"/></h5>
                        </div>
                        <div>
                            <h6>R$ Multas</h6>
                            <h5><c:out value="${p.getVlrMultas()}"/></h5>
                        </div>
                        <div>
                            <h6>R$ Juros</h6>
                            <h5><c:out value="${p.getVlrJuros()}"/></h5>
                        </div>
                        <div>
                            <h6>R$ Despesas</h6>
                            <h5><c:out value="${p.getVlrDespesas()}"/></h5>
                        </div>
                        <div>
                            <h6>% Honorarios</h6>
                            <h5><c:out value="${p.getPercHO()}"/></h5>
                        </div>
                        <div>
                            <h6>Parcelas</h6>
                            <h5><c:out value="${p.getQtdParcela()}"/></h5>
                        </div>
                        <div class="">
                            <h6>Tipo de Proposta</h6>
                            <h5><c:out value="${p.getTipoProsposta()}"/></h5>
                        </div>
                        <div class="total">
                            <div class="">
                                <h6>Valor Total:</h6>
                                <p>50.000,00</p>
                            </div>
                            <div class="">
                                <h6>Valor Desconto:</h6>
                                <p>25.000,00</p>
                            </div>

                            <div class="">
                                <h6>% Desconto: </h6>
                                <p>54%</p>
                            </div>


                        </div>

                    </section>
                    <div class="mensagem">
                        <div class="conteudo-mensagem">
                            <c:forEach items="${m}" var="m">
                                <p><c:out value="${m.getConvesa()}"/></p>
                                <p><c:out value="${m.getConvesa()}"/></p>
                                <p><c:out value="${m.getConvesa()}"/></p>
                                <p><c:out value="${m.getConvesa()}"/></p>
                            </c:forEach>
                        </div>
                        
                        <div class="salvar-mensagem">
                            <input type="text" name="">
                            <a href="input?action=CadastrarMensagem&idProposta=${p.getId()}&texto=testandooooooo">
                                <button type="button" name="button" class="btn-mensagem">Salvar</button>
                            </a>
                        </div>
                    </div>

                </section>

                <div class="btns">
                    <a href="input?action=AlterarStatus&status=rejeitar&idProposta=${p.getId()}">
                        <button class="btn-acao btnCancelar">Rejeitar</button>
                    </a>
                    <a href="input?action=AlterarStatus&status=aprovar&idProposta=${p.getId()}">
                        <button class="btn-acao btnProposta">Aprovar</button>
                    </a>
                </div>
            </section>


        </main>
    </body>
</html>
