#language: pt
  Funcionalidade: Acessar vários componentes html

    Contexto:
      Dado que o usuário acessou o arquivo Campo de treinamento

    Cenário: Validar campo textfield
      Quando o usuário digitar Batatinha
      Então o resultado no campo textfield deve ser Batatinha

