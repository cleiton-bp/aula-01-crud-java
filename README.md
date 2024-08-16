# Aplicação CRUD com ArrayList em Java

Esta é um exemplo simples de um CRUD (Create, Read, Update, Delete) usando a classe `ArrayList` em Java, o objetivo é demonstrar como realizar operações básicas de manipulação de dados em uma lista.

## Funcionalidades

A aplicação permite ao usuário realizar as seguintes operações em uma lista de strings:

1. **Adicionar**: Adiciona um novo item à lista.
2. **Atualizar**: Atualiza um item existente na lista.
3. **Remover**: Remove um item da lista.
4. **Exibir**: Exibe todos os itens da lista.
5. **Sair**: Encerra o programa.

## Estrutura do Código

### Classe Principal

A classe principal `Main` que é o ponto de entrada do programa, ele cria uma nova lista e um scanner para ler a entrada do usuário, e um loop infinito permite que o usuário escolha operações até decidir sair.

### Métodos Estáticos

A classe `Main` também contém métodos estáticos para realizar as operações CRUD:

- `adicionarLista(ArrayList<String> lista, String item)`: Adiciona um item à lista.
- `atualizarLista(ArrayList<String> lista, int posicao, String novoItem)`: Atualiza um item na lista na posição especificada.
- `removerLista(ArrayList<String> lista, int posicao)`: Remove um item da lista na posição especificada.
- `exibirLista(ArrayList<String> lista)`: Exibe todos os itens da lista com suas posições.