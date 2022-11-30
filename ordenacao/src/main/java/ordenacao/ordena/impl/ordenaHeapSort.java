package ordenacao.ordena.impl;

import ordenacao.iOrdenar;
public class ordenaHeapSort implements iOrdenar{
    @Override
    public int[] ordena(int[] vetor) {
        int size = vetor.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(vetor, size, i);
        for (int i = size - 1; i >= 0; i--) {
            int x = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = x;
            heapify(vetor, i, 0);
        }
        return vetor;
    }

    public void heapify(int array[], int SizeofHeap, int i) {
        int largestelement = i;
        int leftChild  = 2*i + 1;
        int rightChild  = 2*i + 2;
        if (leftChild  < SizeofHeap && array[leftChild ] > array[largestelement])
            largestelement = leftChild ;
        if (rightChild  < SizeofHeap && array[rightChild ] > array[largestelement])
            largestelement = rightChild ;
        if (largestelement != i) {
            int temp = array[i];
            array[i] = array[largestelement];
            array[largestelement] = temp;
            heapify(array, SizeofHeap, largestelement);
        }
    }
}
