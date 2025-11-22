import Vetor.Vetor;
import java.util.Arrays;
public class TesterVetor1000 {
    public static void main(String[] args) {
        int[] vetor1000 = Vetor.gerarValores(1000);
        Vetor.embaralhar(vetor1000);
        //int[] vetor1000 = Vetor.gerarValores(1000);
        //Vetor.embaralhar(vetor1000);
        //int[] vetor10000 = Vetor.gerarValores(10000);
        //Vetor.embaralhar(vetor10000);
        long somarTempos = 0;
        System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 1000 POSICOES ===");
        System.out.println(Arrays.toString(vetor1000));
        
        for (int i = 0; i < 5; i++) {
            Vetor vetorTeste = new Vetor(1000);
            long inicio = System.nanoTime();
            for (int j = 0; j < vetor1000.length; j++) {
                vetorTeste.insert(vetor1000[j]);
            }
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;
            somarTempos += tempoDecorrido;
            System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
        }
        long mediaNano = somarTempos / 5;
        double mediaMillisegundos = mediaNano / 1000000.0;
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Tamanho: " + 1000);
        System.out.println("Tempo Médio (ns): " + mediaNano);
        System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
        

        System.out.println("\n====================================================");


        System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL ===");
        long somarTemposBusca = 0;
        int valorProcurado = 50;
        for(int i = 0; i<5; i++){
            Vetor.embaralhar(vetor1000);
            Vetor vetorBusca = new Vetor(1000);
            for (int j = 0; j < vetor1000.length; j++) {
                vetorBusca.insert(vetor1000[j]);
            }
            long inicioBusca = System.nanoTime();
            int indice = vetorBusca.buscaSequencial(valorProcurado);
            long fimBusca = System.nanoTime();
            long tempoBusca = fimBusca - inicioBusca;
            somarTemposBusca += tempoBusca;
            System.out.println("Execução " + (i + 1) +" - Índice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

        }
        long mediaBusca = somarTemposBusca / 5;
        System.out.println("\n--- RESULTADO FINAL BUSCA ---");
        System.out.println("Tamanho: " + 1000);
        System.out.println("Valor procurado: " + valorProcurado);
        System.out.println("Tempo Médio Busca (ns): " + mediaBusca);
        System.out.println("Tempo Médio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));


        System.out.println("\n====================================================");


        System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 1000 POSICOES ===");
        long somarTemposBB1000 = 0;
        for (int i = 0; i < 5; i++) {
            Vetor vetorTeste = new Vetor(1000);
            for (int j = 0; j < vetor1000.length; j++) {
                vetorTeste.insert(vetor1000[j]);
            }
            long inicioBB1000 = System.nanoTime();
            vetorTeste.bubbleSort(vetorTeste.getData()); 
            long fimBB1000 = System.nanoTime();
            long tempoDecorridoBB1000 = fimBB1000 - inicioBB1000;
            somarTemposBB1000 += tempoDecorridoBB1000;
            System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB1000 + " ns" );
        }
        long mediaNanoBB1000 = somarTemposBB1000 / 5;
        double mediaMillisegundosBB1000 = mediaNanoBB1000 / 1000000.0;
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Tamanho: " + 1000);
        System.out.println("Tempo Médio (ns): " + mediaNanoBB1000);
        System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB1000));
    }
}
