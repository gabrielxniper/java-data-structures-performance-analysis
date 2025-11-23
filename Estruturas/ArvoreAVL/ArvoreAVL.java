package ArvoreAVL;

public class ArvoreAVL {
    private class No {
        int valor;
        No esquerda;
        No direita;
        int altura;

        No(int valor) {
            this.valor = valor;
            this.altura = 1;
        }
    }
    private No raiz;

    private int altura(No raiz) {
        if (raiz == null){
           return 0; 
        } 
        return raiz.altura;
    }

    private int fatorBalanceamento(No raiz) {
        if (raiz == null) {
            return 0;
        }
        return altura(raiz.direita) - altura(raiz.esquerda);
    }

    private No rotacaoDireita(No y) {

        No x = y.esquerda;
        No T2 = x.direita;
        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    private No rotacaoEsquerda(No x) {

        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        } else {
            return atual;
        }
        atual.altura = 1 + Math.max(altura(atual.esquerda), altura(atual.direita));

        int fb = fatorBalanceamento(atual);
        if (fb > 1 && valor > atual.direita.valor) {
            return rotacaoEsquerda(atual);
        }
        if (fb < -1 && valor < atual.esquerda.valor) {
            return rotacaoDireita(atual);
        }
        if (fb > 1 && valor < atual.direita.valor) {
            atual.direita = rotacaoDireita(atual.direita);
            return rotacaoEsquerda(atual);
        }
        if (fb < -1 && valor > atual.esquerda.valor) {
            atual.esquerda = rotacaoEsquerda(atual.esquerda);
            return rotacaoDireita(atual);
        }
        return atual; 
    }
    public static int[] gerarValoresCresc(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i + 1;
        }
        return vetor;
    }

    public static int[] gerarValoresDesc(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = tamanho - i;
        }
        return vetor;
    }

    public static int[] gerarValoresRandom(int tamanho) {
        int[] vetor = gerarValoresCresc(tamanho); // 1..tamanho

        java.util.Random random = new java.util.Random();

        for (int i = vetor.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
        }

        return vetor;
    }


}
