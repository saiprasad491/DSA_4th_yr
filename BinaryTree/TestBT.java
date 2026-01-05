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
Node root;
BT(){
root = null;
}

void preOrder(Node node){
if(node == null){
return ;
}
System.out.print(node.data+" ");
preOrder(node.left);
preOrder(node.right);
}

void postOrder(Node node){
if(node == null){
return;
}
postOrder(node.left);
postOrder(node.right);
System.out.print(node.data+" ");
}

void inOrder(Node node){
if(node == null){
return;
}
inOrder(node.left);
System.out.print(node.data+" ");
inOrder(node.right);
}

void levelOrder(Queue<Node> q){

while(!q.isEmpty()){
Node node = q.poll();
if(node != null){
System.out.print(node.data+" ");
if(node.left!=null)
q.offer(node.left);
if(node.right!=null)
q.offer(node.right);
}
else if(node == null)
q.offer(q.poll());
System.out.println();
}

}

}

class TestBT{
public static void main(String ...args){
BT obj = new BT();
obj.root = new Node(1);
obj.root.left = new Node(2);
obj.root.right = new Node(3);

obj.root.left.left = new Node(4);
obj.root.left.right = new Node(5);
obj.root.right.left = new Node(6);
obj.root.right.right = new Node(7);

System.out.print("Pre order traversal : ");
obj.preOrder(obj.root);
System.out.println();

System.out.print("Post order traversal : ");
obj.postOrder(obj.root);
System.out.println();

System.out.print("In order traversal : ");
obj.inOrder(obj.root);
System.out.println();

System.out.println("Level order traversal : ");
Queue<Node> q = new LinkedList<Node>();
q.offer(obj.root);
q.offer(null);
obj.levelOrder(q);

}
}