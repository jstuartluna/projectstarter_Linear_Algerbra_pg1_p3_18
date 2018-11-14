package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.Mat2x2;
import hn.edu.hn.edu.ujcv.lib.al.VecR2;
import hn.edu.ujcv.util.LectorTeclado;

public class Matrices {
    LectorTeclado lt = LectorTeclado.getInstance();

    public void menumat() {
        int opcion_mat;
        System.out.println("Bienvenido a las matrices");
        System.out.println("");
        System.out.println("Presione 1 para Matrices en R2");
        System.out.println("Presione 2 para Matrices en R3");
        System.out.println("Presione 3 para Matrices en R4");
        System.out.println("Presione 4 para regresar al menu principal");
        opcion_mat = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

        switch (opcion_mat) {
            case 1:
                System.out.println("Escoja el tipo de operacion a realizar con vectores en R2");
                System.out.println(" 1.  para Suma");
                System.out.println(" 2.  para Resta");
                System.out.println(" 3.  para Multiplicacion de dos Matrices");
                System.out.println(" 4.  para Multiplicacion por un escalar");
                System.out.println(" 5.  para Multiplicacion por un vector columna");
                System.out.println(" 6.  para Regresar al menu Principal");

                int opcion_mat2 = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

                switch (opcion_mat2) {
                    case 1: {
                        Mat2x2 mata1 = Mat2a();
                        Mat2x2 matb1 = Mat2b();
                        Mat2x2 res1 = mata1.resta(matb1);
                        resMat2c(res1);
                    }

                }
        }
    }

    public Mat2x2 Mat2a() {
        VecR2 colx = new VecR2();
        VecR2 coly = new VecR2();
        colx.setX(lt.leerEntero("Ingresar el numero de la matriz a en la posicion (1,1)", "Favor intentar de nuevo"));
        colx.setY(lt.leerEntero("Ingresar el numero de la matriz a en la posicion (1,2)", "Favor intentar de nuevo"));
        coly.setX(lt.leerEntero("Ingresar el numero de la matriz a en la posicion (2,1)", "Favor intentar de nuevo"));
        coly.setY(lt.leerEntero("Ingresar el numero de la matriz a en la posicion (2,2)", "Favor intentar de nuevo"));
        return new Mat2x2();
    }

    public Mat2x2 Mat2b() {
        VecR2 colx = new VecR2();
        VecR2 coly = new VecR2();
        colx.setX(lt.leerEntero("Ingresar el numero de la matriz b en la posicion (1,1)", "Favor intentar de nuevo"));
        colx.setY(lt.leerEntero("Ingresar el numero de la matriz b en la posicion (1,2)", "Favor intentar de nuevo"));
        coly.setX(lt.leerEntero("Ingresar el numero de la matriz b en la posicion (2,1)", "Favor intentar de nuevo"));
        coly.setY(lt.leerEntero("Ingresar el numero de la matriz b en la posicion (2,2)", "Favor intentar de nuevo"));
        return new Mat2x2();
    }

    public void resMat2c(Mat2x2 c) {
        System.out.println();
    }

}

