package app;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
    
    private double side = 0.0;
    
    public Octagon(){ this.side = 1.0; } // end Octagon constructor
    
    public Octagon(double side){ this.side = side; } // end Octagon constructor
    
    @Override
    public double getArea() { return (2 + 4 / Math.sqrt(2)) * side * side; } // end getArea
    
    @Override
    public double getPerimeter() { return 8 * side; } // end getPerimeter
    
    @Override
    public int compareTo(Object obj) {
        
        if (this.getArea() > ((Octagon) obj).getArea()) { return 1; } // end if
        else if (this.getArea() < ((Octagon) obj).getArea()) { return -1; } // end else if
        else { return 0;} // end else
        
    } // end compareTo
    
     public Octagon clone(){
        try{
            System.out.print("Getting Ellipse to clone...");
            return(Octagon) super.clone();
        } // end try
        catch(Exception e){            
            System.out.println("UH-OH in Octagon");
            return null;            
        } // end catch
        
    } // end clone
     
} // end Octagon
