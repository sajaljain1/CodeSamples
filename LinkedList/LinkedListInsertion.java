package linkedList;

public class LinkedListInsertion {
	public static void main(String[] args) {
		ListNode node = new ListNode();
		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();

		node.setData(10);;
		node.setNext(node1);
		node1.setData(20);;
		node1.setNext(node2);
		node2.setData(5);;
		node2.setNext(null);

		ListNode node3 = new ListNode();
		node3.setData(25);
		node3.setNext(null);
		
		ListNode head = new ListNode();
//		head = insertionStart(node, node3);
//		System.out.println(head.getNext().getData());
		
//		head = insertionEnd(node, node3);
//		System.out.println(head.getNext().getNext().getNext().getData());
		
		
		
	}
	public static ListNode insertionStart(ListNode head,ListNode newNode){
		newNode.setNext(head);
		head = newNode;
		return head;
	}
	public static ListNode insertionEnd(ListNode head,ListNode newNode){
		ListNode new1 = head;
		while(new1.getNext() != null){
			new1 = new1.getNext();
		}
		new1.setNext(newNode);
		//newNode.setNext(null);
		return head;
	}
	public static void insertionMiddle(ListNode head,ListNode newNode){
		
	}

}
