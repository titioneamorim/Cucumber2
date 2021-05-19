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

    }

    @Quando("o usuário digitar Batatinha")
    public void o_usuário_digitar_Batatinha() {
        componentes.testeTextField();
    }

    @Então("o resultado no campo textfield deve ser Batatinha")
    public void o_resultado_no_campo_textfield_deve_ser_Batatinha() {
        componentes.validaTextField();
        componentes.fecharNavegador();
    }

    @Quando("o usuário digitar Batatinha Batatinha")
    public void o_usuário_digitar_Batatinha_Batatinha() {
        componentes.testeTextArea();
    }

    @Então("o resultado no campo textarea deve ser Batatinha Batatinha")
    public void o_resultado_no_campo_textarea_deve_ser_Batatinha_Batatinha() {
        componentes.validaTextArea();
        componentes.fecharNavegador();
    }

    @Quando("o usuário selecionar radio")
    public void o_usuário_selecionar_radio() {
        componentes.testeSelecaoRadioButton("elementosForm:sexo:0");
    }

    @Então("o valor do radiobutton deve ser true")
    public void o_valor_do_radiobutton_deve_ser_true() {
        componentes.validaSelecaoCheckBox("elementosForm:sexo:0");
        componentes.fecharNavegador();
    }

    @Quando("o usuário selecionar o checkbos")
    public void o_usuário_selecionar_o_checkbos() {
       componentes.testeSelecaoCheckBox("elementosForm:comidaFavorita:0");
    }

    @Então("o valor do checkbox deve ser true")
    public void o_valor_do_checkbox_deve_ser_true() {
        componentes.validaSelecaoCheckBox("elementosForm:comidaFavorita:0");
        componentes.fecharNavegador();
    }

    @Quando("o usuário selecionar o valor no combo")
    public void o_usuário_selecionar_o_valor_no_combo() {
        componentes.selecionarValorCOmbobox();
    }

    @Então("o valor selecionado deve ser apresentado")
    public void o_valor_selecionado_deve_ser_apresentado() {
        componentes.selecionarValorCOmbobox();
        componentes.fecharNavegador();
    }

    @Quando("o usuario clicar no elemento combobox")
    public void o_usuario_clicar_no_elemento_combobox() {
        componentes.listarQuantidadeCombobox();
    }

    @Então("o elemento deve conter oito opções")
    public void o_elemento_deve_conter_oito_opções() {
        componentes.validaQuantidadeCombo();
        componentes.fecharNavegador();
    }

    @Quando("o usuário selecionar a opção mestrado")
    public void o_usuário_selecionar_a_opção_mestrado() {
        componentes.selecionarValorPeloTexto("mestrado");
    }

    @Então("a opção mestrado deve ser selecionada")
    public void a_opção_Mestrado_deve_ser_selecionada() {
        componentes.validaOpcaoSelecionada("Mestrado");
        componentes.fecharNavegador();
    }

    @Quando("o usuário selecionar um valor no elemento campo de múltipla escolha")
    public void o_usuário_selecionar_um_valor_no_elemento_campo_de_múltipla_escolha() {
        componentes.selecionarValorComboMultiplo();
    }

    @Então("o valor deve aparecer selecionado no elemento combobox de múltipla escolha")
    public void o_valor_deve_aparecer_selecionado_no_elemento_combobox_de_múltipla_escolha() {
        componentes.vaidaValorComboMultiplo();
        componentes.fecharNavegador();
    }

    @Quando("o usuário clicar no botão Clique Me")
    public void o_usuário_clicar_no_botão_Clique_Me() {
        componentes.interageBotao();
    }

    @Então("o nome do botão deve ser alterado para Obrigado")
    public void o_nome_do_botão_deve_ser_alterado_para_Obrigado() {
        componentes.validaInteracaoBtao();
    }

    @Quando("o usuario clicar no botão Alert")
    public void o_usuario_clicar_no_botão_Alert() {
        componentes.interageBotaoAlert();
    }

    @Então("deve aparecer a mensagem de feedback ALert Simples")
    public void deve_aparecer_a_mensagem_de_feedback_ALert_Simples() {
        componentes.validaInteracaoAlert();
        componentes.fecharNavegador();
    }

    @Dado("que o usuario clicou no botão Confirm")
    public void que_o_usuario_clicou_no_botão_Confirm() {
        componentes.interageBotaoConfirm();
    }

    @Dado("aparecer a mensagem de confirmação Confirm Simples")
    public void aparecer_a_mensagem_de_confirmação_Confirm_Simples() {
        componentes.validaInteracaoAlertConfirm("Confirm Simples");
    }

    @Quando("ao usuário clicar em Ok")
    public void ao_usuário_clicar_em_Ok() {
        componentes.interageAlertConfirmOk();
    }

    @Então("deve aparecer a mensagem de feedback Confirmado")
    public void deve_aparecer_a_mensagem_de_feedback_Confirmado() {
        componentes.validaInteracaoAlertConfirm("Confirmado");

    }

    @Quando("ao usuário clicar em Cancelar")
    public void ao_usuário_clicar_em_Cancelar() {
        componentes.interageAlertConfirmCancelar();
    }

    @Então("deve aparecer a mensagem de feedback Negado")
    public void deve_aparecer_a_mensagem_de_feedback_Negado() {
        componentes.validaInteracaoAlertConfirm("Negado");

    }
}