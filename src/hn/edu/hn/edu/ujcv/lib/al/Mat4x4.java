package hn.edu.hn.edu.ujcv.lib.al;

public class Mat4x4 {

    private VecR4 colX;
    private VecR4 colY;
    private VecR4 colZ;
    private VecR4 colW;

    public Mat4x4(){
        colX = new VecR4(1, 0, 0, 0);
        colY = new VecR4(0, 1, 0, 0);
        colZ = new VecR4(0, 0, 1, 0);
        colW = new VecR4(0, 0, 0, 1);
    }

    public Mat4x4(VecR4 colX ,VecR4 colY,VecR4 colZ,VecR4 colW){
        this.colX = new VecR4(colX);
        this.colY = new VecR4(colY);
        this.colZ = new VecR4(colZ);
        this.colW = new VecR4(colW);
    }

    public Mat4x4(Mat4x4 b){
        colX = new VecR4(b.colX);
        colY = new VecR4(b.colY);
        colZ = new VecR4(b.colZ);
        colW = new VecR4(b.colW);
    }

    public VecR4 getColX() {

        return colX;
    }

    public void setColX(VecR4 colX) {

        this.colX = colX;
    }

    public VecR4 getColY() {

        return colY;
    }

    public void setColY(VecR4 colY) {

        this.colY = colY;
    }

    public VecR4 getColZ() {

        return colZ;
    }

    public void setColZ(VecR4 colZ) {

        this.colZ = colZ;
    }

    public VecR4 getColW() {

        return colW;
    }

    public void setColW(VecR4 colW) {

        this.colW = colW;
    }

    public VecR4 getFilaX(){

        VecR4 retval = new VecR4(colX.getX(),colY.getX(),colZ.getX(),colW.getX());

        return retval;
    }

    public void  setFilaX(VecR4 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
        this.colZ.setX(filaX.getZ());
        this.colW.setX(filaX.getW());
    }

    public VecR4 getFilaY(){
        VecR4 retval = new VecR4(colX.getY(),colY.getY(),colZ.getY(),colW.getY());
        return retval;
    }


    public void  setFilaY(VecR4 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
        this.colZ.setY(filaY.getZ());
        this.colW.setY(filaY.getW());
    }

    public VecR4 getFilaZ(){
        VecR4 retval = new VecR4(colX.getZ(),colY.getZ(),colZ.getZ(),colW.getZ());
        return retval;
    }

    public void  setFilaZ(VecR4 filaZ){
        this.colX.setZ(filaZ.getX());
        this.colY.setZ(filaZ.getY());
        this.colZ.setZ(filaZ.getZ());
        this.colW.setZ(filaZ.getW());
    }

    public VecR4 getFilaW(){
        VecR4 retval = new VecR4(colX.getW(),colY.getW(),colZ.getW(),colW.getW());
        return retval;
    }

    public void  setFilaW(VecR4 filaW){
        this.colX.setW(filaW.getX());
        this.colY.setW(filaW.getY());
        this.colZ.setW(filaW.getZ());
        this.colW.setW(filaW.getW());
    }

    public Mat4x4 suma (Mat4x4 b){
        Mat4x4 retval = new Mat4x4();
        retval.colX.setX(this.colX.getX() + b.colX.getX());
        retval.colX.setY(this.colX.getY() + b.colX.getY());
        retval.colX.setZ(this.colX.getZ() + b.colX.getZ());
        retval.colX.setZ(this.colX.getW() + b.colX.getW());
        retval.colY.setX(this.colY.getX() + b.colY.getX());
        retval.colY.setY(this.colY.getY() + b.colY.getY());
        retval.colY.setY(this.colY.getZ() + b.colY.getZ());
        retval.colY.setY(this.colY.getW() + b.colY.getW());
        retval.colZ.setX(this.colZ.getX() + b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() + b.colZ.getY());
        retval.colZ.setY(this.colZ.getZ() + b.colZ.getZ());
        retval.colZ.setY(this.colZ.getW() + b.colZ.getW());
        retval.colW.setX(this.colW.getX() + b.colW.getX());
        retval.colW.setY(this.colW.getY() + b.colW.getY());
        retval.colW.setY(this.colW.getZ() + b.colW.getZ());
        retval.colW.setY(this.colW.getW() + b.colW.getW());
        return retval;
    }

