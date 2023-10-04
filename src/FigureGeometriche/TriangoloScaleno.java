
package figureGeometriche;



public class TriangoloScaleno {
    public double l1;
    public double l2;
    public double l3;
    
    public TriangoloScaleno(double l1,double l2, double l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    public double perimetro(){
        double rit;
        rit= l1+l2+l3;
        return rit;
    }
    
    public double trovaAltezza(){
        double rit;
        rit = Math.sqrt(TriangoloScaleno.this.perimetro());
        return rit;
    }
    
    
    
}
