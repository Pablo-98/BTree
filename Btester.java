public class Btester extends Bnode{

    public static void main(String[] args){
System.out.println("hi");



        Bnode a = new Bnode ("start");
       Bnode b = new Bnode ("yo");
       Bnode c = new Bnode ("ho");
       Bnode d = new Bnode ("cho");
       Bnode e = new Bnode ("go");
       Bnode f = new Bnode ("fo");
       Bnode g = new Bnode ("yo");
       Bnode h = new Bnode ("yo");
       Bnode i = new Bnode ("yo");
       Bnode j = new Bnode ("yo");
       Bnode k = new Bnode ("yo");
       Bnode l = new Bnode ("yo");

       // connect A to itsch children b and c
       a.left = b;
       a.right = c;

       //connect b t o its child, D

       b.left = d;

       // connect c to child
       c.left = e;
       c.right = f;

       //connect d to its children
       d.right = g; 

       //connect e to h and i 
       e.left =h;
       e.right = i;

       //connect i to child 

       i.left = k;

       //connect f to child 
       f.right = j;




//pre order call
//preOrder(a);

//In order call
//InOrder(a);

//post order call
postOrder(a);


    }
//pre order 
    public static void preOrder(Bnode root){
        if(root!= null){

            System.out.println(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }


    }

    public static void InOrder(Bnode root){
        if (root!=null){
            InOrder(root.left);
            System.out.println(root.data);
            InOrder(root.right);
        }
    }

    public static void postOrder(Bnode root){

        if(root!=null){

            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }


}