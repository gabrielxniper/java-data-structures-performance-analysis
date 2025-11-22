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