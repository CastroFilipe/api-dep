## Desafio

API criada em reposta ao desafio proposto pela empresa Vibe Tecnologia.
Este projeto fornece uma API para consultas de dados de parlamentares da câmara legislativa.

### Principais tecnologias utilizadas: 
- Spring Boot
- Spring Data JPA/JPQL
- Java 8
- Swagger - para documentação básica.
- PostgreSQL
- SQL 

##### OBS: O projeto não possui interface para usuários(front-end) apenas a API com os recursos disponibilizados e documentados.

### Instruções de execução.
Importar o projeto para alguma IDE e criar a base de dados nomeada como ‘base’.
O usuário e senha devem ser: ‘postgres’ e ‘root’ respectivamente.

Se preferir poderá modificar as propriedades url, username e password no arquivo application.properties para utilizar outra configuração de banco de dados. A geração do banco será feita pelo hibernate/jpa quando a aplicação for executada.

Quando a aplicação estiver rodando, o acesso a documentação básica pelo swagger poderá ser feito por : http://localhost:8080/swagger-ui.html#/ 

 
