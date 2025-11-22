import Vetor.Vetor;
public class TesterVetor10000 {
    public static void main(String[] args) {
        int[] vetor10000 = Vetor.gerarValores(10000);
        long somarTempos = 0;
        int repeticao = 0;
        do{
            System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 10000 POSICOES DECRESCENTE ===");
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
            System.out.println("Tempo Médio (ns): " + mediaNano);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL ===");
            long somarTemposBusca = 0;
            int valorProcurado = 50;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorBusca.insert(vetor10000[j]);
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
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado);
            System.out.println("Tempo Médio Busca (ns): " + mediaBusca);
            System.out.println("Tempo Médio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));


            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 10000 POSICOES ===");
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
            System.out.println("Tempo Médio (ns): " + mediaNanoBB10000);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB10000));
            repeticao++;
        }while(repeticao<1);
        repeticao = 0;

        System.out.println("\n====================================================");
        System.out.println("\n====================================================");
        System.out.println("\n====================================================");


        do{
            Vetor.embaralhar(vetor10000);
            System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 10000 POSICOES DESORDENADO ===");
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
            System.out.println("Tempo Médio (ns): " + mediaNano);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL ===");
            long somarTemposBusca = 0;
            int valorProcurado = 50;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000.length; j++) {
                    vetorBusca.insert(vetor10000[j]);
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
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado);
            System.out.println("Tempo Médio Busca (ns): " + mediaBusca);
            System.out.println("Tempo Médio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));


            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 10000 POSICOES ===");
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
            System.out.println("Tempo Médio (ns): " + mediaNanoBB10000);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB10000));
            repeticao++;
        }while(repeticao<1);

        repeticao = 0;

        System.out.println("\n====================================================");
        System.out.println("\n====================================================");
        System.out.println("\n====================================================");

        
        do{
            System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 10000 POSICOES CRESCENTE ===");
            int[] vetor10000c = Vetor.gerarValoresCresc(10000);
            //System.out.println(Arrays.toString(vetor10000c));
            
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
            System.out.println("Tempo Médio (ns): " + mediaNano);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL ===");
            long somarTemposBusca = 0;
            int valorProcurado = 50;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(10000);
                for (int j = 0; j < vetor10000c.length; j++) {
                    vetorBusca.insert(vetor10000c[j]);
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
            System.out.println("Tamanho: " + 10000);
            System.out.println("Valor procurado: " + valorProcurado);
            System.out.println("Tempo Médio Busca (ns): " + mediaBusca);
            System.out.println("Tempo Médio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));


            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 10000 POSICOES ===");
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
            System.out.println("Tempo Médio (ns): " + mediaNanoBB10000);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB10000));
            repeticao++;
        }while(repeticao<1);
    }
}
