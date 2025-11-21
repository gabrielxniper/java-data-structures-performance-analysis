import Vetor.Vetor;
import java.util.Arrays;
import java.util.Random; 
public class Main {
    public static void main(String[] args) {
        int[] vetor100 = gerarValores(100);
        //int[] vetor1000 = gerarValores(1000);
        //int[] vetor10000 = gerarValores(10000);
        long somarTempos = 0;
        System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 100 POSICOES ===");
        System.out.println(Arrays.toString(vetor100));
        for (int i = 0; i < 5; i++) {
            Vetor vetorTeste = new Vetor(100);
            long inicio = System.nanoTime();
            for (int j = 0; j < vetor100.length; j++) {
                vetorTeste.insert(vetor100[j]);
            }
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;
            vetorTeste.bubbleSort(vetorTeste.getData()); 
            somarTempos += tempoDecorrido;
            System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
        }
        long mediaNano = somarTempos / 5;
        double mediaMillisegundos = mediaNano / 1000000.0;
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Tamanho: " + 100);
        System.out.println("Tempo Médio (ns): " + mediaNano);
        System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
        


        System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 100 POSICOES ===");
        long somarTemposBB100 = 0;
        for (int i = 0; i < 5; i++) {
            Vetor vetorTeste = new Vetor(100);
            long inicioBB100 = System.nanoTime();
            vetorTeste.bubbleSort(vetorTeste.getData()); 
            long fimBB100 = System.nanoTime();
            long tempoDecorridoBB100 = fimBB100 - inicioBB100;

            somarTemposBB100 += tempoDecorridoBB100;
            System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB100 + " ns" );
        }
        long mediaNanoBB100 = somarTemposBB100 / 5;
        double mediaMillisegundosBB100 = mediaNanoBB100 / 1000000.0;
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Tamanho: " + 100);
        System.out.println("Tempo Médio (ns): " + mediaNanoBB100);
        System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB100));
    }
    public static int[] gerarValores(int tamanho) {
        int[] vetorGerado = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetorGerado[i] = random.nextInt(100000);
        }
        return vetorGerado;
    }
}
