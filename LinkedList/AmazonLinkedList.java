package linkedList;

public class AmazonLinkedList {
	public static void main(String[] args) {
		ListNode node = new ListNode();
		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();

		node.setData(1);

		node.setNext(node1);
		node1.setData(2);

		node1.setNext(node2);
		node2.setData(7);

		node2.setNext(node);

		// value = 6;
		ListNode node3 = sortedInsert(node, 6);
		System.out.println(node3.getData());
		System.out.println(node3.getNext().getData());
		System.out.println(node3.getNext().getNext().getData());
		System.out.println(node3.getNext().getNext().getNext().getData());
		System.out.println(node3.getNext().getNext().getNext().getNext()
				.getData());

	}

	public static ListNode sortedInsert(ListNode node, int value) {
		ListNode newNode = new ListNode();
		newNode.setData(value);
		newNode.setNext(null);
		ListNode head = node;
		if (head.getData() > newNode.getData()) {
			while ((head.getData() > newNode.getData())
					|| head.getNext() != node) {
				head = head.getNext();
			}
			newNode.setNext(head.getNext());
			head.setNext(newNode);
			return newNode;
		}
		ListNode current = new ListNode();
		if (head.getData() < newNode.getData()) {
			while ((head.getData() < newNode.getData())
					&& head.getNext() == node) {
				current = head;
				head = head.getNext();
				
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			return newNode;
		}

		return null;

	}
}
