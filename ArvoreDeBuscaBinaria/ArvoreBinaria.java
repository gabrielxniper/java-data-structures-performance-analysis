package  ArvoreDeBuscaBinaria;

import java.util.Random;

public class ArvoreBinaria {
    private class No {
        int valor;
        No esquerda, direita;
        No(int valor) {
            this.valor = valor;
        }
    }

    private No raiz;

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
        }
        return
         atual;
    }
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }
    
    private boolean buscarRecursivo(No atual, int valor) {
        if (atual == null) {
            return false;
        }
        if (valor == atual.valor) {
            return true;
        }
        if (valor < atual.valor) {
            return buscarRecursivo(atual.esquerda, valor);
        } else {
            return buscarRecursivo(atual.direita, valor);
        }
    }

    public static int[] gerarValoresCresc(int tamanho) {
        int[] vetorGerado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorGerado[i] = i + 1;
        }
        return vetorGerado;
    }

    public static int[] gerarValoresDesc(int tamanho) {
        int[] vetorGerado = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetorGerado[i] = tamanho - i;
        }
        return vetorGerado;
    }

    public static int[] gerarValoresRandom(int tamanho) {
        int[] vetorGerado = gerarValoresCresc(tamanho);
        Random random = new Random();
        for (int i = tamanho - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = vetorGerado[i];
            vetorGerado[i] = vetorGerado[j];
            vetorGerado[j] = temp;
        }

        return vetorGerado;
    }
} 
    
