# Análise de Desempenho de Estruturas de Dados em Java

Este repositório contém o trabalho prático da disciplina de Estrutura de Dados do curso de Análise e Desenvolvimento de Sistemas (FAMINAS). O projeto consiste na implementação "do zero" (sem bibliotecas de coleções nativas) de estruturas de dados fundamentais e na análise comparativa de seu desempenho em operações de inserção, busca e ordenação.

## 📋 Sobre o Projeto

O objetivo principal é comparar a eficiência de **Vetores**, **Árvores Binárias de Busca (ABB)** e **Árvores AVL** em diferentes cenários:
* **Volumes de dados:** 100, 1.000 e 10.000 elementos.
* **Ordenação da entrada:** Crescente, Decrescente e Aleatória.

Além das estruturas, foram implementados e comparados algoritmos de ordenação (**Bubble Sort** vs **Quick Sort**) e busca (**Sequencial** vs **Binária**).

## 📂 Estrutura de Arquivos

O código está organizado em pacotes Java conforme a função de cada classe:

* **/Estruturas**: Contém as implementações principais das estruturas de dados.
    * `Vetor/Vetor.java`: Implementação de array dinâmico com métodos de ordenação (Bubble/Quick) e busca.
    * `ArvoreDeBuscaBinaria/ArvoreBinaria.java`: Implementação da ABB clássica (sem balanceamento).
    * `ArvoreAVL/ArvoreAVL.java`: Implementação da Árvore AVL com rotações automáticas para balanceamento.
* **/TesteVetores**: Classes executáveis para testar desempenho de inserção, busca e ordenação em vetores (`TesterVetor100.java`, `TesterVetor1000.java`, etc.).
* **/TesteArvores**: Classes executáveis para testar a Árvore Binária (`TesterArvoreBB100.java`, etc.).
* **/TesteArvoresAVL**: Classes executáveis para testar a Árvore AVL (`TesterArvoreAVL100.java`, etc.).

## 🚀 Guia de Instalação e Execução

### Pré-requisitos
* **Java JDK** (Recomendado versão 8 ou superior).
* **Git** instalado.

### 1. Clonar o Repositório
Abra o seu terminal (CMD, PowerShell ou Bash) e execute o comando abaixo para baixar o projeto:

```bash
git clone https://github.com/gabrielxniper/java-data-structures-performance-analysis
cd java-data-structures-performance-analysis
````
2. Compilação
Compile todos os arquivos Java.
3. Execução dos Testes
Entre em uma das pastas de Teste, em cada pasta haverá as opções referentes às estruturas com 100, 1000 e 10000 valores.

Exemplos de execução:

Para testar Vetores (10.000 elementos):
  java TesteVetores.TesterVetor10000
Para testar Árvore Binária (1.000 elementos):
  java TesteArvores.TesterArvoreBB1000
Para testar Árvore AVL (100 elementos):
  java TesteArvoresAVL.TesterArvoreAVL100

  
🛠 Tecnologias Utilizadas
Linguagem: Java (implementação pura).

Ferramentas: VSCode, JGRASP (para debug e visualização).

✒️ Autor
Gabriel da Costa Rodrigues
Curso: Análise e Desenvolvimento de Sistemas
Instituição: Centro Universitário FAMINAS
