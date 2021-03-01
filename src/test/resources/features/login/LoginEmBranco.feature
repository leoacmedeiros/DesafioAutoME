#language: pt
Funcionalidade: Login em branco

  Cenário: Acessar o site, clicar para logar, inserir email em branco e validar mensagem que o email é requerido
    Dado que acesse o site Automation Practice
    E acesse a opção para logar
    E informe os dados apenas da senha
      | password | 000000 |
    Quando clicar no botão Sign In
    Então o site deverá exibir mensagem que email é um campo obrigatório para logar
