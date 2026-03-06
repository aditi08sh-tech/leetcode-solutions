class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum+=digit;
                num=num/10;
            }
            num=sum;

        }
        return num;
    }
}


class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
}


// they have both mathematical and leetcode solutiion
