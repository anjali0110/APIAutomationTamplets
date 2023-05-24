package com.thetestingacademy.tests.fullcrud;

import org.testng.annotations.*;

public class AnnotationDemo {
  @BeforeSuite
    void demo1(){
      System.out.println("BeforeSuite");
  }

  @BeforeTest
   //@Test(groups = "P0")
   void demo2(){
      System.out.println("BeforeTest");

  }
  @BeforeClass
   void demo3(){
      System.out.println("BeforeClass");
  }
  @BeforeMethod
    Void demo4(){
      System.out.println("BeforeMethod");
      return null;
  }
  @Test
    void demo5(){
      System.out.println("Test");
  }
  @AfterMethod
    void demo6(){
      System.out.println("AfterMethod");
  }

   @AfterClass
    void demo7(){
      System.out.println("AfterClass");
   }
   @AfterTest
    void demo8(){
      System.out.println("AfterTest");
   }
   @AfterSuite
   void demo9(){
      System.out.println("AfterSuite");
   }



}
