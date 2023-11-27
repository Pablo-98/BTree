public class BST{
    Bnode root;


public BST() {
    root ==null;
}

public void add(int x){
    root = add(x, root);
}

private Bnode add(int x, Bnode root){
//when the current node is null , we reached a leaf node and we can insert the new node 
// in that position 

if (root == null){
return new Bnode(x)
}

//if the new nodes value is lower than a current node's, go to the left
if (x <root.value){
root.left = add(x, root.left);
}
//
else{
    root.right = add(x,root.right);
} 
return root;
}

private boolean contains (int target, Bnode root) {
if (root == null){
    return false;
}
if (target == root.value){
    return true ;
}
if (target<root.value){
    return contains(target, root.left);
}
// else{  return contains(target, root.rioght)}
if (target > root.value){
    return contains (target, root.right);
}
} 


  

}