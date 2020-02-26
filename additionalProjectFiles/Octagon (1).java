   package lab2geometricshape;

public class Octagon extends GeometricObject implements Comparable, Cloneable {
    
    private double side;
    
    public Octagon(){
        
        this.side = 1.0;
        
    }//Octagon w/ no args
    
    public Octagon(double side){
        
        this.side = side;
        
    }//Octagon w/ args
    
    @Override
    public double getArea(){
        
        return (2 + 4 / Math.sqrt(2)) * side * side;
        
    }//getArea
    
    @Override
    public double getPerimeter(){
        
        return 8 * side;
        
    }//getPerimeter
    
    @Override
    public int compareTo(Object obj) {
        
        if (this.getArea() > ((Octagon) obj).getArea()) 
            
            return 1;
        
        else if (this.getArea() < ((Octagon) obj).getArea()) 
            
            return -1;
        
        else 
            
            return 0;
        
    }//compareTo
    
     public Octagon clone(){
        try{
            System.out.print("Getting Ellipse to clone...");
            
            return(Octagon) super.clone();
            
        }//try
        catch(Exception e){
            
            System.out.println("UH-OH in Octagon");
            return null;
            
        }//catch
        
    }//clone
     
     
}//Octagon
