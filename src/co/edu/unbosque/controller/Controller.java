package co.edu.unbosque.controller;

import co.edu.unbosque.model.GrafoDirigido;
import co.edu.unbosque.view.View;

public class Controller {

    private View view;
    private GrafoDirigido grafoDirigido;

    public Controller() {
        view = new View();
        funcionar();
    }

    private void funcionar() {
        String opcion = view.menuPrincipal();

        switch (opcion) {
            case "1. Grafo dirigido.":
                int vertices = view.capturarInt("Ingrese cantidad de vertices: ");
                int arcos = view.capturarInt("Ingrese cantidad de arcos");

                if (arcos < vertices) {
                    view.mostrarMensaje("Cantidad de arcos menor que los vertices");
                    funcionar();
                } else {
                    grafoDirigido = new GrafoDirigido(vertices, arcos);
                    grafoDirigido.inicializarLista();
                }

                for (int i = 0; i < arcos; i++) {
                    String datos = view.capturarString("Ingrese inicio, destino,  peso para el arco (separado por ;):");
                    String[] arco = datos.split(";");
                    if (esNumeroInt(arco[0]) && esNumeroInt(arco[1]) && esNumeroInt(arco[2])) {
                        grafoDirigido.insertatElemento(Integer.parseInt(arco[0]), Integer.parseInt(arco[1]), Integer.parseInt(arco[2]));
                    }
                }

                menuGrafos();

                break;

            case "2:":
                //parte gonzo

                break;

        }
    }

    public void menuGrafos() {
        String opcion = view.menuGrafos(grafoDirigido.mostrarListaAdyacencia());

        switch (opcion) {

            case "1. Eliminar elemento":

        }
    }

    private boolean esNumeroInt(String mensaje) {
        try {
            Integer.parseInt(mensaje);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


}
