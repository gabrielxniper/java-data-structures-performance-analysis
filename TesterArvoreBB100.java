import ArvoreDeBuscaBinaria.ArvoreBinaria;

public class TesterArvoreBB100 {
    public static void main(String[] args) {

        int tamanho = 100;

        long somaCresc = 0;

        for (int t = 0; t < 5; t++) {

            ArvoreBinaria arvoreCresc = new ArvoreBinaria();
            int[] valoresCresc = ArvoreBinaria.gerarValoresCresc(tamanho);
            for (int i = 0; i < tamanho; i++) {
                arvoreCresc.inserir(valoresCresc[i]);
            }
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
        System.out.println("Tempo medio (ms): " + String.format("%.4f", mediaCresc/1000000.0) + " ms\n");



        System.out.println("\n===============================");
        
        System.out.println("=== TESTES DE BUSCA NA ARVORE CRESCENTE (VALOR INICIAL) ===\n");
        long somaB1 = 0;
        ArvoreBinaria arvoreBusca = new ArvoreBinaria();
        int[] valoresCresc = ArvoreBinaria.gerarValoresCresc(tamanho);
        for (int i = 0; i < tamanho; i++) {
            arvoreBusca.inserir(valoresCresc[i]);
        }
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(1); 
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(1); 
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;
            if(i==0){
                if (buscar){
                    System.out.println("valor encontrado.");
                }else{
                    System.out.println("valor não foi encontrado.");
                }
            }  
            somaB1 += tempoDecorrido;
            System.out.println("Execucao " + (i + 1) + " - Busca inicio (1): " + tempoDecorrido + " ns");

        }

        long mediaB1 = somaB1 / 5;
        System.out.println("Media busca primeiro (1): " + mediaB1 + " ns\n");
        System.out.println("Media busca primeiro (1): " + String.format("%.4f",mediaB1 / 1000000.0) + " ms\n");

        System.out.println("\n===============================");
        System.out.println("=== TESTES DE BUSCA NA ARVORE CRESCENTE (VALOR MEDIO) ===\n");
        long somaB2 = 0;
        for (int i = 0; i < tamanho; i++) {
            arvoreBusca.inserir(valoresCresc[i]);
        }
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(50);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(50);
            long fim = System.nanoTime();
            if(i==0){
                if (buscar){
                    System.out.println("valor encontrado.");
                }else{
                    System.out.println("valor não foi encontrado.");
                }
            }   
            long tempoDecorrido = fim - inicio;
            somaB2 += tempoDecorrido;
            System.out.println("Execucao " + (i + 1) + " - Busca medio (50): " + tempoDecorrido + " ns");

        }
        
        long mediaB2 = somaB2 / 5;
        System.out.println("Media busca medio (50): " + mediaB2 + " ns\n");
        System.out.println("Media busca medio (50): " + String.format("%.4f",mediaB2 / 1000000.0) + " ms\n");

        System.out.println("\n===============================");

        System.out.println("=== TESTES DE BUSCA NA ARVORE CRESCENTE (VALOR FINAL) ===\n");

        long somaB3 = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(100);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(100);
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;

            if(i==0){
                if (buscar){
                    System.out.println("valor encontrado.");
                } else {
                    System.out.println("valor não foi encontrado.");
                }
            }

