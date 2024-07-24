class Solution {
    public String interpret(String command) {
        command = command.replaceAll("\\(\\)", "o");
        command = command.replaceAll("\\(", "");
        command = command.replaceAll("\\)", "");

        return command;
    }
}