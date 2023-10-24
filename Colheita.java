//*isabelle lays r.a 2525810
package fazenda.Colheita;

import fazenda.fazenda.Fazenda;

public class Colheita {

    public Colheita(String nomeFazenda, String localizacaoFazenda, String tamanhoFazenda, int quantidadeColhida) {
    }
    class Colheita extends Fazenda {
    private final int quantidadeColhida;
    private final float Preco = 0;
    private final String Tipo;

    public Colheita(String nome, String localizacao, double areaTotal, int quantidadeColhida) {
        super(nome, localizacao, areaTotal);
        this.quantidadeColhida = quantidadeColhida;
        this.Preco = Preco;
        this.Tipo = Tipo;
        

        
    }

    public void mostrarQuantidadeColhida() {
        System.out.println("Quantidade Colhida: " + quantidadeColhida + " toneladas");
        System.out.println("Preco : " + Preco + "R$");
        System.out.println("Tipo:" + Tipo );
               


    }
    }


}
