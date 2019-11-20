package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(3, 4);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    Point p3 = new Point(2, 3);
    Point p4 = new Point(5, 6);
    Assert.assertEquals(p3.distance(p4), 4.242640687119285);
    Point p5 = new Point(3, 4);
    Point p6 = new Point(7, 8);
    Assert.assertEquals(p5.distance(p6), 5.656854249492381);
  }
}

