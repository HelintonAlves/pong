# 🏓 Pong Game: Level Up Edition

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)

Este é um clone do clássico jogo **Pong**, desenvolvido durante o curso da **Danki Code**, mas com implementações exclusivas de lógica e progressão que elevam o desafio original.

---

## 🚀 Diferenciais do Projeto (Custom Logic)

Ao contrário de um clone comum, este projeto possui um sistema de **Dificuldade Progressiva** que eu implementei para tornar o gameplay mais dinâmico:

* **Sistema de Levels (0 a 4):** O jogo monitora seu desempenho e avança de nível conforme você vence.
* **Velocidade Escalonada:** A cada level, tanto a **bola** quanto a **IA do Computador** ficam mais rápidas, exigindo reflexos cada vez mais afiados.
* **Contagem de Vitórias:** Implementação de lógica para rastrear a transição entre níveis.
* **Loop de Jogo:** Ao superar o Level 4, o jogo retorna ao Level 0, reiniciando o ciclo de desafio.

---

## 🎮 Como Jogar

O controle é intuitivo e permite que você escolha o estilo de sua preferência:

| Ação | Teclas |
| :--- | :--- |
| **Mover para Cima** | `W` ou `Seta para Cima (UP)` |
| **Mover para Baixo** | `S` ou `Seta para Baixo (DOWN)` |

---

## 🛠️ Tecnologias e Aprendizados

* **Linguagem:** Java.
* **Renderização:** Java Graphics/Canvas API.
* **Conceitos aplicados:**
    * Game Loop (Update e Render).
    * Lógica de Colisões (AABB).
    * Inteligência Artificial simples para o oponente.
    * Gestão de estados para o sistema de níveis.

---

## 📦 Como rodar a aplicação

1. Certifique-se de ter o **JDK** instalado em sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git](https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git)

### 💡 Dica para Jogadores

> **Atenção:** Se você quer apenas testar o jogo sem precisar abrir o código ou compilar nada, o executável já está pronto para uso!
> 
> 📂 Basta navegar até a pasta: `out/artifacts`  
> 🎮 Localize o arquivo `.jar` e execute-o diretamente.
