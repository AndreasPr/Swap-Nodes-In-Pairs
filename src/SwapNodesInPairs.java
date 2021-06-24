
/**
 * Created on 24/Jun/2021 to swap-nodes-in-pairs
 */
public class SwapNodesInPairs {

    Node head;

    public class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }

    void swapPairs(){
        Node temp = head;
        while(temp != null && temp.next != null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }

    }

    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]){

        SwapNodesInPairs linkedList = new SwapNodesInPairs();
        linkedList.push(5);
        linkedList.push(4);
        linkedList.push(3);
        linkedList.push(2);
        linkedList.push(1);

        System.out.println("Linked List before the swapping: ");
        linkedList.printList();

        linkedList.swapPairs();

        System.out.println("Linked List after the swapping: ");
        linkedList.printList();
    }
}
