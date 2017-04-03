package character;
//链表分割
/*
 * 编写代码，以给定值x为基准将链表分割成两部分，
 * 所有小于x的结点排在大于或等于x的结点之前
*给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
*注意：分割以后保持原来的数据顺序不变。
 */
import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
    	ListNode sH = null;
    	ListNode sT = null;
    	ListNode bH = null;
    	ListNode bT = null;
    	ListNode p = null;
    	while(pHead != null){
    		p = pHead.next;
    		pHead.next = null;
    		if(pHead.val < x){
    			if(sH == null){
    				sH = pHead;
    				sT = pHead;
    			}else{
    				sT.next = pHead;
    				sT = pHead;
    			}
    		}else{
    			if(bH == null){
    				bH = pHead;
    				bT = pHead;
    			}else{
    				bT.next = pHead;
    				bT = pHead;
    			}
    		}
    		pHead = p;
    	}
    	if(sT != null){
    		sT.next = bH;
    	}
    	return sH != null ? sH :bH ;
    }
}