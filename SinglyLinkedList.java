// first of all we have to define the structure of node using class
class Node{
    int data;
    Node next;

    // create constructor to initilize the data of the node.
    Node(){
        this.next = null;
    }
}

class SinglyLinkedList{
    public static void main(String [] args){

        // creating head.
        Node head = new Node();

        // first node.
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();


        // assigning data to the nodes.
        first.data = 4;
        second.data = 5;
        third.data = 6;

        // linking node to each other..

        head.next = first;
        first.next = second;
        second.next = third;
       // third.next = null;


        // printing nodes data 
        Node pointer = head;

        System.out.print("Head--->");
        while(pointer.next!= null){
            System.out.print(pointer.next.data+"--->");
            pointer.next = pointer.next.next;
        }
        System.out.print("Null");
        System.out.println();

        
    }
}