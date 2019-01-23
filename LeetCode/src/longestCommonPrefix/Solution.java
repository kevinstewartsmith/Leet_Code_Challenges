package longestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
               return "";
        }
        //length of string array
        int arrayLength = strs.length;
        //final string
        String finalStr = "";
        //index of shortest String in array
        int strIdx = Integer.MAX_VALUE;
        //length of shortest String
        int strLen = Integer.MAX_VALUE;
        
        //find the shortest String in array
        for (int i = 0; i < arrayLength; i++) {
            if (strs[i].length() < strLen ) {
                strLen = strs[i].length();
                strIdx = i;
            }
        }
        //Shortest String 
        String shortStr = strs[strIdx];
        int count = Integer.MAX_VALUE;
        for (int i = 0; i < arrayLength; i++) {
            int count2 = 0 ;
            for (int j = 0; j < shortStr.length(); j++) {
                if (shortStr.substring(0,j+1).equals(strs[i].substring(0,j+1))){
                    count2++;
                }
            }
            
            if (count2 < count){
                count = count2;
            }
        }
        
        finalStr = shortStr.substring(0,count );
        return finalStr;
        
    }
}