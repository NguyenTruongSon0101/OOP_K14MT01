package oo.animal;

public class Cho extends hoCho {
    public Cho(){
        System.out.println("contructor mac dinh cua cho");
    }
    @Override
    public void keu() {
        System.out.println("Cho keu GAU GAU");
    }
    @Override
    public void an() {
        System.out.println("Cho an xuong");
    }
    public void duoiMeo(){
        System.out.println("Duoi theo meo");
    }
}
