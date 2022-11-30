package ordenacao;

import ordenacao.ordena.impl.ordenaHeapSort;

public class ordenacaoHeapSort extends Ordenar {

    public ordenacaoHeapSort(){
        ordenar = new ordenaHeapSort();
    }

}