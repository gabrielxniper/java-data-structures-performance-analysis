import ArvoreDeBuscaBinaria.ArvoreBinaria;

public class TesterArvoreBB100 {
    public static void main(String[] args) {

        int tamanho = 100;

        long somaCresc = 0;

        for (int t = 0; t < 5; t++) {

            ArvoreBinaria arvoreCresc = new ArvoreBinaria();
            int[] valoresCresc = ArvoreBinaria.gerarValoresCresc(tamanho);
            long inicioCresc = System.nanoTime();
            for (int i = 0; i < tamanho; i++) {
                arvoreCresc.inserir(valoresCresc[i]);
            }
            long fimCresc = System.nanoTime();
            long tempoCresc = fimCresc - inicioCresc;
            somaCresc += tempoCresc;
            System.out.println("Execucao " + (t + 1) + " - Crescente: " + tempoCresc + " ns");
        }
        long mediaCresc = somaCresc / 5;
        System.out.println("\n=== INSERCAO CRESCENTE ===");
        System.out.println("Tempo medio: " + mediaCresc + " ns");
        System.out.println("Tempo medio (ms): " + (mediaCresc / 1_000_000.0) + " ms\n");



        System.out.println("\n===============================");
        long somaDesc = 0;
        for (int t = 0; t < 5; t++) {
            ArvoreBinaria arvoreDesc = new ArvoreBinaria();
            int[] valoresDesc = ArvoreBinaria.gerarValoresDesc(tamanho);
            long inicioDesc = System.nanoTime();
            for (int i = 0; i < tamanho; i++) {
                arvoreDesc.inserir(valoresDesc[i]);
            }
            long fimDesc = System.nanoTime();
            long tempoDesc = fimDesc - inicioDesc;
            somaDesc += tempoDesc;
            System.out.println("Execucao " + (t + 1) + " - Decrescente: " + tempoDesc + " ns");
        }
        long mediaDesc = somaDesc / 5;
        System.out.println("\n=== INSERCAO DECRESCENTE ===");
        System.out.println("Tempo medio: " + mediaDesc + " ns");
        System.out.println("Tempo medio (ms): " + (mediaDesc / 1_000_000.0) + " ms\n");



        System.out.println("\n===============================");

        long somaRandom = 0;

        for (int t = 0; t < 5; t++) {
            ArvoreBinaria arvoreRandom = new ArvoreBinaria();
            int[] valoresRandom = ArvoreBinaria.gerarValoresRandom(tamanho);
            long inicioRandom = System.nanoTime();
            for (int i = 0; i < tamanho; i++) {
                arvoreRandom.inserir(valoresRandom[i]);
            }
            long fimRandom = System.nanoTime();
            long tempoRandom = fimRandom - inicioRandom;
            somaRandom += tempoRandom;
            System.out.println("Execucao " + (t + 1) + " - Aleatorio: " + tempoRandom + " ns");
        }
        long mediaRandom = somaRandom / 5;
        System.out.println("\n=== INSERCAO ALEATORIA ===");
        System.out.println("Tempo medio: " + mediaRandom + " ns");
        System.out.println("Tempo medio (ms): " + (mediaRandom / 1_000_000.0) + " ms\n");

    }
}
