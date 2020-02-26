package app;
// Complete all methods
// Add JavaDoc with explanations.

// most code here supplied by instructor

public class Ellipse extends GeometricObject implements Eccentric, Comparable, Cloneable {
	
	double a = 0.0;
	double b = 0.0;

	public Ellipse(double s1, double s2) {
		if(s1 < s2) {			
			a = s2;
			b = s1;
		}
		else {		
			a = s1;
			b = s2;
		}

	} // end Ellipse constructor

	@Override
	public double getPerimeter() {
        
		return (Math.PI) * (Math.sqrt(2 * (Math.pow(a,2) + Math.pow(b,2) + (a - b) / 2)));
		
	} // end getPerimeter
	
	@Override
	public double getArea() {
        
        return(Math.PI * a * b); 
        
	} // end getArea

	
	public double perimeter()
	{
		//method body missing

		System.out.println("perimeter");

		return 0;
	} // end perimeter
	
	public double area()
	{
		//method body missing

		System.out.println("area");

		return 0;		
	} // end area
	
	public double eccentricity() {
        
		double e = 0.0;

		e = Math.sqrt(a * a + b * b) / a;
		
		return e;

	} // end eccentricity
	
	public String toString() {
        
		return "Ellipse Perimeter: " + getPerimeter() + "\nArea: " + getArea() + "\n";
		
	} // end toString

    /**
     * Two Ellipse are compared based on the area of Ellipse.
     *
     * @param obj: Ellipse being compared to this Ellipse
     * @return see {@link Comparable#compareTo(java.lang.Object)}
     */
    @Override
    public int compareTo(Object obj) {
        if (this.getArea() > ((Ellipse) obj).getArea()) {
            return 1;
        } else if (this.getArea() < ((Ellipse) obj).getArea()) {
            return -1;
        } else {
            return 0;
        }
	} // end compareTo
	
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
	
} // end Ellipse
