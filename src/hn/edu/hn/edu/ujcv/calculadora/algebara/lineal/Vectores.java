package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;

import hn.edu.hn.edu.ujcv.lib.al.VecR3;

import hn.edu.hn.edu.ujcv.lib.al.VecR4;

import hn.edu.ujcv.util.LectorTeclado;

public class Vectores {

    public int opcion_vec;
    public int vec_R2;
    public int vec_R3;
    public int vec_R4;

    public LectorTeclado lt = new LectorTeclado();

    public void menu() {
        System.out.println("Bienvenido a los vectores");
        System.out.println("");
        System.out.println("Presione 1 para Vectores en R2");
        System.out.println("Presione 2 para Vectores en R3");
        System.out.println("Presione 3 para Vectores en R4");
        System.out.println("Presione Opcion 3 para regresar");

    }

    public int leer_opciones() {
        opcion_vec = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

        return opcion_vec;

    }

    public void menu_vectores() {


        switch (opcion_vec) {
            case 1:
                System.out.println("Bienvenido a los vectores en R2");
                //vectores opciones
                break;

            int opcion_vec2 = lt.leerEntero("Ingrese una opcion valida","Intente de nuevo");

            switch (opcion_vec){


                }

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
