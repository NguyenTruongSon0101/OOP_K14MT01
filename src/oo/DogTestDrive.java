package oo;

public class DogTestDrive {
    public static void main(String[] args) {
    Dog miloDog;
    miloDog = new Dog(5, "gaugau", "milo");
    miloDog.bark();
    miloDog.setBigger();
    miloDog.run();

    Dog luLuDog;
    luLuDog = new Dog(20, "gru gru", "lulu");
    luLuDog.bark();
    luLuDog.setBigger();
    luLuDog.run();
    }
    
}
