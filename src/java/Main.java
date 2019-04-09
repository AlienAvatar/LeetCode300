import com.algr0407.ExcelSheetColumnNumber;
import com.algr0407.FirstUniqueCharacterInAString;
import com.algr0407.SumOfIntegers;
import com.algr0408.MissingNumber;
import com.algr0408.NumberOf1Bits;
import com.algr0408.PascalsTriangle;
import com.algr0409.IntersectionOfTwoArray2;
import com.algr0409.RotateArray;
import com.algr0409.SymmetricTree;
import com.util.TreeNode;

public class Main {
    public static void main(String[] args) {
        /*FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(15);

        RomanToInt romanToInt = new RomanToInt();
        romanToInt.romanToInt("IV");

        com.algr0402.IsHappy isHappy = new com.algr0402.IsHappy();
        isHappy.isHappy2(19);

        com.algr0402.CountPrimes countPrimes = new com.algr0402.CountPrimes();
        countPrimes.countPrimes2(10);

        int[] nums = {1,1,1,2,2,3};
        TopKFrequent topKFrequent = new TopKFrequent();
        topKFrequent.topKFrequent(nums,2);

        PowerOfThree powerOfThree = new PowerOfThree();
        //powerOfThree.isPowerOfThree(27);
        powerOfThree.isPowerOfThree2(1);

        int[] nums = {4,5,6,7,0,1,2};
        SearchInRotatedSortedArray sirsa = new SearchInRotatedSortedArray();
        sirsa.search(nums,3);

        int[] nums = {2,5,6,0,0,1,2};
        SearchInRotatedSortedArray2 searchInRotatedSortedArray2 = new SearchInRotatedSortedArray2();
        searchInRotatedSortedArray2.search(nums,3);

        BasicCalculator basicCalculator = new BasicCalculator();
        basicCalculator.calculate("3+2*2");*/

        /*int[] nums = {1};
        FindFirstAndLastPositionOfElementInSortedArray findFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();
        findFirstAndLastPositionOfElementInSortedArray.searchRange(nums,1);*/

       /* ValidAnagram validAnagram = new ValidAnagram();
        boolean re = validAnagram.isAnagram("rat","car");
        System.out.println(re);*/

        /*int[] nums = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2 = new BestTimeToBuyAndSellStock2();
        bestTimeToBuyAndSellStock2.maxProfit(nums);*/

        /*int[] nums = {1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        containsDuplicate.containsDuplicate(nums);*/

        /*ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        excelSheetColumnNumber.titleToNumber("AB");*/

       /* SumOfIntegers sumOfIntegers = new SumOfIntegers();
        sumOfIntegers.getSum(-1,2);*/

        /*FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        firstUniqueCharacterInAString.firstUniqChar("z");

        int nums[] = {0,1};
        MissingNumber missingNumber = new MissingNumber();
        missingNumber.missingNumber(nums);

        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        pascalsTriangle.generate(5);

        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        numberOf1Bits.hammingWeight(00000000000000000000000000001011);

        int[] nums = {1,2,3,4,5,6,7};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(nums,3);

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        IntersectionOfTwoArray2 intersectionOfTwoArray2 = new IntersectionOfTwoArray2();
        intersectionOfTwoArray2.intersect(nums1,nums2);*/

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        SymmetricTree symmetricTree = new SymmetricTree();
        symmetricTree.isSymmetric(root);
    }
}
