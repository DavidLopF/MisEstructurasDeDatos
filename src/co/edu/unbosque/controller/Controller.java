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
                    } else {
                        view.mostrarMensaje("Datos erroneos.");
                        funcionar();
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

            case "1. Eliminar elemento y todos sus arcos.":
                int elemento = view.capturarInt("Ingrese elemento a eliminar: ");
                grafoDirigido.eliminarElemento(elemento);
                menuGrafos();
                break;

            case "2. indicar si existe un camino entre un Nodo X y otro Nodo y":
                String datos = view.capturarString("Ingrese incio y destino separado de  ( ; ) : ");
                String[] camino = datos.split(";");
                if (esNumeroInt(camino[0]) && esNumeroInt(camino[1]) && esNumeroInt(camino[0])) {

                    view.mostrarMensaje("Desde " + camino[0] + " a " + camino[1] + " hay " + grafoDirigido.indicarCaminosXY(Integer.parseInt(camino[0]), Integer.parseInt(camino[0])) + " caminos.");
                    menuGrafos();
                    break;

                } else {
                    view.mostrarMensaje("..:: DATO INCORRECTO ::..");
                    menuGrafos();
                    break;
                }

            case "3. Ruta menos costosa entre nodo x a nodo y":
                String dato = view.capturarString("Ingrese inicio y destino separado de  ( ; )");
                String[] cam = dato.split(";");

                if (esNumeroInt(cam[0]) && esNumeroInt(cam[1])) {
                    if(grafoDirigido.indicarCaminosXY(Integer.parseInt(cam[0]), Integer.parseInt(cam[1])) > 1){



                    }else{
                        view.mostrarMensaje("Solo hay un camino entre " + cam[0] + " y " + cam[1]);
                        menuGrafos();
                        break;
                    }
                }else{
                    view.mostrarMensaje("..:: DATO INCORRECTO ::..");
                    menuGrafos();
                    break;
                }



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
