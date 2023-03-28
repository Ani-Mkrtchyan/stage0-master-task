package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide <= thirdSide) {
            System.out.print("this is a valid triangle");
        } else if ((firstSide + thirdSide <= secondSide) && (secondSide + thirdSide <= firstSide)) {
            System.out.print("This is not a valid triangle.");
        } else {
            System.out.println("it's not a triangle");

        }
    }

}
