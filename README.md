# HelpDesk Pro 🚀

Sistema de Helpdesk completo desenvolvido como simulação de ciclo de vida de desenvolvimento de software (SDLC), focado em boas práticas de engenharia de software, arquitetura limpa e DevOps.

## 📋 Sobre o Projeto

O **HelpDesk Pro** é uma plataforma para gestão de chamados de suporte técnico, permitindo a interação organizada entre Clientes e Agentes de Suporte (Analistas). O projeto segue uma arquitetura **Client-Server** desacoplada.

### Funcionalidades Principais (MVP)
- **Autenticação:** Login e Registro com Spring Security e JWT.
- **Gestão de Tickets:** Abertura, listagem e detalhamento de chamados.
- **Workflow de Atendimento:** Analistas podem assumir tickets e alterar status (Aberto → Em Progresso → Resolvido → Fechado).
- **Auditoria:** Histórico de comentários e interações imutáveis.

## 🛠️ Tech Stack

### Backend (API REST)
- **Linguagem:** Java 21 (LTS)
- **Framework:** Spring Boot 3
- **Database:** PostgreSQL 15
- **Security:** Spring Security + JWT (Stateless)
- **Documentation:** OpenAPI / Swagger (Planejado)

### Frontend (SPA)
- **Framework:** Next.js 15 (App Router)
- **Estilização:** TailwindCSS + ShadCN/UI

### Infraestrutura & DevOps
- **Containerização:** Docker & Docker Compose
- **CI/CD:** Pipeline de testes e build (Planejado)

## 🚀 Como Executar

### Pré-requisitos
- Docker & Docker Compose instalados.
- Java 21 (para desenvolvimento local).

### Passo a Passo

1. **Clone o repositório:**

    git clone https://github.com/jorgedu1/helpdesk-pro.git
    cd helpdesk-pro

2. **Suba a infraestrutura (Banco de Dados):**

    docker compose up -d

3. **Execute o Backend:**

    cd backend
    ./mvnw spring-boot:run

   A API estará disponível em: `http://localhost:8080`

## 📚 Documentação

A documentação oficial do projeto (SRS, Arquitetura e Casos de Uso) está hospedada externamente.

[📂 **Acessar Pasta de Documentação no Google Drive**](https://drive.google.com/drive/folders/1GVo52Zv9aEUAl3LADlqDg53NFvoyRfI1?usp=sharing)

---
Desenvolvido por JorgEdu1