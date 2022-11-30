package ordenacao.ordena.impl;

import ordenacao.iOrdenar;

public class ordenaMergeSort implements iOrdenar{
    @Override
    public int[] ordena(int[] vetor) {
        if (vetor.length <= 1) {
            return vetor;
        }
        int meio = vetor.length / 2;
        int[] dir = vetor.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];
        int[] aux = new int[vetor.length];
        for (int i = 0; i < meio; i++) {
            esq[i] = vetor[i];
        }
        int auxIndex = 0;
        for (int i = meio; i < vetor.length; i++) {
            dir[auxIndex] = vetor[i];
            auxIndex++;
        }
        esq = ordena(esq);
        dir = ordena(dir);
        aux = mergesort(esq, dir);

        return aux;
    }

    static int[] mergesort(int[] esq, int[] dir) {
        int[] aux = new int[esq.length + dir.length];

        int indexDir = 0, indexEsq = 0, indexAux = 0;

        while (indexEsq < esq.length || indexDir < dir.length) {
            if (indexEsq < esq.length && indexDir < dir.length) {
                if (esq[indexEsq] <= dir[indexDir]) {
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                } else {
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                }
            } else if (indexEsq < esq.length) {
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
            } else if (indexDir < dir.length) {
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
            }
        }
        return aux;
    }

}