            somaB3 += tempoDecorrido;
            System.out.println("Execucao " + (i + 1) + " - Busca final (100): " + tempoDecorrido + " ns");
        }

        long mediaB3 = somaB3 / 5;
        System.out.println("Media busca final (100): " + mediaB3 + " ns\n");
        System.out.println("Media busca final (100): " + String.format("%.4f", mediaB3 / 1000000.0) + " ms\n");



        System.out.println("\n===============================");
        System.out.println("=== TESTE DE BUSCA ALEATORIA 1 ===\n");
        long somaTemp = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(7);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(7);
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;

            if(i==0){
                if (buscar){
                    System.out.println("valor encontrado.");
                } else {
                    System.out.println("valor não foi encontrado.");
                }
            }

            somaTemp += tempoDecorrido;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (7): " + tempoDecorrido + " ns");
        }

        long mediaTemp = somaTemp / 5;
        System.out.println("Media busca (7): " + mediaTemp + " ns\n");
        System.out.println("Media busca (7): " + String.format("%.4f", mediaTemp / 1000000.0) + " ms\n");

        System.out.println("\n===============================");

        System.out.println("=== TESTE DE BUSCA ALEATORIA 2 ===\n");
        somaTemp = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(27);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(27);
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;

            if(i==0){
                if (buscar){
                    System.out.println("valor encontrado.");
                } else {
                    System.out.println("valor não foi encontrado.");
                }
            }

            somaTemp += tempoDecorrido;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (27): " + tempoDecorrido + " ns");
        }

        mediaTemp = somaTemp / 5;
        System.out.println("Media busca (27): " + mediaTemp + " ns\n");
        System.out.println("Media busca (27): " + String.format("%.4f", mediaTemp / 1000000.0) + " ms\n");

        System.out.println("\n===============================");

        System.out.println("=== TESTE DE BUSCA ALEATORIA 3 ===\n");
        somaTemp = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(87);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(87);
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;

            if(i==0){
                if (buscar){
                    System.out.println("valor encontrado.");
                } else {
                    System.out.println("valor não foi encontrado.");
                }
            }

            somaTemp += tempoDecorrido;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (87): " + tempoDecorrido + " ns");
        }

        mediaTemp = somaTemp / 5;
        System.out.println("Media busca (87): " + mediaTemp + " ns\n");
        System.out.println("Media busca (87): " + String.format("%.4f", mediaTemp / 1000000.0) + " ms\n");

        System.out.println("\n===============================");

        
        System.out.println("=== TESTE DE BUSCA INEXISTENTE (9999) ===\n");

        long somaB4 = 0;

        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(9999);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(9999);
            long fim = System.nanoTime();
            long tempoDecorrido = fim - inicio;

            if(i==0){
                if (buscar){
                    System.out.println("valor encontrado (não deveria...)");
                } else {
                    System.out.println("valor corretamente não encontrado.");
                }
            }
            somaB4 += tempoDecorrido;
            System.out.println("Execucao " + (i + 1) + " - Busca inexistente (9999): " + tempoDecorrido + " ns");
        }
        long mediaB4 = somaB4 / 5;
        System.out.println("Media busca inexistente (9999): " + mediaB4 + " ns\n");
        System.out.println("Media busca inexistente (9999): " + String.format("%.4f", mediaB4 / 1000000.0) + " ms\n");


        System.out.println("\n===============================");
        System.out.println("===============================");
        System.out.println("===============================\n");
        
        long somaDesc = 0;
        for (int t = 0; t < 5; t++) {
            ArvoreBinaria arvoreDesc = new ArvoreBinaria();
            int[] valoresDesc = ArvoreBinaria.gerarValoresDesc(tamanho);
            for (int i = 0; i < tamanho; i++) {
                arvoreDesc.inserir(valoresDesc[i]);
            }
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
        System.out.println("Tempo medio (ms): " + String.format("%.4f", mediaDesc/1000000.0) + " ms\n");



        System.out.println("\n===============================");
        System.out.println("===============================");
        System.out.println("===============================\n");

        long somaRandom = 0;

        for (int t = 0; t < 5; t++) {
            ArvoreBinaria arvoreRandom = new ArvoreBinaria();
            int[] valoresRandom = ArvoreBinaria.gerarValoresRandom(tamanho);
            for (int i = 0; i < tamanho; i++) {
                arvoreRandom.inserir(valoresRandom[i]);
            }
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
        System.out.println("Tempo medio (ms): " + String.format("%.4f", mediaRandom/1000000.0) + " ms\n");

    }
}
