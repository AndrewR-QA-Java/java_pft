package ru.stqa.pft.sandbox;

public class DistanceCalculation {
  public static void main(String[] args) {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(3, 4);
    System.out.println("Distance between 2 points is" + " = " + p1.distance(p2));
    Point p3 = new Point(2, 3);
    Point p4 = new Point(4, 5);
    System.out.println("Distance between 2 points is" + " = " + p3.distance(p4));
    Point p5 = new Point(3, 4);
    Point p6 = new Point(5, 6);
    System.out.println("Distance between 2 points is" + " = " + p5.distance(p6));
  }
}

