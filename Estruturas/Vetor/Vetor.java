package Vetor;

import java.util.Random;

public class Vetor {
    private int[] data;
    private int size; 

    public Vetor(int capacidade) {
        this.data = new int[capacidade];
        this.size = 0;
    }
    public void insert(int data) {
        if (this.size >= this.data.length) {
            throw new ArrayIndexOutOfBoundsException("Erro: Capacidade máxima do vetor atingida!"); 
        }
        this.data[this.size] = data;
        this.size++;
    }
    public void quickSort() {
        quickSortRecursivo(this.data, 0, this.size - 1);
    }


    public int buscaBinaria(int valor) {
        return buscaBinariaRecursiva(valor, 0, this.size - 1);
    }
    private int buscaBinariaRecursiva(int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }
        int meio = (inicio + fim) / 2;
        if (this.data[meio] == valor) {
            return meio;
        }
        if (this.data[meio] < valor) {
            return buscaBinariaRecursiva(valor, meio + 1, fim);
        } 
        else {
            return buscaBinariaRecursiva(valor, inicio, meio - 1);
        }
    }


    private void quickSortRecursivo(int[] vetor, int inicio, int fim) {
        if (inicio >= fim){
            return;
        } 
        int i = inicio;
        int f = fim;
        int pivo = vetor[(inicio + fim) / 2];

        while (i <= f) {
            while (vetor[i] < pivo) i++;
            while (vetor[f] > pivo) f--;

            if (i <= f) {
                int temp = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = temp;
                i++;
                f--;
            }
        }
        if (inicio < f) quickSortRecursivo(vetor, inicio, f);
        if (i < fim) quickSortRecursivo(vetor, i, fim);
    }


    
    public void bubbleSort(int[] vetor) {
        int tamanho = vetor.length;
        for(int i = 0; i<tamanho-1; i++){
            for(int j = 0; j< tamanho-i-1; j++){
                if (vetor[j] > vetor[j + 1]) {
                    int vetorJ = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = vetorJ;
                }
            }
        }
    }
    public int buscaSequencial(int valor) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == valor) {
                return i; //
            }
        }
        return -1;
    }

    public int getSize() {
        return this.size;
    }
    public int[] getData() {
        return this.data;
    }
    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < this.size; i++) {
            if(i < this.size - 1){
                resultado += this.data[i] + ",";
            }
            if(i == this.size - 1){
                resultado += this.data[i];
            }
        }
        return resultado;
    }
    public static int[] gerarValores(int tamanho) {
        int[] vetorGerado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorGerado[i] = tamanho - i;
        }
        return vetorGerado;
    }
    public static int[] gerarValoresCresc(int tamanho) {
        int[] vetorGerado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorGerado[i] = i+1;
        }
        return vetorGerado;
    }
    public static void embaralhar(int[] vetor) {
        Random random = new Random();
        for (int i = vetor.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int vetorI = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = vetorI;
        }
    }
}