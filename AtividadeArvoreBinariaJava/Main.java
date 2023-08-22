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

        // Mostrar o caminho para as alas desejadas
        System.out.println("Path to Alas:");
        printPathToAla(t, 58);
        printPathToAla(t, 31);
        printPathToAla(t, 42);
        printPathToAla(t, 36);

        System.out.println("Depth: ");
        t.depth();

        System.out.println("Contains: ");
        t.contains(4);
    }

    // Função para mostrar o caminho até uma ala desejada
    public static boolean printPathToAla(BTree<Integer> tree, int target) {
        if (tree == null) {
            return false;
        }

        // Realiza uma busca em profundidade para encontrar o caminho até a ala desejada
        if (tree.getData() == target || printPathToAla(tree.getLeft(), target) || printPathToAla(tree.getRight(), target)) {
            System.out.print(tree.getData() + " ");
            return true;
        }

        return false;
    }
}
