public class Node {
    private int data;
    private Node left,right;

    public Node( int d ){
	data = d;
    }

    public Node( int d, Node l, Node r ){
	data = d;
	left = l;
	right = r;
    }

    public int getData(){
	return data;
    }
    
    public void setData( int s ){
	data = s;
    }

    public Node getLeft(){
	return left;
    }

    public void setLeft( Node l ){
        left = l;
    }

    public Node getRight(){
	return right;
    }

    public void setRight( Node r ){
        right = r;
    }
}
