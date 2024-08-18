class Main {
    public static void main(String[] args) {
     LL list = new LL();
        list.InsertLast(1);
        list.InsertLast(1);
        list.InsertLast(2);
        list.InsertLast(2);
        list.InsertLast(4);

        list.Display();
        list.AddRecursive(88,5);
        list.Duplicates();
        list.Display();
    }
}