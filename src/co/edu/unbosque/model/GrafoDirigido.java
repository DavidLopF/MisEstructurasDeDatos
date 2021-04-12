package co.edu.unbosque.model;

public class GrafoDirigido {

    private Lista[] listaAdyacencia;
    private int vertices;
    private int arcos;

    public GrafoDirigido(int vertices, int arcos) {

        this.vertices = vertices;
        this.arcos = arcos;
        listaAdyacencia = new Lista[this.vertices];
    }

    public void inicializarLista() {
        int cont = 0;
        for (int i = 0; i < listaAdyacencia.length; i++) {
            Lista lista = new Lista();
            listaAdyacencia[i] = lista;
            lista.insertar(cont, 0);
            cont++;
        }
    }

    public void eliminarElemento(int a) {

        listaAdyacencia[a] = null;
        for (int i = 0; i < listaAdyacencia.length ; i++) {

        }
    }


    public void insertatElemento(int posicion, int peso, int elemento) {
        listaAdyacencia[posicion].insertar(peso, elemento);
    }

    public String mostrarListaAdyacencia() {
        String a = "";
        for (int i = 0; i < listaAdyacencia.length; i++) {
            a += listaAdyacencia[i].toString() + "\n";
        }
        return a;
    }

    public Lista[] getListaAdyacencia() {
        return listaAdyacencia;
    }

    public void setListaAdyacencia(Lista[] listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int getArcos() {
        return arcos;
    }

    public void setArcos(int arcos) {
        this.arcos = arcos;
    }
}
