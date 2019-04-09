import com.util.TreeNode;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solu = new Solution();
        /*String res = solu.decodeString("3[a]2[bc]");
        System.out.println(res);

        String res2 = solu.decodeTest("3[a]2[bc]");
        System.out.println(res2);*/

       /* int[] nums = {3,1,3,4,2};
        int result = solu.findDuplicate2(nums);
        System.out.println(result);*/

        /*int[] nums = {3,2,3,1,2,4,5,5,6};
        int result = solu.findKthLargest(nums,4);
        System.out.println(result);*/

        /*int[] nums = {1,2,3,4};
        solu.productExceptSelf2(nums);*/

       /* solu.findAnagrams("aa","bb");*/

        /*String[] strs = {"Hello", "Alaska", "Dad", "Peace"};
        solu.findWords(strs);*/

        /*solu.findComplement(5);*/

        /*int nums[] = {2, 6, 4, 8, 10, 9, 15};
        solu.findUnsortedSubarray(nums);*/

        //solu.climbStairs(3);

        int[] nums = {1,2,3};
        solu.subsets(nums);
    }

    public String decodeString(String s){
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while(idx < s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int count = 0;
                while(Character.isDigit(s.charAt(idx))){
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }else if(s.charAt(idx) == '['){
                resStack.push(res);
                res = "";
                idx++;
            }else if(s.charAt(idx) == ']'){
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeatTimes = countStack.pop();
                for(int i = 0; i < repeatTimes; i++){
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }else{
                res += s.charAt(idx++);
            }
        }
        return res;
    }

    /**
     * 3[a]2[bc] aaabcbc
     * @param s
     * @return
     */
    public String decodeTest(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        String res = "";
        int i = 0;
        while(i < s.length()){
            //把数字丢进来
            if(Character.isDigit(s.charAt(i))){
                int count = 0;
                while(Character.isDigit(s.charAt(i))){
                    count = 10 * count + s.charAt(i) - '0';//数字转换为int
                    i++;
                }
                countStack.push(count);//数字放进来
                //i++;
            }else if(s.charAt(i) == '['){
                resStack.push(res);//把上个结果存起来
                res = "";
                i++;
            }else if(s.charAt(i) == ']'){
                int temp = countStack.pop();
                StringBuilder sb = new StringBuilder(resStack.pop());
                for(int j = 0;j < temp; j++){
                    sb.append(res);
                }
                res = sb.toString();
                i++;
            }else {
                res += s.charAt(i++);
            }
        }
        return res;
    }

    /**
     * [1,3,4,2,2] //2
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public int findDuplicate2(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<Integer>());
            }
            map.get(nums[i]).add(nums[i]);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().size());
            if(entry.getValue().size() == 2){
                return entry.getValue().get(0);
            }
        }
        return 0;
    }

    /**
     * [3,2,1,5,6,4] and k = 2 //5
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(k+1);

        for(Integer i : nums){
            queue.add(i);
            if(queue.size() > k){
                queue.poll();
            }
        }
        return  queue.poll();
    }

    public int[] productExceptSelf(int[] nums){
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int sum = 1;
            for(int j = 0; j < nums.length;j++){
                if(i == j){
                    continue;
                }else {
                    sum *= nums[j];
                }
            }
            arr[i] = sum;
        }
        return arr;
    }

    public int[] productExceptSelf2(int[] nums){
        int[] arr = new int[nums.length];
        arr[0] = 1;
        int sum = 1;
        for(int i = 1; i < nums.length; i++){
             arr[i] = arr[i - 1] * nums[i-1];
        }
        for(int i = nums.length-1; i >= 0; i--){
            arr[i] *= sum;
            sum *= nums[i];
        }
        return arr;
    }

    public List<Integer> findAnagrams(String s, String p){
        List<Integer> list = new ArrayList<>();
        if(s.length() == 0 || p.length() == 0 || p.length() > s.length()){
            return new ArrayList<>();
        }
        int[] chars = new int[26];
        for(Character c : p.toCharArray()){
            chars[c-'a']++;
        }

        int start = 0,end = 0, len = p.length(),diff = len;
        char temp;
        //验证第一个数字是否有效
        for(end = 0;end < len;end++){
            temp = s.charAt(end);

            chars[temp-'a']--;

            if(chars[temp-'a']>=0){
                diff--;
            }

        }

        if(diff >= 0){
            list.add(0);
        }

        while(end < s.length()){
            temp = s.charAt(start);

            if(chars[temp-'a'] >= 0){
                diff++;
            }
            chars[temp - 'a']++;
            start++;

            //end
            temp = s.charAt(end);
            chars[temp-'a']--;
            if(chars[temp-'a']>=0){
                diff--;
            }
            if(diff == 0){
                list.add(start);
            }
            end++;
        }
        return list;
    }

    /**
     * Input: ["Hello", "Alaska", "Dad", "Peace"]
     * Output: ["Alaska", "Dad"]
     * @param words
     * @return
     */
    public String[] findWords(String[] words){
        List<String>  list = new ArrayList<>();

        for(String word : words){
            if(valid(word)){
                list.add(word);
            }
        }
        String[] strs = new String[list.size()];

        for(int i = 0; i < list.size();i++){
            strs[i] = list.get(i);
        }
        return strs;
    }

    public boolean valid(String word){
        Set<Character> row1 = new HashSet<Character>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        Set<Character> row2 = new HashSet<Character>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        Set<Character> row3 = new HashSet<Character>(Arrays.asList('z','x','c','v','b','n','m'));
        boolean[] flags = new boolean[3];
        Arrays.fill(flags,true);
        for(Character c : word.toLowerCase().toCharArray()){
            if(!row1.contains(c)){
                flags[0] = false;
            }
            if(!row2.contains(c)){
                flags[1] = false;
            }
            if(!row3.contains(c)){
                flags[2] = false;
            }
        }
        return flags[0] || flags[1] || flags[2];
    }

    public int findComplement(int num){
        //转换为二进制
        //求出补位
        String s = Integer.toBinaryString(num);
        String re = "";
        for(Character c : s.toCharArray()){
            if(c=='1'){
                re += '0';
            }else if(c == '0'){
                re += '1';
            }
        }
        return Integer.valueOf(re,2);
    }

    public int climbStairs(int n){
        int v1 = 0;
        int v2 = 1;
        for(int i=0; i < n;i++){
            int tmp = v2;
            v2 = v1 + v2;
            v1 = tmp;
        }
        return v2;
    }

    //*****
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,0,new ArrayList<Integer>(),results);
        return results;
    }

    private void dfs(int[] nums,int index,List<Integer> subset,List<List<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<Integer>(subset));
            return;
        }
        subset.add(nums[index]);
        dfs(nums,index+1,subset,result);

        subset.remove(subset.size()-1);
        dfs(nums,index+1,subset,result);
    }


}
