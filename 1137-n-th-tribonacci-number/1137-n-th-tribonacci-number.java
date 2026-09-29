class Solution {
    public int tribonacci(int n) {
        int fi=0;
        int se=1;
        int th=1;
        if(n==0){
            return 0;
        }
        int sum=0;
        if(n==1||n==2){
            return 1;
        }else{
            for(int i=3;i<=n;i++){
                sum=fi+se+th;
                fi=se;
                se=th;
                th=sum;
            }
        }
        return sum;
    }
}