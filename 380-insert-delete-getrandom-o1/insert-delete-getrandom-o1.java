class RandomizedSet {
    private List<Integer> randomList;

    public RandomizedSet() {
        randomList = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(randomList.contains(val)){
            return false;
        }

        randomList.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(randomList.contains(val)){
            randomList.remove((Integer)val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        Random random = new Random();

        int randomNum = random.nextInt(randomList.size());
        return randomList.get(randomNum);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */