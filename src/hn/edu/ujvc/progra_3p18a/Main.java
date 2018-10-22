package hn.edu.ujvc.progra_3p18a;

import hn.edu.ujcv.util.LectorTeclado;


public class Main {

    public static void main(String[] args) {
        LectorTeclado lt = new LectorTeclado();

        System.out.println("ingerese un entero");

        int x = lt.leerEntero("_?","ingrese un entero");

        System.out.println("el entero que ingreso es :" + x);
	    System.out.println("hola mundo!!");
    }
}
