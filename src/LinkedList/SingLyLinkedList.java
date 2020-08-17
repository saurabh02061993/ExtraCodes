package LinkedList;

//Author: Saurabh Gupta

public class SingLyLinkedList {
	Node head = null;

	public static class Node {

		int data;
		Node next;

		Node(int x) {
			data = x;

		}

	}

	public static SingLyLinkedList insert(SingLyLinkedList list, int data) {
		Node temp = new Node(data);
		temp.next = null;

		if (list.head == null) {
			list.head = temp;

		} else {

			Node last = list.head;
			while (last.next != null) {
				last = last.next;

			}
			last.next = temp;

		}

		return list;

	}

	public static void printList(SingLyLinkedList list) {

		Node currNode = list.head;
		while (currNode != null) {
			System.out.print(currNode.data + "  ");
			currNode = currNode.next;

		}

	}

	public static void main(String[] args) {
		SingLyLinkedList ll = new SingLyLinkedList();
		ll.insert(ll, 10);
		ll.insert(ll, 20);
		ll.insert(ll, 30);
		ll.insert(ll, 40);
		printList(ll);

	}

}
