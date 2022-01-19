package oo.constructor;

public class MyInterger {
    private int value;

    public MyInterger(int inititialValue){
        value = inititialValue;
    }

    public MyInterger(){
        this(0);
    }

    public MyInterger(MyInterger other){
        this(other.value);
    }
    public boolean greaterThan (MyInterger other){
        return(this.value > other.value);
    }

    public boolean lessThan (MyInterger other){
        return (other.greaterThan(this));
    }

    public MyInterger increment(){
        value++;
        return this;
    }
}
