public class Node<E> {
	private E data;
	Node<E> left, right;
	
	public Node (){                                                                                                    //Default Constructor
		left=null;
		right=null;
		data=null;
	}
	
	public Node (E data){
		this.data=data;
		left=null;
		right=null;
	}
	
	public E getData(){                                                                                                 //Gets the data from the node
		return data;
	}
	
	public void setData(E data){                                                                                        //Asigns the value to the variable data
		this.data = data;
	}
	
	public Node<E> getLeft(){                                                                                          //Gets next node value
		return left;
	}
	
	public void setLeft(Node<E> node){                                                                                 //Sets next node value
		this.left = node;
	}
	
	public Node<E> getRight(){                                                                                          //Gets previous node value
		return right;
	}
	
	public void setRight(Node<E> node){                                                                                 //Sets previous node value
		this.right = node;
	}
	
}
