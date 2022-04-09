# Limbo

Guarde e encontre suas coisas no limbo.

## Para desenvolvedores

Para compilar: 

    (Windows)
    > ./mvnw clean package

Script que espera o banco subir:

  $ ./wait-for-mariadb.sh 172.20.176.1 LIMBO dvp123

Docker start:

    (Windows: na pasta raiz do projeto)
    > docker-compose.exe --env-file limbo-dev.env -f docker-compose.yml -p limbo-dev up -d

Docker DB shell :

    >  docker exec -it db bash

## JetBrains IntelliJ IDEA

Para executar durante o desenvolvimento:

1. Inicie o db container com a opção "Enviroment Variables File" apontando para o arquivo "limbo-dev.env";
2. 

## SPRING DATA REST

### Stock Items:

- http://localhost:8080/stockItems
- http://localhost:8080/stockItem/1


