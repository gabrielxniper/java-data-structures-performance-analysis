import Vetor.Vetor;
public class TesterVetor10000 {
    public static void main(String[] args) {
        int[] vetor10000 = Vetor.gerarValores(10000);
        long somarTempos = 0;
        int repeticao = 0;
        do{
            System.out.println("\n=== TESTE INSERCAO DE VALORES NO VETOR DE 10000 POSICOES DECRESCENTE ===");
            //System.out.println(Arrays.toString(vetor10000));
            
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                long inicio = System.nanoTime();
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorTeste.insert(vetor10000[j]);
                }
                long fim = System.nanoTime();
                long tempoDecorrido = fim - inicio;
                somarTempos += tempoDecorrido;
                System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
            }
            long mediaNano = somarTempos / 5;
            double mediaMillisegundos = mediaNano / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Medio (ns): " + mediaNano);
            System.out.println("Tempo Medio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");



            System.out.println("\n=== TESTE ORDENACAO(BUBBLE SORT) COM VETOR DE 10000 POSICOES ===");
            long somarTemposBB10000 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorTeste.insert(vetor10000[j]);
                }
                long inicioBB10000 = System.nanoTime();
                vetorTeste.bubbleSort(vetorTeste.getData()); 
                long fimBB10000 = System.nanoTime();
                long tempoDecorridoBB10000 = fimBB10000 - inicioBB10000;
                somarTemposBB10000 += tempoDecorridoBB10000;
                System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB10000 + " ns" );
                //if(i==4){
                //   System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                //}
            }
            long mediaNanoBB10000 = somarTemposBB10000 / 5;
            double mediaMillisegundosBB10000 = mediaNanoBB10000 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Medio (ns): " + mediaNanoBB10000);
            System.out.println("Tempo Medio (ms): " + String.format("%.4f", mediaMillisegundosBB10000));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE ORDENACAO(QUICK SORT) COM VETOR DE 10000 POSICOES ===");
            long somarTemposQS10000 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorTeste.insert(vetor10000[j]);
                }
                long inicioQS10000 = System.nanoTime();
                vetorTeste.quickSort();
                long fimQS10000 = System.nanoTime();
                long tempoDecorridoQS10000 = fimQS10000 - inicioQS10000;
                somarTemposQS10000 += tempoDecorridoQS10000;
                System.out.println("\nTeste QUICK SORT " + (i + 1) + ": " + tempoDecorridoQS10000 + " ns" );
                //if(i==4){
                //   System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                //}
            }
            long mediaNanoQS10000 = somarTemposQS10000 / 5;
            double mediaMillisegundosQS10000 = mediaNanoQS10000 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO QUICK SORT ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Médio (ns): " + mediaNanoQS10000);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosQS10000));
            repeticao++;
        }while(repeticao<1);
        repeticao = 0;

        System.out.println("\n====================================================");
        System.out.println("\n====================================================");
        System.out.println("\n====================================================");


        do{
            Vetor.embaralhar(vetor10000);
            System.out.println("\n=== TESTE INSERCAO DE VALORES NO VETOR DE 10000 POSICOES DESORDENADO ===");
            //System.out.println(Arrays.toString(vetor10000));
            
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                long inicio = System.nanoTime();
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorTeste.insert(vetor10000[j]);
                }
                long fim = System.nanoTime();
                long tempoDecorrido = fim - inicio;
                somarTempos += tempoDecorrido;
                System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
            }
            long mediaNano = somarTempos / 5;
            double mediaMillisegundos = mediaNano / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Medio (ns): " + mediaNano);
            System.out.println("Tempo Medio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE ORDENACAO(BUBBLE SORT) COM VETOR DE 10000 POSICOES ===");
            long somarTemposBB10000 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorTeste.insert(vetor10000[j]);
                }
                long inicioBB10000 = System.nanoTime();
                vetorTeste.bubbleSort(vetorTeste.getData()); 
                long fimBB10000 = System.nanoTime();
                long tempoDecorridoBB10000 = fimBB10000 - inicioBB10000;
                somarTemposBB10000 += tempoDecorridoBB10000;
                System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB10000 + " ns" );
                //if(i==4){
                //    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                //}
            }
            long mediaNanoBB10000 = somarTemposBB10000 / 5;
            double mediaMillisegundosBB10000 = mediaNanoBB10000 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Medio (ns): " + mediaNanoBB10000);
            System.out.println("Tempo Medio (ms): " + String.format("%.4f", mediaMillisegundosBB10000));
            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE ORDENACAO(QUICK SORT) COM VETOR DE 1000 POSICOES ===");
            long somarTemposQS10000 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorTeste.insert(vetor10000[j]);
                }
                long inicioQS10000 = System.nanoTime();
                vetorTeste.quickSort();
                long fimQS10000 = System.nanoTime();
                long tempoDecorridoQS10000 = fimQS10000 - inicioQS10000;
                somarTemposQS10000 += tempoDecorridoQS10000;
                System.out.println("\nTeste QUICK SORT " + (i + 1) + ": " + tempoDecorridoQS10000 + " ns" );
                //if(i==4){
                //    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                //}
            }
            long mediaNanoQS10000 = somarTemposQS10000 / 5;
            double mediaMillisegundosQS10000 = mediaNanoQS10000 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO QUICK SORT ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Médio (ns): " + mediaNanoQS10000);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosQS10000));
            repeticao++;
        }while(repeticao<1);

        repeticao = 0;

        System.out.println("\n====================================================");
        System.out.println("\n====================================================");
        System.out.println("\n====================================================");

        
        do{
                
            System.out.println("\n=== TESTE INSERCAO DE VALORES NO VETOR DE 10000 POSICOES CRESCENTE ===");
            int[] vetor10000c = Vetor.gerarValoresCresc(10000);
            //System.out.println(Arrays.toString(vetor10000c));
            somarTempos = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                long inicio = System.nanoTime();
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorTeste.insert(vetor10000c[j]);
                }
                long fim = System.nanoTime();
                long tempoDecorrido = fim - inicio;
                somarTempos += tempoDecorrido;
                System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
            }
            long mediaNano = somarTempos / 5;
            double mediaMillisegundos = mediaNano / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Medio (ns): " + mediaNano);
            System.out.println("Tempo Medio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL PRIMEIRO VALOR ===");
            long somarTemposBusca = 0;
            int valorProcurado = 1;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                vetorBusca.buscaSequencial(valorProcurado);
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaSequencial(valorProcurado);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBusca += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBusca = somarTemposBusca / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado);
            System.out.println("Tempo Medio Busca (ns): " + mediaBusca);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));

            
            System.out.println("\n====================================================");
            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL VALOR MEIO ===");
            long somarTemposBusca2 = 0;
            int valorProcurado2 = 5000;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaSequencial(valorProcurado2);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBusca2 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBusca2 = somarTemposBusca2 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado2);
            System.out.println("Tempo Medio Busca (ns): " + mediaBusca2);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBusca2 / 1000000.0));

            System.out.println("\n====================================================");
            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL VALOR FINAL ===");
            long somarTemposBusca3 = 0;
            int valorProcurado3 = 10000;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaSequencial(valorProcurado3);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBusca3 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBusca3 = somarTemposBusca3 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado3);
            System.out.println("Tempo Medio Busca (ns): " + mediaBusca3);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBusca3 / 1000000.0));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL VALOR ALEATORIO 1 ===");
            long somarTemposBusca4 = 0;
            int valorProcurado4 = 2300;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaSequencial(valorProcurado4);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBusca4 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBusca4 = somarTemposBusca4/ 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado4);
            System.out.println("Tempo Medio Busca (ns): " + mediaBusca4);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBusca4 / 1000000.0));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL VALOR ALEATORIO 2 ===");
            long somarTemposBusca5 = 0;
            int valorProcurado5 = 700;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaSequencial(valorProcurado5);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBusca5 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBusca5 = somarTemposBusca5/ 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado5);
            System.out.println("Tempo Medio Busca (ns): " + mediaBusca5);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBusca5 / 1000000.0));

            System.out.println("\n====================================================");
            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL VALOR ALEATORIO 3 ===");
            long somarTemposBusca6 = 0;
            int valorProcurado6 = 8700;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaSequencial(valorProcurado6);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBusca6 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBusca6 = somarTemposBusca6/ 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado6);
            System.out.println("Tempo Medio Busca (ns): " + mediaBusca6);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBusca6 / 1000000.0));

            System.out.println("\n====================================================");
            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL VALOR INEXISTENTE ===");
            long somarTemposBusca7 = 0;
            int valorProcurado7 = 10001;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaSequencial(valorProcurado7);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBusca7 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBusca7 = somarTemposBusca7/ 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado7);
            System.out.println("Tempo Medio Busca (ns): " + mediaBusca7);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBusca7 / 1000000.0));

            System.out.println("\n====================================================");
            System.out.println("\n=== TESTE DE BUSCA BINARIA VALOR INICIAL ===");
            long somarTemposBuscaBinaria = 0;
            int valorProcuradoBinario = 1;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                vetorBusca.buscaBinaria(valorProcuradoBinario);
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaBinaria(valorProcuradoBinario);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBuscaBinaria += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBuscaBinaria = somarTemposBuscaBinaria / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA BINARIA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcuradoBinario);
            System.out.println("Tempo Medio Busca (ns): " + mediaBuscaBinaria);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBuscaBinaria / 1000000.0));

            System.out.println("\n====================================================");
            System.out.println("\n=== TESTE DE BUSCA BINARIA VALOR METADE ===");
            long somarTemposBuscaBinaria2 = 0;
            int valorProcuradoBinario2 = 5000;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaBinaria(valorProcuradoBinario2);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBuscaBinaria2 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBuscaBinaria2 = somarTemposBuscaBinaria2 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA BINARIA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcuradoBinario2);
            System.out.println("Tempo Medio Busca (ns): " + mediaBuscaBinaria2);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBuscaBinaria2 / 1000000.0));

            System.out.println("\n====================================================");
            System.out.println("\n=== TESTE DE BUSCA BINARIA VALOR FINAL ===");
            long somarTemposBuscaBinaria3 = 0;
            int valorProcuradoBinario3 = 10000;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaBinaria(valorProcuradoBinario3);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBuscaBinaria3 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBuscaBinaria3 = somarTemposBuscaBinaria3 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA BINARIA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcuradoBinario3);
            System.out.println("Tempo Medio Busca (ns): " + mediaBuscaBinaria3);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBuscaBinaria3 / 1000000.0));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE DE BUSCA BINARIA VALOR ALEATORIO 1 ===");
            long somarTemposBuscaBinaria4 = 0;
            int valorProcuradoBinario4 = 2300;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaBinaria(valorProcuradoBinario4);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBuscaBinaria4 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBuscaBinaria4 = somarTemposBuscaBinaria4 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA BINARIA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcuradoBinario4);
            System.out.println("Tempo Medio Busca (ns): " + mediaBuscaBinaria4);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBuscaBinaria4 / 1000000.0));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE DE BUSCA BINARIA VALOR ALEATORIO 2 ===");
            long somarTemposBuscaBinaria5 = 0;
            int valorProcuradoBinario5 = 700;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaBinaria(valorProcuradoBinario5);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBuscaBinaria5 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBuscaBinaria5 = somarTemposBuscaBinaria5 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA BINARIA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcuradoBinario5);
            System.out.println("Tempo Medio Busca (ns): " + mediaBuscaBinaria5);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBuscaBinaria5 / 1000000.0));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE DE BUSCA BINARIA VALOR ALEATORIO 3 ===");
            long somarTemposBuscaBinaria6 = 0;
            int valorProcuradoBinario6 = 8700;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaBinaria(valorProcuradoBinario6);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBuscaBinaria6 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBuscaBinaria6 = somarTemposBuscaBinaria6 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA BINARIA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcuradoBinario6);
            System.out.println("Tempo Medio Busca (ns): " + mediaBuscaBinaria6);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBuscaBinaria6 / 1000000.0));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE DE BUSCA BINARIA VALOR INEXISTENTE ===");
            long somarTemposBuscaBinaria7 = 0;
            int valorProcuradoBinario7 = 10001;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
                }
                long inicioBusca = System.nanoTime();
                int indice = vetorBusca.buscaBinaria(valorProcuradoBinario7);
                long fimBusca = System.nanoTime();
                long tempoBusca = fimBusca - inicioBusca;
                somarTemposBuscaBinaria7 += tempoBusca;
                System.out.println("Execucao " + (i + 1) +" - Indice encontrado: " + indice +" -> Tempo: " + tempoBusca + " ns");

            }
            long mediaBuscaBinaria7 = somarTemposBuscaBinaria7 / 5;
            System.out.println("\n--- RESULTADO FINAL BUSCA BINARIA ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcuradoBinario7);
            System.out.println("Tempo Medio Busca (ns): " + mediaBuscaBinaria7);
            System.out.println("Tempo Medio Busca (ms): " + String.format("%.4f", mediaBuscaBinaria7 / 1000000.0));


            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE ORDENCAO(BUBBLE SORT) COM VETOR DE 10000 POSICOES ===");
            long somarTemposBB10000 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorTeste.insert(vetor10000c[j]);
                }
                long inicioBB10000 = System.nanoTime();
                vetorTeste.bubbleSort(vetorTeste.getData()); 
                long fimBB10000 = System.nanoTime();
                long tempoDecorridoBB10000 = fimBB10000 - inicioBB10000;
                somarTemposBB10000 += tempoDecorridoBB10000;
                System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB10000 + " ns" );
                //if(i==4){
                //    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                //}
            }
            long mediaNanoBB10000 = somarTemposBB10000 / 5;
            double mediaMillisegundosBB10000 = mediaNanoBB10000 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Medio (ns): " + mediaNanoBB10000);
            System.out.println("Tempo Medio (ms): " + String.format("%.4f", mediaMillisegundosBB10000));
            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE ORDENACAO(QUICK SORT) COM VETOR DE 10000 POSICOES ===");
            long somarTemposQS10000 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(10000);
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorTeste.insert(vetor10000[j]);
                }
                long inicioQS10000 = System.nanoTime();
                vetorTeste.quickSort();
                long fimQS10000 = System.nanoTime();
                long tempoDecorridoQS10000 = fimQS10000 - inicioQS10000;
                somarTemposQS10000 += tempoDecorridoQS10000;
                System.out.println("\nTeste QUICK SORT " + (i + 1) + ": " + tempoDecorridoQS10000 + " ns" );
                //if(i==4){
                //    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                //}
            }
            long mediaNanoQS10000 = somarTemposQS10000 / 5;
            double mediaMillisegundosQS10000 = mediaNanoQS10000 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO QUICK SORT ---");
            System.out.println("Tamanho: " + 10000);
            System.out.println("Tempo Medio (ns): " + mediaNanoQS10000);
            System.out.println("Tempo Medio (ms): " + String.format("%.4f", mediaMillisegundosQS10000));
            repeticao++;
        }while(repeticao<1);
    }
}
