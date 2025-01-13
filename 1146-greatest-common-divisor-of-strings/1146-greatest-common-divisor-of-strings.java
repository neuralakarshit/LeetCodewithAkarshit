import java.math.BigInteger;
class Solution {
    public String gcdOfStrings(String str1, String str2) 
    {

        if(!str1.concat(str2).equals(str2.concat(str1)))
        {
            return "";
        }

        int l1=str1.length();
        int l2=str2.length();
       
        BigInteger n1 = BigInteger.valueOf(l1);   //    BigInteger only takes string value so valueOf
        BigInteger n2 = BigInteger.valueOf(l2);   // calc gcd of two numers manuallly

        BigInteger gcd = n1.gcd(n2);

        String result=str1.substring(0,gcd.intValue());  

        return result;
        
    }
}