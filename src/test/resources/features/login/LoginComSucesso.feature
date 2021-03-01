#language: pt
Funcionalidade: Realizar login no site com sucesso

  Cenário: Acessar o site e realizar o login com sucesso
    Dado que acesse o site Automation Practice
    E acesse a opção para logar
    E informe os dados de email e senha
      | email    | teste@testes.com |
      | password |           123456 |
    Quando clicar no botão Sign In
    Então o usuário irá logar no sistema  
