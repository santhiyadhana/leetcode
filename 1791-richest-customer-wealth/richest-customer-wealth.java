class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;
        
        for (int[] customer : accounts) {
            int wealth = 0;
           
            for (int bank : customer) {
                wealth += bank;
            }
            rich = Math.max(rich, wealth);
        }
        
        return rich;
    }
}