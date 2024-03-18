package hashmap;

public class Main {
    public static void main(String[] args) {
        MyHashMap table = new MyHashMap();
        table.set("nails", 100);
        table.set("nails", 200);
        table.set("tiles", 50);

        System.out.println(String.join(", ", table.keys()));
        table.printTable();
    }
}
