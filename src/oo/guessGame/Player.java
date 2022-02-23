package oo.guessGame;

public class Player {
    //implementtation
    private int number = 0;

    //interfaces
    public void setnumber(){
        this.number = number;
    }

    public int getnumber(){
        return this.number;
    }
    public void guess(){
        number = (int)(Math.random()*10);
        System.out.println("I'm guess"+number);
    }
}
