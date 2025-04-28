
# 🌿 Botanica BackEnd 🌿

Bem-vindo ao **Botanica BackEnd**!  
O motor por trás do seu **Botanica FrontEnd**, construído com **Spring Boot** e **Java 21**. 🌱

Este repositório contém a implementação do backend da plataforma **Botanica**, proporcionando toda a lógica de negócios e a persistência de dados relacionados às plantas.

---

## 🛠️ Tecnologias Utilizadas 💻

- **Spring Boot** 🧰 — Framework para construção de APIs.
- **Java 21** ☕ — Linguagem de programação principal.
- **Spring Data JPA** 📊 — Persistência de dados com Hibernate.
- **Spring Validation** ✅ — Validação de dados.
- **MySQL** 🗄️ — Banco de dados relacional.
- **Maven** ⚙️ — Gerenciamento de dependências.
- **Spring Boot DevTools** 🔄 — Ferramentas de desenvolvimento para agilizar o processo.

---

## ✨ Funcionalidades Principais ✨

O **Botanica BackEnd** oferece:

- **Gestão de Plantas** 🌿: CRUD (criação, leitura, atualização e exclusão) de informações sobre plantas.
- **Persistência de Dados** 💾: Conexão e operações com banco de dados MySQL.
- **Validação de Dados** ✅: Garantia de dados corretos através do Spring Validation.
- **Testes Automatizados** 🧪: Testes de unidade utilizando Spring Boot.
- **Segurança** 🔐: (Planejado) Configuração de autenticação e autorização com Spring Security.

---

## 🚀 Instalação e Execução 🛠️

Siga os passos abaixo para rodar o projeto no seu ambiente local:

### 1️⃣ Clone o repositório:

```bash
git clone https://github.com/botanicad/Botanica-BackEnd.git
```

### 2️⃣ Instale as dependências:

```bash
cd Botanica-BackEnd
mvn install
```

### 3️⃣ Execute a aplicação:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080).

---

## 📁 Estrutura do Projeto 🏗️

```plaintext
Botanica-BackEnd/
│
├── src/
│   ├── main/java/com/lista/        # Código fonte principal
│   │   ├── controller/             # Controladores REST
│   │   ├── model/                  # Modelos de dados (Entidades)
│   │   ├── repository/             # Repositórios JPA
│   │   ├── service/                # Lógica de negócios
│   ├── main/resources/             # Arquivos de configuração (application.properties, etc)
│   ├── test/                       # Testes automatizados
├── pom.xml                         # Gerenciador de dependências (Maven)
└── README.md                       # Este arquivo!
```

---

## 🧑‍💻 Como Contribuir 🤝

Quer contribuir com o projeto? Siga os passos:

1. Faça um fork do repositório.
2. Clone o seu fork:

```bash
git clone https://github.com/SEU-USUARIO/Botanica-BackEnd.git
```

3. Crie uma nova branch para suas alterações:

```bash
git checkout -b minha-nova-funcionalidade
```

4. Faça suas alterações e adicione os arquivos modificados:

```bash
git add .
```

5. Faça o commit:

```bash
git commit -m "Descrição clara das mudanças"
```

6. Envie para o seu repositório:

```bash
git push origin minha-nova-funcionalidade
```

7. Abra um Pull Request para o repositório original.

---


**Agradecemos por contribuir para o Botanica! 🌱**

#JuntosPelasPlantas 🌳
