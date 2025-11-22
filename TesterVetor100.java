import Vetor.Vetor;
import java.util.Arrays;
public class TesterVetor100 {
    public static void main(String[] args) {
        int[] vetor100 = Vetor.gerarValores(100);
        long somarTempos = 0;
        int repeticao = 0;
        do{
            System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 100 POSICOES DECRESCENTE ===");
            System.out.println(Arrays.toString(vetor100));
            
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                long inicio = System.nanoTime();
                for (int j = 0; j < vetor100.length; j++) {
                    vetorTeste.insert(vetor100[j]);
                }
                long fim = System.nanoTime();
                long tempoDecorrido = fim - inicio;
                somarTempos += tempoDecorrido;
                System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
            }
            long mediaNano = somarTempos / 5;
            double mediaMillisegundos = mediaNano / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNano);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL ===");
            long somarTemposBusca = 0;
            int valorProcurado = 50;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(100);
                for (int j = 0; j < vetor100.length; j++) {
                    vetorBusca.insert(vetor100[j]);
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
            System.out.println("Tamanho: " + 100);
            System.out.println("Valor procurado: " + valorProcurado);
            System.out.println("Tempo Médio Busca (ns): " + mediaBusca);
            System.out.println("Tempo Médio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));


            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 100 POSICOES ===");
            long somarTemposBB100 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                for (int j = 0; j < vetor100.length; j++) {
                    vetorTeste.insert(vetor100[j]);
                }
                long inicioBB100 = System.nanoTime();
                vetorTeste.bubbleSort(vetorTeste.getData()); 
                long fimBB100 = System.nanoTime();
                long tempoDecorridoBB100 = fimBB100 - inicioBB100;
                somarTemposBB100 += tempoDecorridoBB100;
                System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB100 + " ns" );
                if(i==4){
                    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                }
            }
            long mediaNanoBB100 = somarTemposBB100 / 5;
            double mediaMillisegundosBB100 = mediaNanoBB100 / 1000000.0;

