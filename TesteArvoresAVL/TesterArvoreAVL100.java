package TesteArvoresAVL;

import ArvoreAVL.ArvoreAVL;

public class TesterArvoreAVL100 {
    public static void main(String[] args) {
        int aleatorio1 = 7;
        int aleatorio2 = 27;
        int aleatorio3 = 87;
        int inicial = 1;
        int tamanho = 100;
        int metade = tamanho/2;
        int ultimo = tamanho;

        System.out.println("\n===============================");
        System.out.println("=== TESTES COM ARVORE AVL ("+tamanho+") ===");

        long somaCresc = 0;

        for (int t = 0; t < 5; t++) {

            ArvoreAVL arvore = new ArvoreAVL();
            int[] valores = ArvoreAVL.gerarValoresCresc(tamanho);

            long inicio = System.nanoTime();
            for (int i = 0; i < tamanho; i++) {
                arvore.inserir(valores[i]);
            }
            long fim = System.nanoTime();

            long tempoDecorrido = fim - inicio;
            somaCresc += tempoDecorrido;

            System.out.println("Execucao " + (t + 1) + " - Crescente: " + tempoDecorrido + " ns");
        }

        long mediaCresc = somaCresc / 5;

        System.out.println("\n=== INSERCAO CRESCENTE (AVL) ===");
        System.out.println("Tempo medio: " + mediaCresc + " ns");
        System.out.println("Tempo medio (ms): " + String.format("%.4f", mediaCresc / 1000000.0) + " ms\n");
        
        
        System.out.println("\n===============================");
        System.out.println("\n===============================");
        System.out.println("\n===============================");

        long somaDesc = 0;

        for (int t = 0; t < 5; t++) {

            ArvoreAVL arvore = new ArvoreAVL();
            int[] valores = ArvoreAVL.gerarValoresDesc(tamanho);

            long inicio = System.nanoTime();
            for (int i = 0; i < tamanho; i++) {
                arvore.inserir(valores[i]);
            }
            long fim = System.nanoTime();

            long tempoDecorrido = fim - inicio;
            somaDesc += tempoDecorrido;

            System.out.println("Execucao " + (t + 1) + " - Decrescente: " + tempoDecorrido + " ns");
        }

        long mediaDesc = somaDesc / 5;
        System.out.println("\n=== INSERCAO DECRESCENTE (AVL) ===");
        System.out.println("Tempo medio: " + mediaDesc + " ns");
        System.out.println("Tempo medio (ms): " + String.format("%.4f", mediaDesc / 1000000.0) + " ms\n");

        System.out.println("\n===============================");
        System.out.println("\n===============================");
        System.out.println("\n===============================");
        long somaRandom = 0;

        for (int t = 0; t < 5; t++) {

            ArvoreAVL arvore = new ArvoreAVL();
            int[] valores = ArvoreAVL.gerarValoresRandom(tamanho);

            long inicio = System.nanoTime();
            for (int i = 0; i < tamanho; i++) {
                arvore.inserir(valores[i]);
            }
            long fim = System.nanoTime();

            long tempoDecorrido = fim - inicio;
            somaRandom += tempoDecorrido;

            System.out.println("Execucao " + (t + 1) + " - Aleatorio: " + tempoDecorrido + " ns");
        }
        long mediaRandom = somaRandom / 5;

        System.out.println("\n=== INSERCAO ALEATORIA (AVL) ===");
        System.out.println("Tempo medio: " + mediaRandom + " ns");
        System.out.println("Tempo medio (ms): " + String.format("%.4f", mediaRandom / 1000000.0) + " ms\n");
    }
}
