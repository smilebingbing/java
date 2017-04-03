package com.java.offer;
//树的子结构
/*
 * 基本思路：
 * 运行时间29ms
 * 占用内存503k
 */
public class HasSubTree {
//
	public boolean hasSubTree(NodeTree root1, NodeTree root2){
		boolean result = false;
		if(root1 != null && root2 != null){
			if(root1.value == root2.value){
				result = doTree1HasTree2(root1, root2);
			}
			if(!result){
				result = hasSubTree(root1.left, root2);
			}
			if(!result){
				result = hasSubTree(root1.right, root2);
			}
		}
		return result;
	}
	//判断树A中以root1为根节点的子树是不是和树B具有相同的结构
	//若根节点的值不同，则不是，
	//递归判断左子树和右子树
	//终止条件是到达了树的根节点
	public boolean doTree1HasTree2(NodeTree root1, NodeTree root2){
		if(root2 == null){
			return true;
		}
		if(root1 == null){
			return false;
		}
		if(root1.value != root2.value){
			return false;
		}
		return doTree1HasTree2(root1.left, root2.left) && 
				doTree1HasTree2(root1.right, root2.right);
	}
}