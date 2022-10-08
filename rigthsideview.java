//TC: O(n)
//SC: O(h)
// Solved on leetcode
// No problem faced
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return list;
        }
        dfs(root, 0);
        
        return list;
    }
    
    private void dfs(TreeNode root, int lvl) {
        if (root == null) {
            return;
        }
        
        if (lvl == list.size()) {
            list.add(root.val);
        } else {
            list.set(lvl, root.val);
        }
        dfs(root.left, lvl + 1);
        dfs(root.right, lvl + 1);
    }
}
