
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="containerParcelas esconder">
    <div class="divImg">
        <img class="imgFechar" src="img/fechar.png" onclick="mostrarParcelas()">
    </div>
      <table>
        <thead>
          <tr>
            <th>Nº Parcela</th>
            <th>Valor</th>
            <th>Data Vencimento</th>
            <th>Data Pagamento</th>
            <th>Status</th>

          </tr>
        </thead>
        <tbody>
            <c:forEach  items="${p.getParcelas()}" var="p">
                <tr class="proposta">
                    <td class="nParcela"><c:out value="${p.getNumParcela()}"/></td>
                    <td class="Valor"><c:out value="${p.getVlrApagar()}"/></td>
                    <td class="dtVencimento"><c:out value="${p.getDtVencimento()}"/></td>
                    <td class="dtPagamento"><c:out value="${p.getDtPagamento()}"/></td>
                    <td class="tdStatus"><c:out value="${p.getStatusPagamento()}"/></td>
                </tr>
            </c:forEach>
        
         
          
        </tbody>
      </table>

    </div>
