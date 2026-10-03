class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> Smap = new HashMap<>();
        HashMap<Character, Integer> Tmap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            Smap.put(ch, Smap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            Tmap.put(ch, Tmap.getOrDefault(ch, 0) + 1);
        }

        return Smap.equals(Tmap);

    }
}
