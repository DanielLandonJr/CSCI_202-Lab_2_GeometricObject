
package lab2geometricshape;


public class Circle extends Ellipse implements Comparable, Cloneable{
    
    private double radius;
    
    public Circle(){
        
        super(1.0,1.0);
        radius = 1.0;
        
    }//circle w/ no args
    
    public Circle(double radius){
        
        super(radius,radius);
        System.out.println("This circle has a radius of: " + radius);
        this.radius = radius;
        
    }//circle w/ args
    
    public double getRadius(){
        
        return radius;
        
    }//getRadius
    
    public void setRadius(double radius){
        
        this.radius = radius;
        
    }//setRadius
    
    public double getArea(){
        
        return radius * radius * Math.PI;
        
    }//getArea
    
    public double getPerimeter(){
        
        return 2 * radius * Math.PI;
        
    }//getPerimeter
    
    @Override
    public String toString(){
        
        return "Cirle's radius: " + radius;
        
    }//toString
    
    @Override
    public int compareTo(Object obj){
        
        if (this.getArea() > ((Circle) obj).getArea())
            
            return 1;
        
        else if (this.getArea() < ((Circle) obj).getArea()) 
            
            return -1;
        
        else
            
            return 0;

    }//compareTo
    
    @Override
    public boolean equals(Object obj){
        
        return this.radius == ((Circle) obj).radius;
        
    }//equals
    
    public Circle clone(){
        
        System.out.println("Getting Circle to clone...");
        
        return (Circle)super.clone();
    }//clone
    
}//Circle
