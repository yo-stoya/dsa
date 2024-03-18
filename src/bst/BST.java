package bst;

public class BST {
    private BSTNode root;

    public boolean insert(int value) {
        BSTNode newNode = new BSTNode(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        BSTNode temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        BSTNode temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return  true;
            }
        }
        return false;
    }

    public static class BSTNode {
        int value;
        BSTNode left;
        BSTNode right;

        public BSTNode(int value) {
            this.value = value;
        }
    }
}
