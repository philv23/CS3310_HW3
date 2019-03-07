
public class LinkedList<E> {

	public String value;
	public Node next;
	public Node head;
	public Node tail;

	/**
	 * Inserts Node at beginning of list
	 * 
	 * @param Node n
	 */

	public void insertFirst(E data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	/**
	 * Inserts Node at end of list
	 * 
	 * @param Node n
	 */

	public void insertLast(E data) {
		Node n = new Node(data);
		if (isEmpty()) {
			n.next = head;
			head = n;
			tail = n;
		} else {
			tail.next = n;
			tail = n;
			tail.next = null;
		}
	}

	/**
	 * Deletes first Node in list
	 * 
	 * @param Node n
	 */

	public Node deleteFirst() {
		Node temp = head;
		if (head != null) {
			head = head.next;
		}
		return temp;
	}

	/**
	 * get the object in specific position in the LinkedList used to print the
	 * enrolled student contents inside the Course class and return the name.
	 * 
	 * @param position
	 * @return E
	 */
	public E get(int position) {
		Node head1 = head;

		for (int i = 0; i < position; i++) {
			head1 = head1.next;

		}
		return (E) head1.getData();

	}

	/**
	 * Return number of elements in the list.
	 * 
	 * @return integer
	 */
	public int size() {
		Node head1 = head;
		int i = 0;

		while (head1 != null) {
			head1 = head1.next;
			i++;
		}

		return i;
	}

	public void printList() {
		Node g = head;
		while (g != null) {
			g.printNode();
			g = g.next;
		}

		System.out.println("");
	}

	/**
	 * Checks if the list is empty.
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
}