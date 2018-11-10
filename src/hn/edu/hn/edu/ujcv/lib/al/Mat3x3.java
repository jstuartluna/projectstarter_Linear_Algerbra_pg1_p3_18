package hn.edu.hn.edu.ujcv.lib.al;

public class Mat3x3 {
    //double[][] arr;

    //double m11;  double m12;
    //double m21;  double m22;


    // principios de la contencion
    // 1. miembros de la clase privados
    // 2. constructor.
    // 3. accesores y mutadores (a.k.a. getters y setters)
    private VecR3 colX;
    private VecR3 colY;
    private VecR3 colZ;



    //
    public Mat3x3(){
        colX = new VecR3(1, 0, 0);
        colY = new VecR3(0, 1, 0);
        colZ = new VecR3(0, 0, 1);
    }


    public VecR3 getColX() {
        return colX;
    }

    public void setColX(VecR3 colX) {
        this.colX = colX;
    }

    public VecR3 getColY() {
        return colY;
    }

    public void setColY(VecR3 colY) {
        this.colY = colY;
    }

    public VecR3 getColZ() {
        return colZ;
    }

    public void setColZ(VecR3 colY) {
        this.colZ = colZ;
    }

    public VecR3 getFilaX(){
        VecR3 retval = new VecR3(colX.getX(),colY.getX(),colZ.getZ());
        return retval;
    }

    public void  setFilaX(VecR3 filaX){
        this.colX.setX(filaX.getX());
        this.colY.setX(filaX.getY());
        this.colZ.setZ(filaX.getZ());
    }

    public VecR3 getFilaY(){
        VecR3 retval = new VecR3(colX.getY(),colY.getY(),colZ.getY());
        return retval;
    }

    public void  setFilaY(VecR3 filaY){
        this.colX.setY(filaY.getX());
        this.colY.setY(filaY.getY());
        this.colZ.setY(filaY.getY());

    }

    public VecR3 getFilaZ(){
        VecR3 retval = new VecR3(colX.getY(),colY.getY(),colZ.getY());
        return retval;
    }

    public void  setFilaZ(VecR3 filaZ){
        this.colX.setY(filaZ.getX());
        this.colY.setY(filaZ.getY());
        this.colZ.setY(filaZ.getY());

    }

