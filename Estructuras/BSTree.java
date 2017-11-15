public class BSTree<E> {
	
	private Node<E> root;
	
	public BSTree(){
		root = null;	
	}
	
	public boolean isEmpty(){
		return root==null;	
	}
	
	public void insert(E data)
	{
		root = insert(root, data);
	}
	
	private Node<E> insert(Node<E> node, E data){	
		if (node==null){
			node = new Node<E>(data);
		}
		else{
			if (node.getLeft()== null){
				node.left = insert(node.left, data);
			}
			else{
				node.right = insert(node.right, data);
			}
		}
		return node;
	}
	
	public int countNodes(){
		return countNodes(root);
	}
	
	public int countNodes(Node<E> r){
		if (r ==null){
			return 0;
		}
		else{
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}
	
	public boolean search(E val){
		return search(root, val);
	}
	
	private boolean search(Node<E> r, E val ){
		if (r.getData()==val){
			return true;
		}
		if (r.getLeft() != null){
			if (search(r.getLeft(), val)){
				return true;
			}
		}
		if (r.getRight() != null){
			if (search(r.getRight(), val)){
				return true;
			}
		}
		return false;
	}
	
    /* Function for in-order traversal */
	public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node<E> r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }
    /* Function for pre-order traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node<E> r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    /* Function for post-order traversal */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node<E> r)
    {
        if (r != null)
        {
            postorder(r.getLeft());             
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }     
	

}
