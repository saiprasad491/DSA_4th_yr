import java.util.Queue;
import java.util.LinkedList;

class Node{
int data;
Node left,right;
Node(int data){
this.data = data;
this.left = null;
this.right = null;
}
}

class BT{
static int index = -1;

Node buildBT(int[] nodes){
index ++;
if(nodes[index] == -1){
return null;
}
Node node = new Node(nodes[index]);
node.left = buildBT(nodes);
node.right = buildBT(nodes);
return node;
}

static void inOrder(Node node){
if(node == null)
return;
inOrder(node.left);
System.out.print(node.data+" ");
inOrder(node.right);
}

static void preOrder(Node node){
if(node == null)
return;
System.out.print(node.data+" ");
preOrder(node.left);
preOrder(node.right);
}

static void postOrder(Node node){
if(node == null)
return;
postOrder(node.left);
postOrder(node.right);
System.out.print(node.data+" ");
}

static void levelOrder(Node node){
if(node == null)
return;
Queue<Node> q = new LinkedList<Node>();
q.add(node);
q.add(null);
while(!q.isEmpty()){
node = q.remove();
if(node == null)
{
System.out.println();
if(q.isEmpty())
	break;
else
	q.add(null);
}
else{
System.out.print(node.data+" ");
if(node.left!=null)
q.add(node.left);
if(node.right != null)
q.add(node.right);
}

}
}

}
class TestBT
{
public static void main(String ...args){
BT obj = new BT();
int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};	//pre-order
Node root = obj.buildBT(nodes);
System.out.println(root.data);	//1
obj.inOrder(root);	//4 2 5 1 3 6
System.out.println();
obj.preOrder(root);	//1 2 4 5 3 6
System.out.println();
obj.postOrder(root);	//4 5 2 6 3 1
System.out.println();
obj.levelOrder(root);
/*
1
2 3
4 5 6
*/

}
}