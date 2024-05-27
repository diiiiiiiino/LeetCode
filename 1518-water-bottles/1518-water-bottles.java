class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + recFunc(numBottles, numExchange);
    }

    private int recFunc(int numBottles, int numExchange){
        int drink = numBottles / numExchange;
        int rest = numBottles % numExchange;

        if(drink == 0){
            return 0;
        }

        return drink + recFunc(drink + rest, numExchange);
    }
}