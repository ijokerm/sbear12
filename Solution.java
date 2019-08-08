class ListNode{
	int val;
    ListNode next;
    //构造方法
	ListNode(int val){
		this.val=val;
	}	
}

class Review{
	public static ListNode pushFront(ListNode head,int val){
		ListNode node=new ListNode(val);
		node.next=head;
		return node;
	}
	public static ListNode popBack(ListNode head){
		if(head==null){
			return null;
		}
		if(head.next==null){
			return null;
		}
		ListNode cur=head;
		while(cur.next.next!=null){
			cur=cur.next;
		}
		cur.next=null;
		return head;
	}
}
class Solution{
	public ListNode reverseL(ListNode head){
		//建立新链表
		ListNode result=null;
		ListNode cur=head;
		while(cur!=null) 
			cur.next=result;
		    
		    cur=cur.next;
	}
	
}
public class Solution{
	
}