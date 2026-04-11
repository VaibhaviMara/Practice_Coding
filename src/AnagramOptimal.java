class Main3 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(areAnagrams(str1,str2));
    }
    static boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length())
        {
            return false;
        }
        int[] count = new int[26];
        for( int i = 0; i < str1.length(); i++)
        {
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        for ( int val : count)
        {
            if ( val !=0 )
            {
                return false;
            }
        }
        return true;
    }
}
