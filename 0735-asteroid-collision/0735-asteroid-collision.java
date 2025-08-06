class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<asteroids.length;++i){
            if(asteroids[i]>0) stack.push(asteroids[i]);
            else{
                while(!stack.isEmpty() && stack.peek()>0 && Math.abs(asteroids[i])>Math.abs(stack.peek())){
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()==Math.abs(asteroids[i])) {
                    stack.pop();
                    continue;
                }
                else if(stack.isEmpty() || stack.peek()<0){
                    stack.push(asteroids[i]);
                }
            }
        }

        int[] ans=new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            ans[i]=stack.get(i);
        }
        return ans;

    }
}