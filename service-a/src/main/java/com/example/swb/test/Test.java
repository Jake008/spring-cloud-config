package com.example.swb.test;

public class Test {

      int i = 1 ;
      static int m = 2;
      public static int add(){
         return m++;
      }
    public  int add1(){
       return i++;
    }
    public  int search(){
        return m;
    }

    public static void main(String[] args) {

       Test test = new Test();
       test.add();
        test.add1();
        //System.out.println();
       Test test1 = new Test();
        System.out.println(test.search());
        System.out.println(test1.search());
    }
}
