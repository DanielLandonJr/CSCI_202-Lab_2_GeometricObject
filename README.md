# Lab 2 - GeometricObject

- Instructions as presented

DO THE FOLLOWING

- Follow the comments in individual programs. First read Javadoc comments in __GeometricObject__ and __Circle__

- Next complete your __Octagon__, __EquilateralTriangle__, and __Ellipse__. Look at Circle class for help on implementation of __compareTo__, clone, and __equals__ methods. All sub-classes must implement __Comparable__ and __Cloneable__ interfaces.

- Design and implement the subclass __“EquilateralTriangle”__ having a double variable side denoting the three sides of the equilateral triangle [Note that since all the 3 sides are equal, the constructor will have only one parameter]. You need to write an accessor method for the side.

- An ellipse is basically nothing but an elongated circle. A circle has a radius. An ellipse has two measurements: the major axis (a) and the minor axis (b) with a > b.
    - Note that in an ellipse if a = b then it becomes a circle.
    
- The measure of “roundness” of an ellipse is given by its eccentricity e where the value of e is always between 0 and 1. For a circle e = 0. The higher the value of e, the higher is the deviation of the ellipse from its roundness.

- Eccentricity is associated with a lot of other shapes as well e.g. hyperbola, parabola, etc.
    - The various formulae for the ellipse are:
        - Perimeter = P = ∏∗2∗(a2+b2)−(a−b)22
        
- We can define an interface called Eccentric for all eccentric Shapes.

```
Eccentric.java:

interface Eccentric
    {            
        double eccentricity();
    }
```

- Finally, complete the Test class. 

- Follow the comments in the Test class.

- If you follow __Circle__ class and code already written in Test class as your examples, it should not take too long to get this lab done.

- __Turn in CIRCLE. Ellipse, EquilateralTriangle, Octagon and Test classes in a word/pfd doc as well as the java files.__
