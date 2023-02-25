

class Task1_Numeric_Tree {
    static class BinaryTree {
        int key;
        BinaryTree left, right;
    
        public BinaryTree(int item) {
            key = item;
            left = right = null;
        }
    }
    static BinaryTree root;

    Task1_Numeric_Tree() {
        root = null;
    }
    public static int size(BinaryTree root){
        if (root == null){
            return 0;
        }
        int leftNodes=size(root.left);
        int rightNodes=size(root.right);
      
        return (leftNodes + 1 + rightNodes);    // adding +1 of root
    }
    public int height(BinaryTree root){
        if(root==null){
            return 0;
        }
        int leftsize=0;
        int rightsize=0;
        BinaryTree temp=root;

        while(root.left!=null){
            leftsize++;
            root=root.left;
        }while(temp.right!=null){
            rightsize++;
            temp=temp.right;
        }
        return Math.max(leftsize,rightsize);
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    BinaryTree insertRec(BinaryTree root, int key) {
        if (root == null) {
            root = new BinaryTree(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(BinaryTree root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " , ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root);
    }

    void preorderRec(BinaryTree root) {
        if (root != null) {
            System.out.print(root.key + " , ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root);
    }

    void postorderRec(BinaryTree root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " , ");
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
        Task1_Numeric_Tree tree1 = new Task1_Numeric_Tree();

        int[] keys = {6, 8, 22, 3, 7, 5, 12, 10, 9, 20, 35, 40, 42};
        for (int key : keys) {
            tree1.insert(key);
        }

        System.out.println("\n\t\t *****   Numeric Binary Tree   *******\n\n");
        System.out.println("Size of tree is : "+ tree1.size(root));
        System.out.println("Height of tree is : "+ tree1.height(root));
        System.out.println("Is Full status of tree is : "+tree1.isFull(root));

        System.out.print("Inorder traversal: ");
        tree1.inorder();

        System.out.print("\nPreorder traversal: ");
        tree1.preorder();

        System.out.print("\nPostorder traversal: ");
        tree1.postorder();
        System.out.println("\n\n\n");


    }
}
