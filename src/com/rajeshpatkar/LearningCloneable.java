package com.rajeshpatkar;

public class LearningCloneable {

    public static void main(String[] args) throws Exception {

        Point p1 = new Point(1, 2);
        System.out.println(p1);
        System.out.println("creating a clone");
        Point p2 = (Point) p1.clone();
        System.out.println("clone created successfully ");
        System.out.println("printing the clone now....");
        System.out.println(p2);
        System.out.println("modifying the values of clone...");
        p2.setX(89);
        p2.setY(78);
        System.out.println("printing the original object .. ");
        System.out.println(p1);
        System.out.println("printing the cloned object .. ");
        System.out.println(p2);

    }
}
