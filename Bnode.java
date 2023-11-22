public class Bnode{

    String data;
    Bnode left, right;


    public Bnode(){

        this.data = "";
        this.left = null;
        this.right = null;


    }

        public Bnode(String val ){

        this.data = val;
        this.left = this.right=null;


        
    }

          public Bnode(String val,Bnode L, Bnode R ){

        this.data = val;
        this.left = L;
        this.right = R;
        

        
    }
}