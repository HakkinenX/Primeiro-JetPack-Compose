╭──        ──╮
              
  Introdução
              
╰──        ──╯

Estou atualmente estudando Jetpack Compose, o toolkit moderno da Android para construção de interfaces nativas de forma mais simples, declarativa e intuitiva. Tenho explorado seus conceitos, componentes e boas práticas, e abaixo compartilho mais detalhes sobre o que venho aprendendo e experimentando no processo.




A Column é usada para organizar os elementos verticalmente, ou seja, os componentes ficam empilhados um sobre o outro.

Exemplo de código:

```@Composable
fun ColumnExample() {
    Column(modifier = Modifier.padding(16.dp)) {
      Text(text = "Item 1")
      Text(text = "Item 2")
      Text(text = "Item 3")
      }
}
```
Explicação:

  O componente Column organiza os elementos de forma vertical.

  Você pode adicionar padding ou outras propriedades de estilo utilizando o modifier (como o Modifier.padding(16.dp) que aplica 16dp de padding ao redor da coluna).

  Dentro da Column, você pode adicionar qualquer tipo de Composable, como Text, Button, ou até outras Columns ou Rows.




O componente Row organiza os elementos de forma Horizontal.

A Row é o oposto da Column. Ela organiza os itens horizontalmente, ou seja, os elementos ficam lado a lado.
```
@Composable
fun RowExample() {
    Row(modifier = Modifier.padding(16.dp)) {
      Text(text = "Item A")
      Spacer(modifier = Modifier.width(8.dp)) //Espaço entre os itens
      Text(text = "Item B")
      Spacer(modifier = Modifier.width(8.dp)) //Espaço entre os itens
      Text(text = "Item C")
      }
}
```
Explicação:

Row organiza os itens horizontalmente.

O Spacer com Modifier.width(8.dp) é usado para criar um espaço entre os itens, evitando que eles fiquem colados.

Como a Column, a Row também pode ser estilizada com modificadores, como padding ou align para ajustar o alinhamento dos itens.


Box em Jetpack Compose

A Box é um contêiner que permite sobrepor elementos dentro dele. Os itens dentro de um Box podem se sobrepor, o que pode ser útil para layouts como banners ou sobreposição de conteúdo.

Exemplo de código:

```@Composable
fun BoxExample() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Texto de fundo", modifier = Modifier.align(Alignment.Center))
        Button(onClick = { /* Ação do botão */ }, modifier = Modifier.align(Alignment.BottomEnd)) {
            Text("Clique aqui")
        }
    }
}
```

Explicação:

Box permite sobrepor elementos dentro dela. No exemplo, o Text fica centralizado e o Button é alinhado na parte inferior direita (Alignment.BottomEnd).

O modifier = Modifier.fillMaxSize() faz a Box ocupar todo o espaço disponível.

A Box é ideal para layouts onde você precisa de camadas ou sobreposições de elementos.


Como eles se combinam?

Você pode combinar essas construções para criar layouts complexos. Por exemplo, você pode usar uma Column dentro de uma Box, ou uma Row dentro de uma Column. Aqui está um exemplo mais complexo:

Exemplo de Layout Combinado:
```
@Composable
fun ComplexLayout() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.align(Alignment.TopStart)) {
            Text(text = "Cabeçalho", style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(text = "Item 1")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Item 2")
            }
        }

        Button(
            onClick = { /* Ação do botão */ },
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text("Ação")
        }
    }
}
```
Explicação:

Box é o contêiner principal e ocupa toda a tela (fillMaxSize).

Dentro da Box, temos uma Column com um título e uma Row de itens.

Um Button é colocado na parte inferior central da tela utilizando o modifier = Modifier.align(Alignment.BottomCenter).

4. Modifiers e Personalização

Modifiers são usados para ajustar o layout e comportamento dos componentes no Compose. Além de padding, você pode usar modificadores como fillMaxWidth(), align(), background(), entre outros.

O Compose é altamente flexível, então você pode controlar quase todos os aspectos de como seus componentes são dispostos na tela.

Conclusão

Column: Para dispor elementos verticalmente.

Row: Para dispor elementos horizontalmente.

Box: Para sobrepor elementos ou criar camadas.