            System.out.println("\n--- RESULTADO FINAL ORDENACAO BUBBLE SORT ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNanoBB100);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB100));
            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE ORDENAÇÃO(QUICK SORT) COM VETOR DE 100 POSICOES ===");
            long somarTemposQS100 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                for (int j = 0; j < vetor100.length; j++) {
                    vetorTeste.insert(vetor100[j]);
                }
                long inicioQS100 = System.nanoTime();
                vetorTeste.quickSort();
                long fimQS100 = System.nanoTime();
                long tempoDecorridoQS100 = fimQS100 - inicioQS100;
                somarTemposQS100 += tempoDecorridoQS100;
                System.out.println("\nTeste QUICK SORT " + (i + 1) + ": " + tempoDecorridoQS100 + " ns" );
                if(i==4){
                    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                }
            }
            long mediaNanoQS100 = somarTemposQS100 / 5;
            double mediaMillisegundosQS100 = mediaNanoQS100 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO QUICK SORT ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNanoQS100);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosQS100));
            repeticao++;
        }while(repeticao<1);
        repeticao = 0;

        System.out.println("\n====================================================");
        System.out.println("\n====================================================");
        System.out.println("\n====================================================");


        do{
            Vetor.embaralhar(vetor100);
            System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 100 POSICOES DESORDENADO ===");
            System.out.println(Arrays.toString(vetor100));
            
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                long inicio = System.nanoTime();
                for (int j = 0; j < vetor100.length; j++) {
                    vetorTeste.insert(vetor100[j]);
                }
                long fim = System.nanoTime();
                long tempoDecorrido = fim - inicio;
                somarTempos += tempoDecorrido;
                System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
            }
            long mediaNano = somarTempos / 5;
            double mediaMillisegundos = mediaNano / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNano);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL ===");
            long somarTemposBusca = 0;
            int valorProcurado = 50;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(100);
                for (int j = 0; j < vetor100.length; j++) {
                    vetorBusca.insert(vetor100[j]);
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
            System.out.println("Tamanho: " + 100);
            System.out.println("Valor procurado: " + valorProcurado);
            System.out.println("Tempo Médio Busca (ns): " + mediaBusca);
            System.out.println("Tempo Médio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));


            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 100 POSICOES ===");
            long somarTemposBB100 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                for (int j = 0; j < vetor100.length; j++) {
                    vetorTeste.insert(vetor100[j]);
                }
                long inicioBB100 = System.nanoTime();
                vetorTeste.bubbleSort(vetorTeste.getData()); 
                long fimBB100 = System.nanoTime();
                long tempoDecorridoBB100 = fimBB100 - inicioBB100;
                somarTemposBB100 += tempoDecorridoBB100;
                System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB100 + " ns" );
                if(i==4){
                    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                }
            }
            long mediaNanoBB100 = somarTemposBB100 / 5;
            double mediaMillisegundosBB100 = mediaNanoBB100 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO BUBBLE SORT ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNanoBB100);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB100));

            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE ORDENAÇÃO(QUICK SORT) COM VETOR DE 100 POSICOES ===");
            long somarTemposQS100 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                for (int j = 0; j < vetor100.length; j++) {
                    vetorTeste.insert(vetor100[j]);
                }
                long inicioQS100 = System.nanoTime();
                vetorTeste.quickSort();
                long fimQS100 = System.nanoTime();
                long tempoDecorridoQS100 = fimQS100 - inicioQS100;
                somarTemposQS100 += tempoDecorridoQS100;
                System.out.println("\nTeste QUICK SORT " + (i + 1) + ": " + tempoDecorridoQS100 + " ns" );
                if(i==4){
                    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                }
            }
            long mediaNanoQS100 = somarTemposQS100 / 5;
            double mediaMillisegundosQS100 = mediaNanoQS100 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO QUICK SORT ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNanoQS100);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosQS100));


            repeticao++;
        }while(repeticao<1);

        repeticao = 0;

        System.out.println("\n====================================================");
        System.out.println("\n====================================================");
        System.out.println("\n====================================================");

        
        do{
            System.out.println("\n=== TESTE INSERÇÃO DE VALORES NO VETOR DE 100 POSICOES CRESCENTE ===");
            int[] vetor100c = Vetor.gerarValoresCresc(100);
            System.out.println(Arrays.toString(vetor100c));
            
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                long inicio = System.nanoTime();
                for (int j = 0; j < vetor100c.length; j++) {
                    vetorTeste.insert(vetor100c[j]);
                }
                long fim = System.nanoTime();
                long tempoDecorrido = fim - inicio;
                somarTempos += tempoDecorrido;
                System.out.println("\nTeste " + (i + 1) + ": " + tempoDecorrido + " ns" );
            }
            long mediaNano = somarTempos / 5;
            double mediaMillisegundos = mediaNano / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNano);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundos));
            

            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE DE BUSCA SEQUENCIAL ===");
            long somarTemposBusca = 0;
            int valorProcurado = 50;
            for(int i = 0; i<5; i++){
                Vetor vetorBusca = new Vetor(100);
                for (int j = 0; j < vetor100c.length; j++) {
                    vetorBusca.insert(vetor100c[j]);
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
            System.out.println("Tamanho: " + 100);
            System.out.println("Valor procurado: " + valorProcurado);
            System.out.println("Tempo Médio Busca (ns): " + mediaBusca);
            System.out.println("Tempo Médio Busca (ms): " + String.format("%.4f", mediaBusca / 1000000.0));


            System.out.println("\n====================================================");


            System.out.println("\n=== TESTE ORDENAÇÃO(BUBBLE SORT) COM VETOR DE 100 POSICOES ===");
            long somarTemposBB100 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                for (int j = 0; j < vetor100c.length; j++) {
                    vetorTeste.insert(vetor100c[j]);
                }
                long inicioBB100 = System.nanoTime();
                vetorTeste.bubbleSort(vetorTeste.getData()); 
                long fimBB100 = System.nanoTime();
                long tempoDecorridoBB100 = fimBB100 - inicioBB100;
                somarTemposBB100 += tempoDecorridoBB100;
                System.out.println("\nTeste BUBBLE SORT " + (i + 1) + ": " + tempoDecorridoBB100 + " ns" );
                if(i==4){
                    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                }
            }
            long mediaNanoBB100 = somarTemposBB100 / 5;
            double mediaMillisegundosBB100 = mediaNanoBB100 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNanoBB100);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosBB100));
            System.out.println("\n====================================================");

            System.out.println("\n=== TESTE ORDENAÇÃO(QUICK SORT) COM VETOR DE 100 POSICOES ===");
            long somarTemposQS100 = 0;
            for (int i = 0; i < 5; i++) {
                Vetor vetorTeste = new Vetor(100);
                for (int j = 0; j < vetor100.length; j++) {
                    vetorTeste.insert(vetor100[j]);
                }
                long inicioQS100 = System.nanoTime();
                vetorTeste.quickSort();
                long fimQS100 = System.nanoTime();
                long tempoDecorridoQS100 = fimQS100 - inicioQS100;
                somarTemposQS100 += tempoDecorridoQS100;
                System.out.println("\nTeste QUICK SORT " + (i + 1) + ": " + tempoDecorridoQS100 + " ns" );
                if(i==4){
                    System.out.println("\nVetor ordenado:\n[ " + vetorTeste.toString()+ " ]\n");
                }
            }
            long mediaNanoQS100 = somarTemposQS100 / 5;
            double mediaMillisegundosQS100 = mediaNanoQS100 / 1000000.0;
            System.out.println("\n--- RESULTADO FINAL ORDENACAO QUICK SORT ---");
            System.out.println("Tamanho: " + 100);
            System.out.println("Tempo Médio (ns): " + mediaNanoQS100);
            System.out.println("Tempo Médio (ms): " + String.format("%.4f", mediaMillisegundosQS100));
            repeticao++;
        }while(repeticao<1);
    }
}
