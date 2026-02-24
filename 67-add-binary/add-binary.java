class Solution {
    public String addBinary(String a, String b) {
        int x = a.length() -1;
        int y = b.length() -1;
        int carry = 0;

        String result = "";

        while (x >= 0 || y >= 0 || carry == 1){
            int sum = carry;

            if (x >= 0){
                sum += a.charAt(x) - '0';
                x--;
            }

            if (y >= 0){
                sum += b.charAt(y) - '0';
                y--;
            }

            result = (sum % 2) + result;
            carry = sum / 2;
        }

        return result;
    }
}