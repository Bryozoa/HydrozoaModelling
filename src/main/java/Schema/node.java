package Schema;

import java.util.ArrayList;

class Node {
    public ArrayList<Item> Items;
    public ArrayList<Node> Children = new ArrayList<Node>();

    public Node(ArrayList<Item> items) {
        this.Items = items;
    }
}