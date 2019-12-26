<%-- 
    Document   : form-proposta
    Created on : 19/12/2019, 20:49:34
    Author     : Thiago
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="utf-8">
    <title>Proposta</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/analise-proposta.css">

    <link href="https://fonts.googleapis.com/css?family=Noto+Sans|Poppins&display=swap" rel="stylesheet">
  </head>

  <body>
    <header>
      <nav class="menu">
        <ul>
          <li><a href="">Pagina Inicial</a></li>
          <li><a href="">Administradora</a>
              <ul>
                <li><a href="#">Cadastrar</a></li>
                <li><a href="#">Listar</a></li>
              </ul>
          </li>
          <li><a href="">Assessoria</a>
            <ul>
              <li><a href="#">Cadastrar</a></li>
              <li><a href="#">Listar</a></li>
            </ul>
          </li>
          <li><a href="">Divida</a>
            <ul>
              <li><a href="#">Cadastrar</a></li>
            </ul>
          </li>
          <li><a href="">Proposta</a>
            <ul>
              <li><a href="#">Cadastrar</a></li>
              <li><a href="#">Lista de Analise</a></li>
            </ul>
          </li>
          <li class="contato"><a href="">Contato</a></li>
        </ul>

      </nav>
    </header>

    <div class="container">
        <a href="/SistemaProposta/input?action=FormPropostaLista">Voltar</a>
      <div class="dadosDivida">
        <div class="dadosGerais">
          <div class="">
            <h6>Numero do Contrato</h6>
            <p><c:out value="${p.getDivida().getContrato().getNumContrato()}"/></p>
          </div>
          
          <div class="">
            <h6>Nome Assessoria:</h6>
            <p><c:out value="${p.getDivida().getContrato().getAssessoria().getNome()}"/></p>
          </div>
          <div class="">
            <h6>Nome Administradora:</h6>
            <p><c:out value="${p.getDivida().getContrato().getAdministradora().getNome()}"/></p>
          </div>

        </div>
        <div class="valoresDivida">
            
          <div class="">
            <h6>R$ Principal:</h6>
            <p><c:out value="${p.getDivida().getVlrPrincipal()}"/></p>
          </div>
          <div class="">
            <h6>R$ Multas:</h6>
            <p><c:out value="${p.getDivida().getVlrMultas()}"/></p>
          </div>

          <div class="">
            <h6>R$ Juros:</h6>
            <p><c:out value="${p.getDivida().getVlrJuros()}"/></p>
          </div>

          <div class="">
            <h6>R$ Despesas:</h6>
            <p><c:out value="${p.getDivida().getVlrDespesas()}"/></p>
          </div>

          <div class="">
            <h6>% Honorarios:</h6>
            <p><c:out value="${p.getDivida().getPercHonorarios()}"/></p>
          </div>

          <div class="">
            <h6>R$ Categoria:</h6>
            <p><c:out value="${p.getDivida().getVlrCategoria()}"/></p>
          </div>

          <div class="">
            <h6>R$ Saldo Devedor:</h6>
            <p><c:out value="${p.getDivida().getPercSaldoDevedor()}"/></p>
          </div>

          <div class="">
            <h6>R$ POS:</h6>
            <p><c:out value="${p.getDivida().getVlrPos()}"/></p>
          </div>

          <div class="">
            <h6>R$ POS:</h6>
            <p><c:out value="${p.getDivida().getVlrPos()}"/></p>
          </div>

          <div class="">
            <h6>Data do Atraso:</h6>
            <p><c:out value="${p.getDivida().getDtAtraso()}"/></p>
          </div>


        </div>
      </div>

      <div class="proposta">


        <div class="proposta-mensagem">
          <div class="dadosProposta">
            <div class="">
              <h6>R$ Principal:</h6>
              <p><c:out value="${p.getVlrPrincipal()}"/></p>
            </div>

            <div class="">
              <h6>R$ Multas:</h6>
              <p><c:out value="${p.getVlrMultas()}"/></p>
            </div>
            <div class="">
              <h6>R$ Juros:</h6>
              <p><c:out value="${p.getVlrJuros()}"/></p>
            </div>

            <div class="">
              <h6>R$ Despesas:</h6>
              <p><c:out value="${p.getVlrDespesas()}"/></p>
            </div>

            <div class="">
              <h6>% Honorarios:</h6>
              <p><c:out value="${p.getPercHO()}"/></p>
            </div>
            <div class="">
              <h6>Parcelas:</h6>
              <p><c:out value="${p.getQtdParcela()}"/></p>
            </div>

            <div class="tipoProposta">
              <div class="atualizacao">
                <input id="tpAtualizacao" type="radio" name="tipo" value="Atualizacao">
                <label for="tpAtualizacao">Atualização</label>
              </div>
              <div class="quitacao">
                <input id="tpQuitacao" type="radio" name="tipo" value="Quitacao">
                <label for="tpQuitacao">Quitação</label>

              </div>
            </div>
            <div class="resumo">
              <h6>Total: 1.150.150.000,00</h6>
              <h6>Desc.: 50.000,00</h6>
              <h6>% Desc.: 50%</h6>
            </div>
            <div class="">
              <button type="button" name="button" class="btnContraProposta">Contra Proposta</button>
            </div>
          </div>


        <div class="mensagens">
            <div class="mensagen">
              <textarea class="textArea" name="name" rows="8" cols="65">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</textarea>
            </div>
            <div class="escreverMensagemEnviar">
              <textarea class="escreveMensagem" name="name" rows="2" cols="50"></textarea>
              <button type="button" name="button" class="btnEnviar">Salvar</button>
            </div>

        </div>

        </div>




        <div class="botoes">
          <button type="button" name="button" class="btnRejeitar">Rejeitar</button>
          <button type="button" name="button" class="btnAprovar">Aprovar</button>
        </div>

      </div>


    </div>

  </body>
</html>
