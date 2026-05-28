class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer>st=new Stack<>();
        Map<Integer,Integer>ans=new HashMap<>();

        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                ans.put(st.pop(),num);
            }
            st.push(num);
        }
            while(!st.isEmpty()){
                ans.put(st.pop(),-1);
            }

        int[]answ=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            answ[i]=ans.get(nums1[i]);
        }
        return answ;
    }
}