package com.driver;
import java.util.*;
 class A {
  String meth(){
    return "Invoking method from class A";
}
}
class B extends A{
  @Override 
  String meth(){
    return "Method is overridden Extended class B";
  }
  public static void main(String[] args){
    B obj = new B();
    String result = obj.meth();
    System.out.println(result);
  }
}
