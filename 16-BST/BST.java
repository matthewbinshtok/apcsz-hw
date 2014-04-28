public class BST {
    private Node root;

    public BST() {
        root = null;
    }

    public BST( int r ){
	root = new Node(r);
    }

    public void insert( Node x ) {
	Node piggy = root;
	Node carry = root;
	while ( carry != null ) {
	    piggy = carry;

	    if (x.getData() > carry.getData())
		carry = carry.getRight();
	    else
		carry = carry.getLeft();

	}
	//Points to inserted node. Forgot to put it in originally.
        if (x.getData() > piggy.getData())
	    piggy.setRight(x);
	else
	    piggy.setLeft(x);
    }

    public Node search( int i ){
	Node n = root;
	while ( n != null ){
	    if ( n.getData() == i )
		return n;
	    else if ( n.getData() < i )
		n = n.getRight(); 
	    else
		n = n.getLeft();
	}
	return null;
    }

    public Node search2( Node c, int x ){
	if ( c == null )
	    return null;
	else if ( c.getData() == x )
	    return c;
	else if ( c.getData() < x )
	    c = c.getRight(); 
	else
	    c = c.getLeft();
	return search2(c,x);
    }


}
