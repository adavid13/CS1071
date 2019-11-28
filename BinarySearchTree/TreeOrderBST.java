class Node {
	int ID;
	int Data;
	Node Parent;
	Node Left;
	Node Right;
	public Node(int val) {
		ID+=1;
		Data = val;
		Left = Right = Parent = null;
	}
}
	
public class TreeOrderBST {
	
	Node root;
	
	TreeOrderBST() {
		root = null;
	}
	
	Node insert_recurs(Node root, int val) {
		if(root==null) {
			root = new Node(val);
			return root;
		}
		if(val<=root.Data) {
			root.Left=insert_recurs(root.Left, val);
		}else if(val>root.Data){
			root.Right=insert_recurs(root.Right, val);
		}
		return root;
	}
	
	void insert(int val) {
		root = insert_recurs(root, val);
	}
	
	void preOrder() {
		rec_preOrder(root);
	}
	
	void inOrder() {
		rec_inOrder(root);
	}
	
	void postOrder() {
		rec_postOrder(root);
	}
	
	void rec_preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.Data+" ");
			rec_preOrder(root.Left);
			rec_preOrder(root.Right);
		}
	}

	void rec_inOrder(Node root) {
		if(root!=null) {
			rec_inOrder(root.Left);
			System.out.print(root.Data+" ");
			rec_inOrder(root.Right);
		}
	}
	
	void rec_postOrder(Node root) {
		if(root!=null) {
			rec_postOrder(root.Left);
			rec_postOrder(root.Right);
			System.out.print(root.Data+" ");
		}
	}
	
	public static void main(String[] args) {
		TreeOrderBST tree = new TreeOrderBST();
		int []elements = {12, 10, 19, 13, 15, 14, 18};
		for(int i=0; i<7; i++) {
			tree.insert(elements[i]);
		}
		System.out.print("\nPretOrder traversal: ");
		tree.preOrder();
		System.out.print("\nInOrder traversal: ");
		tree.inOrder();
		System.out.print("\nPostOrder traversal: ");
		tree.postOrder();
	}
}

