package hn.edu.ujcv.util;


import java.util.Scanner;

public class LectorTeclado {
    private Scanner mSc;

    public void init(Scanner sc){
         mSc = sc;
    }

    public int leerEntero(String mensaje, String mensajeError){
        int retval = 0;
        System.out.println(mensaje);
        while(!mSc.hasNextInt()){
            mSc.nextLine();
            System.out.println(mensajeError);
        }
        retval = mSc.nextInt();
        return retval;
    }
}
