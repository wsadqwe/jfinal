package com.niit.text;

import org.junit.jupiter.api.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.lang.annotation.ElementType;

public class UnitTest {
    @Test
    public void test01(){
    Person person=new Person();
    Class.cs1=person.getclass();
    system.out.println(cs1);

    Person person=new PErson();
    Class cs1=person.getclass();
    System.out.println(cs1);

    Class cs2=class.forName("com.niit.bean.Person");

    Class cs2=Person.class;
    System.out.println(cs2);
    System.out.println(cs1==cs2);
        }

    @Test
    public void test01(){


        Class cs1=Object.class;
        Class cs2=void.class;
        Class cs3=int.class;
        Class cs4=int[].class;
        Class cs5=int[][].class;
        Class cs6=Override.class;
        Class cs7= ElementType.class;//@interface
        Class cs8=Enum.class;
        Class cs9= Comparable.class;




        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs3);
        System.out.println(cs4);
        System.out.println(cs5);
        System.out.println(cs6);
        System.out.println(cs7);
        System.out.println(cs8);
        System.out.println(cs9);

        int []a=new int[10];
        int []b=new int[100];
    }
}
