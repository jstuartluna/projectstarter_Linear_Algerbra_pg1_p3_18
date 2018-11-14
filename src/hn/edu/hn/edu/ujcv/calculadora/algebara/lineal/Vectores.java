package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;

import hn.edu.hn.edu.ujcv.lib.al.VecR3;

import hn.edu.hn.edu.ujcv.lib.al.VecR4;

import hn.edu.ujcv.util.LectorTeclado;

public class Vectores {

    LectorTeclado lt = LectorTeclado.getInstance();

    public void menu() {
        int opcion_vec;
        System.out.println("Bienvenido a los vectores");
        System.out.println("");
        System.out.println("Presione 1 para Vectores en R2");
        System.out.println("Presione 2 para Vectores en R3");
        System.out.println("Presione 3 para Vectores en R4");
        System.out.println("Presione 4 para regresar al menu principal");
        opcion_vec = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");


        switch (opcion_vec) {
            case 1:
                System.out.println("Escoja el tipo de operacion a realizar con vectores en R2");
                System.out.println(" 1.  para Suma");
                System.out.println(" 2.  para Resta");
                System.out.println(" 3.  para Producto Punto");
                System.out.println(" 4.  para Multiplicacion por un escalar");
                System.out.println(" 5.  para Division por un escalar");
                System.out.println(" 6.  para Regresar al menu Principal");

                int opcion_vec2 = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

                switch (opcion_vec2) {

                    case 1: {
                        VecR2 a1 = VectorR2a();
                        VecR2 b1 = VectorR2b();
                        VecR2 res1 = a1.add(b1);
                        mostrarvec1r2(a1);
                        mostrarvec2r2(b1);
                        resultadovecr2(res1);
                        break;
                    }
                    case 2:{
                        VecR2 a2 = VectorR2a();
                        VecR2 b2 = VectorR2b();
                        VecR2 res2 = a2.sub(b2);
                        mostrarvec1r2(a2);
                        mostrarvec2r2(b2);
                        resultadovecr2(res2);
                        break;
                        }
                    case 3:{
                        VecR2 a5 = VectorR2a();
                        VecR2 b5 = VectorR2b();
                        mostrarvec1r2(a5);
                        mostrarvec2r2(b5);
                        double res5 = a5.dotProduct(b5);
                        System.out.println("El producto punto es: \n" + res5);
                        break;
                        }
                    case 4:{
                        double alpha1;
                        alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                        VecR2 a6 = VectorR2a();
                        VecR2 res6 = a6.mul(alpha1);
                            System.out.println("El escalar es \n" + alpha1);
                        mostrarvec1r2(a6);
                        resultadovecr2(res6);
                        break;
                         }
                    case 5: {
                        double alpha1;
                        alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                        VecR2 a6 = VectorR2a();
                        VecR2 res6 = a6.mul(alpha1);
                        System.out.println("El escalar es \n" + alpha1);
                        mostrarvec1r2(a6);
                        resultadovecr2(res6);
                        break;
                        }
                    case 6:{
                        System.out.println("Has regresado al menu de Principal");
                        break;
                    }
                    }
                    return;
            case 2:{
                System.out.println("Escoja el tipo de operacion a realizar con vectores en R3");
                System.out.println(" 1.  para Suma");
                System.out.println(" 2.  para Resta");
                System.out.println(" 3.  para Producto Punto");
                System.out.println(" 4.  para Multiplicacion por un escalar");
                System.out.println(" 5.  para Division por un escalar");
                System.out.println(" 6.  para Producto Cruz");
                System.out.println(" 7.  para Regresar al menu Principal");

                int opcion_vec3 = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

                switch (opcion_vec3) {

                    case 1: {
                        VecR3 a1 = VectorR3a();
                        VecR3 b1 = VectorR3b();
                        VecR3 res1 = a1.add(b1);
                        mostrarvec1r3(a1);
                        mostrarvec2r3(b1);
                        resultadovecr3(res1);
                        break;
                    }
                    case 2:{
                        VecR3 a2 = VectorR3a();
                        VecR3 b2 = VectorR3b();
                        VecR3 res2 = a2.sub(b2);
                        mostrarvec1r3(a2);
                        mostrarvec2r3(b2);
                        resultadovecr3(res2);
                        break;
                    }
                    case 3:{
                        VecR3 a5 = VectorR3a();
                        VecR3 b5 = VectorR3b();
                        mostrarvec1r3(a5);
                        mostrarvec2r3(b5);
                        double res5 = a5.dotProduct(b5);
                        System.out.println("El producto punto es: \n" + res5);
                        break;
                    }
                    case 4:{
                        double alpha1;
                        alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                        VecR3 a6 = VectorR3a();
                        VecR3 res6 = a6.mul(alpha1);
                        System.out.println("El escalar es \n" + alpha1);
                        mostrarvec1r3(a6);
                        resultadovecr3(res6);
                        break;
                    }
                    case 5: {
                        double alpha1;
                        alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                        VecR3 a6 = VectorR3a();
                        VecR3 res6 = a6.mul(alpha1);
                        System.out.println("El escalar es \n" + alpha1);
                        mostrarvec1r3(a6);
                        resultadovecr3(res6);
                        break;
                    }
                    case 6:{
                        VecR3 a2 = VectorR3a();
                        VecR3 b2 = VectorR3b();
                        VecR3 res2 = a2.crossProduct(b2);
                        mostrarvec1r3(a2);
                        mostrarvec2r3(b2);
                        resultadovecr3(res2);
                        break;
                    }
                    case 7:{
                        System.out.println("Has regresado al menu Principal");
                        break;
                    }
                }
                return;

            }
            case 3:{
                System.out.println("Escoja el tipo de operacion a realizar con vectores en R3");
                System.out.println(" 1.  para Suma");
                System.out.println(" 2.  para Resta");
                System.out.println(" 3.  para Producto Punto");
                System.out.println(" 4.  para Multiplicacion por un escalar");
                System.out.println(" 5.  para Division por un escalar");
                System.out.println(" 6.  para Regresar al menu Principal");

                int opcion_vec4 = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

                switch (opcion_vec4) {

                    case 1: {
                        VecR4 a1 = VectorR4a();
                        VecR4 b1 = VectorR4b();
                        VecR4 res1 = a1.add(b1);
                        mostrarvec1r4(a1);
                        mostrarvec2r4(b1);
                        resultadovecr4(res1);
                        break;
                    }
                    case 2:{
                        VecR4 a2 = VectorR4a();
                        VecR4 b2 = VectorR4b();
                        VecR4 res2 = a2.sub(b2);
                        mostrarvec1r4(a2);
                        mostrarvec2r4(b2);
                        resultadovecr4(res2);
                        break;
                    }
                    case 3:{
                        VecR4 a5 = VectorR4a();
                        VecR4 b5 = VectorR4b();
                        mostrarvec1r4(a5);
                        mostrarvec2r4(b5);
                        double res5 = a5.dotProduct(b5);
                        System.out.println("El producto punto es: \n" + res5);
                        break;
                    }
                    case 4:{
                        double alpha1;
                        alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                        VecR4 a6 = VectorR4a();
                        VecR4 res6 = a6.mul(alpha1);
                        System.out.println("El escalar es \n" + alpha1);
                        mostrarvec1r4(a6);
                        resultadovecr4(res6);
                        break;
                    }
                    case 5: {
                        double alpha1;
                        alpha1 = lt.leerReal("Ingrese el escalar", "Error! Ha ingresado un caracter no valido");
                        VecR4 a6 = VectorR4a();
                        VecR4 res6 = a6.mul(alpha1);
                        System.out.println("El escalar es \n" + alpha1);
                        mostrarvec1r4(a6);
                        resultadovecr4(res6);
                        break;
                    }
                    case 6:{
                        System.out.println("Has regresado al menu Principal");
                        break;
                    }
                }
                return;

            }
            case 4:{
                System.out.println("Ha regresado al menu principal");
                break;
            }

        }

        return;
    }


