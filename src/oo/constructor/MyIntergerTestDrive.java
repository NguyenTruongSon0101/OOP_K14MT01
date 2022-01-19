package oo.constructor;

public class MyIntergerTestDrive {
    public static void main(String[] args) {
        MyInterger myInterger;
        myInterger = new MyInterger();
        
        
        MyInterger myInterger2;
        myInterger2 = new MyInterger(5);
        myInterger2.greaterThan(myInterger);
        myInterger2.greaterThan(myInterger);
        myInterger.increment();
    }
}
