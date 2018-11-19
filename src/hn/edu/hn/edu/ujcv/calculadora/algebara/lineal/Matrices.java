package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.Mat2x2;
import hn.edu.hn.edu.ujcv.lib.al.Mat3x3;
import hn.edu.hn.edu.ujcv.lib.al.Mat4x4;
import hn.edu.hn.edu.ujcv.lib.al.VecR2;
import hn.edu.hn.edu.ujcv.lib.al.VecR3;
import hn.edu.hn.edu.ujcv.lib.al.VecR4;
import hn.edu.ujcv.util.LectorTeclado;

public class Matrices {
    LectorTeclado lt = LectorTeclado.getInstance();

    public void menumat() {
        int opcion_mat;
        System.out.println("Bienvenido a las matrices \n  ");
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
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat2x2 mat2 = Mat2a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat2x2 res1 = mat1.suma(mat2);
                        resMat2c(res1);
                        break;
                    }
                    case 2: {
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat2x2 mat2 = Mat2a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat2x2 res2 = mat1.resta(mat2);
                        resMat2c(res2);
                        break;
                    }
                    case 3: {
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat2x2 mat2 = Mat2a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat2x2 res3 = mat1.mul(mat2);
                        resMat2c(res3);
                        break;
                    }
                    case 4: {
                        double alpha1 = 0;
                        alpha1 = lt.leerEntero("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat2x2 res4 = mat1.mul2(alpha1);
                        System.out.println("La multiplicacion de una matriz por un escalar es \n");
                        resMat2c(res4);
                        break;
                    }
                    case 5:{
                        Mat2x2 mat1 = Mat2a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        VecR2 v = new VecR2(0,1);
                        v.setX(lt.leerReal("Ingrese el numero del vector columna en la posicion (1,1)","Error, ingrese un numero valido"));
                        v.setY(lt.leerReal("Ingrese el numero del vector columna en la posicion (1,2)","Error, ingrese un numero valido"));
                        VecR2 res5 = mat1.mul(v);
                        System.out.println("La multiplicacion de matriz por vector columna es \n" + "| "+ res5.getX()+" |" + "\n| "+ res5.getY()+" |");
                        break;
                    }
                    case 6:{
                        System.out.println("Has regresado al menu de Principal");
                        break;
                    }

                }
            case 2:
                System.out.println("Escoja el tipo de operacion a realizar con vectores en R3");
                System.out.println(" 1.  para Suma");
                System.out.println(" 2.  para Resta");
                System.out.println(" 3.  para Multiplicacion de dos Matrices");
                System.out.println(" 4.  para Multiplicacion por un escalar");
                System.out.println(" 5.  para Multiplicacion por un vector columna");
                System.out.println(" 6.  para Regresar al menu Principal");

                int opcion_mat3 = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

