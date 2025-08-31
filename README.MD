# 🐾 Máquina de Banho de Pets - Exercício Java

Este projeto é um exercício prático de **abstração com classes e encapsulamento em Java**, simulado através de uma **máquina de banho para pets** em um petshop.

---

## 💡 Objetivo

Desenvolver uma aplicação Java orientada a objetos que simula o funcionamento de uma máquina de banho de petshop, com controle de recursos, estado da máquina e operações restritas conforme regras de negócio.

---

## ⚙️ Funcionalidades da Máquina

A máquina de banho oferece as seguintes operações:

- 🛁 **Dar banho no pet**
- 💧 **Abastecer com água** (2L por acionamento)
- 🧴 **Abastecer com shampoo** (2L por acionamento)
- 🔍 **Verificar nível de água**
- 🔍 **Verificar nível de shampoo**
- 🐶 **Verificar se há pet na máquina**
- ➕ **Colocar pet na máquina**
- ➖ **Retirar pet da máquina**
- 🧼 **Limpar máquina** (caso o pet saia sujo)

---

## 📏 Regras de Negócio

- A máquina deve permitir **apenas 1 pet por vez**.
- Cada banho consome:
    - `10 litros de água`
    - `2 litros de shampoo`
- A capacidade máxima da máquina é de:
    - `30 litros de água`
    - `10 litros de shampoo`
- **Se o pet for retirado sem banho**, será necessário **limpar a máquina antes de adicionar outro pet**.
- A **limpeza da máquina** consome:
    - `3 litros de água`
    - `1 litro de shampoo`
- Abastecimentos são feitos em incrementos de:
    - `2 litros de água`
    - `2 litros de shampoo`

---

## 🧱 Conceitos Utilizados

- ✅ **Abstração**: a máquina e o pet são representações de entidades com responsabilidades bem definidas.
- ✅ **Encapsulamento**: os atributos da máquina e dos pets são protegidos, com acesso controlado por métodos.
- ✅ **Validação de estado**: operações respeitam os limites de capacidade e as regras de uso da máquina.

---

## 🗂️ Estrutura do Projeto

