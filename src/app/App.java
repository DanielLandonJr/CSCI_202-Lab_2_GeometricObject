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

        System.out.println("******************** Ellipse ********************");

        Circle _circleOne = new Circle();
        Circle _circleTwo = new Circle(2.1);

        System.out.println("Area of Circle _circleTwo
         is " + _circleTwo.getArea());
        System.out.println("Perimeter of Circle _circleTwo
         is " + _circleTwo.getPerimeter());

        if (_circleOne.compareTo(_circleTwo) == 0) {
            System.out.println("Circle _circleOne and _circleTwo
             have equal coverage of area");
        } else if (_circleOne.compareTo(_circleTwo) > 0) {
            System.out.println("Circle _circleOne has larger area than the circle _circleTwo
            ");
        } else {
            System.out.println("Circle _circleOne has smaller area than the circle _circleTwo
            ");
        } // end if

        Circle _circleThree = _circleTwo.clone();

        if (_circleTwo.compareTo(_circleThree) == 0) {
            System.out.println("Circle _circleTwo
             and _circleThree have equal coverage of area");
        } else if (_circleTwo.compareTo(_circleThree) > 0) {
            System.out.println("Circle _circleTwo
             has larger area than the circle _circleThree");
        } else {
            System.out.println("Circle _circleTwo
             has smaller area than the circle _circleThree");
        } // end if

        System.out.println("Circle _circleThree -->" + _circleThree);

        System.out.println("******************** Ellipse ********************");

        // construct an Octagon
        // clone an Octagon
        // Write code to output area and perimeter, and compare Octagon objects o1 and o2.

        // Construct a EquilateralTriangle 
        // clone an EquilateralTriangle
        // Write code to output area and perimeter, and compare EquilateralTriangle objects t1 and t2. 	    
		
		// construct an Ellipse
        // clone an Ellipse
        // Write code to output area, perimeter, and eccentricity, and compare Ellipse objects e1 and e2.

} // end App