public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Observer entrega = new EntregaService();
        Observer email = new EmailService();
        Observer faturamento = new FaturamentoService();

        pedido.adicionarObserver(faturamento);
        pedido.adicionarObserver(entrega);
        pedido.adicionarObserver(email);


        pedido.setStatusPedido("ENVIADO");
    }
}