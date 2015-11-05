package leetcode;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class BinaryTreePaths {

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<String>();
        StringBuffer s = new StringBuffer();
        if(root==null) return res;
        binaryPath(root,res,s);
        return res;
        
    }
    public void binaryPath(TreeNode root,List<String> res,StringBuffer s){
        if(root.left==null && root.right==null) {
            StringBuffer s1 = new StringBuffer(s);
            s1.append(root.val);
            res.add(s1.toString());
            
            return;
        }
        s.append(root.val);
        s.append("->");  
        StringBuffer s2 = new StringBuffer(s);
        if(root.left!=null) binaryPath(root.left,res,s);
        if(root.right!=null) binaryPath(root.right,res,s2);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreePaths bPaths = new BinaryTreePaths();
		TreeNode tNode = new TreeNode(1);
		tNode.left = new TreeNode(2);
		tNode.right = new TreeNode(3);
		tNode.left.left = new TreeNode(4);
		bPaths.binaryTreePaths(tNode);
	}

}
