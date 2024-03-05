class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> magazineMap = new HashMap<>();
        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch : ransomNote.toCharArray()){
            ransomNoteMap.put(ch, ransomNoteMap.getOrDefault(ch, 0) + 1);
        }

        for(char ch : ransomNote.toCharArray()){
            int magazineCount = magazineMap.getOrDefault(ch, 0);
            int ransomNoteCount = ransomNoteMap.getOrDefault(ch, 0);

            if(magazineCount == 0){
                return false;
            } else if(ransomNoteCount > magazineCount){
                return false;
            }
        }

        return true;
    }
}