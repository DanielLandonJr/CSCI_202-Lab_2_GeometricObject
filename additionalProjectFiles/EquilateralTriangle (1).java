package lab2geometricshape;


public class EquilateralTriangle extends GeometricObject implements Comparable, Cloneable {
    
    double side;
    
    public EquilateralTriangle(){
        
        this.side = 1.0;
        
    }//EquilateralTriangle w/ no args
    
    public EquilateralTriangle(double a){
        
        side = a;
        
    }//EquilateralTriangle w/ args
    
    @Override
    public double getPerimeter(){
        
        return (side * 3); 
        
    }//getPerimeter
    
    @Override
    public double getArea(){
        
        return ((side * side * Math.sqrt(3)) / 4 );
        
    }//getArea
    
    @Override
    public String toString(){
        
        return "Equilateral Triangle Perimeter: " + getPerimeter() + "\nArea: " + getArea() + "\n";
        
    }//toString
    
    @Override
    public int compareTo(Object obj) {
        
        if (this.getArea() > ((EquilateralTriangle) obj).getArea()) 
            
            return 1;
        
        else if (this.getArea() < ((EquilateralTriangle) obj).getArea()) 
            
            return -1;
        
        else 
            
            return 0;
        
    }//compareTo
    
    @Override
    public EquilateralTriangle clone(){
        try{
            System.out.print("Getting EquilateralTriangle to clone...");
            
            return(EquilateralTriangle) super.clone();
            
        }//try
        catch(Exception e){
            
            System.out.println("UH-OH in EquilateralTriangle");
            return null;
            
        }//catch
        
    }//clone

}//EQTriangle
