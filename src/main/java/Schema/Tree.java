package Schema;

import java.util.ArrayList;

import static java.lang.System.in;

class Tree {
    public Node Root;
    public Tree() {
        this.Root = new Node();
    }
    public void Build(ArrayList<Item> items) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        foreach (Item Item in items) {
            ArrayList<Item> items = new ArrayList<item>();
            items.Add(item);
            nodes.Add(new Node(items));
        }

        this.Filter(this.Root, nodes);
    }

    public void Filter(Node node, ArrayList<Node> candidates) {
        foreach (Node candidate in nodes) {
            if(this.PassCondition(candidate)) {
                node.Children.Add(candidate);
                this.Filter(candidate, this.Permutations(candidates));
            }
        }
    }

    public bool PassesCondition(Node node) {
        // check your supports here? do you need any other information other than the single node?
    }

    public List<Node> Permutations(Node node, ArrayList<Node> candidates) {
        ArrayList<Node> nodes = new ArrayList<Node>();
        for (int index = candidates.indexOf(node) + 1; index < candidates.Count(); index++) {
            nodes.Add(new Node(node.Items.Union(candidates[index].Items));
        }
    }
}
