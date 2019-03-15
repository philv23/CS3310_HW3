public class Stack<E> {

	LinkedList list = new LinkedList();

	int tempMax = 0;

	LinkedList max = new LinkedList();

	/**
	 * Adds new Node to top of stack
	 * 
	 */

	public void push(E data) {
		list.insertFirst(data);

		if (max.isEmpty() || max.size() == 1) {
			tempMax = 0;
		}

		if (data instanceof Integer) {

			int data1 = (Integer) data;

			if (data1 > tempMax) {
				tempMax = data1;

			}
			max.insertFirst(tempMax);

		}
	}

	/**
	 * Removes Node from top of stack returns removed Node
	 * 
	 * @return list.deleteFirst()
	 * 
	 */

	public Node pop() {
		max.deleteFirst();
		return list.deleteFirst();
	}

	/**
	 * Prints elements contained in Stack
	 * 
	 */

	public void printStack() {
		list.printList();
	}

	/**
	 * Returns whether stack is empty
	 * 
	 * @return list.isEmpty()
	 */

	public boolean isEmpty() {

		return list.isEmpty();
	}

	/**
	 * Return number of elements in the stack
	 * 
	 * @return list.size()
	 */

	public int size() {
		return list.size();
	}

	/**
	 * Returns largest value contained in stack
	 * 
	 * @return max.head.getData().toString()
	 */

	public String getMax() {

		if (!max.isEmpty()) {
			return max.head.getData().toString();
		} else {
			return "Data is not Integers";
		}

	}
}
