package hn.edu.hn.edu.ujcv.calculadora.algebara.lineal;

public class  Run {

    public void run() {

            MenuPrincipal menu = new MenuPrincipal();
        do {
            menu.menu2();
            menu.vecymat(menu.leer_opciones());
        }while (menu.opciones != 3);
    }
}

