import ordenacao.Ordenar;
import ordenacao.ordenacaoBubbleSort;
import ordenacao.ordenacaoHeapSort;
import ordenacao.ordenacaoMergeSort;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Ordenar ord = null;
        int vetor[] = new int[8];
        int op = -1;
        int op2 = -1;
        int arr[] = new int[8];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 4;
        vetor[3] = 3;
        vetor[4] = 6;
        vetor[5] = 5;
        vetor[6] = 7;
        vetor[7] = 0;

        while (op != 4){
            System.out.print("Opções\n 1- Bubble Sort\n 2- Merge Sort\n 3- Heap Sort\n 4- Sair\nEscolha qual ordenação deseja: ");
            op = input.nextInt();
            if (op < 1 || op > 3) {
                break;
            }
            System.out.print("Opções\n 1- Escolher valor do vetor\n 2- Valor padrão/escolhido anteriormente\nEscolha qual ordenação deseja: ");
            op2 = input.nextInt();
            if(op2 == 1){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("Posicao ");
                    System.out.print(i);
                    System.out.print(": ");
                    vetor[i] = input.nextInt();
                }
            }
            if(op == 1) {
                ord = new ordenacaoBubbleSort();
            } else if (op == 2) {
                ord = new ordenacaoMergeSort();
            } else if (op == 3) {
                ord = new ordenacaoHeapSort();
            }
            arr = ord.Ordenar(vetor);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
