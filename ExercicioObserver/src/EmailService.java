public class EmailService implements Observer{
    @Override
    public void update(Pedido pedido) {
        System.out.println("Olá, gostariamos de informar que seu pedido foi atualizado. \nStatus atual: " + pedido.getStatus() );
    }
}
