import ordenacao.Ordenar;
import ordenacao.ordena.impl.ordenaBubbleSort;
import ordenacao.ordena.impl.ordenaHeapSort;
import ordenacao.ordena.impl.ordenaMergeSort;
import ordenacao.ordenacaoBubbleSort;
import ordenacao.ordenacaoHeapSort;
import ordenacao.ordenacaoMergeSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOrdenar {

    Ordenar ordenar;
    int[] vetorMock = new int[4];

    @Before
    public void setup(){
        vetorMock[0] = 56;
        vetorMock[1] = 12;
        vetorMock[2] = 44;
        vetorMock[3] = 9;
    }

    @Test
    public void testeordenacaoBubbleSort(){
        ordenar = new ordenacaoBubbleSort();
        assertTrue(ordenar.getOrdenar() instanceof ordenaBubbleSort);
    }

    @Test
    public void testeordenacaoBubbleSortOrdenado(){
        ordenar = new ordenacaoBubbleSort();
        int[] arr = new int[4];
        arr = ordenar.Ordenar(vetorMock);
        assertEquals(arr[0], 9);
        assertEquals(arr[1], 12);
        assertEquals(arr[2], 44);
        assertEquals(arr[3], 56);
    }

    @Test
    public void testeordenacaoHeapSort(){
        ordenar = new ordenacaoHeapSort();
        assertTrue(ordenar.getOrdenar() instanceof ordenaHeapSort);
    }

    @Test
    public void testeordenacaoHeapSortOrdenado(){
        ordenar = new ordenacaoHeapSort();
        int[] arr = new int[4];
        arr = ordenar.Ordenar(vetorMock);
        assertEquals(arr[0], 9);
        assertEquals(arr[1], 12);
        assertEquals(arr[2], 44);
        assertEquals(arr[3], 56);
    }

    @Test
    public void testeordenacaoMergeSort(){
        ordenar = new ordenacaoMergeSort();
        assertTrue(ordenar.getOrdenar() instanceof ordenaMergeSort);
    }

    @Test
    public void testeordenacaoMergeSortOrdenado(){
        ordenar = new ordenacaoMergeSort();
        int[] arr = new int[4];
        arr = ordenar.Ordenar(vetorMock);
        assertEquals(arr[0], 9);
        assertEquals(arr[1], 12);
        assertEquals(arr[2], 44);
        assertEquals(arr[3], 56);
    }
}
