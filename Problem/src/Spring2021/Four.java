package Spring2021;

import java.util.ArrayList;
import java.util.Collections;

public class Four {
    public static void main(String[] args) {
        ArrayList<Node> ara = new ArrayList<>();
        Node one = new Node();
        one.productName = "Shirt";
        one.quantity  = 3;
        one.price = 760;
        one.location = "Noakhali";
        Node two = new Node();
        two.productName = "Pant";
        two.quantity  = 5;
        two.price = 2000;
        two.location = "Chittagong";
        Node three = new Node();
        three.productName = "Shue";
        three.quantity  = 6;
        three.price = 1000;
        three.location = "Dhaka";

        ara.add(one);
        ara.add(two);
        ara.add(three);

        Collections.sort(ara);

        for(Node i: ara) {
            System.out.println(i.toString());
        }

    }
}
class Node implements Comparable<Node> {
    public String productName, location;
    public int price, quantity;

    @Override
    public String toString() {
        return "Node{" +
                "productName='" + productName + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.price,o.price);
    }
}
