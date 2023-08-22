import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Path to Node: 58 31 25 N 12 N N 42 N 36 N N 90 N 62 N 75 N N

        Scanner scan = new Scanner(System.in);

        BTree<Integer> t = LibTree.readIntTree(scan); // Instanciar a árvore

        System.out.println("Preorder Traversal:");
        t.printPreOrder();

        System.out.println("Inorder Traversal:");
        t.printInOrder();

        System.out.println("Postorder Traversal:");
        t.printPostOrder();

        System.out.println("Depth-First Traversal:");
        t.printDFS();

        System.out.println("Breadth-First Traversal:");
        t.printBFS();

        System.out.println("Path to Alas:");
        if (printPathToAla(t.getRoot(), 58)) {
            System.out.println();
        }
        if (printPathToAla(t.getRoot(), 31)) {
            System.out.println();
        }
        if (printPathToAla(t.getRoot(), 42)) {
            System.out.println();
        }
        if (printPathToAla(t.getRoot(), 36)) {
            System.out.println();
        }

        System.out.println("Depth: " + t.depth());

        System.out.println("Contains: " + t.contains(4));
    }

        private static <T> boolean printPathToAla(BTNode<T> node, T target) {
                if (node == null) {
                    return false;
                }
        
                if (node.getValue().equals(target)) {
                    System.out.print(node.getValue() + " ");
                    return true;
                }
        
                if (printPathToAla(node.getLeft(), target) || printPathToAla(node.getRight(), target)) {
                    System.out.print(node.getValue() + " ");
                    return true;
                }
        
                return false;
            }
}
