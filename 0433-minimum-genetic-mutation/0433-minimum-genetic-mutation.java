class Solution {
    private static final char[] chars = { 'A', 'C', 'G', 'T' };

    static class Data{
        String gene;
        int dist;

        Data(String gene, int dist){
            this.gene = gene;
            this.dist = dist;
        }
    }

    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<Data> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        q.add(new Data(startGene, 0));

        while(!q.isEmpty()){
            Data d = q.poll();

            if(d.gene.equals(endGene))
                return d.dist;

            for(String b : bank){
                if(!isPossible(d.gene, b)) continue;
                if(set.contains(b)) continue;

                q.add(new Data(b, d.dist + 1));
                set.add(b);
            }
        }

        return -1;
    }

    private boolean isPossible(String gene, String b){
        int count = 0;
        for(int i = 0; i < gene.length(); i++){
            if(gene.charAt(i) != b.charAt(i)){
                count++;
            }
        }
        
        return count == 1;
    }
}