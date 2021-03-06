### Backend Test - Aplicação de José Manuel Kassimo Júnior

[![Build Status](https://travis-ci.com/belezanaweb/test-java.svg?branch=master)](https://travis-ci.com/belezanaweb/test-java)

[![codecov](https://codecov.io/gh/belezanaweb/test-java/branch/master/graph/badge.svg)](https://codecov.io/gh/belezanaweb/test-java)


### Tarefas

Crie endpoints para as seguintes ações:


- [x] Criação de produto onde o payload será o json informado acima (exceto as propriedades **isMarketable** e **inventory.quantity**)

       POST /products

- [x] Edição de produto por **sku**

       PUT /products/{sku}

- [x] Recuperação de produto por **sku**

       GET /products/{sku}

- [x] Deleção de produto por **sku**

       DELETE /products/{sku}

Tarefa extra para facilitar na avaliação:

- [x] Recuperação de todos os produtos cadastrados

       GET /products


### Requisitos


- [x] Toda vez que um produto for recuperado por **sku** deverá ser calculado a propriedade: **inventory.quantity**

        A propriedade inventory.quantity é a soma da quantity dos warehouses

- [x] Toda vez que um produto for recuperado por **sku** deverá ser calculado a propriedade: **isMarketable**

        Um produto é marketable sempre que seu inventory.quantity for maior que 0

- [x] Caso um produto já existente em memória tente ser criado com o mesmo **sku** uma exceção deverá ser lançada

        Dois produtos são considerados iguais se os seus skus forem iguais


- [x] Ao atualizar um produto, o antigo deve ser sobrescrito com o que esta sendo enviado na requisição

        A requisição deve receber o sku e atualizar com o produto que tbm esta vindo na requisição

### Dicas

- Para rodar o projeto basta baixa-lo e ter instalados o `maven 3` e o `java 1.8`
- Na pasta do projeto, execute:
    - `mvn clean package` para empacotar e rodar testes
    - `mvn spring-boot:run` para executar a aplicação
