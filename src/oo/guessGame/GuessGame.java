package oo.guessGame;

public class GuessGame {
//implementtation
    private Player p1;
    private Player p2;
    private Player p3;

//interfaces

public void setp1(){
    this.p1 = p1;
}
public Player getp1(){
    return this.p1;
}

public void setp2(){
    this.p2 = p2;
}
public Player getp2(){
    return this.p2;
}


public void setp3(){
    this.p3 = p3;
}
public Player getp3(){
    return this.p3;
}
public void startGame(){
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;
    int targetNumber = (int)(Math.random()*10);
    System.out.println("I'm thinking if a number between 0 and 9...");
    while (true){
        System.out.println("Number to guess is: "+targetNumber);

        p1.guess();
        p2.guess();
        p3.guess();

        guessp1 = p1.getnumber();
        System.out.println("player one guessed: "+guessp1);
        guessp2 = p2.getnumber();
        System.out.println("player two guessed: "+guessp2);
        guessp3 = p3.getnumber();
        System.out.println("Player three guessed: "+guessp3);

        if(guessp1 == targetNumber){
            p1isRight = true;
        }
        if(guessp2 == targetNumber){
            p2isRight = true;
        }
        if(guessp3 == targetNumber){
            p3isRight = true;
        }

        if(p1isRight || p2isRight || p3isRight){
            System.out.println("We have a winner!");
            System.out.println("player one got it right? "+p1isRight);
            System.out.println("player two got it right? "+p2isRight);
            System.out.println("player three got it right? "+p3isRight);
            System.out.println("Game is over");
            break;
        }
        else{
            System.out.println("Players will have to try again.");
        }
    }
}
}
