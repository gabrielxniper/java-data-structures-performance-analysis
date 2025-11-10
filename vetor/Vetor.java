package vetor;
public class Vetor {
    private int[] data;
    private int size; 

    public Vetor(){
        this.data = new int[10000];
        this.size = 0; 
    }
    public void insert(int data) {
        if (this.size >= this.data.length) {
            throw new ArrayIndexOutOfBoundsException("Erro: Capacidade máxima do vetor (10000) atingida!"); 
        }
        this.data[this.size] = data;
        this.size++;
    }

    public int getSize() {
        return this.size;
    }
    public int[] getData() {
        return this.data;
    }
}