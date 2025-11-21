package Vetor;
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

    public int getSize() {
        return this.size;
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
}