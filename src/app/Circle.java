package app;

public class Circle extends Ellipse {
    
    private double radius = 0.0;
    
    public Circle() {
        super(1.0, 1.0);
        radius = 1.0;
    } // end Circle constructor
    
    public Circle(double radius) {
        super(radius,radius);
        System.out.println("This circle has a radius of: " + radius);
        this.radius = radius;
    } // end Circle constructor
    
    public double getRadius() { return radius; } // end getRadius
    
    public void setRadius(double radius) { this.radius = radius; } // end setRadius
    
    public double getArea() { return radius * radius * Math.PI; } // end getArea
    
    public double getPerimeter() { return 2 * radius * Math.PI; } // end getPerimeter

    @Override
    public String toString() { return "[Circle] radius = " + radius; } // end toString
    
    @Override
    public int compareTo(Object obj) {
        if (this.getArea() > ((Circle) obj).getArea()) { return 1; } 
        else if (this.getArea() < ((Circle) obj).getArea()) { return -1; }
        else { return 0; }
    } // end compareTo
    
    @Override
    public boolean equals(Object obj) { return this.radius == ((Circle) obj).radius; } // end equals

    @Override
    public Circle clone() {
        System.out.println("Getting Circle to clone...");
        
        return (Circle)super.clone();
    } // end clone
}
