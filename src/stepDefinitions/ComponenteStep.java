package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import util.Componentes;

public class ComponenteStep {

    Componentes componentes = new Componentes();

    @Dado("que o usuário acessou o arquivo Campo de treinamento")
    public void que_o_usuário_acessou_o_arquivo_Campo_de_treinamento() {
        componentes.inicializa();
        componentes.fecharNavegador();
    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("o resultado no campo textfield deve ser Batatinha")
    public void o_resultado_no_campo_textfield_deve_ser_Batatinha() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
