/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=new TreeNode(nums[nums.length/2]);
        root.left=helper(Arrays.copyOfRange(nums,0,nums.length/2));
        root.right=helper(Arrays.copyOfRange(nums,(nums.length/2)+1,nums.length));
        return root;
    }
    public TreeNode helper(int[]nums){
        if(nums.length==0)return null;
        TreeNode node=new TreeNode(nums[nums.length/2]);
        node.left=helper(Arrays.copyOfRange(nums,0,nums.length/2));
        node.right=helper(Arrays.copyOfRange(nums,(nums.length/2)+1,nums.length));
        return node;
    }
}