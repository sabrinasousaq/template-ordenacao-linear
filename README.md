# Identificação

* Nome: Sabrina de Oliveira Sousa
* Email (@ccc): sabrina.de.oliveira.sousa@ccc.ufcg.edu
* Matrícula: 124212432

# Roteiro: Ordenação linear

## Material Teórico 

[Counting Sort](https://joaoarthurbm.github.io/eda/posts/ordenacao-linear/)

## O template

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão (ou você terá que incluir) no diretório **/src/main/java/** no formato de asserts.

> Seu código é tão bom quanto seus testes.

> Eu vou executar meus testes quando você submeter.

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.

> Compilando: `javac *.java` em **/src/main/java/**

> Executando os testes: `java -ea CountingSortAsserts` e `java -ea RadixSortAsserts` em **/src/main/java/**

## Introdução

Este roteiro envolve implementação e teoria dos principais algoritmos de ordenação linear.

## A tarefa. 

### Implementação e testes


**CountingSort.** Implemente os métodos da classe CountingSort. A explicação do que fazer está como comentário no código. Seu objetivo é passar nos testes que disponibilizei.

Ah...confira (sempre!) se você passa nos testes: `java -ea CountingSortAsserts` e `java -ea RadixSortAsserts` em **/src/main/java/**.

Óbvio que você pode simplesmente copiar código da Internet e colar lá. Eu mesmo disponibilizo código. Mas, conselho, assim você não aprende :)

### Teoria

Perguntas importantes:
  
  * Apresente um exemplo concreto em que o Counting Sort é muito adequado.

  > Por exemplo, ordenar a idade de todas as pessoas do mundo. "0-180". São 10 dígitos de 0-9, ou seja, todas as entradas são inteiros positivos.
  
  * Apresente um exemplo concreto em que o Counting Sort não é uma boa alternativa para ordenação.

  > Quando o K é muito maior que o N, por exemplo, um array A com os elementos -3 10 70.000.000: Chamando o array de frequência de B: B terá muitas posições vazias, formam "buracos" dentro do array. 

  * Qual problema do Counting Sort o Radix Sort resolve? Como? 

  > Resolve a ineficiência de trabalhar com entradas muito maiores, facilita a ordenação com K maior.

    
## Mais estudo

Implemente as seguintes questões no tst-eda:

* Radix Dois Dígitos
* Radix Três Dígitos
