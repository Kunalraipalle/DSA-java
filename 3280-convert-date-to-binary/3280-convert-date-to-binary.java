class Solution {
    public String convertDateToBinary(String date) {
       
        int year  = Integer.parseInt(date.substring(0, 4)); 
        int month = Integer.parseInt(date.substring(5, 7)); 
        int day   = Integer.parseInt(date.substring(8, 10));

        return toBinary(year) + "-" + toBinary(month) + "-" + toBinary(day);
    }

    private String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary; 
            num = num / 2;
        }
        return binary;
    }
}