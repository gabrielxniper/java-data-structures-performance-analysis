# 📊 **Análise de Desempenho de Estruturas de Dados em Java**

Este repositório contém o trabalho prático da disciplina de **Estrutura de Dados** do curso de **Análise e Desenvolvimento de Sistemas (FAMINAS)**.
O projeto consiste na **implementação completa (do zero)** de estruturas de dados fundamentais e na **análise comparativa de desempenho** em diferentes volumes e cenários.

---

## 📋 **Sobre o Projeto**

O objetivo principal é comparar a eficiência de:

✔ **Vetores**
✔ **Árvores Binárias de Busca (ABB)**
✔ **Árvores AVL**

em operações de:

* Inserção
* Busca
* Ordenação

### 📌 Cenários de teste

**Tamanhos:**

* 100
* 1.000
* 10.000 elementos

**Tipos de entrada:**

* Crescente
* Decrescente
* Aleatória

### 📌 Algoritmos analisados

**Ordenação**

* Bubble Sort
* Quick Sort

**Busca**

* Sequencial
* Binária

---

## 📂 **Estrutura do Repositório**

```
/Estruturas
    /Vetor
        Vetor.java
    /ArvoreDeBuscaBinaria
        ArvoreBinaria.java
    /ArvoreAVL
        ArvoreAVL.java

/TesteVetores
    TesterVetor100.java
    TesterVetor1000.java
    TesterVetor10000.java

/TesteArvores
    TesterArvoreBB100.java
    TesterArvoreBB1000.java
    TesterArvoreBB10000.java

/TesteArvoresAVL
    TesterArvoreAVL100.java
    TesterArvoreAVL1000.java
    TesterArvoreAVL10000.java
```

---

## 🚀 **Guia de Instalação e Execução**

### 🔧 **Pré-requisitos**

* **Java JDK 8+**
* **Git**

---

## 📥 **1. Clonar o Repositório**

```bash
git clone https://github.com/gabrielxniper/java-data-structures-performance-analysis
cd java-data-structures-performance-analysis
```

---

## 🏗 **2. Compilar o Projeto**

Compile todos os arquivos `.java`:

```bash
javac */**/*.java
```

(ou compile individualmente, conforme sua IDE)

---

## ▶️ **3. Executar os Testes**

### ➤ Testar Vetores (10.000 elementos)

```bash
java TesteVetores.TesterVetor10000
```

### ➤ Testar Árvore Binária (1.000 elementos)

```bash
java TesteArvores.TesterArvoreBB1000
```

### ➤ Testar Árvore AVL (100 elementos)

```bash
java TesteArvoresAVL.TesterArvoreAVL100
```

---

## 🛠 **Tecnologias Utilizadas**

* **Java (puro, sem libraries de coleções)**
* **VSCode**
* **JGRASP** (debug e visualização)

---

## ✒️ **Autor**

**Gabriel da Costa Rodrigues**
Curso: *Análise e Desenvolvimento de Sistemas*
Instituição: *Centro Universitário FAMINAS*

---

