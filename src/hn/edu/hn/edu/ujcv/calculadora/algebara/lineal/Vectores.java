package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;

import hn.edu.hn.edu.ujcv.lib.al.VecR3;

import hn.edu.hn.edu.ujcv.lib.al.VecR4;

import hn.edu.ujcv.util.LectorTeclado;

public class Vectores {

    private int opcion_vec;
    public int vec_R2;
    public int vec_R3;
    public int vec_R4;

    LectorTeclado lt = new LectorTeclado();
    Operaciones_Vectores operaciones_vectores = new Operaciones_Vectores();

    public void menu() {
        int opcion_vec;
        System.out.println("Bienvenido a los vectores");
        System.out.println("");
        System.out.println("Presione 1 para Vectores en R2");
        System.out.println("Presione 2 para Vectores en R3");
        System.out.println("Presione 3 para Vectores en R4");
        System.out.println("Presione Opcion 3 para regresar");
        opcion_vec = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");


        switch (opcion_vec) {
            case 1:
                System.out.println("Escoja el tipo de operacion a realizar con vectores en R2");
                System.out.println(" 1.  para Suma");
                System.out.println(" 2.  para Resta");
                System.out.println(" 3.  para Multiplicacion");
                System.out.println(" 4.  para Division");
                System.out.println(" 5.  para Producto Punto");
                System.out.println(" 3.  para Multiplicacion por un escalar");
                System.out.println(" 4.  para Division por un escalar");

                int opcion_vec2 = lt.leerEntero("Escoja una opcion", "Caracter no valido, vuelva a escoger una opcion");

                switch (opcion_vec2){
                    case 1: {
                    }
                        VecR2 a= new VecR2();
                        VecR2 b= new VecR2();
                        VecR2 res= a.add(b);
                        System.out.println("La suma de los dos vectores es: " + res );
                        break;
                    }
                    case 2: {
                        VecR2 a= new VecR2();
                        VecR2 b= new VecR2();
                        VecR2 res= a.sub(b);
                        System.out.println("x." + res.getX() + " y. " + res.getY() );
                        break;
                    }
                    case 3: {
                        VecR2 a= new VecR2();
                        VecR2 b= new VecR2();
                        VecR2 res= a.mul(b);
                        System.out.println("x." + res.getX() + " y. " + res.getY() );
                        break;
                    }
                    case 4: {
                        VecR2 a= new VecR2();
                        VecR2 b= new VecR2();
                        VecR2 res= a.div(b);
                        System.out.println("x." + res.getX() + " y. " + res.getY() );
                        break;
                    }
                    case 5: {
                        VecR2 a= new VecR2();
                        VecR2 b= new VecR2();
                        double res= a.dotProduct(b);
                        System.out.println("El producto punto es:" + res );
                        break;
                    }
                     case 6: {
                        VecR2 a= new VecR2();
                        VecR2 b= new VecR2();
                        VecR2 res= a.div(b);
                        System.out.println("x." + res.getX() + " y. " + res.getY() );
                        break;
                        }
                    case 7: {
                        VecR2 a= new VecR2();
                        VecR2 b= new VecR2();
                        double res= a.dotProduct(b);
                        System.out.println("El producto punto es:" + res );
                        break;
                    }

                }

                return;


           /* case 2:

                break;

            case 3:

                break;

            case 4:
                System.out.println("Escoje una operacion (Menu Principal)");
                break;


        }

        return;*/

    }


}
