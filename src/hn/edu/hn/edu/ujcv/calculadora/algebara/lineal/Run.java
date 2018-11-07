package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

public class  Run {

    public void run(){
        System.out.println("Bienvenid@ a la calculadora de Algebra Lineal");

        do {
            System.out.println("\n\nIntroduzca la opción que desea realizar:\n1. Realizar Operaciones con Vectores \n2. Realizar Operaciones con Matrices \nSALIR --> Pulse cualquier otro número\n");
            switch(Leer.datoInt()) {
                case 1:
                    break;
                case 2:

                    break;
                default:
                    continuar = false;
            }
        } while(continuar);

        System.out.println("Gracias por utilizar la Calculadora);
    }

    }

}
