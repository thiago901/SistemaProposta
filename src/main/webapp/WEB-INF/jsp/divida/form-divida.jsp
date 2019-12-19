<%-- 
    Document   : form-divida
    Created on : 19/12/2019, 19:28:29
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="utf-8">
    <title>Inadimplencia</title>
    <link rel="stylesheet" href="css/inadimplencia.css">
  </head>
  <body>
    <div class="tela-fundo"></div>
    <div class="main">
      <h1>Inadimplencia</h1>
      <form action="/SistemaProposta/input?action=CadastrarDivida" method="Post">
        <label for="idNumContrato">Número do Contrato</label>
        <input id="idNumContrato" type="text" name="num-contrato" value="">
        <button type="button" name="button">Buscar</button>

        <div class="dadosInadimplencia">
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

          <label for="vlrCategoria">R$ Categoria</label>
          <input id="vlrCategoria" type="text" name="categoria" value="">

          <label for="vlrSaldoDev">R$ Saldo Dev.</label>
          <input id="vlrSaldoDev" type="text" name="perc-saldo-devedor" value="">

          <label for="vlrPOS">R$ POS</label>
          <input id="vlrPOS" type="text" name="POS" value="">

          <label for="vlrDebBem">R$ Debitos do Bem</label>
          <input id="vlrDebBem" type="text" name="debitos-bem" value="">

          <label for="dtAtraso">Data de Atraso</label>
          <input id="dtAtraso" type="text" name="dt-atraso" value="">
        </div>
        <button type="button" name="button">Cancelar</button>
        <button type="submit" name="button">Salvar</button>
      </form>
    </div>

  </body>
</html>
