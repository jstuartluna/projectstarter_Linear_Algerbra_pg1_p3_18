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
    private double delta;

    @org.junit.Before
    public void setUp() throws Exception {
        a = new VecR2();// constructor por defecto.
        b = new VecR2(2.2,1.1); //constructor de conveniencia.
        c = new VecR2(b); // constructor de copia.
        d = new VecR2(-2.2,-1.1);
        e = new VecR2(3,3);
        f = new VecR2(-10,50);
        delta = 0.00001;

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        VecR2 temp = a.add(b);
        assertEquals(b.getX(),temp.getX(),delta);
        assertEquals(b.getY(),temp.getY(),delta);
        temp = b.add(d);
        assertEquals(a.getX(),temp.getX(),delta);
        assertEquals(a.getY(),temp.getY(),delta);
        temp = f.add(f);
        assertEquals(f.getX()*2,temp.getX(),delta);
        assertEquals(f.getY()*2,temp.getY(),delta);

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
}
