package hn.edu.hn.edu.ujcv.lib.al;

public class Mat2x2 {

    private VecR2 colX;
    private VecR2 colY;


    public Mat2x2(){
        colX = new VecR2(1, 0);
        colY = new VecR2(0, 1);
    }


    public VecR2 getColX() {

        return colX;
    }

    public void setColX(VecR2 colX) {

        this.colX = colX;
    }

    public VecR2 getColY() {

        return colY;
    }

    public void setColY(VecR2 colY) {

        this.colY = colY;
    }


    public VecR2 getFilaX(){
        VecR2 retval = new VecR2(colX.getX(),colY.getX());
        return retval;
    }

    public void  setFilaX(VecR2 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
    }

    public VecR2 getFilaY(){
        VecR2 retval = new VecR2(colX.getY(),colY.getY());
        return retval;
    }

    public void  setFilaY(VecR2 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
    }

    public Mat2x2 suma (Mat2x2 b){
         Mat2x2 retval = new Mat2x2();

        retval.colX.setX(this.colX.getX() + b.colX.getX());
        retval.colX.setY(this.colX.getY() + b.colX.getY());
        retval.colY.setX(this.colY.getX() + b.colY.getX());
        retval.colY.setY(this.colY.getY() + b.colY.getY());


         return retval;
    }
    // resta
    public Mat2x2 resta (Mat2x2 b){
        Mat2x2 retval = new Mat2x2();

        retval.colX.setX(this.colX.getX() - b.colX.getX());
        retval.colX.setY(this.colX.getY() - b.colX.getY());
        retval.colY.setX(this.colY.getX() - b.colY.getX());
        retval.colY.setY(this.colY.getY() - b.colY.getY());
        return retval;
    }
    // multiplicacion escalar
    public  Mat2x2 mul(double alpha){
        Mat2x2 retval = new Mat2x2();
        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setX(this.colY.getX() * alpha);
        retval.colY.setY(this.colX.getY() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        return  new Mat2x2();
    }

    //multiplicacion vector columna
    public VecR2 mul (VecR2 v){
       VecR2 retval =  new VecR2();

        retval.setX(v.dotProduct(this.getFilaX()));
        retval.setY(v.dotProduct(this.getFilaY()));
        return retval;

    }

    // multiplicacion por matriz
    public Mat2x2 mul (Mat2x2 b){
        Mat2x2 retval =  new Mat2x2();

        retval.colX.setX(this.getFilaX().dotProduct(b.colX));
        retval.colY.setX(this.getFilaX().dotProduct(b.colY));
        retval.colX.setY(this.getFilaY().dotProduct(b.colX));
        retval.colY.setY(this.getFilaY().dotProduct(b.colY));

        return retval;
    }

}
