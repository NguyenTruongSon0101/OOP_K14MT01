package oo.lab4;

public class SanPhamLinkList {
    Node head = null;
    Node tail = null;

    public SanPhamLinkList (){

    }

    boolean isEmpty(){
        boolean empty =true;
        if(head == null){
            empty = true;
        }else{
            empty = false;
        }
        return empty;
    }

    void add(String tenSP,double donGia,double giamGia){
        SanPham sanPham = new SanPham(tenSP,donGia,giamGia);
        Node newNode = new Node(sanPham);
        if(isEmpty() == true){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }    
    }

    void print(){
        Node current = head;
    
        if(head == null){
            System.out.println("Danh sach rong");
            return;
        }
        System.out.println("danh sach hang hoa");
        while(current != null){
            current.data.xuat();
            current = current.next;
        }
    }
}
