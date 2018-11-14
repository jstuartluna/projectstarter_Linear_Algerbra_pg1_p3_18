package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.Mat2x2;
import hn.edu.ujcv.util.LectorTeclado;

public class Matrices {

    LectorTeclado lt = LectorTeclado.getInstance();

    public void menu() {
        int opcion_mat;
        System.out.println("Bienvenido a las matrices");
        System.out.println("");
        System.out.println("Presione 1 para Matrices en R2");
        System.out.println("Presione 2 para Matrices en R3");
        System.out.println("Presione 3 para Matrices en R4");
        System.out.println("Presione 4 para regresar al menu principal");
        opcion_mat = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

        switch (opcion_mat){
            case 1:{

            }
        }
    }

    public Mat2x2 Mat2a(){
        Mat2x2 b = new Mat2x2();
        b.setX(lt.leerReal("Ingrese el primer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        b.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        return new Mat2x2(b);
    }


}
