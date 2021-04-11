package co.edu.unbosque.model;

public class Nodo {

    private int vertice;
    private int peso;
    private Nodo siguiente;

    public Nodo(int elemento, int peso) {
        this.vertice = elemento;
        this.peso = peso;
        siguiente = null;
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "vertice: " + vertice + " , peso :" + peso;
    }
}