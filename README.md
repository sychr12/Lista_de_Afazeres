# 📝 Lista_de_Afazeres

![Java](https://img.shields.io/badge/Java-23%2B-blue)
![Swing](https://img.shields.io/badge/GUI-Swing-orange)
![SQLite](https://img.shields.io/badge/Database-SQLite-brightgreen)

Um aplicativo desktop completo para gerenciamento de tarefas pessoais desenvolvido em Java com persistência em banco de dados.

## ✨ Funcionalidades

- ✅ Adicionar novas tarefas
- ✔️ Marcar tarefas como completas
- ❌ Remover tarefas
- 🔄 Persistência automática em banco de dados SQLite
- 🖥️ Interface gráfica intuitiva com Java Swing

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 23+
- **Interface Gráfica**: Java Swing
- **Banco de Dados**: SQLite (com JDBC)
- **Gerenciamento de Dependências**: Maven
- **Padrão Arquitetural**: MVC (Model-View-Controller)

## 📦 Estrutura do Projeto

```
todo-list-java/
├── src/
│   ├── controller/      # Lógica de controle
│   ├── model/          # Classes de domínio e acesso a dados
│   ├── view/           # Componentes de interface gráfica
│   └── Application/    # Classe principal
├── tasks.db            # Banco de dados SQLite
└── pom.xml             # Configuração do Maven
```

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/todo-list-java.git
```

2. Compile e execute:
```bash
mvn clean install
java -jar target/todo-list-java.jar
```
📸 Screenshots
<img width="381" height="485" margin=10px alt="image" src="https://github.com/user-attachments/assets/6b21e613-e623-4fb2-8856-9c23e261018c" />

<img width="379" height="486" margin=10px alt="image" src="https://github.com/user-attachments/assets/d8c917e0-c957-4601-b978-a8c3d8112b98" />


Interface principal do aplicativo


## 📌 Próximas Melhorias

- [ ] Adicionar categorias de tarefas
- [ ] Implementar sistema de prioridades
- [ ] Adicionar lembretes e prazos
- [ ] Exportar/importar tarefas
