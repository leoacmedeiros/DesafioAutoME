#language: pt
Funcionalidade: Login inválido

  Cenário: Acessar o site, clicar para logar, inserir login inválido e validar mensagem de login inválido
    Dado que acesse o site Automation Practice
    E acesse a opção para logar
    E informe os dados de email e senha
      | email    | logininvalido@email.com |
      | password |                  000000 |
    Quando clicar no botão Sign In
    Então o site deverá exibir mensagem que a autenticação falhou
