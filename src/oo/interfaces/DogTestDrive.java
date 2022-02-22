package oo.interfaces;

import java.util.jar.Attributes.Name;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setSize(5);
        dog.setName("lulu");
        dog.setBreed("Phu quoc");
        System.out.println("name: "+dog.getName()+" size: "+dog.getsize()+" breed: "+dog.getBreed());
    }
}
