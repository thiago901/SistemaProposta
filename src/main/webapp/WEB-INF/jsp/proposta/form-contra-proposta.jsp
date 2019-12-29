<%-- 
    Document   : form-proposta
    Created on : 19/12/2019, 20:49:34
    Author     : Thiago
--%>




<div class="containerContraProposta">

    <form autocomplete="off" action="/SistemaProposta/input?action=CadastrarContraProposta" method="Post">

        <div class="dadosContraProposta">
            
            <div hidden="">
                <label for="idProposta">idProposta</label>
                <input id="idProposta" type="text" name="idProposta" value="${p.getId()}">
            </div>

            <div>
                <label for="vlrPrincipal">R$ Principal</label>
                <input id="vlrPrincipal" type="text" name="principal" value="">
            </div>

            <div>
                <label for="vlrMultas">R$ Multas</label>
                <input id="vlrMultas" type="text" name="multas" value="">
            </div>
            <div>
                <label for="vlrJuros">R$ Juros</label>
                <input id="vlrJuros" type="text" name="juros" value="">
            </div>

            <div>
                <label for="vlrDespesas">R$ Despesas</label>
                <input id="vlrDespesas" type="text" name="despesas" value="">
            </div>

            <div>
                <label for="percHonorarios">% Honorarios</label>
                <input id="percHonorarios" type="text" name="perc-honorarios" value="">
            </div>

            
            <div>
            <label for="qtdParcela">Qtd Parcela</label>
            <input id="qtdParcela" type="text" name="qtd-parcela" value="">
            </div>
            <div class="tipo-proposta">
                <div>
                <input id="rd-quitacao"type="radio" name="tipo-proposta" value="Quitacao">
                <label for="rd-quitacao">Quitação</label>
                </div>
                <div>
                <input id="rd-atualizacao" type="radio" name="tipo-proposta" value="Atualizacao">
                <label for="rd-atualizacao">Atualização</label>
                </div>
            </div>
        </div>
        <button onclick="mostrarContraProposta()"  type="button" name="button">Cancelar</button>
        
        <button type="submit" name="button">Salvar</button>                        
               
    </form>
</div>
