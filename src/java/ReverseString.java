/**
 * 2019 4 1
 */
public class ReverseString {
    public static void main(String[] args) {
        ReverseString solu = new ReverseString();
        char[] chars = {'h','e','l','l','o'};
        solu.reverseString(chars);
    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }
}
