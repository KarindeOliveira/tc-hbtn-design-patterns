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
    final String[] result = {""};
    result[0] += "\tFora da Caixa:\n";

    this.itensForaCaixa.stream()
            .forEach(itemPedido -> {
              result[0] += "\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome() + "\n";
            });

    result[0] += "\tDentro da Caixa:\n";

    this.itensDentroCaixa.stream()
            .forEach(itemPedido -> {
              result[0] += "\t\t- " + itemPedido.getTipo() + " " + itemPedido.getNome() + "\n";
            });
    return result[0];
  }
}
