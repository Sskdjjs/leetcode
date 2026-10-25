class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //额外申请一个m+n数组用m+n循环遍历比大小
        int [] temp = new int[n+m];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < temp.length;temp++) {
            while (nums1[i1] < nums2[i2]) {
                temp[i] = nums1[i1];
                            
            }
        }
    }
  //写不动...从求职第一题写,这玩意要考虑好多没意思的东西边界啥的...写一点是一点
}
