import ArvoreDeBuscaBinaria.ArvoreBinaria;

public class TesterArvoreBB100 {
    public static void main(String[] args) {
        
        int aleatorio1 = 7;
        int aleatorio2 = 27;
        int aleatorio3 = 87;

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
        System.out.println("=== TESTE DE BUSCA ALEATORIA NA ARVORE CRESCENTE 1 ===\n");
        long somaTemp = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(aleatorio1);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(aleatorio1);
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
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria ("+aleatorio1+"): " + tempoDecorrido + " ns");
        }

        long mediaTemp = somaTemp / 5;
        System.out.println("Media busca ("+aleatorio2+"): " + mediaTemp + " ns\n");
        System.out.println("Media busca ("+aleatorio2+"): " + String.format("%.4f", mediaTemp / 1000000.0) + " ms\n");

        System.out.println("\n===============================");

        System.out.println("=== TESTE DE BUSCA ALEATORIA NA ARVORE CRESCENTE 2 ===\n");
        somaTemp = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(aleatorio2);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(aleatorio2);
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
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria ("+aleatorio2+"): " + tempoDecorrido + " ns");
        }

        mediaTemp = somaTemp / 5;
        System.out.println("Media busca ("+aleatorio2+"): " + mediaTemp + " ns\n");
        System.out.println("Media busca ("+aleatorio2+"): " + String.format("%.4f", mediaTemp / 1000000.0) + " ms\n");

        System.out.println("\n===============================");

        System.out.println("=== TESTE DE BUSCA ALEATORIA NA ARVORE CRESCENTE 3 ===\n");
        somaTemp = 0;
        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(aleatorio3);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(aleatorio3);
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
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria ("+aleatorio3+"): " + tempoDecorrido + " ns");
        }

        mediaTemp = somaTemp / 5;
        System.out.println("Media busca ("+aleatorio3+"): " + mediaTemp + " ns\n");
        System.out.println("Media busca ("+aleatorio3+"): " + String.format("%.4f", mediaTemp / 1000000.0) + " ms\n");

        System.out.println("\n===============================");

        
        System.out.println("=== TESTE DE BUSCA INEXISTENTE NA ARVORE CRESCENTE (9999) ===\n");

        long somaB4 = 0;

        for (int i = 0; i < 5; i++) {
            arvoreBusca.buscar(999999);
            long inicio = System.nanoTime();
            boolean buscar = arvoreBusca.buscar(999999);
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
            System.out.println("Execucao " + (i + 1) + " - Busca inexistente (999999): " + tempoDecorrido + " ns");
        }
        long mediaB4 = somaB4 / 5;
        System.out.println("Media busca inexistente (999999): " + mediaB4 + " ns\n");
        System.out.println("Media busca inexistente (999999): " + String.format("%.4f", mediaB4 / 1000000.0) + " ms\n");


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
        
        System.out.println("===============================");

        System.out.println("=== TESTES DE BUSCA NA ARVORE ALEATORIA ===\n");

        ArvoreBinaria arvoreRandomBusca = new ArvoreBinaria();
        int[] valoresRandomBusca = ArvoreBinaria.gerarValoresRandom(tamanho);
        for (int i = 0; i < tamanho; i++) {
            arvoreRandomBusca.inserir(valoresRandomBusca[i]);
        }
        int primeiro = valoresRandomBusca[0];
        long somaR1 = 0;

        System.out.println("=== BUSCA DO PRIMEIRO ELEMENTO NA ARVORE ALEATORIA (" + primeiro + ") ===\n");
        for (int i = 0; i < 5; i++) {
            arvoreRandomBusca.buscar(primeiro);
            long inicio = System.nanoTime();
            boolean buscar = arvoreRandomBusca.buscar(primeiro);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não foi encontrado.");
            }
            somaR1 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca primeiro (" + primeiro + "): " + tempo + " ns");
        }

        long mediaR1 = somaR1 / 5;
        System.out.println("Media busca primeiro: " + mediaR1 + " ns");
        System.out.println("Media busca primeiro: " + String.format("%.4f", mediaR1 / 1000000.0) + " ms\n");
        int ultimo = valoresRandomBusca[tamanho - 1];
        long somaR2 = 0;

        System.out.println("===============================");
        System.out.println("\n=== BUSCA DO ULTIMO ELEMENTO NA ARVORE ALEATORIA (" + ultimo + ") ===\n");
        
        for (int i = 0; i < 5; i++) {
            arvoreRandomBusca.buscar(ultimo);
            long inicio = System.nanoTime();
            boolean buscar = arvoreRandomBusca.buscar(ultimo);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não foi encontrado.");
            }

            somaR2 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca ultimo (" + ultimo + "): " + tempo + " ns");
        }

        long mediaR2 = somaR2 / 5;
        System.out.println("Media busca ultimo: " + mediaR2 + " ns");
        System.out.println("Media busca ultimo: " + String.format("%.4f", mediaR2 / 1000000.0) + " ms\n");

        int meio = valoresRandomBusca[tamanho / 2];
        long somaR3 = 0;

        System.out.println("===============================");

        System.out.println("\n=== BUSCA DO ELEMENTO DO MEIO NA ARVORE ALEATORIA (" + meio + ") ===\n");

        for (int i = 0; i < 5; i++) {
            arvoreRandomBusca.buscar(meio);
            long inicio = System.nanoTime();
            boolean buscar = arvoreRandomBusca.buscar(meio);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não foi encontrado.");
            }

            somaR3 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca meio (" + meio + "): " + tempo + " ns");
        }

        long mediaR3 = somaR3 / 5;
        System.out.println("Media busca meio: " + mediaR3 + " ns");
        System.out.println("Media busca meio: " + String.format("%.4f", mediaR3 / 1000000.0) + " ms\n");

        System.out.println("===============================");

        System.out.println("=== TESTE DE BUSCA ALEATORIA NA ARVORE ALEATORIA 1 ===\n");

        long somaBA1 = 0;

        for (int i = 0; i < 5; i++) {
            arvoreRandomBusca.buscar(aleatorio1);
            long inicio = System.nanoTime();
            boolean buscar = arvoreRandomBusca.buscar(aleatorio1);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não foi encontrado.");
            }

            somaBA1 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (" + aleatorio1 + "): " + tempo + " ns");
        }

        long mediaBA1 = somaBA1 / 5;
        System.out.println("Media busca (" + aleatorio1 + "): " + mediaBA1 + " ns");
        System.out.println("Media busca (" + aleatorio1 + "): " + String.format("%.4f", mediaBA1 / 1000000.0) + " ms\n");

        System.out.println("===============================");

        System.out.println("=== TESTE DE BUSCA ALEATORIA NA ARVORE ALEATORIA 2 ===\n");

        long somaBA2 = 0;

        for (int i = 0; i < 5; i++) {
            arvoreRandomBusca.buscar(aleatorio2);
            long inicio = System.nanoTime();
            boolean buscar = arvoreRandomBusca.buscar(aleatorio2);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não foi encontrado.");
            }

            somaBA2 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (" + aleatorio2 + "): " + tempo + " ns");
        }

        long mediaBA2 = somaBA2 / 5;
        System.out.println("Media busca (" + aleatorio2 + "): " + mediaBA2 + " ns");
        System.out.println("Media busca (" + aleatorio2 + "): " + String.format("%.4f", mediaBA2 / 1000000.0) + " ms\n");

        System.out.println("===============================");

        System.out.println("=== TESTE DE BUSCA ALEATORIA NA ARVORE ALEATORIA 3 ===\n");
        long somaBA3 = 0;
        for (int i = 0; i < 5; i++) {
            arvoreRandomBusca.buscar(aleatorio3);
            long inicio = System.nanoTime();
            boolean buscar = arvoreRandomBusca.buscar(aleatorio3);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (buscar) System.out.println("valor encontrado.");
                else System.out.println("valor não foi encontrado.");
            }

            somaBA3 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca aleatoria (" + aleatorio3 + "): " + tempo + " ns");
        }

        long mediaBA3 = somaBA3 / 5;
        System.out.println("Media busca (" + aleatorio3 + "): " + mediaBA3 + " ns");
        System.out.println("Media busca (" + aleatorio3 + "): " + String.format("%.4f", mediaBA3 / 1_000_000.0) + " ms\n");


        System.out.println("===============================");   

        System.out.println("\n=== BUSCA DE VALOR INEXISTENTE NA ARVORE ALEATORIA (999999) ===\n");

        long somaR4 = 0;

        for (int i = 0; i < 5; i++) {
            arvoreRandomBusca.buscar(999999);
            long inicio = System.nanoTime();
            boolean buscar = arvoreRandomBusca.buscar(999999);
            long fim = System.nanoTime();
            long tempo = fim - inicio;

            if (i == 0) {
                if (!buscar) {
                    System.out.println("valor corretamente não encontrado.");
                }
            }
            somaR4 += tempo;
            System.out.println("Execucao " + (i + 1) + " - Busca inexistente (999999): " + tempo + " ns");
        }

        long mediaR4 = somaR4 / 5;
        System.out.println("Media busca inexistente: " + mediaR4 + " ns");
        System.out.println("Media busca inexistente: " + String.format("%.4f", mediaR4 / 1000000.0) + " ms\n");

    }   
}
