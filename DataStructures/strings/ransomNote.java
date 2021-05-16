import java.util.HashMap;

public class ransomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magMap = new HashMap<>();

        computeCountMap(ransomMap, ransomNote);
        computeCountMap(magMap, magazine);
        boolean flag = false;
        for (int i = 0; i < ransomNote.length(); i++) {
            Character charkey = ransomNote.charAt(i);
            if (magMap.keySet().contains(charkey)) {
                if (ransomMap.get(charkey) <= magMap.get(charkey))
                    flag = true;
                else {
                    flag = false;
                    break;
                }

            } else
                return false;

        }
        if (flag)
            return true;

        return false;
    }

    private static void computeCountMap(HashMap<Character, Integer> map, String str) {
        for (int i = 0; i < str.length(); i++) {

            map.computeIfPresent(str.charAt(i), (key, val) -> val + 1);
            map.computeIfAbsent(str.charAt(i), k -> 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(canConstruct("ababc", "amgzin"));
        System.out.println(canConstruct("ababc", "abbabc"));
    }
}
