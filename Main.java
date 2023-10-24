//*isabelle lays r.a 2525810
import java.util.Scanner;
import transporte.Transporte;
import plantacao.Plantacao;
import estoque.Estoque;
import fazenda.Fazenda;
import colheita.Colheita;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.println("Digite o nome da fazenda:");
            String nomeFazenda = scanner.nextLine();
            System.out.println("Digite a localização da fazenda:");
            String localizacaoFazenda = scanner.nextLine();
            System.out.println("Digite o tamanho da fazenda:");
            String tamanhoFazenda = scanner.nextLine();
            System.out.println("Digite o tipo de solo da fazenda:");
            String tipoSoloFazenda = scanner.nextLine();
            
            Fazenda fazenda = new Fazenda(nomeFazenda, localizacaoFazenda, tamanhoFazenda, tipoSoloFazenda);
            
            System.out.println("Digite a data do plantio:");
            String dataPlantio = scanner.nextLine();
            System.out.println("Digite o tipo de cultura:");
            String tipoCultura = scanner.nextLine();
            System.out.println("Digite a área do plantio:");
            String areaPlantio = scanner.nextLine();
            System.out.println("Digite a quantidade de cultivo:");
            String quantidadeCultivo = scanner.nextLine();
            
            Plantacao plantacao = new Plantacao(dataPlantio, tipoCultura, areaPlantio, quantidadeCultivo);
            
            
            System.out.println("Digite o código de frete:");
            String codigoFrete = scanner.nextLine();
            System.out.println("Digite o destino:");
            String destino = scanner.nextLine();
            System.out.println("Digite o tempo de deslocamento em horas:");
            int tempoDeslocamento = scanner.nextInt();
            System.out.println("Digite o valor do frete em reais:");
            double ValorFrete = scanner.nextDouble();
            
            Transporte transporte = new Transporte(nomeFazenda, localizacaoFazenda, tamanhoFazenda, codigoFrete, destino, tempoDeslocamento, valorFrete);
            
            
            System.out.println("Digite a quantidade armazenada:");
            int quantidadeArmazenada = scanner.nextInt();
                  System.out.println("Digite a quantidade armazenada:");
        int quantidadeArmazenada = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Digite a data de armazenagem:");
        String dataArmazenagem = scanner.nextLine();

        System.out.println("Digite a data de saída:");
        String dataSaida = scanner.nextLine();

        System.out.println("Digite o ID do cultivo:");
        String idCultivo = scanner.nextLine();

        Estoque estoque = new Estoque(nomeFazenda, localizacaoFazenda, tamanhoFazenda, quantidadeArmazenada);
        estoque.setDataDaArmazenagem(dataArmazenagem);
        estoque.setDataDaSaida(dataSaida);
        estoque.setIDCultivo(idCultivo);

        // Exibe a quantidade armazenada no estoque
        estoque.mostrarQuantidadeArmazenada();

        // Adiciona mais 10 toneladas ao estoque
        estoque.adicionarAoEstoque(10);

        // Exibe novamente a quantidade armazenada no estoque
        estoque.mostrarQuantidadeArmazenada();

        // Remove 5 toneladas do estoque
        estoque.removerDoEstoque(5);

        estoque.mostrarQuantidadeArmazenada();
    }
}
            
            Estoque estoque = new Estoque(nomeFazenda, localizacaoFazenda, tamanhoFazenda, quantidadeArmazenada);
            
            System.out.println("Digite a quantidade colhida:");
            int quantidadeColhida = scanner.nextInt();
            
            Colheita colheita = new Colheita(nomeFazenda, localizacaoFazenda, tamanhoFazenda, quantidadeColhida);
            
            System.out.println(fazenda.toString());
            System.out.println(plantacao.toString());
            transporte.mostraCodigoFrete();
            transporte.mostrarDestino();
            transporte.mostrarTempoDeslocamento();
            transporte.mostrarValorFrete();
            estoque.mostrarQuantidadeArmazenada();
            colheita.mostrarQuantidadeColhida();
        }
    }
} v
