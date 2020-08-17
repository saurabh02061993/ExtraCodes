package LinkedList;

import LinkedList.LinkedList.Node;

public class RotateaLLright {
	static int listCount;

	Node head; // head of list

	public class Node {
		Node next;

		Object data;

		public Node(Object _data) {
			next = null;
			data = _data;
		}

		public Node(Object _data, Node _next) {
			next = _next;
			data = _data;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object _data) {
			data = _data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node _next) {
			next = _next;
		}
	}

	public void add(Object data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
        } else {
            Node current = head;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(temp);
        }
    }

	public void rotateRight() {
		System.out.println("->");
		if (head != null) { // otherwise it is empty list
			Node tail = null;
			Node current = head;

			while (current.getNext() != null) {
				tail = current;
				current = current.getNext();
			}
			if (tail != null) { // otherwise it is single item list
				tail.setNext(null);
				current.setNext(head);
				head = current;
			}
		}
	}
	 public void printList() {
	        Node cursor = head;
	        while (cursor != null) {
	            System.out.print(cursor.data + ", ");
	            cursor = cursor.getNext();
	        }
	        System.out.println();
	    }
	
	

	public static void main(String[] args) {

		RotateaLLright LL = new RotateaLLright();

		LL.add("1");
		LL.add("2");
		LL.add("3");
		LL.add("4");
		LL.add("4");
		LL.add("5");
		LL.rotateRight();
		LL.printList();
		LL.rotateRight();
		LL.printList();
		LL.rotateRight();
		LL.printList();

	}

}
