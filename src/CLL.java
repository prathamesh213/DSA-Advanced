import java.rmi.UnexpectedException;

public class CLL {
    Node head;
    Node tail;
    int size = 0;
    CLL(){
        this.head = null;
        this.tail= null;
    }

    public void display(){
        Node temp = head;
        if(head!=null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp  != head);
            System.out.println();
        }
    }
    public void Delete(int val){
        Node node = head;
        if(head == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);


    }

    public void Insert(int val){
         Node node = new Node(val);
          if(head == null){
              head = node;
              tail = node;
              return;
          }
          node.next = head;
          tail.next = node;
          tail = node;
    }

    private class Node{
        int val;
        Node next;

          public Node(int val){
              this.val = val;
          }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
