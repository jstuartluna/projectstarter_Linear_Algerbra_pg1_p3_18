package hn.edu.hn.edu.test;

import hn.edu.hn.edu.ujcv.lib.al.VecR4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VecR4Test {
    private VecR4 a;
    private VecR4 b;
    private VecR4 c;
    private VecR4 d;
    private VecR4 e;
    private VecR4 f;
    private VecR4 fx2;
    private double delta;
    private VecR4 ex3;
    private double aDb;
    private double bDd;
    private double eDe;
    private double dDe;
    @Before
    public void setUp() throws Exception {
        a = new VecR4();// constructor por defecto.
        b = new VecR4(2.2,1.1,3.0,3.0); //constructor de conveniencia.
        c = new VecR4(b); // constructor de copia.
        d = new VecR4(-2.2,-1.1,-3,-3);
        e = new VecR4(3,3,3,3);
        f = new VecR4(-10,50,3,3);
        fx2 = new VecR4(-20,100,6,6);
        ex3 = new VecR4(9,9,9,9);
        aDb = 0;
        bDd = -4.84 + -1.21 + -9 +-9;
        eDe = 3*3 +3*3 + 3*3 +3*3;
        dDe = -2.2 * 3 + -1.1 * 3 + 3*3 + 3*3;

        delta = 0.00001;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
    }

    @Test
    public void sub() {
    }

    @Test
    public void mul() {
    }

    @Test
    public void dotProduct() {
    }

    @Test
    public void div() {
    }
}