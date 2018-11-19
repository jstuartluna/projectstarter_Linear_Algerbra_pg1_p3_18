package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.ujcv.util.LectorTeclado;

public class MenuPrincipal {

    public int opciones;
    Vectores vectores = new Vectores();
    Matrices matrices = new Matrices();

    LectorTeclado lt = LectorTeclado.getInstance();


    public void menu2() {
        System.out.println("\n Bienvenido a la Calculadora de algebra lineal");
        System.out.println("");
        System.out.println("Presione 1 para Vectores");
        System.out.println("Presione 2 para Matrices");
        System.out.println("Presione 3 para terminar el programa");

    }

    public int leer_opciones() {
        opciones = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");
        return opciones;

    }

    public void vecymat(int opciones) {


        switch (opciones) {
            case 1:
                vectores.menu();
                break;

            case 2:
                matrices.menumat();
                break;

            case 3:
                System.out.println("Gracias, hasta pronto");
                break;
        }

    }
}