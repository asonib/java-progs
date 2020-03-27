class binary_search_tree{
    class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            right = null;
            left = null;
        }
    }
    Node createNewNode(int data){
        Node newNode = new Node(data);
        return newNode;
    }
    Node insertNode(Node root, int data){
        if(root == null){
            root = createNewNode(data);
        }
        else if(data < root.data){
            root.left = insertNode(root.left, data);
        }
        else if(data > root.data){
            root.right = insertNode(root.right, data);
        }
        return root;


    }
    void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        Node root = null;
        binary_search_tree tree = new binary_search_tree();
        root  = tree.insertNode(root, 10);
        root  = tree.insertNode(root, 5);
        root  = tree.insertNode(root, 15);
        root  = tree.insertNode(root, 25);
        root  = tree.insertNode(root, 7);
        
        tree.preOrder(root);
        System.out.println();

        // tree.inOrder(root);
        // System.out.println();

        // tree.postOrder(root);
        // System.out.println();
    }
}