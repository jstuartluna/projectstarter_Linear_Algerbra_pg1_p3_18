package hn.edu.ujcv.util;

import java.util.Scanner;

public class LectorTeclado {
    private Scanner mSc;

    private LectorTeclado(){
        Scanner sc = new Scanner(System.in);
        init(sc);
    }

    private static LectorTeclado instance;
    public static LectorTeclado getInstance(){
        if(instance==null){
            instance = new LectorTeclado();
        }
        return instance;
    }
    private void init(Scanner sc){
        mSc = sc;
    }

    public double leerReal(String mensaje, String mensajeError){
        double retval = 0;
        System.out.println(mensaje);
        while(!mSc.hasNextDouble()){
            mSc.nextLine();
            System.out.println(mensajeError);
        }
        retval = mSc.nextDouble();
        return retval;
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