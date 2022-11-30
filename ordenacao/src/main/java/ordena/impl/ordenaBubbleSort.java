package ordena.impl;

import iOrdenar;

public class ordenaBubbleSort implements iOrdenar {

    @Override
    public int[] ordena(int[] vetor) {
        int n = vetor.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(vetor[j-1] > vetor[j]){
                    temp = vetor[j-1];
                    vetor[j-1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        return vetor;
    }
}
