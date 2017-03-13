package model;

import java.util.HashMap;

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution7 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        HashMap<RandomListNode,RandomListNode> map=new HashMap<RandomListNode,RandomListNode>();
        RandomListNode cur=pHead;
        while(cur!=null){
        	map.put(cur, new RandomListNode(cur.label));
        	cur=cur.next;
        }
        cur=pHead;
        while(cur!=null){
        	map.get(cur).next=map.get(cur.next);
        	map.get(cur).random=map.get(cur.random);
        	cur=cur.next;
        }
        return map.get(pHead);
        
    }
}