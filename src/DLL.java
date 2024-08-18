public class DLL {
    Node head;
    Node tail;

    int size;
    public DLL(){
        int size = 0;;
    }

    public void InserAfter(int after, int val) {
          Node node = new Node(val);
          Node found = find(after);

          node.next = found.next;
          node.prev = found;
          found.next = node;
          if(node.next == null){
              size++;
              return;
          }
          node.next.prev = node;

          size++;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev =node;
        }else{
            head = node;
        }

        if(tail == null){
            tail = head;
        }

        size += 1;
    }
    public void InsertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        if(head == null){
            node.next = head;
            head = node;
            node.prev = null;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;
        node.next = null;

        size++;
    }

    public void Display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.print("start");
        System.out.println();
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
}
