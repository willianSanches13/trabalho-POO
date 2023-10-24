
package fazenda.estoque;
class Estoque extends Fazenda {
    private int quantidadeArmazenada;
    private String DataDaAmarzenagem;
    private String DataDaSaida;
    private String IDCultivo; 
    

    public Estoque(String nome, String localizacao, double areaTotal, int quantidadeArmazenada) {
        super(nome, localizacao, areaTotal);
        this.quantidadeArmazenada = quantidadeArmazenada;
        this.DataDaSaida = DataDaSaida;
        this.DataDaAmarzenagem = DataDaAmarzenagem;
        this.IDCultivo = IDCultivo;
    }

    public void mostrarQuantidadeArmazenada() {
        System.out.println("Quantidade Armazenada: " + quantidadeArmazenada + " toneladas");
    }

    public void adicionarAoEstoque(int quantidade) {
        quantidadeArmazenada += quantidade;
    }

    public void removerDoEstoque(int quantidade) {
        if (quantidade <= quantidadeArmazenada) {
            quantidadeArmazenada -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }
}    

