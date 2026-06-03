class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int p=0;
        int ori=x;
        int m=(int)Math.floor(Math.log10(ori));
        m=(int)Math.pow(10,m);
        int ans=0;
        while(x>0){
            p=x%10;
            ans+=p*m;
    
            m/=10;
            x/=10;
        }
        if(ori==ans)
        return true;
        else
        return false;

    }
}