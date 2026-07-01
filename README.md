## Exercício: Padrão de projeto Observer

Neste exercício, pratiquei o uso do padrão Observer no código, fiz um sistema de pedidos aonde o gatilho para ativação dos observers é a mudança de status do pedido.
A estrutura é muito simples: 

- Criamos um método para adicionar os observers desejados a uma lista no código principal 
- Após a criação do pedido decidimos qual observer será adicionado a lista para ser notificado 
- A cada modificação de status, os observers adicionados na lista serão ativados, chamando o método "update" imposto por uma interface, fazendo com que o tipo de notificação desejada seja exibida
