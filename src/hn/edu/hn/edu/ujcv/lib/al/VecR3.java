package hn.edu.hn.edu.ujcv.lib.al;

public class VecR3 {

    private double x;
    private double y;
    private double z;

    //todo: Definir variables y constructores


    //todo: conformar al contrato de un vector

    public VecR3 add( VecR3 c){

    VecR3 retval = new VecR3();
    retval.setX(this.getX() + c.getX());
    retval.setY(this.getY() + c.getY());
    retval.setZ(this.getZ() + c.getZ());
    return retval;

    return new VecR3();
    }


    public VecR3 sub(VecR3 b){
        VecR3 retval = new VecR3();
        retval.setX(this.getX() - b.getX());
        retval.setY(this.getY() - b.getY());
        retval.setZ(this.getZ() - b.getZ());
        return retval;
    }


    public VecR3 mul(double alpha){
        VecR3 retval = new VecR3(this.getX()* alpha, this.getY() *alpha, this.getZ() * alpha);
        return retval;
    }

    public double dotProduct(VecR3 b){
        // segun google:
        // alpha = (u1 * v1) + (u2 * v2) + (u3 * v3)
        // u es this.
        // v es b.
        // 1 es x.
        // 2 es y.
        // 3 es z.
        double retval = 0.0;
        return retval;
    }

    public VecR3 crossProduct(VecR3 b){
        // dividir formula en componentes vectoriales
        // U X V
        //sea U [1,2,-2]
        //sea V [3,0,1 ]
        //          |   i     j     k |
        // U X V =  |   1     2    -2 |  =  [2, -7, -6]
        //          |   3     0     1 |
        // formula por componenters
        // i = ?
        // j = -(u1 * v3 - v1 * u3)
        // k = ?
        VecR3 retval = new VecR3();

        return retval;
    }

    public VecR3 div(double alpha){
        VecR3 retval = new VecR3();


        return retval;
    } public VecR3()
{
    this.x = 0;
    this.y = 0;
    this.z = 0;
}

    public VecR3(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public VecR3(VecR3 w){
        x = w.x;
        y = w.y;
        z = w.z;

    }


    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getZ(double z) {

        return z;
    }

    public void setZ(double z){

        this.z = z;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }
}
