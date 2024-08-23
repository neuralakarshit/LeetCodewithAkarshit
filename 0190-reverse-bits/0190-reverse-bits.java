public class Solution 
{
    // you need treat n as an unsigned value
    public int reverseBits(int n)
    {
        int revbits=0;
        for(int i=0;i<32;i++)
        {

            int lsb= n & 1;
            int reverseLsb=lsb<<(31-i);
            revbits=revbits | reverseLsb;
            n=n >> 1;

        }
        return revbits;
    }
}