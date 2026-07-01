public class EntregaService implements Observer {
    @Override
    public void update(Pedido pedido) {
        if (pedido.getStatus().equals("ENVIADO")){
            System.out.println("o pedido: " + pedido + " foi enviado");
        } else {
            System.out.println("o pedido: " + pedido + " foi atualizado");
        }

    }
}
