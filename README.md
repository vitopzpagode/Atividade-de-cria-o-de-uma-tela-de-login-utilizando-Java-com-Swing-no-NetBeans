# Atividade de criação de uma **tela de login** utilizando **Java com Swing no NetBeans**:

---

### 📝 Enunciado: Criação de Tela de Login em Java (NetBeans)

**Objetivo:**

Desenvolver uma interface gráfica (GUI) para uma **tela de login** utilizando **Java com Swing** no **NetBeans IDE**, simulando um sistema de autenticação simples.

---

### 🛠️ Requisitos da Atividade:

1. **Criação do Projeto:**
    - Crie um novo projeto Java no NetBeans com o nome `TelaLogin`.
2. **Interface Gráfica:**
    - Utilize o editor visual (GUI Builder) do NetBeans para criar uma interface gráfica com os seguintes componentes:
        - `JLabel` para "Usuário:"
        - `JTextField` para entrada do nome de usuário
        - `JLabel` para "Senha:"
        - `JPasswordField` para entrada da senha
        - `JButton` com o texto "Entrar"
        - `JLabel` para mensagens de erro ou sucesso
3. **Lógica de Autenticação:**
    - No evento de clique do botão "Entrar", verificar se os dados inseridos correspondem a um nome de usuário e senha previamente definidos no código (por exemplo: `admin` e `1234`).
    - Exibir uma mensagem de sucesso se os dados estiverem corretos.
    - Exibir uma mensagem de erro se os dados estiverem incorretos.
4. **Validações:**
    - Exibir uma mensagem se os campos estiverem vazios.

---

### ✅ Exemplo de Funcionamento Esperado:

- Ao digitar `admin` no campo de usuário e `1234` no campo de senha e clicar em "Entrar", exibir:
    
    `"Login realizado com sucesso!"`
    
- Ao digitar dados incorretos:
    
    `"Usuário ou senha incorretos!"`
    
- Ao deixar campos em branco:
    
    `"Preencha todos os campos!"`
