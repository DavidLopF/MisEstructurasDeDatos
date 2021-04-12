package co.edu.unbosque.view;

import javax.swing.*;

public class View {

    public void mostrarMensaje(String a) {
        JOptionPane.showMessageDialog(null, a);
    }

    public String capturarString(String titulo) {
        String a = JOptionPane.showInputDialog(titulo);
        return a;
    }

    public int capturarInt(String titulo) {
        String a = JOptionPane.showInputDialog(titulo);
        int num = 0;
        if (esNumeroInt(a)) {
            num = Integer.parseInt(a);
            System.out.println("DATO INGRESADO CON EXITO,");
        } else {
            System.out.println("ERROR.. NO ES ENTERO.");
        }

        return num;
    }


    private boolean esNumeroInt(String mensaje) {
        try {
            Integer.parseInt(mensaje);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public String menuPrincipal() {
        Object[] opciones = {"1. Grafo dirigido.", "2. Grafo no dirigido", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "      ..:Bienvenido señor usuario :..                " + "\n\n\nSelecciona un operacion a realizar:    ", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }

    public String menuGrafos(String a) {
        Object[] opciones = {"1. Eliminar elemento",
                "2. indicar si existe un camino entre un Nodo X y otro Nodo y", "3. Ruta menos costosa entre nodo x a nodo y", "Salir"};
        Object opcion = JOptionPane.showInputDialog(null, "El grafo representado en lista de adyacencia es:  " + "\n" + a + "\n\n\nSelecciona un operacion a realizar:    ", "Elegir",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if (opcion == null) {
            mostrarMensaje("Hasta Pronto");
        }
        return opcion.toString();
    }
}
