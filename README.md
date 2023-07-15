# Exercício Módulo 4: Infos dos Rebeldes

Este exercício emula um programa para gerenciamento de Rebeldes contra o Império, permitindo cadastrar novos integrantes, atualizar sua localização, fazer compras e delatar que for traidor.

## Base de dados
A base de dados do programa foi originalmente codificada em PostgreSQL, mas seus dados de SQL estão disponíveis no diretório SQL através dos aqrquivos *tabelas.sql* (arquivo para criação da DB) e *dados-teste.sql* (arquivo com alguns dados de teste que foram feitos todos os testes.
A base de dado está configurada do seguinte jeito: 
![Diagrama da base de dados](https://raw.githubusercontent.com/tiofaso/ExercioModulo4InfosRebeldes/main/src/main/java/img/infosrebeldes-diagramadb.png)

## Menu
O programa possui 9 (nove) opções no menu, as quais são as seguintes:

 1. Inserir Rebelde no sistema
 2. Atualizar Localização do Rebelde
 3. Mostrar base de Rebeldes
 4. Mostrar inventário dos Rebeldes
 5. Mostrar localização dos Rebeldes
 6. Denunciar Rebeldes
 7. Mercado
 8. Mostrar compras no mercado
 9. Relatórios

**1. Inserir Rebelde no sistema**
Para inserir um Rebelde no sistema precisa apenas digitar o seu nome, idade, gênero (temos 6 opções) e a sua terra natal. Após realizar esse cadastro inicial será solicitado que descreva os itens que o mesmo carrega para deixar armazenado no iventário. Esse último recurso permite escrever livremente, mas o ideal é montar listas para manter a organização. Ao término basta digitar **-fim** que o sistema automaticamente encerrará o cadastro.

**2. Atualizar Localização do Rebelde**
Inicialmente os Rebeldes estão fazendo o seu primeiro cadastro na algfândega da nossa base, mas conforme eles partem em missão é de suma importância manter um registro atualizado de seus paradeiros. Essa função é simples de realizar: basta pegar o número único de identificação (o **id**) que o sistema automaticamente identificará o Rebelde, bastando apenas registrar em que lugar elu está.
>
> **Note**:
 Importante: a data e hora cadastrados em nossa base é apenas relativa à entrada do registro no sistema.

**3. Mostrar a base de Rebeldes**
Essa opção é simples e direta: mostra uma lista de quase todos os dados de cada Rebelde incluído em nosso sistema, inclusive a sua situação *(status)*. Ela é uma lista rápida para observar como estão os cadastros

**4. Mostrar inventário dos Rebeldes**
Da mesma forma que a opção anterior este também mostra informações sobre os Rebeldes, mas permite uma visualização individualizada e mais completa a partir do **id** delu.

**5. Mostrar a localização dos Rebeldes**
Para as lideranças conseguirem acompanhar onde cada Rebelde está localizado e assim promover as melhores estratégias, essa opção foi implementada. Ela exibe todo o histórico de localizações de cada Rebelde a partir da pesquisa do seu **id**.

**6. Denunciar Rebeldes**
Infelizmente alguns de nós partimos pro lado do inimigo e para não ter frutas podres dentro do nosso esforço de batalha é possível  denunciar quem nos está traindo. Para tal o denunciante precisa se identificar através do seu **id** e indicar o **id** do suposto traidor. Após três denúncias o suposto traidor é inativado em nossa base, **perdendo acesso aos recursos de compra de produtos** até uma averiguação forma por parte do nossa cadeia de comando.

**7. Mercado**
Para manter a cadeia de suprimentos sempre em funcionamento cada Rebelde ativo em nosso sistema pode solicitar compras de armas, munição, água e comida que serão entregues por nossos *courriers*. No final de cada compra aparecem os valores individuais e totais de créditos a serem pagos.

**8. Mostrar compras no mercado**
Visando facilitar as entregas de suprimentos é possível ver todas as compras feitas em nosso sistema, com suas quantidades, quem solicitou e a data e hora da compra.

**9. Relatórios**
É uma opção simples e rápida para mostrar quantos Rebeldes e quantos traidores há em nossa base de dados.

*Que a força esteja com você!*
