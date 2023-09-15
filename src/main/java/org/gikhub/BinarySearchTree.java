package org.gikhub;

public class BinarySearchTree {
    Node root;
    public void insert(int value) {
        insert(this.root, value);
    }

    private Node insert(Node root, int value) {
        if(root == null) {
            root = new Node();
            root.data = value;
        } else if (value < root.data) {
            // insert the value to the left
            root.left = insert(root.left, value);

        } else if(value > root.data) {
            // insert the value to the right
            root.right = insert(root.right, value);
        }
        // do nothing if the value == root.data - no need to insert it
        return root;
    }
}
