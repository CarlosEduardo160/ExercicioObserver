public class FaturamentoService implements Observer{
    @Override
    public void update(Pedido pedido) {
        if(pedido.getStatus().equals("PAGO"))
            System.out.println("Cobrança do pedido: " + pedido);
        else {
            System.out.println("Faturamento do pedido em processamento");
        }
    }
}
