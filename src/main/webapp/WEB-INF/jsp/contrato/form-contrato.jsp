<%-- 
    Document   : form-contrato
    Created on : 18/12/2019, 19:37:36
    Author     : Thiago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <title>Contrato</title>

    </head>
    <body>
        <div class="tela-fundo"></div>
        <div class="main">
            <h1>Contrato</h1>
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

    </body>
</html>