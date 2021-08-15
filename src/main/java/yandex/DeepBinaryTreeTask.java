package yandex;

public class DeepBinaryTreeTask {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        DeepBinaryTreeTask task = new DeepBinaryTreeTask();
        Node root = getDefaultTree();
        Node deepest = task.getDeepestNode(root);
        System.out.println(deepest.val);
    }

    private static Node getDefaultTree() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.left.right.left = new Node(9);
        return root;
    }

    private Node deepest;
    private int max;

    public Node getDeepestNode(Node root) {
        getDeepestNodeWithCounter(root, 0);
        return deepest;

    }

    private void getDeepestNodeWithCounter(Node root, int counter) {

        if (root != null) {
            getDeepestNodeWithCounter(root.left, ++counter);

            if (counter > max) {
                max = counter;
                deepest = root;
            }
            getDeepestNodeWithCounter(root.right, counter);
        }
    }
}
