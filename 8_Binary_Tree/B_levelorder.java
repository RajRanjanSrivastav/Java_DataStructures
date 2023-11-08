import java.util.LinkedList;
import java.util.Queue;
public class B_levelorder {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class Binarytree
    {
        static int idx = -1;
        public Node buildTree(int nodes[]) {
            idx++;
            if( idx>=nodes.length)
            {
                return null;
            }
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
            
      
        public void levelOrder(Node root)
        {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                Node curn = q.remove();
                if(curn==null)
                {
                    System.out.println();
                    if(q.isEmpty()) break;
                    else{
                        q.add(null);
                    } 
                }
                else{
                    System.out.print(curn.data+" ");
                    if(curn.left!=null)
                    {
                        q.add(curn.left);
                    }
                    if(curn.right!=null)
                    {
                        q.add(curn.right);
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int Nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6};

        Binarytree bt = new Binarytree();
        Node root = bt.buildTree(Nodes);

        bt.levelOrder(root);
       
        
    }


}
