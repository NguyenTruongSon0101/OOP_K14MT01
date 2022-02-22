package oo.lab4;

public class Node {
    SanPham data;
    Node next;

    //lien ket
    public Node(){}

    public Node(SanPham sanPham){
        data = sanPham;
        next = null;
    }
    public Node(SanPham sanPham, Node node){
        data = sanPham;
        next = node;
    }
}
