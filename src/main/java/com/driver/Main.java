package com.driver;
import java.util.*;
public class Main {
  String meth(){
    return "Invoking method from class A";
}
}
class B extends Main{
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
