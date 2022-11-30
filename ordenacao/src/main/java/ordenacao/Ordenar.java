package ordenacao;

public abstract class Ordenar {

    protected iOrdenar ordenar;

    public iOrdenar getOrdenar() {
        return ordenar;
    }

    public void setOrdenar(iOrdenar ordenar) {
        this.ordenar = ordenar;
    }

    public int[] Ordenar(int[] vetor){
        return ordenar.ordena(vetor);
    }
}
