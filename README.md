# Microserviço para envio de Email.

Aplicação autonoma e independente, baseado na arquitetura de <b>microserviço</b>, com a finalidade em envios de emails para determinado usuário, sendo de forma <b>síncrona</b>  e  <b>assíncrona</b> ou sendo através de uma API REST e através da mensageria.

## Resumo

Aplicação desenvolvido utilizando Java em conjunto com o framework Spring Boot, banco de dados relacional PostgreSQL, protocolo de mensageria MQTT e Docker para criação de containers invididuais e isolados de cada ferramenta.

## Organização:
 
 * config/
 * consumers/
 * controllers/
 * dtos/
 * enums/
 * models/
 * repositories/
 * services/


## Linguagens e ferramentas:

<div>

<p align="left"> 
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/docker/docker-original-wordmark.svg" alt="docker" width="40" height="40"/>
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/>
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="40" height="40"/>
  <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/>
</p>
  
</div>


## Requisitos

* Necessário possuir Docker e Docker Compose instalado;
* Necessário possuir o Maven para gerar o .jar.



## Instruções

1. Configurar as credenciais do email no projeto Spring, em application.properties;


2. Gerar o arquivo .jar do projeto em Spring boot, e colocar dentro da pasta /email/target/  


3. Executar o comando Docker compose para criar os containers:
```shell  
   docker-compose up    ou    docker-compose up -d
```

* Logo a API REST irá estar rodando no porta 8000

* RabbitMQ irá estar rodando no porta 15672

* PostgreSQL irá estar rodando no porta 5432