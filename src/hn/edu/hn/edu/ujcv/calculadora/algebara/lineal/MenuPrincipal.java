package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.ujcv.util.LectorTeclado;

public class MenuPrincipal {

    public int opciones;

    public LectorTeclado lt = new LectorTeclado();

    Vectores vectores = new Vectores();
    Matrices matrices = new Matrices();


    public void menu() {
        System.out.println("Bienvenido a la Calculadora de algebra lineal");
        System.out.println("");
        System.out.println("Presione 1 para Vectores");
        System.out.println("Presione 2 para Matrices");
        System.out.println("Presione Opcion 3 para termiar el programa");

    }

    public int leer_opciones() {
        opciones = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");
        return opciones;

    }

    public void menu_principal() {


        switch (opciones) {
            case 1:


                break;

            case 2:
                System.out.println("Bienvenido a las matrices");
                //matrices opciones
                break;

            case 3:
                System.out.println("Gracias, hasta pronto");
                break;
        }

    }
}