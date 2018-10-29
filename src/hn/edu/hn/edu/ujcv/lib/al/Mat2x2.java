package hn.edu.hn.edu.ujcv.lib.al;

public class Mat2x2 {

    //double[][] arr;

    //double m11;  double m12;
    //double m21;  double m22;


    // principios de la contencion
    // 1. miembros de la clase privados
    // 2. constructor.
    // 3. accesores y mutadores (a.k.a. geters y seters)
    private VecR2 colX;
    private VecR2 colY;


    //
    public Mat2x2(){
        colX = new VecR2(1, 0);
        colY = new VecR2(0,1);
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

    // este contrato debe estar en las demas matrices
    // y no debe variar mas que en la dimencion de los objetos
    // retornados y recibidos.
    // suma
    public Mat2x2 suma (Mat2x2 b){
        return new Mat2x2();
    }
    // resta
    public Mat2x2 resta (Mat2x2 b){
        return new Mat2x2();
    }
    // multiplicacion escalar
    public  Mat2x2 mul(double alpha){
        return  new Mat2x2();
    }
    // multiplicacion vector columna
    public VecR2 mul(VecR2 v){
        return new VecR2();
    }
    // multiplicacion por matriz
    public Mat2x2 mul (Mat2x2 b){
        return  new Mat2x2();
    }
}
