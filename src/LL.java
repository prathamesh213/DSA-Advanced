public class LL {
   private Node head;
   private Node tail;
   private int size;
   public LL() {
       size = 0;
   }
   public void Display(){
       Node temp = head;
       while(temp != null){
           System.out.print(temp.val + " -> ");
           temp = temp.next;
       }
      System.out.println("End");
   }

   public void AddRecursive(int val, int index){
       head = AddRecur(val,index,head);
   }
   private Node AddRecur(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }
        node.next = AddRecur( val, index-1, node.next);
        return node;

   }

   public void Delete(int index){
       if(index == 0){
           Node temp = head;
           head = temp.next;
           temp = null;
           return;
       }

       Node temp = head;
       for(int i = 1; i < index;i++){
           temp = temp.next;
       }
       Node deltemp = temp.next;
       temp.next = deltemp.next;
       deltemp = null;


   }

   public void Insert(int val, int index){
       if(index==0){
            InsertFirst(val);
            return;
       }
       if (index == size) {
           InsertLast(val);
           return;
       }
       Node temp = head;
       for(int i= 1; i< index ; i++){
           temp = temp.next;
       }
       Node node = new Node(val, temp.next);
       temp.next = node;

       size++;

   }
   public void InsertLast(int val){
       if(tail == null){
           InsertFirst(val);
           return;
       }
       Node node = new Node(val);
       tail.next = node;
       tail = node;

       size++;
   }
   public void InsertFirst(int val){
         Node node = new Node(val);
         node.next = head;
         head = node;

         if(tail == null){
            tail = head;
         }

       size += 1;
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

    public void Duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
}
