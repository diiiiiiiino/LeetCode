class Solution {
    public String interpret(String command) {
        command = command.replaceAll("\\(\\)", "o")
                         .replaceAll("\\(", "")
                         .replaceAll("\\)", "");
        
        return command;
    }
}