    // este contrato debe estar en las demas matrices
    // y no debe variar mas que en la dimencion de los objetos
    // retornados y recibidos.
    // suma
    public Mat3x3 suma (Mat3x3 b){
        Mat3x3 retval = new Mat3x3();
        //          cx cy  cz              cx cy cz
        // dado A  | 1  2  3 |  dado b  |  1  1  1 |  x
        //         | 2  3  4 |          |  0  0  0 |  y
        //         | 4  5  6 |          |  3  3  3 |  Z
        //
        //   retval:
        //   |  a.cx.x + b.cx.x     a.cy.x +  b.cy.x    a.cz.x +  b.cz.x  |
        //   |  a.cx.y + b.cx.y     a.cy.y +  b.cy.y    a.cz.y +  b.cz.y  |
        //   |  a.cx.z + b.cx.z     a.cy.z +  b.cy.z    a.cz.z +  b.cz.z  |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   cz es colZ
        //   x es   getX , setX
        //   y es   getY , setY
        //   z es   getZ , setZ

        retval.colX.setX(this.colX.getX() + b.colX.getX());
        retval.colX.setY(this.colX.getY() + b.colX.getY());
        retval.colX.setZ(this.colX.getZ() + b.colX.getZ());
        retval.colY.setX(this.colY.getX() + b.colY.getX());
        retval.colY.setY(this.colY.getY() + b.colY.getY());
        retval.colY.setY(this.colY.getZ() + b.colY.getZ());
        retval.colZ.setX(this.colZ.getX() + b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() + b.colZ.getY());
        retval.colZ.setY(this.colZ.getZ() + b.colZ.getZ());
        return retval;
    }
    // resta
    public Mat3x3 resta (Mat3x3 b){
        Mat3x3 retval = new Mat3x3();
        //          cx cy  cz              cx cy cz
        // dado A  | 1  2  3 |  dado b  |  1  1  1 |  x
        //         | 2  3  4 |          |  0  0  0 |  y
        //         | 4  5  6 |          |  3  3  3 |  Z
        //
        //   retval:
        //   |  a.cx.x - b.cx.x     a.cy.x - b.cy.x    a.cz.x - b.cz.x  |
        //   |  a.cx.y - b.cx.y     a.cy.y - b.cy.y    a.cz.y - b.cz.y  |
        //   |  a.cx.z - b.cx.z     a.cy.z - b.cy.z    a.cz.z - b.cz.z  |
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   cz es colZ
        //   x es   getX , setX
        //   y es   getY , setY
        //   z es   getZ , setZ

        retval.colX.setX(this.colX.getX() - b.colX.getX());
        retval.colX.setY(this.colX.getY() - b.colX.getY());
        retval.colX.setZ(this.colX.getZ() - b.colX.getZ());
        retval.colY.setX(this.colY.getX() - b.colY.getX());
        retval.colY.setY(this.colY.getY() - b.colY.getY());
        retval.colY.setY(this.colY.getZ() - b.colY.getZ());
        retval.colZ.setX(this.colZ.getX() - b.colZ.getX());
        retval.colZ.setY(this.colZ.getY() - b.colZ.getY());
        retval.colZ.setY(this.colZ.getZ() - b.colZ.getZ());
        return retval;
    }
    // multiplicacion escalar
    public  Mat3x3 mul(double alpha){
        Mat3x3 retval = new Mat3x3();
        retval.colX.setX(this.colX.getX() * alpha);
        retval.colX.setX(this.colY.getX() * alpha);
        retval.colX.setX(this.colZ.getX() * alpha);
        retval.colY.setY(this.colX.getY() * alpha);
        retval.colY.setY(this.colY.getY() * alpha);
        retval.colY.setY(this.colZ.getY() * alpha);
        retval.colZ.setY(this.colX.getZ() * alpha);
        retval.colZ.setY(this.colY.getZ() * alpha);
        retval.colZ.setY(this.colZ.getZ() * alpha);
        return  new Mat3x3();
    }

    // multiplicacion vector columna
    public VecR3 mul(VecR3 v){
        return new VecR3();
    }
    // multiplicacion por matriz
    public Mat3x3 mul (Mat3x3 b){
        Mat3x3 retval =  new Mat3x3();
        //          cx cy  cz              cx cy cz
        // dado A  | 1  2  3 |  dado b  |  1  1  1 |  x
        //         | 2  3  4 |          |  0  0  0 |  y
        //         | 4  5  6 |          |  3  3  3 |  Z
        //           x  y  z
        //   retval:
        //   |   a.fx.dot(b.cx)   a.fx.dot(b.cy)   a.fx.dot(b.cz)|
        //   |   a.fy.dot(b.cx)   a.fy.dot(b.cy)   a.fy.dot(b.cz)|
        //   |   a.fz.dot(b.cx)   a.fz.dot(b.cy)   a.fz.dot(b.cz)|
        //
        //   a es this.
        //   b es b
        //   cx es colX
        //   cy es colY
        //   cz es colZ
        //   x es   getX , setX
        //   y es   getY , setY
        //   z es   getZ , setZ
        retval.colX.setX(this.getFilaX().dotProduct(b.colX));
        retval.colX.setY(this.getFilaY().dotProduct(b.colX));
        retval.colX.setX(this.getFilaZ().dotProduct(b.colZ));
        retval.colY.setX(this.getFilaX().dotProduct(b.colY));
        retval.colY.setY(this.getFilaY().dotProduct(b.colY));
        retval.colY.setX(this.getFilaZ().dotProduct(b.colZ));

        return retval;
    }


}
