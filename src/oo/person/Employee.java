package oo.person;

public class Employee extends Person {
    private double salary;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name: "+this.name +"birthday"+this.birthday+" salary: "+this.salary;
    }
}
