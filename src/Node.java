
public class Node<E> {
	public E dataValue;
	Node<E> nextNode;
	public Node next;

	/**
	 * constructor sets dataValue.
	 * 
	 * @param dataValue
	 */
	public Node(E dataValue) {
		this.dataValue = dataValue;
	}

	/**
	 * constructor sets dataValue and calls setNext(nextNode).
	 * 
	 * @param dataValue
	 * @param nextNode
	 */
	public Node(E dataValue, Node<E> nextNode) {
		this.dataValue = dataValue;
		setNext(nextNode);
	}

	/**
	 * Returns the data stored in this node.
	 * 
	 * @return E
	 */
	public E getData() {
		return dataValue;
	}

	/**
	 * Returns the node next to this node.
	 * 
	 * @return Node
	 */
	public Node getNext() {
		return nextNode;
	}

	/**
	 * Sets node received as the next node to this node.
	 * 
	 * @param next
	 */
	public void setNext(Node next) {
		nextNode = next;
	}

	/**
	 * Prints node's dataValue
	 * 
	 */

	public void printNode() {
		System.out.print(dataValue + " ");
	}

}