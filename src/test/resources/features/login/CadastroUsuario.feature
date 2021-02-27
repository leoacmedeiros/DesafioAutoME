#language: pt
Funcionalidade: Cadastro de usuário com sucesso

  Cenário: Cadastrar usuário
    Dado que acesse o site Automation Practice
    E clique para se cadastrar
    E digite o endereço de e-mail para iniciar o cadastro
    E clique em Create an account
    Então irá aparecer os campos para preenchimento do cadastro de usário
    E preencha os dados do formulário de cadastro
      | Title | Mr. |
      | First Name | Leonardo  |
      | Last Name | Medeiros |
      | Password | 123456 |
      | Date of Birth | 5 | 
      | Company | Mercado Eletrônico |
      | Address | R. Gomes de Carvalho, 1195 - Vila Olímpia, São Paulo - SP |
      | Address Line 2 | Loja 50 |
      | City | São Paulo |
      | State | Arizona |
      | Zip/Postal Code | 04547 |
      | Additional information |  Teste de automação para entrevista Mercado Eletrônico |
      | Home phone | 6133358877 |
      | Mobile phone | 6199652310 |
      | Address alias for future reference | Rua Siqueira, n 167 travessa 8 |
      Quando clicar em Register
      Então o usuário será criado
      
      
      
      
      
      
