
---

# Gerenciador de Projetos e Tarefas

Aplicação web para gerenciamento de projetos e tarefas, desenvolvida com **Java Server Faces (JSF)**, **Spring Framework**, **Hibernate** e **PostgreSQL**. Permite cadastrar, visualizar, editar e excluir projetos e suas respectivas tarefas.

---

## 🛠️ Tecnologias Utilizadas

- **Frontend**:
  - Java Server Faces (JSF 2.2)
  - RichFaces (4.6.2) para componentes ricos.
- **Backend**:
  - Spring Framework (5.3.20) para injeção de dependência e camada de negócio.
- **Persistência**:
  - Hibernate (5.6.9) como ORM.
  - PostgreSQL como banco de dados.
  - HQL (Hibernate Query Language) para consultas.
- **Ferramentas**:
  - Maven para gerenciamento de dependências.
  - Apache Tomcat 9+ como servidor de aplicações.

---

## ⚙️ Pré-requisitos

- Java JDK 11+
- Maven 3.8+
- PostgreSQL 14+
- Apache Tomcat 9+
- IntelliJ IDEA (ou outra IDE de sua preferência).

---

## 🚀 Instalação e Configuração

### 1. Clone o Repositório
```bash
git clone https://github.com/seu-usuario/gerenciador_projetos_desafio.git
cd gerenciador_projetos_desafio
```

### 2. Configure o Banco de Dados
1. Crie um banco de dados no PostgreSQL:
   ```sql
   CREATE DATABASE gerenciamento_projetos;
   ```
2. Atualize as credenciais no arquivo `persistence.xml`:
   ```xml
   <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/cead" />
   <property name="javax.persistence.jdbc.user" value="SEU_USUARIO" />
   <property name="javax.persistence.jdbc.password" value="SUA_SENHA" />
   ```

### 3. Build do Projeto
```bash
mvn clean install
```

### 4. Implantação no Tomcat
1. Copie o arquivo `.war` gerado na pasta `target` para a pasta `webapps` do Tomcat.
2. Inicie o servidor Tomcat:
   ```bash
   # Linux/Mac
   ./bin/startup.sh

   # Windows
   bin\startup.bat
   ```

### 5. Acesso à Aplicação
Abra o navegador e acesse:
```
http://localhost:8080/desafio-cead
```


# Gerenciador de Projetos e Tarefas

Aplicação web para gerenciamento de projetos e tarefas, desenvolvida com **Java Server Faces (JSF)**, **Spring Framework**, **Hibernate** e **PostgreSQL**. Permite cadastrar, visualizar, editar e excluir projetos e suas respectivas tarefas.

---

## 🛠️ Tecnologias Utilizadas

- **Frontend**:
  - Java Server Faces (JSF 2.2)
  - RichFaces (4.6.2) para componentes ricos.
- **Backend**:
  - Spring Framework (5.3.20) para injeção de dependência e camada de negócio.
- **Persistência**:
  - Hibernate (5.6.9) como ORM.
  - PostgreSQL como banco de dados.
  - HQL (Hibernate Query Language) para consultas.
- **Ferramentas**:
  - Maven para gerenciamento de dependências.
  - Apache Tomcat 9+ como servidor de aplicações.

---

## ⚙️ Pré-requisitos

- Java JDK 11+
- Maven 3.8+
- PostgreSQL 14+
- Apache Tomcat 9+
- IntelliJ IDEA (ou outra IDE de sua preferência).

---

## 🚀 Instalação e Configuração

### 1. Clone o Repositório
```bash
git clone https://github.com/seu-usuario/gerenciador_projetos_desafio.git
cd gerenciador_projetos_desafio
```

### 2. Configure o Banco de Dados
1. Crie um banco de dados no PostgreSQL:
   ```sql
   CREATE DATABASE gerenciamento_projetos;
   ```
2. Atualize as credenciais no arquivo `persistence.xml`:
   ```xml
   <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/gerenciamento_projetos" />
   <property name="javax.persistence.jdbc.user" value="SEU_USUARIO" />
   <property name="javax.persistence.jdbc.password" value="SUA_SENHA" />
   ```

### 3. Build do Projeto
```bash
mvn clean install
```

### 4. Implantação no Tomcat
1. Copie o arquivo `.war` gerado na pasta `target` para a pasta `webapps` do Tomcat.
2. Inicie o servidor Tomcat:
   ```bash
   # Linux/Mac
   ./bin/startup.sh

   # Windows
   bin\startup.bat
   ```

### 5. Acesso à Aplicação
Abra o navegador e acesse:
```
http://localhost:8080/gerenciador_projetos_desafio
```

---

## 🗂️ Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── exemplo/
│   │           ├── controller/  # Managed Beans JSF
│   │           ├── dao/         # Classes DAO (Data Access Object)
│   │           ├── model/       # Entidades JPA (Projeto e Tarefa)
│   │           └── service/     # Camada de serviço
│   ├── resources/│   │     
│   │       └── applicationContext.xml # Configuração do Hibernate
|   |       └── hibernate.cfg.xml # Configuração do Hibernate
│   └── webapp/
│       ├── WEB-INF/
│       │   └── applicationContext.xml # Configuração do JSF
|       |   └── faces-config.xml # Configuração do JSF
            └── web.xml # Configuração do JSF 
│       ├── index.xhtml          # Página inicial
│       
└── test/                       
```

---

## 📋 Funcionalidades

- **Cadastro de Projetos**:
  - Título, descrição e data de início.
- **Listagem de Projetos**:
  - Visualizar, editar e excluir projetos.
- **Cadastro de Tarefas**:
  - Título, descrição, prioridade (Muito Alta, Alta, Baixa, Muito Baixa) e estimativa em horas.
- **Listagem de Tarefas**:
  - Visualizar, editar e excluir tarefas associadas a um projeto.

---

## 🔧 Configurações Adicionais

### Spring Framework
- A injeção de dependências está configurada em `applicationContext.xml`.
- Os serviços (`ProjetoService`, `TarefaService`) são gerenciados pelo Spring.

### RichFaces
- Componentes ricos como `<rich:dataTable>` e `<rich:calendar>` são utilizados nas páginas `.xhtml`.

---

## 📌 Observações

- Após a avaliação, esteja preparado para apresentar o projeto e explicar as decisões técnicas tomadas.
- Adicione testes unitários e validações de entrada para aprimorar a robustez da aplicação.

---

--

## 📋 Funcionalidades

- **Cadastro de Projetos**:
  - Título, descrição e data de início.
- **Listagem de Projetos**:
  - Visualizar, editar e excluir projetos.
- **Cadastro de Tarefas**:
  - Título, descrição, prioridade (Muito Alta, Alta, Baixa, Muito Baixa) e estimativa em horas.
- **Listagem de Tarefas**:
  - Visualizar, editar e excluir tarefas associadas a um projeto.

---

## 🔧 Configurações Adicionais

### Spring Framework
- A injeção de dependências está configurada em `applicationContext.xml`.
- Os serviços (`ProjetoService`, `TarefaService`) são gerenciados pelo Spring.

### RichFaces
- Componentes ricos como `<rich:dataTable>` e `<rich:calendar>` são utilizados nas páginas `.xhtml`.

