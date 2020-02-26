
package lab2geometricshape;


public class Ellipse extends GeometricObject implements Eccentric, Comparable, Cloneable {
    
    double a;
    double b;
    
    public Ellipse(){
        
        this.a = a;
        this.b = b; 
        
    }//ellipse w/ no args 
    
    public Ellipse(double side1, double side2){
        
        if(side1 < side2){
            
            a = side2;
            b = side1;
            
        }//if
        
        else{
            
            a = side1;
            b = side2;
            
        }//else
    }//ellipse w/ args
    
    @Override
    public double getPerimeter(){
        
        return (Math.PI) * (Math.sqrt(2 * (Math.pow(a,2) + Math.pow(b,2) + (a - b) / 2)));
        
    }//getPerimeter
    
    @Override
    public double getArea(){
        
        return(Math.PI * a * b); 
        
    }//getArea
    
    @Override
    public double eccentricity(){
        
        double e = 0;
        e = Math.sqrt(a * a + b * b) / a;
        
        return e;
    }//eccentricity
    
    @Override
    public String toString(){
        
        return "Ellipse Perimeter: " + getPerimeter() + "\nArea: " + getArea() + "\n";
        
    }//toString
    
    @Override
    public int compareTo(Object obj){
        
        if(this.getArea() > ((Ellipse)obj).getArea())
            
            return  1;
            
        else if(this.getArea() < ((Ellipse)obj).getArea())
        
            return -1;
        
        else
            return 0;
        
    }//compareTo
    
    @Override
    public Ellipse clone(){
        try{
            System.out.print("Getting Ellipse to clone...");
            
            return(Ellipse) super.clone();
            
        }//try
        catch(Exception e){
            
            System.out.println("UH-OH in Ellipse");
            return null;
            
        }//catch
        
    }//clone
}//Ellipse
