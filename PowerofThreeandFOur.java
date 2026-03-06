class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        while(n%3==0){
            n=n/3;
        }
        return n==1;

    }
}
class Solution{
  public boolean isPowerofFour(int n){
  if(n<=0)return false;
        while(n%4==0){
            n=n/4;
        }
        return n==1;
  }}
