package gof.facade;

import subsistema1.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {

    String cidade = subsistema2.cep.CepApi.getInstancia().recuperarCidade(cep);
    String estado = subsistema2.cep.CepApi.getInstancia().recuperarEstado(cep);

    CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
