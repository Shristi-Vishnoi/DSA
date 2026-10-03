class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        HashSet<Integer> intersectionset=new HashSet<>();
        for(int num:nums2){
            if(set1.contains(num)){
            intersectionset.add(num);
        }
        }
        int ans[]=new int[intersectionset.size()];
        int i=0;
        for(int num:intersectionset){
            ans[i]=num;
            i++;
        }
        return ans;
    }
}