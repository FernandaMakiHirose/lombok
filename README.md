# Aumente sua Produtividade com Spring Boot e Lombok
- [Lombok](https://projectlombok.org/)
- [Features](https://projectlombok.org/features/all)

Para executar o projeto:
>mvn spring-boot:run

## Requisitos
- IDE
- Java
- Maven

## Licença
Distribuido sob a licença MIT License. Veja `LICENSE` para mais informações.

## Spring Initializr
- Maven
- Java
- Spring Boot 2.5.2
- Dependências: Spring Web (necessário para fazer API), Spring Data JPA (acessar o banco de dados), PostgreSQL Driver (banco de dados)

## Entendendo o código 
`application.properties`: apresenta as configurações com o banco de dados. <br>
`pom.xml`: apresenta as configurações do projeto, o Lombok foi adicionado aqui. <br>
`model`: mapeamento da entidade. <br>
`controller`: métodos HTTP. <br>
`repository`: conexão com o banco de dados. <br>
