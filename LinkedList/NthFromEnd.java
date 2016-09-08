package linkedList;

public class NthFromEnd {
	public static void main(String[] args) {
		ListNode node = new ListNode();
		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();
		ListNode node3 = new ListNode();
		ListNode node4 = new ListNode();
		ListNode node5 = new ListNode();
		ListNode node6 = new ListNode();
		ListNode node7 = new ListNode();
		ListNode node8 = new ListNode();
		ListNode node9 = new ListNode();

		ListNode iter = node;
		node.setData(1);
		node.setNext(node1);
		node1.setData(2);
		node1.setNext(node2);
		node2.setData(3);
		node2.setNext(node3);
		node3.setData(4);
		node3.setNext(node4);
		node4.setData(5);
		node4.setNext(node5);
		node5.setData(6);
		node5.setNext(node6);
		node6.setData(7);
		node6.setNext(node7);
		node7.setData(8);
		node7.setNext(node8);
		node8.setData(9);
		node8.setNext(node9);
		node9.setData(10);
		node9.setNext(null);
		while(iter!=null){
			System.out.print(iter.getData());
			if(iter.getNext() != null){
				System.out.print("-->");
			}
			iter = iter.getNext();
		}
		System.out.println("");
		System.out.println(nthFromEnd(node,7));
	}
	
	public static int nthFromEnd(ListNode head,int pos){
		ListNode start = head;
		ListNode nthEnd = null;
		int count = 1;
		
		while(count!= pos){
			start = start.getNext();
			count++;
		}
		
		while(start!=null){
			start=start.getNext();
			if(nthEnd == null)
				nthEnd = head;
			else
				nthEnd = nthEnd.getNext();
		}
		
		return nthEnd.getData();
	}
}