    // resta
    public Mat4x4 resta (Mat4x4 b){
        Mat4x4 retval = new Mat4x4();
        retval.colX.setX(this.colX.getX() - b.colX.getX());
        retval.colX.setY(this.colX.getY() - b.colX.getY());
        retval.colX.setZ(this.colX.getZ() - b.colX.getZ());
        retval.colX.setZ(this.colX.getW() - b.colX.getW());
        retval.colY.setX(this.colY.getX() - b.colY.getX());
        retval.colY.setY(this.colY.getY() - b.colY.getY());
        retval.colY.setY(this.colY.getZ() - b.colY.getZ());
        retval.colY.setY(this.colY.getW() - b.colY.getW());
        retval.colZ.setX(this.colZ.getX() - b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() - b.colZ.getY());
        retval.colZ.setY(this.colZ.getZ() - b.colZ.getZ());
        retval.colZ.setY(this.colZ.getW() - b.colZ.getW());
        retval.colW.setX(this.colW.getX() - b.colW.getX());
        retval.colW.setY(this.colW.getY() - b.colW.getY());
        retval.colW.setY(this.colW.getZ() - b.colW.getZ());
        retval.colW.setY(this.colW.getW() - b.colW.getW());
        return retval;
    }

    // multiplicacion escalar
    public  Mat4x4 mul(double alpha){
        Mat4x4 retval = new Mat4x4();
        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setX(this.colY.getX() * alpha);
        retval.colX.setX(this.colZ.getX() * alpha);
        retval.colX.setX(this.colW.getX() * alpha);
        retval.colY.setY(this.colX.getY() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        retval.colY.setY(this.colZ.getY() * alpha);
        retval.colY.setY(this.colW.getY() * alpha);
        retval.colZ.setY(this.colX.getZ() * alpha);
        retval.colZ.setY(this.colY.getZ() * alpha);
        retval.colZ.setY(this.colZ.getZ() * alpha);
        retval.colZ.setY(this.colW.getZ() * alpha);
        retval.colW.setY(this.colX.getZ() * alpha);
        retval.colW.setY(this.colY.getZ() * alpha);
        retval.colW.setY(this.colZ.getZ() * alpha);
        retval.colW.setY(this.colW.getZ() * alpha);
        return retval;
    }

    // multiplicacion vector columna
    public VecR4 mul(VecR4 v){
        VecR4 retval =  new VecR4();
        retval.setX(v.dotProduct(this.getFilaX()));
        retval.setY(v.dotProduct(this.getFilaY()));
        retval.setZ(v.dotProduct(this.getFilaZ()));
        retval.setW(v.dotProduct(this.getFilaW()));
        return retval;

    }

    // multiplicacion por matriz
    public Mat4x4 mul (Mat4x4 b){
        Mat4x4 retval =  new Mat4x4();
        retval.colX.setX(this.getFilaX().dotProduct(b.colX));
        retval.colY.setX(this.getFilaX().dotProduct(b.colY));
        retval.colZ.setX(this.getFilaX().dotProduct(b.colZ));
        retval.colW.setX(this.getFilaX().dotProduct(b.colW));
        retval.colX.setY(this.getFilaY().dotProduct(b.colX));
        retval.colY.setY(this.getFilaY().dotProduct(b.colY));
        retval.colZ.setY(this.getFilaY().dotProduct(b.colZ));
        retval.colW.setY(this.getFilaY().dotProduct(b.colW));
        retval.colX.setZ(this.getFilaZ().dotProduct(b.colX));
        retval.colY.setZ(this.getFilaZ().dotProduct(b.colY));
        retval.colZ.setZ(this.getFilaZ().dotProduct(b.colZ));
        retval.colW.setZ(this.getFilaZ().dotProduct(b.colW));
        retval.colX.setW(this.getFilaW().dotProduct(b.colX));
        retval.colY.setW(this.getFilaW().dotProduct(b.colY));
        retval.colZ.setW(this.getFilaW().dotProduct(b.colZ));
        retval.colW.setW(this.getFilaW().dotProduct(b.colW));
        return retval;
    }

}
