package oo.car;

import javax.swing.event.SwingPropertyChangeSupport;

public class CarTestDrive {
    
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("color: "+car.getcarColor());
        System.out.println("price: "+car.getcarPrice());
    }
}
