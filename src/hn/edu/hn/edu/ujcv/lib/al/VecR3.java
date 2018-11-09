package hn.edu.hn.edu.ujcv.lib.al;

public class VecR3 {

    private double x;
    private double y;
    private double z;


    public VecR3 crossProduct(VecR3 c){
        // dividir formula en componentes vectoriales
        // U X V
        //sea U [1,2,-2]
        //sea V [3,0,1 ]
        //          |   x     y     z |
        // U X V =  |   1     2    -2 |  =  [2, -7, -6]
        //          |   3     0     1 |
        // formula por componenters
        // i = ?
        // j = -(u1 * v3 - v1 * u3)
        // k = ?

        VecR3 retval = new VecR3();
       retval.setX((this.y * c.z)- (this.z * c.y));
       retval.setY((this.x * c.z)- (this.z * c.x));
       retval.setZ((this.x * c.y)- (this.y * c.x));
       return retval;
    }

    public VecR3 div(double alpha){
        VecR3 retval = new VecR3();
        retval.setX(this.x / alpha);
        retval.setY(this.y / alpha);
        retval.setZ(this.z / alpha);
         return retval;
    }

    public VecR3 add(VecR3 c) {
        VecR3 retval = new VecR3();
        retval.setX(this.x + c.x);
        retval.setY(this.y + c.y);
        retval.setZ(this.z + c.z);
        return retval;
    }

    public VecR3 sub(VecR3 c) {
        VecR3 retval = new VecR3();
        retval.setX(this.x - c.x);
        retval.setY(this.y - c.y);
        retval.setZ(this.z - c.z);
        return retval;
    }


    public VecR3 mul(double alpha){
        VecR3 retval = new VecR3();
        retval.setX(this.x * alpha);
        retval.setY(this.y * alpha);
        retval.setZ(this.z * alpha);
        return retval;
    }


    public double dotProduct(VecR3 c){
        double retval = 0.0;
        retval = (this.x * c.x) + (this.y * c.y) + (this.z * c.z);
        return retval;

    }

        public VecR3 div (VecR3 c){
            VecR3 retval = new VecR3();
            retval.setX(this.x / c.x);
            retval.setY(this.y / c.y);
            retval.setZ(this.z / c.z);
            return retval;

        }


    public VecR3() {
            this.x = 0;
            this.y = 0;
            this.z = 0;
        }

    public VecR3( double x, double y, double z){
            this.x = x;
            this.y = y;
            this.z = z;

        }

    public VecR3(VecR3 c) {
            x = c.x;
            y = c.y;
            z = c.z;

        }


        public double getX () {

            return x;
        }

        public  void setX ( double x){

            this.x = x;
        }

        public double getY () {

            return y;
        }

        public void setY ( double y){

            this.y = y;
        }

        public double getZ() {

        return z;
        }

        public void setZ ( double z){

        this.z = z;
    }

}