#language: pt
@acessar_varios_componentes_html
Funcionalidade: Acessar vários componentes html

  Contexto:
    Dado que o usuário acessou o arquivo Campo de treinamento

  @Validar_campo_textfield_area
  Esquema do Cenário: Validar campo textfield e textarea
    Quando o usuário digitar <texto>
    Então o resultado no campo <campo> deve ser <texto>
    Exemplos:
      | texto               | campo     |
      | Batatinha           | textfield |
      | Batatinha Batatinha | textarea  |

  @Validar_campo_radiobutton
  Cenário: Validar o campo radiobutton
    Quando o usuário selecionar radio
    Então o valor do radiobutton deve ser true
  @validar_checkbox
  Cenário: Validar o campo checkbox
    Quando o usuário selecionar o checkbos
    Então o valor do checkbox deve ser true

  @validar_selecao_combobox
  Cenário: Validar elemento combobox escolaridade pelo valor
    Quando o usuário selecionar o valor no combo
    Então o valor selecionado deve ser apresentado

  @validar_quantidade_opcoes_combobox_escolaridade
  Cenário: Validar a quantidade de opções possui na combobox
    Quando o usuario clicar no elemento combobox
    Então o elemento deve conter oito opções

  @selecionar_opção_mestrado
  Cenário: Selecionar opção mestrado
    Quando o usuário selecionar a opção mestrado
    Então a opção mestrado deve ser selecionada

  @validar_elemento_combo_multipla
  Cenário: Validar elemento Combo Múltipla
    Quando o usuário selecionar um valor no elemento campo de múltipla escolha
    Então o valor deve aparecer selecionado no elemento combobox de múltipla escolha

  @interagir_botao
  Cenário: Interagir com o Botão
    Quando o usuário clicar no botão Clique Me
    Então o nome do botão deve ser alterado para Obrigado

  @interagir_alert_simples
  Cenário: Iteragir com alerta simples
    Quando o usuario clicar no botão Alert
    Então deve aparecer a mensagem de feedback ALert Simples

  @interagir_alert_botao_confirmar
  Esquema do Cenário: Cenário: Iteragir com alerta do botao confirmar
    Dado que o usuario clicou no botão Confirm
    E aparecer a mensagem de confirmação Confirm Simples
    Quando ao usuário clicar em <opcao>
    Então deve aparecer a mensagem de feedback <retorno>
    Exemplos:
      | opcao    | retorno    |
      | Ok       | Confirmado |
      | Cancelar | Negado     |