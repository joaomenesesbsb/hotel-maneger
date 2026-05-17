# hotel-maneger

## Sobre o Projeto

Este é um Sistema de Gestão Hoteleira integrado, desenvolvido para otimizar e profissionalizar os processos operacionais e administrativos de um hotel. O foco central é a integração entre os setores de reservas, receção, governança, alimentos e bebidas (A&B) e financeiro.

## Objetivos

- **Centralização:** Integrar informações operacionais e administrativas num único núcleo.
  
- **Controlo de Ocupação:** Gestão rigorosa de reservas e disponibilidade de Unidades Habitacionais (UH).
  
- **Consistência Financeira:** Garantir que todos os consumos e serviços sejam faturados corretamente no check-out.
  
- **Eficiência Operacional:** Reduzir falhas manuais e melhorar a comunicação entre setores.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Security
- JWT
- JPA / Hibbernate
- PostgreSQL
- Docker
- Junit / Mockito
- Layered Architecture (DDD Pattern)
- Maven

## Arquitetura

O projeto segue Principios:
- Clean Architecture
- Domain Driven Design (DDD)
- Separacao por camadas (Controller, Service, Repository)

```
src
|---domain
|---aplication
|---infrastructure
|---interfaces
```

## Como Executar

### Pre-requisitos 

- Java 17+
- Docker
- Maven
- Redis

Clone o repositório:

```bash
git clone https://github.com/joaomenesesbsb/hotel-maneger.git
```

Configure a base de dados no ficheiro 

Execute o projeto via Maven:

```bash
./mvnw spring-boot:run
```
---

## Testes

Para rodar os testes:

```bash
./mvnw test
```
---
## Autenticação

A API utiliza autenticação via **JWT (JSON Web Token)**.

### Exemplo de login

```json
{
  "email": "user@email.com",
  "password": "123456"
}
```
---

## Deploy

O projeto pode ser facilmente deployado em:

- Render
- Railway
- AWS
- Docker

---

## Demonstração

# EM BREVE...

---

## Contribuição

Contribuições são bem-vindas!

1. Fork o projeto
2. Crie uma branch (`git checkout -b feature/minha-feature`)
3. Commit (`git commit -m 'Minha feature'`)
4. Push (`git push origin feature/minha-feature`)
5. Abra um Pull Request

---
## Licença
[![NPM](https://img.shields.io/badge/license-MIT-blue)](https://github.com/joaomenesesbsb/hotel-maneger/blob/main/LICENSE)
---
## Autor

Feito por **Joao Victor Meneses Silva**

- LinkedIn: [https://linkedin.com](https://www.linkedin.com/in/jo%C3%A3o-meneses-bsb/)
- GitHub: [https://github.com](https://github.com/joaomenesesbsb)

---

## Considerações finais

Se este projeto te ajudou, considere em dar uma estrela no repositório!
