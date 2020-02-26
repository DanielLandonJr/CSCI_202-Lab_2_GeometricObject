package app;

/**
* 
* @custom.application_name Lab_2_GeometricObject
* @custom.class_name App
*  
* @custom.author Daniel C. Landon Jr.
* @custom.instructor Dr. Bob Walsh
* @custom.course CSCI 202 - Introduction to Software Systems
* @custom.date_started 02.04.2020
* @custom.date_due 02.20.2020
* 
* @custom.class_notes None
* 
* @custom.pre_condition None
* 
* @custom.post_condition None
* 
* @custom.javadoc_tags In order to use @custom.tag_name in javadocs you must include the folloinwing in the command line to generate the docs. This part must be after you have indicated what files to process;
* 
*  ' -tag custom.tag_name:a:"tag_name" '
* 
* The first part identifies the tag in the code, the second part in quotes indentifies what will be printed in the javadocs when they are generated. If you do not include this in the command to generate the docs you will get an error/warning.
* 
*/

public class App {
    /**
     * 
     * @custom.method_name main
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.04.2020
     * 
     * @custom.method_notes none
     * 
     * @custom.pre_condition Interfaces and Abstract class must exist
     * 
     * @custom.post_condition none
     * 
     * @param args command line arguments
     * @throws Exception go figure
     */
    public static void main(String[] args) throws Exception {

        System.out.println("\n******************** Circle ********************\n");

        Circle _circleOne = new Circle();
        Circle _circleTwo = new Circle(2.1);

        System.out.println("Area of Circle _circleTwo is " 
            + _circleTwo.getArea());
        System.out.println("Perimeter of Circle _circleTwo is " 
            + _circleTwo.getPerimeter());

        if (_circleOne.compareTo(_circleTwo) == 0) { 
            System.out.println("Circle _circleOne and _circleTwo have equal coverage of area"); } // end if
        else if (_circleOne.compareTo(_circleTwo) > 0) { 
            System.out.println("Circle _circleOne has larger area than the circle _circleTwo"); } // end else if
        else { 
            System.out.println("Circle _circleOne has smaller area than the circle _circleTwo"); } // end else

        Circle _circleThree = _circleTwo.clone();

        if (_circleTwo.compareTo(_circleThree) == 0) {
            System.out.println("Circle _circleTwo and _circleThree have equal coverage of area"); } // end if
        else if (_circleTwo.compareTo(_circleThree) > 0) {
            System.out.println("Circle _circleTwo has larger area than the circle _circleThree"); } // end else if
        else { 
            System.out.println("Circle _circleTwo has smaller area than the circle _circleThree"); } // end else

        System.out.println("Circle _circleThree -->" + _circleThree);

        System.out.println("\n******************** Ellipse ********************\n");
        
        Ellipse ellipse1 = new Ellipse(2.0,2.0);
        Ellipse ellipse2 = new Ellipse(3.0, 3.0);
        
        System.out.println("Area of Ellipse ellipse2 is " 
            + ellipse2.getArea());
        System.out.println("Perimeter of Ellipse ellipse2 is " 
            + ellipse2.getPerimeter());
        
        if (ellipse1.compareTo(ellipse2) == 0) { 
            System.out.println("Ellipse ellipse1 and ellipse2 have equal coverage of area"); } // end if
        else if (ellipse1.compareTo(ellipse2) > 0) { 
            System.out.println("Ellipse ellipse1 has larger area than the circle ellipse2"); } // end else if
        else { 
            System.out.println("Ellipse ellipse1 has smaller area than the ellipse ellipse2"); } // end else
        
        Ellipse ellipse3 = ellipse2.clone();
        
        if (ellipse2.compareTo(ellipse3) == 0) {
            System.out.println("Ellipse ellipse2 and ellipse3 have equal coverage of area"); } // end if
        else if (ellipse2.compareTo(ellipse3) > 0) { 
            System.out.println("Ellipse ellipse2 has larger area than the ellipse ellipse3"); } // end else if
        else { 
            System.out.println("Ellipse ellipse2 has smaller area than the ellipse ellipse3"); } // end else
        
        System.out.println("Ellipse ellipse3: " + ellipse3);

        System.out.println("\n******************** Octagon ********************\n");        
        
        Octagon octagon1 = new Octagon();
        Octagon octagon2 = new Octagon(3.0);
        
        System.out.println("Area of Octagon octagon2 is " 
            + octagon2.getArea());
        System.out.println("Perimeter of Octagon octagon2 is " 
            + octagon2.getPerimeter());
        
        if (octagon1.compareTo(octagon2) == 0) { 
            System.out.println("Octagon ooctagon1 and octagon2 have equal coverage of area"); } // end if
        else if (octagon1.compareTo(octagon2) > 0) { 
            System.out.println("Octagon octagon1 has larger area than the Octagon octagon2"); } // end else if
        else { 
            System.out.println("Octagon octagon1 has smaller area than the Octagon octagon2"); } // end else
        
        Octagon octagon3 = octagon2.clone();
        if (octagon2.compareTo(octagon3) == 0) { 
            System.out.println("Octagon octagon2 and octagon3 have equal coverage of area"); } // end if
        else if (octagon2.compareTo(octagon3) > 0) { 
            System.out.println("Octagon octagon2 has larger area than the Octagon octagon3"); } // end else if
        else { 
            System.out.println("Octagon octagon2 has smaller area than the Octagon octagon3"); } // end else
        
        System.out.println("Octagon octagon3: " + octagon3);

        System.out.println("\n******************** Equaleteral Triangle ********************\n");

        EquilateralTriangle et1 = new EquilateralTriangle();
        EquilateralTriangle et2 = new EquilateralTriangle(3.0);
        
        System.out.println("Area of Equilateral Triangle et2 is " 
            + et2.getArea());
        System.out.println("Perimeter of Equilateral Triangle et2 is " 
            + et2.getPerimeter());
        
        if (et1.compareTo(et2) == 0) { 
            System.out.println("Equilateral Triangle et1 and et2 have equal coverage of area"); } // end if
        else if (et1.compareTo(et2) > 0) { 
            System.out.println("Equilateral Triangle et1 has larger area than the Equilateral Triangle et2"); } // mend else if
        else { 
            System.out.println("Equilateral Triangle et1 has smaller area than the Equilateral Triangle et2"); } // end else
                
        EquilateralTriangle et3 = et2.clone();
        
        if (et2.compareTo(et3) == 0) { 
            System.out.println("Equilateral Triangle et2 and et3 have equal coverage of area"); } // end if
        else if (et2.compareTo(et3) > 0) { 
            System.out.println("Equilateral Triangle et2 has larger area than the Equilateral Triangle et3"); } // end else if
        else { 
            System.out.println("Equilateral Triangle et2 has smaller area than the Equilateral Triangle et3"); } // end else
        
        System.out.println("Equilateral Triangle et3: " + et3);

    } // end main

} // end App