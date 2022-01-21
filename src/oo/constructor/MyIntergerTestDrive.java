package oo.constructor;

public class MyIntergerTestDrive {
    public static void main(String[] args) {
        MyInterger myInterger;
        myInterger = new MyInterger();
        
        
        MyInterger myInterger2;
        myInterger2 = new MyInterger(0);
        
        System.out.println(myInterger2.greaterThan(myInterger));
        System.out.println(myInterger2.lessThan(myInterger));

        myInterger.increment();

        System.out.println(myInterger2.greaterThan(myInterger));
        System.out.println(myInterger2.lessThan(myInterger));
        
    }
}
