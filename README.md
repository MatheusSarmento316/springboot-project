Esse daqui consiste em um projeto feito em SpringBoot, criando uma API com a classe Pessoa, contendo colunas de id, nome, idade e CPF. Está também alinhada com
as tecnologias Postman e o PostgreSQL.

_______________________________________________________________________________________________________________

O projeto se baseia em uma arquitetura em camadas, contendo pastas separando Repository, Model, Service e Controller. O Repository, nesse projeto, é uma 
inteface que vai servir para extender o JPA, que irá traduzir operações sobre objetos em Java para os comandos do SQL, o Repository normalmente serve como 
ponte entre a aplicação e o banco de dados. O Model representa a entidade da aplicação, sendo nesse a entidade pessoa, criando colunas referentes a 
classe. O Service será onde fica as regras de negócio, possuindo os métodos de listaPessoas, buscarPorID, cadastrarPessoa e deletarPessoa. E, por último, o 
Controller, que irá coordenar as informações da URL determinar qual o método que será utilizado quando criados no Service.

_______________________________________________________________________________________________________________

Alguns pontos relevantes a serem ressaltados, é que ao se conectar com o PostgreSQL, foram utilizados variáveis de ambiente dentro do application.properties 
para determinar a URL do PostgreSQL em que serão armazenadas as informações, o usuário e a senha, tendo de ser adaptada ao modelo que o usuário está utilizando,
sendo eles:

spring.datasource.username={nome de usuário}

spring.datasource.password={senha do usuário}

spring.datasource.url=jdbc:postgresql://localhost:{porta}/{nome do banco}

Outro ponto, é ajustar a versão do Java que está sendo utilizada, isso pode ser feito no pom.xml do projeto.

O endpoint da api é: http://localhost:8080/api/pessoas

_______________________________________________________________________________________________________________

Para executar!!!

Vá no intelliJ

Clique no botão de listar projetos

Clique em "Clone Repository"

Em "URL" coloque: https://github.com/MatheusSarmento316/springboot-project

Aperte em "Clone"

Vá em application.properties

Ajuste o username, senha e url como citado acima

Ajuste a versão do Java que será usada

Rode o projeto em SpringBootProjectApplication
