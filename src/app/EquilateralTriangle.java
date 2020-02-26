package app;
/* Assumes a proper triangle.
 * EquilateralTriangle is a GeometricObject.
 * EquilateralTriangles are Comparable and Cloneable
 * Must contain Overloaded constructors
 * Add Javadoc as shown in Circle class 
 * Remove all comment lines added by Dr.H.
 */

public class EquilateralTriangle extends GeometricObject implements Comparable, Cloneable {
    
    double side = 0.0;
    
    public EquilateralTriangle() { this.side = 1.0; } // end EquilateralTriangle
    
    public EquilateralTriangle(double a) { side = a; } // end EquilateralTriangle
    
    @Override
    public double getPerimeter() { return (side * 3); } // end getPerimeter
    
    @Override
    public double getArea() { return ((side * side * Math.sqrt(3)) / 4 ); } // end getArea
    
    @Override
    public String toString(){ return "Equilateral Triangle Perimeter: " + getPerimeter() + "\nArea: " + getArea() + "\n"; } // end toString
    
    @Override
    public int compareTo(Object obj) {
        
        if (this.getArea() > ((EquilateralTriangle) obj).getArea()) { return 1; } // end if
        else if (this.getArea() < ((EquilateralTriangle) obj).getArea()) { return -1; } // end else if
        else { return 0; } // end else
        
    } // end compareTo
    
    @Override
    public EquilateralTriangle clone(){
        try{
            System.out.print("Getting EquilateralTriangle to clone...");
            return(EquilateralTriangle) super.clone();            
        } // end try
        catch(Exception e){     
            System.out.println("UH-OH in EquilateralTriangle");
            return null;
        } // end catch
        
    } // end clone

} // end EquilateralTriangle