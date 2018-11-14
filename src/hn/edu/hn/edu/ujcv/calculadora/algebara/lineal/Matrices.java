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
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Favor intentar de nuevo");
                        Mat2x2 mat2 = Mat2a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Favor intentar de nuevo");
                        Mat2x2 res1 = mat1.suma(mat2);
                        resMat2c(res1);
                        break;
                    }
                    case 2: {
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Favor intentar de nuevo");
                        Mat2x2 mat2 = Mat2a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Favor intentar de nuevo");
                        Mat2x2 res1 = mat1.resta(mat2);
                        resMat2c(res1);
                        break;
                    }
                    case 3: {
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Favor intentar de nuevo");
                        Mat2x2 mat2 = Mat2a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Favor intentar de nuevo");
                        Mat2x2 res1 = mat1.mul(mat2);
                        resMat2c(res1);
                        break;
                    }
                    case 4: {
                        double alpha1;
                        alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                        Mat2x2 mat1 = Mat2a("Matriz A", "Ingresar el numero de la matriz a en la posicion ", "Favor intentar de nuevo");
                        Mat2x2 res1 = mat1.mul(alpha1);
                        resMat2c(res1);
                        break;
                    }
                    case 5:{

                    }

                }
        }
    }

    public Mat2x2 Mat2a(String nombrematriz, String mensaje, String mensajeerror) {
        VecR2 colx = new VecR2(1,0);
        VecR2 coly = new VecR2(0,1);
        System.out.println(nombrematriz);
        colx.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,1)", "Favor intentar de nuevo"));
        coly.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,2)", "Favor intentar de nuevo"));
        colx.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,1)", "Favor intentar de nuevo"));
        coly.setY(lt.leerEntero("Ingresar el numero de la matriz a en la posicion (2,2)", "Favor intentar de nuevo"));
        return new Mat2x2(colx,coly);
    }


    public void resMat2c(Mat2x2 c) {
        System.out.println( "| " +c.getColX().getX() + " " + c.getColY().getX() + " |");
        System.out.println( "| " +c.getColX().getY() + " " + c.getColY().getY() + " |");

    }

}

