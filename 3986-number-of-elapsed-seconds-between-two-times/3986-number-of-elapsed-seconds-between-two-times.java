class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        //"01 : 00 : 25"
        // 01 2 35 5 67 

        int sthour= ((startTime.charAt(0)*10)+startTime.charAt(1))*3600;
        int stmin=  ((startTime.charAt(3)*10)+startTime.charAt(4))*60;
        int stsec=  (startTime.charAt(6)*10)+startTime.charAt(7);

        int endhour= ((endTime.charAt(0)*10)+endTime.charAt(1))*3600;
        int  endmin=  ((endTime.charAt(3)*10)+endTime.charAt(4))*60;
        int  endsec=  (endTime.charAt(6)*10)+endTime.charAt(7);

        return ((endhour+endmin+endsec)-(sthour+stmin+stsec));

        
    }
}