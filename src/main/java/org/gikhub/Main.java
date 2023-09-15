package org.gikhub;

public class Main {
    public static void main(String[] args) {

        // BINARY TREE
        //              5
        //        2              4
        //    9       10      7

        Node btRootNode = new Node();
        btRootNode.data = 5;
        Node btNode2 = new Node();
        btNode2.data = 2;
        Node btNode4 = new Node();
        btNode4.data = 4;
        Node btNode9 = new Node();
        btNode9.data = 9;
        Node btNode10 = new Node();
        btNode10.data = 10;
        Node btNode7 = new Node();
        btNode7.data = 7;

        btRootNode.left = btNode2;
        btRootNode.right = btNode4;
        btNode2.left = btNode9;
        btNode2.right = btNode10;
        btNode4.left = btNode7;

        BinaryTree bTree = new BinaryTree();
        bTree.root = btRootNode;

//        bTree.inOrderTraversal();
//        System.out.println();

//        BINARY SEARCH TREE
        Node rootNode = new Node();
        rootNode.data = 2;

        BinarySearchTree bsTree = new BinarySearchTree();

        bsTree.root = rootNode;

        bsTree.insert(1);
        bsTree.insert(3);
        bsTree.insert(4);

        System.out.println(bsTree.contains(1));
        System.out.println(bsTree.contains(5));
        System.out.println(bsTree.contains(4));
    }
}