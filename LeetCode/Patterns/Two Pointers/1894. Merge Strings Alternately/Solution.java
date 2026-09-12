class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int len1=word1.length();
        int len2=word2.length();
        int i=0,j=0;
        while(i<len1 && j<len2){
                 res=res+word1.charAt(i);
            res=res+word2.charAt(j);
            i++;
            j++;
        }
            while (i <len1) {
            res += word1.charAt(i);
            i++;
        }

        while (j <len2) {
            res += word2.charAt(j);
            j++;
        }

        return res;
    }
}