class Solution {
    public String reverseVowels(String s) {
        int len=s.length();
        int j=len-1;
        char[] ch=s.toCharArray();
        for(int i=0;i<j;){
            if(ch[i]!='a'&&ch[i]!='e' &&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u'&&ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U'){
                i++;
            }
            else if(ch[j]!='a'&&ch[j]!='e'&&ch[j]!='i'&&ch[j]!='o'&&ch[j]!='u'&&ch[j]!='A'&&ch[j]!='E'&&ch[j]!='I'&&ch[j]!='O'&&ch[j]!='U'){
                j--;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}