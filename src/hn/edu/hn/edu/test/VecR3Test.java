package hn.edu.hn.edu.test;

import hn.edu.hn.edu.ujcv.lib.al.VecR3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VecR3Test {

    private VecR3 a;
    private VecR3 b;
    private VecR3 c;
    private VecR3 d;
    private VecR3 e;
    private VecR3 f;
    private VecR3 fx2;
    private double delta;
    private VecR3 ex3;
    private double aDb;
    private double bDd;
    private double eDe;
    private double dDe;

    @Before
    public void setUp() throws Exception {
        a = new VecR3();// constructor por defecto.
        b = new VecR3(2.2,1.1,3.0); //constructor de conveniencia.
        c = new VecR3(b); // constructor de copia.
        d = new VecR3(-2.2,-1.1,-3);
        e = new VecR3(3,3,3);
        f = new VecR3(-10,50,3);
        fx2 = new VecR3(-20,100,6);
        ex3 = new VecR3(9,9,9);
        aDb = 0;
        bDd = -4.84 + -1.21 + -9;
        eDe = 3*3 +3*3 + 3*3;
        dDe = -2.2 * 3 + -1.1 * 3 +3*3;

        delta = 0.00001;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        VecR3 temp = a.add(b);
        assertEqualsVecR3(b,temp,delta);
        temp = b.add(d);
        assertEqualsVecR3(a,temp,delta);
        temp = f.add(f);
        assertEqualsVecR3(fx2,temp,delta);
        // probando constructor de copia.
        assertEqualsVecR3(b,c,delta);
    }

    @Test
    public void sub() {
        VecR3 temp = a.add(b);
        assertEqualsVecR3(b,temp,delta);
        temp = b.add(d);
        assertEqualsVecR3(a,temp,delta);
        temp = f.add(f);
        assertEqualsVecR3(fx2,temp,delta);
    }

    @Test
    public void mul() {
        VecR3 temp = e.mul(3);
        assertEqualsVecR3(ex3,temp,delta);
        temp = f.mul(2);
        assertEqualsVecR3(fx2,temp,delta);
    }

    @Test
    public void dotProduct() {
        assertEquals(aDb,a.dotProduct(b),delta);
        assertEquals(bDd,b.dotProduct(d),delta);
        assertEquals(eDe,e.dotProduct(e),delta);
        assertEquals(dDe,d.dotProduct(e),delta);
    }

    @Test
    public void crossProduct() {
        VecR3 a = new VecR3(1,0,0);
        VecR3 b = new VecR3(0,1,0);
        VecR3 c = new VecR3(0,0,1);

        assertEqualsVecR3( a.crossProduct(b),c,delta);
        //-5.7; 2.4; 3.3
        assertEqualsVecR3(this.b.crossProduct(e),new VecR3(-5.7,2.4,3.3),delta);

    }

    @Test
    public void div() {
        VecR3 temp = e.div(3);
        assertEqualsVecR3(new VecR3(1,1,1),temp,delta);
        temp = ex3.div(3);
        assertEqualsVecR3(e,temp,delta);
        temp = fx2.div(2.00000000000001);
        assertEqualsVecR3(f,temp,delta);
    }

    private void assertEqualsVecR3(VecR3 expected, VecR3 actual, double delta) {
        assertEquals(expected.getX(),actual.getX(),delta);
        assertEquals(expected.getY(),actual.getY(),delta);
        assertEquals(expected.getZ(),actual.getZ(),delta);
    }
}