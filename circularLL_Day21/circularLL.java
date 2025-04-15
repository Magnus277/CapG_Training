package circularLL_Day21;

public class circularLL {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			node.next = node;
			node.previous = node;
		} else {
			node.previous = tail;
			node.next = head;
			tail.next = node;
			head.previous = node;
			tail = node;
		}
		count++;
	}

	public void displayForward() {
		if (head == null) {
			System.out.println("No data to display");
			return;
		}
		Node current = head;
		do {
			System.out.print(current.data + " ");
			current = current.next;
		} while (current != head);
		System.out.println();
	}

	public void displayBackward() {
		if (tail == null) {
			System.out.println("No data to display");
			return;
		}
		Node current = tail;
		do {
			System.out.print(current.data + " ");
			current = current.previous;
		} while (current != tail);
		System.out.println();
	}

	public void update(int position, int data) {
		if (head == null || position < 1 || position > count) {
			System.out.println("Invalid position");
			return;
		}
		Node current = head;
		for (int i = 1; i < position; i++) {
			current = current.next;
		}
		current.data = data;
	}

	public void insertAt(int position, int data) {
		if (position < 1 || position > count + 1) {
			System.out.println("Position out of bounds");
			return;
		}
		Node node = new Node(data);
		if (head == null || position == count + 1) {
			insert(data);
			return;
		}
		if (position == 1) {
			node.next = head;
			node.previous = tail;
			head.previous = node;
			tail.next = node;
			head = node;
		} else {
			Node current = head;
			for (int i = 1; i < position - 1; i++) {
				current = current.next;
			}
			node.next = current.next;
			node.previous = current;
			current.next.previous = node;
			current.next = node;
		}
		count++;
	}

	public void delete(int position) {
		if (head == null || position < 1 || position > count) {
			System.out.println("Invalid position");
			return;
		}
		if (count == 1) {
			head = null;
			tail = null;
		} else if (position == 1) {
			head = head.next;
			head.previous = tail;
			tail.next = head;
		} else if (position == count) {
			tail = tail.previous;
			tail.next = head;
			head.previous = tail;
		} else {
			Node current = head;
			for (int i = 1; i < position; i++) {
				current = current.next;
			}
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		count--;
	}
}

