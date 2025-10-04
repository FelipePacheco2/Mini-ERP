# MNI ERP: Gerenciamento de Pedidos de Manutenção (Fase de Estudo)

## 🚧 Sobre o Projeto

O **MNI ERP** é um projeto de estudo e desenvolvimento pessoal focado na criação de um sistema de **Gerenciamento de Pedidos de Manutenção**.

O objetivo inicial é dominar a arquitetura e as regras de negócio de um ERP, permitindo aos **clientes** solicitar manutenções e à **equipe de gestão** administrar o ciclo de vida dessas Ordens de Serviço (OS).

Este repositório serve como um laboratório prático, onde a prioridade é o aprendizado de **Java** e a modelagem do sistema, utilizando um banco de dados em memória (*FakeDB*) para isolar a lógica de negócio da persistência real.

---

## 🛠️ Tecnologias Focadas

Nesta fase de estudo, o projeto está estritamente focado em:

* **Linguagem Principal:** **Java** (para a lógica de *backend* e *core* do sistema).
* **Persistência:** **FakeDB / Persistência em Memória**. Estamos utilizando listas, mapas ou classes simples para simular o banco de dados, permitindo a concentração total na **modelagem de classes** e nas **regras de negócio** sem a complexidade de um DB externo.
* **Conceitos Chave:**
    * **Programação Orientada a Objetos (POO):** Aplicação de herança, encapsulamento e polimorfismo.
    * **Design Patterns:** Implementação de padrões para organizar o código (Ex: Singleton, Factory, Repository, se aplicável).

---

## ✨ Ideias de Funcionalidades Futuras

À medida que a estrutura de classes se consolida, o sistema deverá suportar:

### Módulo do Solicitante (Cliente)
* **Abertura de Chamados:** Criação de novos pedidos com detalhes do ativo e descrição do problema.
* **Rastreamento de Status:** Visualização simples do *status* do pedido (Aberto, Em Execução, Concluído).

### Módulo de Gestão/Manutenção
* **Simulação de Atribuição:** Lógica para designar o pedido a um "técnico" (objeto Java).
* **Gestão de Status:** Métodos para atualizar o progresso do pedido e registrar informações.

---

## 👤 Contato

LinkedIn: [Felipe Pacheco](https://www.linkedin.com/in/felipe-pacheco-642270297/)
E-mail:	felipecaballeropacheco@gmail.com

Acompanhe a evolução! Estou focado em construir a base do sistema de forma sólida em Java.
