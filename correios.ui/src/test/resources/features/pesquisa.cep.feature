#Author: correios.com.br
@regressivo
Feature: Buscar pelo cep ou pelo endereco
  Como Usuario
  Quero informar dados de busca
  Para encontrar o endereco


 Scenario: Buscar cep ou endereco com dados validos
		Given que esteja no site
		When preencho os dados  validos
		Then valido dados do endereco

  

  