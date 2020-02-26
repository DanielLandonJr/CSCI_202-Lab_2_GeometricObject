
package lab2geometricshape;


public abstract class GeometricObject {
    private String color = "not set";
    private boolean filled;
    private java.util.Date dateCreated; 
    
    
    protected GeometricObject(){
        
        dateCreated = new java.util.Date();
        
    }//GeometricObject w/ no args
    
    protected GeometricObject(String color, boolean filled){
        
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
        
    }//GeometricObject w/ args
    
    public String toString(){
        
        return "Color: " + color + "\nIs filled: " + filled + "\nDate : " + dateCreated;
        
    }//toString
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
}//GeometricObject

