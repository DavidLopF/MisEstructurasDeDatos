package co.edu.unbosque.model;

public class Lista {

    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public boolean listaVacia() {
        return primero == null;
    }

    public void insertar(int elemento, int peso) {
        if (listaVacia()) {
            Nodo nuevo = new Nodo(elemento, peso);
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            Nodo nuevo = new Nodo(elemento, peso);
            actual.setSiguiente(nuevo);
        }
    }

    public String toString() {
        if (!listaVacia()) {
            Nodo actual = primero;
            String r = "";
            while (actual != null) {
                r += actual.toString() + " -> ";
                actual = actual.getSiguiente();
            }
            r = r.substring(0, r.length() - 3);
            return r;
        } else {
            return "Lista vacia";
        }
    }

    public void eliminar(int a) {
        if (!listaVacia()) {
            Nodo temp = primero.getSiguiente();
            Nodo ante = primero;
            while (temp.getSiguiente() != null) {
                if (temp.getVertice() == a) {
                    temp = null;
                    ante.setSiguiente(null);
                }

                temp = temp.getSiguiente();
                ante = temp.getSiguiente();
            }
        }
    }
}
