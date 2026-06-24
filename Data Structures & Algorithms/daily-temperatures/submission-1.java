class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ret = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // [temp, index]

        for (int i = 0; i < temperatures.length; i++){
            int curr = temperatures[i];
            while(!stack.isEmpty() && curr > stack.peek()[0]){
                int[] pair = stack.pop();
                ret[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{curr, i});
        }
        return ret;
    }
}
