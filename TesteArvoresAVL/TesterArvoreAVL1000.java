package TesteArvoresAVL;

import ArvoreAVL.ArvoreAVL;

public class TesterArvoreAVL1000 {
    public static void main(String[] args) {
        int aleatorio1 = 70;
        int aleatorio2 = 270;
        int aleatorio3 = 870;
        int inicial = 1;
        int tamanho = 1000;
        int metade = tamanho/2;
        int ultimo = tamanho;

        System.out.println("\n===============================");
        Runtime.getRuntime().gc();
        //a seguir, criação de arvore para "aquecer" o programa e evitar valores muito altos para a primeira execução:
        for (int t = 0; t < 5; t++) {
            ArvoreAVL arvoreAquec = new ArvoreAVL();
            int[] valores = ArvoreAVL.gerarValoresCresc(tamanho);
            for (int i = 0; i < tamanho; i++) {
                arvoreAquec.inserir(valores[i]);
            }
        }
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
        
        System.out.println("=== TESTES DE BUSCA NA ARVORE AVL CRESCENTE ===\n");
        ArvoreAVL arvoreBusca = new ArvoreAVL();
        int[] valoresCresc = ArvoreAVL.gerarValoresCresc(tamanho);
        for (int i = 0; i < tamanho; i++) {
            arvoreBusca.inserir(valoresCresc[i]);
        }
        System.out.println("=== BUSCA DO PRIMEIRO ELEMENTO (" + inicial + ") ===\n");
        long somaB1 = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(inicial);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(inicial);
            long fim = System.nanoTime();
            long tempo = fim - inicio;
            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não encontrado.");
            }
            somaB1 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca inicio (" + inicial + "): " + tempo + " ns");
        }
        long mediaB1 = somaB1 / 5;
        System.out.println("Media busca primeiro (" + inicial + "): " + mediaB1 + " ns");
        System.out.println("Media busca primeiro (" + inicial + "): " + String.format("%.4f", mediaB1 / 1000000.0) + " ms\n");


        System.out.println("===============================");

        System.out.println("=== BUSCA DO ELEMENTO DO MEIO (" + metade + ") ===\n");
        long somaB2 = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(metade);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(metade);
            long fim = System.nanoTime();
            long tempo = fim - inicio;
            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não encontrado.");
            }
            somaB2 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca meio (" + metade + "): " + tempo + " ns");
        }
        long mediaB2 = somaB2 / 5;
        System.out.println("Media busca meio (" + metade + "): " + mediaB2 + " ns");
        System.out.println("Media busca meio (" + metade + "): " + String.format("%.4f", mediaB2 / 1000000.0) + " ms\n");

        System.out.println("===============================");

        System.out.println("=== BUSCA DO ULTIMO ELEMENTO (" + ultimo + ") ===\n");
        long somaB3 = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(ultimo);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(ultimo);
            long fim = System.nanoTime();
            long tempo = fim - inicio;
            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não encontrado.");
            }
            somaB3 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca final (" + ultimo + "): " + tempo + " ns");
        }
        long mediaB3 = somaB3 / 5;
        System.out.println("Media busca final (" + ultimo + "): " + mediaB3 + " ns");
        System.out.println("Media busca final (" + ultimo + "): " + String.format("%.4f", mediaB3 / 1000000.0) + " ms\n");


        System.out.println("===============================");

        System.out.println("=== BUSCA ALEATORIA 1 (" + aleatorio1 + ") ===\n");
        long somaA1 = 0;
        Runtime.getRuntime().gc();
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(aleatorio1);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(aleatorio1);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não encontrado.");
            }
            somaA1 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (" + aleatorio1 + "): " + tempo + " ns");
        }
        long mediaA1 = somaA1 / 5;
        System.out.println("Media busca aleatoria (" + aleatorio1 + "): " + mediaA1 + " ns");
        System.out.println("Media busca aleatoria (" + aleatorio1 + "): " + String.format("%.4f", mediaA1 / 1000000.0) + " ms\n");

        System.out.println("===============================");

        System.out.println("=== BUSCA ALEATORIA 2 (" + aleatorio2 + ") ===\n");
        long somaA2 = 0;

        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(aleatorio2);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(aleatorio2);
            long fim = System.nanoTime();
            long tempo = fim - inicio;
            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não encontrado.");
            }
            somaA2 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (" + aleatorio2 + "): " + tempo + " ns");
        }

        long mediaA2 = somaA2 / 5;
        System.out.println("Media busca aleatoria (" + aleatorio2 + "): " + mediaA2 + " ns");
        System.out.println("Media busca aleatoria (" + aleatorio2 + "): " + String.format("%.4f", mediaA2 / 1000000.0) + " ms\n");


        System.out.println("===============================");
        System.out.println("=== BUSCA ALEATORIA 3 (" + aleatorio3 + ") ===\n");

        long somaA3 = 0;

        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(aleatorio3);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(aleatorio3);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não encontrado.");
            }

            somaA3 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (" + aleatorio3 + "): " + tempo + " ns");
        }

        long mediaA3 = somaA3 / 5;
        System.out.println("Media busca aleatoria (" + aleatorio3 + "): " + mediaA3 + " ns");
        System.out.println("Media busca aleatoria (" + aleatorio3 + "): " + String.format("%.4f", mediaA3 / 1000000.0) + " ms\n");


        int inexistente = 999999;

        System.out.println("===============================");
        System.out.println("=== BUSCA INEXISTENTE (" + inexistente + ") ===\n");

        long somaB4 = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(inexistente);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(inexistente);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (!buscar) System.out.println("valor corretamente não encontrado.");
                else System.out.println("erro: valor encontrado.");
            }

            somaB4 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca inexistente (" + inexistente + "): " + tempo + " ns");
        }

        long mediaB4 = somaB4 / 5;
        System.out.println("Media busca inexistente: " + mediaB4 + " ns");
        System.out.println("Media busca inexistente: " + String.format("%.4f", mediaB4 / 1000000.0) + " ms\n");

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
        Runtime.getRuntime().gc();
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
