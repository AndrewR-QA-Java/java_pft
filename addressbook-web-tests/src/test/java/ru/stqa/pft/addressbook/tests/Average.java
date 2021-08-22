package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Average{

  @Test
  public void testAverageOfIntList() throws  Exception{
    //    Average Value
//    Write a method that returns the average of a list of integers.
//    Suggestion: use Java streams if possible
    List<Integer> list01 = Arrays.asList(1, 9, 15, 46);
    double avgValue;
    Integer sum = 0;
   // Arrays.asList(1, 9, 15, 46)
    for (int i=0; i < list01.size(); i++)
      sum = sum + list01.get(i);
    avgValue = sum.doubleValue()/list01.size();
    System.out.println(avgValue);
    }
}

