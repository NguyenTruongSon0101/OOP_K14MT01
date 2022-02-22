package oo.interfaces;

public class Dog {
    //attribute - data - biến đối tượng

    // implementation(che giấu)
    private int size;
    private String breed;
    private String name;

    //interfaces
    public void setSize(int size){
        if(size > 0){
            this.size = size;
        }else{
            System.out.println("kich thuoc k hop le");
        }
    }
    public int getsize(){
        return this.size;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
