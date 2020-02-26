
package lab2geometricshape;


public class Lab2GeometricShape {

    public static void main(String[] args) {
        
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0);
        
        System.out.println("Area of Circle circle2 is " + circle2.getArea());
        System.out.println("Perimeter of Circle circle2 is " + circle2.getPerimeter());
        

        if (circle1.compareTo(circle2) == 0) 
            
            System.out.println("Circle circle1 and circle2 have equal coverage of area");
        
         else if (circle1.compareTo(circle2) > 0)
             
            System.out.println("Circle circle1 has larger area than the circle circle2");
         
         else
             
            System.out.println("Circle circle1 has smaller area than the circle circle2");
        
        Circle circle3 = circle2.clone();
        if (circle2.compareTo(circle3) == 0)
            
            System.out.println("Circle circle2 and circle3 have equal coverage of area");
        
         else if (circle2.compareTo(circle3) > 0)
             
            System.out.println("Circle circle2 has larger area than the circle circle3");
         
         else 
             
            System.out.println("Circle circle2 has smaller area than the circle circle3");
        
        System.out.println("Circle circle3: " + circle3);

        System.out.println("------------------------------------------------------------------");
        
        Ellipse ellipse1 = new Ellipse(2.0,2.0);
        Ellipse ellipse2 = new Ellipse(3.0, 3.0);
        
          System.out.println("Area of Ellipse ellipse2 is " + ellipse2.getArea());
          System.out.println("Perimeter of Ellipse ellipse2 is " + ellipse2.getPerimeter());
        
         if (ellipse1.compareTo(ellipse2) == 0) 
            
            System.out.println("Ellipse ellipse1 and ellipse2 have equal coverage of area");
        
         else if (ellipse1.compareTo(ellipse2) > 0)
             
            System.out.println("Ellipse ellipse1 has larger area than the circle ellipse2");
         
         else
             
            System.out.println("Ellipse ellipse1 has smaller area than the ellipse ellipse2");
        
        Ellipse ellipse3 = ellipse2.clone();
        
        if (ellipse2.compareTo(ellipse3) == 0)
            
            System.out.println("Ellipse ellipse2 and ellipse3 have equal coverage of area");
        
         else if (ellipse2.compareTo(ellipse3) > 0)
             
            System.out.println("Ellipse ellipse2 has larger area than the ellipse ellipse3");
         
         else 
             
            System.out.println("Ellipse ellipse2 has smaller area than the ellipse ellipse3");
        
        System.out.println("Ellipse ellipse3: " + ellipse3);
        
        System.out.println("------------------------------------------------------------------");
        
        
        Octagon octagon1 = new Octagon();
        Octagon octagon2 = new Octagon(3.0);
        
        System.out.println("Area of Octagon octagon2 is " + octagon2.getArea());
        System.out.println("Perimeter of Octagon octagon2 is " + octagon2.getPerimeter());
        
        if (octagon1.compareTo(octagon2) == 0) 
            
            System.out.println("Octagon ooctagon1 and octagon2 have equal coverage of area");
        
         else if (octagon1.compareTo(octagon2) > 0)
             
            System.out.println("Octagon octagon1 has larger area than the Octagon octagon2");
         
         else 
             
            System.out.println("Octagon octagon1 has smaller area than the Octagon octagon2");
        
        Octagon octagon3 = octagon2.clone();
        if (octagon2.compareTo(octagon3) == 0) 
            
            System.out.println("Octagon octagon2 and octagon3 have equal coverage of area");
         else if (octagon2.compareTo(octagon3) > 0) 
             
            System.out.println("Octagon octagon2 has larger area than the Octagon octagon3");
         
         else 
             
            System.out.println("Octagon octagon2 has smaller area than the Octagon octagon3");
        

        System.out.println("Octagon octagon3: " + octagon3);
        
         System.out.println("------------------------------------------------------------------");

        EquilateralTriangle et1 = new EquilateralTriangle();
        EquilateralTriangle et2 = new EquilateralTriangle(3.0);
        
        System.out.println("Area of Equilateral Triangle et2 is " + et2.getArea());
        System.out.println("Perimeter of Equilateral Triangle et2 is " + et2.getPerimeter());
        
        if (et1.compareTo(et2) == 0) 
            
            System.out.println("Equilateral Triangle et1 and et2 have equal coverage of area");
        
         else if (et1.compareTo(et2) > 0) 
             
            System.out.println("Equilateral Triangle et1 has larger area than the Equilateral Triangle et2");
         
         else 
             
            System.out.println("Equilateral Triangle et1 has smaller area than the Equilateral Triangle et2");
        
        
        EquilateralTriangle et3 = et2.clone();
        
        if (et2.compareTo(et3) == 0) 
            
            System.out.println("Equilateral Triangle et2 and et3 have equal coverage of area");
        
          else if (et2.compareTo(et3) > 0) 
            
            System.out.println("Equilateral Triangle et2 has larger area than the Equilateral Triangle et3");
        
         else 
            
            System.out.println("Equilateral Triangle et2 has smaller area than the Equilateral Triangle et3");
        

        System.out.println("Equilateral Triangle et3: " + et3);
        
        System.out.println("------------------------------------------------------------------");

    }//main
    
}//Lab2GeometricShape
