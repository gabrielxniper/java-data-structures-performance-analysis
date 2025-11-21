import Vetor.Vetor; 
public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        int[] dados = { 8, 2, 3, 5, 7, 6, 1, 4, 9, 0};

        for (int i = 0; i < dados.length; i++) {
            vetor.insert(dados[i]);
            System.out.println("Inserido: " + dados[i]);
        }

        System.out.println("Vetor Original:");
        System.out.println(vetor);

        vetor.bubbleSort(vetor.getData());

        System.out.println("Vetor Ordenado:");
        System.out.println(vetor);
    }
}