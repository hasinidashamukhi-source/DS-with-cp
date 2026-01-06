// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Node{
    int data;
    Node next;
    Node(int a){
        data=a;
        next=null;
    }
    public void getData(){
        System.out.println(data);
    }
    public void getref(){
     
    System.out.println(next);

}
    public static void main(String[] args){
        System.out.println("sweety");
        Node a= new Node(100);
        System.out.println(a);
        a.getData();
        Node b=new Node(50);
        System.out.println(b);
        b.getData();
        Node c=new Node(200);
        System.out.println(c);
        c.getData();
        
    }
}
