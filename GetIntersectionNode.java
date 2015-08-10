package leetcode;

public class GetIntersectionNode {

	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        if(headA==null || headB==null) return null;
	        if(headA==headB) return headA;
	        ListNode a = headA;
	        ListNode b = headB;
	        ListNode a1 = headA;
	        ListNode b1 = headB;
	        int count1=0;
	        int count2=0;
	        while(a!=null){
	            count1++;
	            a=a.next;
	        }
	        while(b!=null){
	            count2++;
	            b=b.next;
	        }
	        if(a!=b) return null;
	        else{
	            int dif = Math.abs(count1-count2);
	            if(count1>count2){
	                while(dif>0){
	                    a1=a1.next;
	                    dif--;
	                }
	                while(a1!=b1){
	                    a1=a1.next;
	                    b1=b1.next;
	                }
	            }else{
	                while(dif>0){
	                    b1=b1.next;
	                    dif--;
	                }
	                while(a1!=b1){
	                    a1=a1.next;
	                    b1=b1.next;
	                }
	            }
	        }
	        return a1;
	    }
	
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
