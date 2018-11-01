package hn.edu.hn.edu.test;

import hn.edu.hn.edu.ujcv.lib.al.VecR2;


import static org.junit.Assert.*;

public class VecR2Test {
    private VecR2 a;
    private VecR2 b;
    private VecR2 c;
    private VecR2 d;
    private VecR2 e;
    private VecR2 f;
    private VecR2 fx2;
    private double delta;

    @org.junit.Before
    public void setUp() throws Exception {
        a = new VecR2();// constructor por defecto.
        b = new VecR2(2.2,1.1); //constructor de conveniencia.
        c = new VecR2(b); // constructor de copia.
        d = new VecR2(-2.2,-1.1);
        e = new VecR2(3,3);
        f = new VecR2(-10,50);
        fx2 = new VecR2(-20,100);
        delta = 0.00001;

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        VecR2 temp = a.add(b);
        assertEqualsVecR2(b,temp,delta);
        temp = b.add(d);
        assertEqualsVecR2(a,temp,delta);
        temp = f.add(f);
        assertEqualsVecR2(fx2,temp,delta);
        // probando constructor de copia.
        assertEqualsVecR2(b,c,delta);

    }

    @org.junit.Test
    public void sub() {
    }

    @org.junit.Test
    public void mul() {
    }

    @org.junit.Test
    public void dotProduct() {
    }

    @org.junit.Test
    public void div() {
    }

    public static void assertEqualsVecR2(VecR2 expected, VecR2 actual, double delta){
        assertEquals(expected.getX(),actual.getX(),delta);
        assertEquals(expected.getY(),actual.getY(),delta);
    }
}
