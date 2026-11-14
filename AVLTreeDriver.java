
public class AVLTreeDriver {
    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        // Insert test values
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        // Additional insertions to test rotations
        tree.insert(5);
        tree.insert(4);
        tree.insert(8);
        tree.insert(25);

        // Print traversals
        System.out.print("Inorder: ");
        tree.inorder();

        System.out.print("Preorder: ");
        tree.preorder();

        System.out.print("Postorder: ");
        tree.postorder();

        // Expected results:
        // Inorder: 4 5 8 10 20 25 30
        // Preorder: 10 5 4 8 25 20 30
        // Postorder: 4 8 5 20 30 25 10
    }
}
