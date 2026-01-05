class Node{
int data;
Node left,right;
Node(int data){
this.data = data;
this.left = null;
this.right = null;
}
}
class Tree{
static int index = -1;
Node buildTree(int nodes[]){
index++;
if(nodes[index]==-1)
return null;
Node node = new Node(nodes[index]);
node.left = buildTree(nodes);
node.right = buildTree(nodes);
return node;
}
}

class TestTree{
public static void main(String ...args){
int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
Tree t = new Tree();
Node root = t.buildTree(nodes);
System.out.println(root.data);

System.out.print(root.left.data+" "+root.right.data+"\n");

System.out.print(root.left.left.data+" "+root.left.right.data+" "+root.right.left.data+" "+root.right.right.data+"\n");

/*
1
2 3
4 5 6 7
*/
}
}