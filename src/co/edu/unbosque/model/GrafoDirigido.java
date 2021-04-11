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

    public void insertatElemento(int posicion, int ){

    }
}
