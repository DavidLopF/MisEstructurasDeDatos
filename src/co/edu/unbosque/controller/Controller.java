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
            case "1":
                int vertices = view.capturarInt("Ingrese cantidad de vertices: ");
                int arcos = view.capturarInt("Ingrese cantidad de arcos");

                if (arcos < vertices) {
                    view.mostrarMensaje("Cantidad de arcos menor que los vertices");
                    funcionar();
                } else {

                    grafoDirigido = new GrafoDirigido(vertices, arcos);

                }
                break;

            case "2:":


                break;

        }
    }


}
