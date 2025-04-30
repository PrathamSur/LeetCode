class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;

        for(int i:bills){
            if(i==5){
                five++;
            }
            if(i==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            if(i==20){
                if(five>0 && ten>0){
                    five--;
                    ten--;
                    twenty++;
                }
                else if(five>=3){
                    five-=3;
                    twenty++;
                }
                else
                    return false;
            }
        }
        return true;
    }
}