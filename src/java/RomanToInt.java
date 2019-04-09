import java.util.HashMap;
import java.util.Map;

/**
 * Input: "III"
 * Output: 3
 */
public class RomanToInt {
    public int romanToInt(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int re = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0;i--){
            if(map.get(s.charAt(i+1)) <= map.get(s.charAt(i))){
                re += map.get(s.charAt(i));
            }else{
                re -= map.get(s.charAt(i));
            }
        }
        return re;
    }
}