    public VecR2 VectorR2a(){
        VecR2 b = new VecR2();
        b.setX(lt.leerReal("Ingrese el primer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        b.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR2(b);
    }

    public VecR2 VectorR2b(){
        VecR2 b = new VecR2();
        b.setX(lt.leerReal("Ingrese el primer numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        b.setY(lt.leerReal("Ingrese el segundo numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR2(b);
    }


    public VecR3 VectorR3a(){
        VecR3 b = new VecR3();
        b.setX(lt.leerReal("Ingrese el primer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        b.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        b.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR3(b);
    }
    public VecR3 VectorR3b(){
        VecR3 b = new VecR3();
        b.setX(lt.leerReal("Ingrese el primer numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        b.setY(lt.leerReal("Ingrese el segundo numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        b.setZ(lt.leerReal("Ingrese el tercer numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR3(b);
    }

    public VecR4 VectorR4a(){
        VecR4 b = new VecR4();
        b.setX(lt.leerReal("Ingrese el primer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        b.setY(lt.leerReal("Ingrese el segundo numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        b.setZ(lt.leerReal("Ingrese el tercer numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        b.setW(lt.leerReal("Ingrese el cuarto numero del primer vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR4(b);
    }

    public VecR4 VectorR4b(){
        VecR4 b = new VecR4();
        b.setX(lt.leerReal("Ingrese el primer numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        b.setY(lt.leerReal("Ingrese el segundo numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        b.setZ(lt.leerReal("Ingrese el tercer numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        b.setW(lt.leerReal("Ingrese el cuarto numero del segundo vector", "Error! Ha ingresado un caracter no valido"));
        return new VecR4(b);
    }

    public void mostrarvec1r2 (VecR2 a){
        System.out.println("El vector a es:\n" + "{ " + a.getX() + " , " + a.getY() +" } ");
    }

    public void mostrarvec2r2 (VecR2 b){
        System.out.println("El vector b es:\n" + "{ " + b.getX() + " , " + b.getY() +" } ");
    }

    public void resultadovecr2 (VecR2 c){
        System.out.println("El resultado es: \n" + "{ " + c.getX() + " , " + c.getY() +" } ");
    }

    public void mostrarvec1r3 (VecR3 a){
        System.out.println("El vector a es:\n" + "{ " + a.getX() + " , " + a.getY() + " , " + a.getZ() +" } ");
    }

    public void mostrarvec2r3 (VecR3 b){
        System.out.println("El vector b es:\n" + "{ " + b.getX() + " , " + b.getY() +" , " + b.getZ() +" } ");
    }

    public void resultadovecr3 (VecR3 c){
        System.out.println("La suma de los dos vectores es: \n" + "{ " + c.getX() + " , " + c.getY() + " , " + c.getZ() +" } ");
    }

    public void mostrarvec1r4 (VecR4 a){
        System.out.println("El vector a es:\n" + "{ " + a.getX() + " , " + a.getY() + " , " + a.getZ() + " , " + a.getW() + " } ");
    }

    public void mostrarvec2r4 (VecR4 b){
        System.out.println("El vector b es:\n" + "{ " + b.getX() + " , " + b.getY() +" , " + b.getZ() + " , " + b.getW() + " } ");
    }

    public void resultadovecr4 (VecR4 c){
        System.out.println("La suma de los dos vectores es: \n" + "{ " + c.getX() + " , " + c.getY() + " , " + c.getZ() + " , " + c.getW() + " } ");
    }
}