                switch (opcion_mat3) {
                    case 1: {
                        Mat3x3 mat1 = Mat3a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat3x3 mat2 = Mat3a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat3x3 res1 = mat1.suma(mat2);
                        resMat3c(res1);
                        break;
                    }
                    case 2: {
                        Mat3x3 mat1 = Mat3a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat3x3 mat2 = Mat3a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat3x3 res1 = mat1.resta(mat2);
                        resMat3c(res1);
                        break;
                    }
                    case 3: {
                        Mat3x3 mat1 = Mat3a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat3x3 mat2 = Mat3a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat3x3 res1 = mat1.mul(mat2);
                        resMat3c(res1);
                        break;
                    }
                    case 4: {
                        double alpha1 = 0;
                        alpha1 = lt.leerEntero("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                        Mat3x3 mat1 = Mat3a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat3x3 res4 = mat1.mul(alpha1);
                        System.out.println("La multiplicacion de una matriz por un escalar es \n");
                        resMat3c(res4);
                        break;
                    }
                    case 5:{
                        Mat3x3 mat1 = Mat3a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        VecR3 v = new VecR3(1,0,0);
                        v.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                        v.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                        v.setZ(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                        VecR3 res5 = mat1.mul(v);
                        System.out.println("La multiplicacion de matriz por vector columna es \n" + "| "+ res5.getX()+" |" + "\n| "+ res5.getY()+" |" + "\n| "+ res5.getZ()+" |");
                        break;
                    }
                    case 6:{
                        System.out.println("Has regresado al menu de Principal");
                        break;
                    }

                }
            case 3: {
                System.out.println("Escoja el tipo de operacion a realizar con vectores en R4");
                System.out.println(" 1.  para Suma");
                System.out.println(" 2.  para Resta");
                System.out.println(" 3.  para Multiplicacion de dos Matrices");
                System.out.println(" 4.  para Multiplicacion por un escalar");
                System.out.println(" 5.  para Multiplicacion por un vector columna");
                System.out.println(" 6.  para Regresar al menu Principal");

                int opcion_mat4 = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

                switch (opcion_mat4) {
                    case 1: {
                        Mat4x4 mat1 = Mat4a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat4x4 mat2 = Mat4a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat4x4 res1 = mat1.suma(mat2);
                        resMat4c(res1);
                        break;
                    }
                    case 2: {
                        Mat4x4 mat1 = Mat4a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat4x4 mat2 = Mat4a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat4x4 res1 = mat1.resta(mat2);
                        resMat4c(res1);
                        break;
                    }
                    case 3: {
                        Mat4x4 mat1 = Mat4a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat4x4 mat2 = Mat4a("Matriz B","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat4x4 res1 = mat1.mul(mat2);
                        resMat4c(res1);
                        break;
                    }
                    case 4: {
                        double alpha1 = 0;
                        alpha1 = lt.leerEntero("Ingrese el escalar", "Error ha ingresado un caracter no valido");
                        Mat4x4 mat1 = Mat4a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        Mat4x4 res4 = mat1.mul(alpha1);
                        System.out.println("La multiplicacion de una matriz por un escalar es \n");
                        resMat4c(res4);
                        break;
                    }
                    case 5:{
                        Mat4x4 mat1 = Mat4a("Matriz A","Ingresar el numero de la matriz a en la posicion ", "Error, ingrese un numero valido");
                        VecR4 v = new VecR4(1,0,0,0);
                        v.setX(lt.leerReal("Ingrese el primer numero vector","Error! Ha ingresado un caracter no valido"));
                        v.setY(lt.leerReal("Ingrese el segundo numero vector","Error! Ha ingresado un caracter no valido"));
                        v.setZ(lt.leerReal("Ingrese el tercer numero vector","Error! Ha ingresado un caracter no valido"));
                        v.setW(lt.leerReal("Ingrese el cuarto numero vector","Error! Ha ingresado un caracter no valido"));
                        VecR4 res5 = mat1.mul(v);
                        System.out.println("La multiplicacion de matriz por vector columna es \n" + "| "+ res5.getX()+" |" + "\n| "+ res5.getY()+" |" + "\n| "+ res5.getZ()+" |"+ "\n| "+ res5.getW()+" |");
                        break;
                    }
                    case 6:{
                        System.out.println("Has regresado al menu de Principal");
                        break;
                    }

                }

            }
        }
    }

    public Mat2x2 Mat2a(String nombrematriz, String mensaje, String mensajeerror) {
        VecR2 colx = new VecR2(1,0);
        VecR2 coly = new VecR2(0,1);
        System.out.println(nombrematriz);
        colx.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,1)", "Error, ingrese un numero valido"));
        coly.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,2)", "Error, ingrese un numero valido"));
        colx.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,1)", "Error, ingrese un numero valido"));
        coly.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,2)", "Error, ingrese un numero valido"));
        return new Mat2x2(colx,coly);
    }

    public void resMat2c(Mat2x2 c) {
        System.out.println( "| " +c.getColX().getX() + " " + c.getColY().getX() + " |");
        System.out.println( "| " +c.getColX().getY() + " " + c.getColY().getY() + " |");

    }

    public Mat3x3 Mat3a(String nombrematriz, String mensaje, String mensajeerror) {
        VecR3 colx = new VecR3(1,0,0);
        VecR3 coly = new VecR3(0,1,0);
        VecR3 colz = new VecR3(0,0,1);
        System.out.println(nombrematriz);
        colx.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,1)", "Error, ingrese un numero valido"));
        coly.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,2)", "Error, ingrese un numero valido"));
        colz.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,3)", "Error, ingrese un numero valido"));
        colx.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,1)", "Error, ingrese un numero valido"));
        coly.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,2)", "Error, ingrese un numero valido"));
        colz.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,3)", "Error, ingrese un numero valido"));
        colx.setZ(lt.leerReal("Ingresar el numero de la matriz a en la posicion (3,1)", "Error, ingrese un numero valido"));
        coly.setZ(lt.leerReal("Ingresar el numero de la matriz a en la posicion (3,2)", "Error, ingrese un numero valido"));
        colz.setZ(lt.leerReal("Ingresar el numero de la matriz a en la posicion (3,3)", "Error, ingrese un numero valido"));
        return new Mat3x3(colx,coly,colz);
    }

    public void resMat3c(Mat3x3 c) {
        System.out.println( "| " +c.getColX().getX() + " " + c.getColY().getX() + " " + c.getColZ().getX() +" |");
        System.out.println( "| " +c.getColX().getY() + " " + c.getColY().getY() + " " + c.getColZ().getY() +" |");
        System.out.println( "| " +c.getColX().getZ() + " " + c.getColY().getZ() + " " + c.getColZ().getZ() +" |");
    }

    public Mat4x4 Mat4a(String nombrematriz, String mensaje, String mensajeerror) {
        VecR4 colx = new VecR4(1,0,0,0);
        VecR4 coly = new VecR4(0,1,0,0);
        VecR4 colz = new VecR4(0,0,1,0);
        VecR4 colw = new VecR4(0,0,0,1);
        System.out.println(nombrematriz);
        colx.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,1)", "Error, ingrese un numero valido"));
        coly.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,2)", "Error, ingrese un numero valido"));
        colz.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,3)", "Error, ingrese un numero valido"));
        colw.setX(lt.leerReal("Ingresar el numero de la matriz a en la posicion (1,4)", "Error, ingrese un numero valido"));
        colx.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,1)", "Error, ingrese un numero valido"));
        coly.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,2)", "Error, ingrese un numero valido"));
        colz.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,3)", "Error, ingrese un numero valido"));
        colw.setY(lt.leerReal("Ingresar el numero de la matriz a en la posicion (2,4)", "Error, ingrese un numero valido"));
        colx.setZ(lt.leerReal("Ingresar el numero de la matriz a en la posicion (3,1)", "Error, ingrese un numero valido"));
        coly.setZ(lt.leerReal("Ingresar el numero de la matriz a en la posicion (3,2)", "Error, ingrese un numero valido"));
        colz.setZ(lt.leerReal("Ingresar el numero de la matriz a en la posicion (3,3)", "Error, ingrese un numero valido"));
        colw.setZ(lt.leerReal("Ingresar el numero de la matriz a en la posicion (3,4)", "Error, ingrese un numero valido"));
        colx.setW(lt.leerReal("Ingresar el numero de la matriz a en la posicion (4,1)", "Error, ingrese un numero valido"));
        coly.setW(lt.leerReal("Ingresar el numero de la matriz a en la posicion (4,2)", "Error, ingrese un numero valido"));
        colz.setW(lt.leerReal("Ingresar el numero de la matriz a en la posicion (4,3)", "Error, ingrese un numero valido"));
        colw.setW(lt.leerReal("Ingresar el numero de la matriz a en la posicion (4,4)", "Error, ingrese un numero valido"));
        return new Mat4x4(colx,coly,colz,colw);
    }

    public void resMat4c(Mat4x4 c) {
        System.out.println( "| " +c.getColX().getX() + " " + c.getColY().getX() + " " + c.getColZ().getX() + " " + c.getColW().getX() + " |");
        System.out.println( "| " +c.getColX().getY() + " " + c.getColY().getY() + " " + c.getColZ().getY() + " " + c.getColW().getY() + " |");
        System.out.println( "| " +c.getColX().getZ() + " " + c.getColY().getZ() + " " + c.getColZ().getZ() + " " + c.getColW().getZ() + " |");
        System.out.println( "| " +c.getColX().getW() + " " + c.getColY().getW() + " " + c.getColW().getZ() + " " + c.getColW().getW() + " |");

    }

}

