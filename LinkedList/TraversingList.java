package linkedList;

public class TraversingList {
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
		
		lengthOfList(node);
	}
	public static void lengthOfList(ListNode node){
		int length = 0;
		ListNode currentNode = node;
		while(currentNode != null){
			length++;
			currentNode = currentNode.getNext();
		}
		System.out.println(length);
	}
}
