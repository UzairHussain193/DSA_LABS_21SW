

class Task2_Alphabetic_Tree {
    static class BinaryTree {
        int key2;
        BinaryTree left, right;
    
        public BinaryTree(int item) {
            key2 = item;
            left = right = null;
        }
    }
    static BinaryTree root2;

    Task2_Alphabetic_Tree() {
        root2 = null;
    }
    public static int size(BinaryTree root2){
        if (root2 == null){
            return 0;
        }
        int leftNodes=size(root2.left);
        int rightNodes=size(root2.right);
      
        return (leftNodes + 1 + rightNodes);    // adding +1 of root
    }
    public int height(BinaryTree root2){
        if(root2==null){
            return 0;
        }
        int leftsize=0;
        int rightsize=0;
        BinaryTree temp=root2;

        while(root2.left!=null){
            leftsize++;
            root2=root2.left;
        }while(temp.right!=null){
            rightsize++;
            temp=temp.right;
        }
        return Math.max(leftsize,rightsize);
    }
    // public int height(BinaryTree root2) {
    //     if (root2 == null) {
    //         return -1;
    //     }

    //     int leftHeight = height(root2.left);
    //     int rightHeight = height(root2.right);

    //     if (leftHeight > rightHeight) {
    //         return leftHeight + 1;
    //     } else {
    //         return rightHeight + 1;
    //     }
    // }
    void insert(int key) {
        root2 = insertRec(root2, key);
    }

    BinaryTree insertRec(BinaryTree root, int key) {
        if (root == null) {
            root = new BinaryTree(key);
            return root;
        }

        if (key < root.key2)
            root.left = insertRec(root.left, key);
        else if (key > root.key2)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root2);
    }

    void inorderRec(BinaryTree root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print((char)root.key2 + " , ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root2);
    }

    void preorderRec(BinaryTree root) {
        if (root != null) {
            System.out.print((char)root.key2 + " , ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root2);
    }

    void postorderRec(BinaryTree root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print((char)root.key2 + " , ");
        }
    }
    public boolean isFull(BinaryTree root){
        int nodes=1;
        int power=height(root)+1;
        Math.pow(nodes, power);
        nodes--;
        if(size(root)==nodes){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Task2_Alphabetic_Tree tree2 = new Task2_Alphabetic_Tree();

        char[] keys2 = {'A','B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'};
        for (int key : keys2) {
            tree2.insert((int)key);
        }

        System.out.println("\n\t\t *****   Alphabetic Binary Tree   *******\n\n");
        System.out.println("Size of tree is : "+ tree2.size(root2));
        System.out.println("Height of tree is : "+ tree2.height(tree2.root2));
        System.out.println("Is Full status of tree is : "+tree2.isFull(root2));

        System.out.print("Inorder traversal: ");
        tree2.inorder();

        System.out.print("\nPreorder traversal: ");
        tree2.preorder();

        System.out.print("\nPostorder traversal: ");
        tree2.postorder();
        System.out.println("\n\n");


    }
}
