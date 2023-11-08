
public class A_preorder {

    static class Node 
    {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        public void printTree(Node root)
        {
            //base case
            if(root==null)
            {
                // System.out.print("-1"+" ");
                return ;
            }

            System.out.print(root.data+" ");
            printTree(root.left);
            printTree(root.right);

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Binarytree bt = new Binarytree();
        Node root = bt.buildTree(nodes);
        System.out.println(root.data);

        bt.printTree(root);
    }
}
