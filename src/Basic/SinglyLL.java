package Basic;

public class SinglyLL {

	static Node head = null;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}

	}

	static void print(Node head1) {

		Node temp = head1;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static void revLL(Node head2) {

		Node curr = head2;
		Node prev = null, next = null;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		head2 = prev;
		print(prev);

	}

	static void addNode(Node sl, int node) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		Node new_node = new Node(node);
		temp.next = new_node;
		print(head);

	}

	public static void main(String[] args) {

		SinglyLL ll = new SinglyLL();
		ll.head = new Node(10);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(30);
		ll.head.next.next.next = new Node(40);
		ll.head.next.next.next.next = new Node(50);

		print(head);
		System.out.println();
		System.out.println("\nadded one new node\n");
		addNode(head, 1000);
		System.out.println("\nReversed link list is : ");
		revLL(head);
		

	}

}
