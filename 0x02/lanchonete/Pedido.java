import java.util.HashSet;

public class Pedido {

  private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
  private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();


    void adicionarItemDentroCaixa(ItemPedido item){
      itensDentroCaixa.add(item);

    }

    void adicionarItemForaCaixa(ItemPedido item){
      itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itensDentroCaixa=" + itensDentroCaixa +
                ", itensForaCaixa=" + itensForaCaixa +
                '}';
    }
}
