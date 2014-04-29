public class Driver{

    public static void main( String[] args ){
	//Test Node
	Node l = new Node(1);
	Node r = new Node(3);
	Node n = new Node(2,l,r);
	System.out.println("Testing Node\n");
	System.out.println(n.getData());
	System.out.println(n.getLeft().getData());
	System.out.println(n.getRight().getData());
	System.out.println("\nExpected: 2,1,3");
	
	//Test BST
        BST pine = new BST(50);
	System.out.println("\nTesting BST\n");
        pine.insert(new Node(45));
	pine.insert(new Node(55));
	pine.insert(new Node(25));
	pine.insert(new Node(75));
	pine.insert(new Node(5));
	pine.insert(new Node(95));
	System.out.println(pine.search(95).getData());
	System.out.println(pine.search(95).getData());
	System.out.println("\nExpected: 95,95");
	
    }

}
