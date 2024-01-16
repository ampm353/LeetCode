class Solution {

    public List<List<Integer>> findWinners(int[][] matches) {
        
        Map<Integer, Integer> lossCountMap = new HashMap<>();
        Map<Integer, Integer> matchMemberMap = new HashMap<>();
        
        for( int[] match : matches) {

            int winner = match[0];
            int loser = match[1];

            matchMemberMap.put(winner, 1);
            matchMemberMap.put(loser, 1);

            lossCountMap.put(loser, lossCountMap.getOrDefault(loser,0) + 1);
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for( int player : matchMemberMap.keySet()){

            int lossCount = lossCountMap.getOrDefault(player, 0);

            if(lossCount == 0){
                noLoss.add(player);
            }else if(lossCount == 1){
                oneLoss.add(player);
            }
        }

        
        Collections.sort(noLoss);
        Collections.sort(oneLoss);

        List<List<Integer>> result = new ArrayList<>();
        result.add(noLoss);
        result.add(oneLoss);

        return result;
    }
}