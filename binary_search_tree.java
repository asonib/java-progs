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
    void search(Node root, int val){
        if(root == null){
            System.out.println("Tree Empty");
            return;
        }
        else if(root.data == val){
            System.out.println("Value Found in the tree");
        }
        else if(root.data > val){
            search(root.left, val);
        }
        else if(root.data < val){
            search(root.right, val);
        }

    }
    void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void inOrder(Node root){
        if(root == null){
            return;
        }
        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }
    void postOrder(Node root){
        if(root == null){
            return;
        }
        preOrder(root.right);
        System.out.print(root.data+" ");
        preOrder(root.left);
    }
    public static void main(String args[]){
        Node root = null;
        binary_search_tree tree = new binary_search_tree();
        root  = tree.insertNode(root, 10);
        root  = tree.insertNode(root, 5);
        root  = tree.insertNode(root, 15);
        root  = tree.insertNode(root, 25);
        root  = tree.insertNode(root, 7);
        
        //print Pre Order
        tree.preOrder(root);
        System.out.println();
        //print In Order
        tree.inOrder(root);
        System.out.println();
        //print Post Order
        tree.postOrder(root);
        System.out.println();

        //searching for value
        int val1 = 51;
        tree.search(root, val1);
        //searching for value
        int val2 = 7;
        tree.search(root, val2);
    }
}