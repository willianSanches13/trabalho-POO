//*isabelle lays r.a 2525810
package fazenda.transporte;


public class Transporte {

    public Transporte(String nomeFazenda, String localizacaoFazenda, String tamanhoFazenda, String codigoFrete, String destino, int tempoDeslocamento, double valorFrete) {
    }

    void mostrarTempoDeslocamento() {
    }



 
    class Transporte extends Fazenda {
    private String CodigoFrete;
    private final String destino;
    private final int tempoDeslocamento; // em horas
    private double valorFrete; // em reais

    public Transporte(String nome, String localizacao, double areaTotal, String meioTransporte, String destino, int tempoDeslocamento, double valorFrete) {
        super(nome, localizacao, areaTotal);
        this.CodigoFrete = CodigoFrete;
        this.destino = destino;
        this.tempoDeslocamento = tempoDeslocamento;
        this.valorFrete = valorFrete;
    }

    public void mostraCodigoFrete() {
        System.out.println("Meio de Transporte: " + CodigoFrete);
    }

    public void mostrarDestino() {
        System.out.println("Destino: " + destino);
    }

    public void mostrarTempoDeslocamento() {
        System.out.println("Tempo de Deslocamento: " + tempoDeslocamento + " horas");
    }

    public void mostrarValorFrete() {
        System.out.println("Valor do Frete: R$" + valorFrete);
    }
}

    

}
