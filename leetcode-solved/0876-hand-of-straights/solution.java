class Solution {
  public boolean isNStraightHand(int[] hand, int groupSize) {
    int len = hand.length;
    if (len % groupSize != 0)
      return false;
    TreeMap<Integer, Integer> treeMap = new TreeMap<>();
    for (int num : hand) {
      treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
    }

    while (!treeMap.isEmpty()) {
      int first = treeMap.firstKey();
      for (int j = 1; j < groupSize; j++) {
        int next = first + j;
        if (treeMap.containsKey(next)) {
          treeMap.put(next, treeMap.get(next) - 1);
          if (treeMap.get(next) == 0)
            treeMap.remove(next);
        } else {
          return false;
        }
      }
      treeMap.put(first, treeMap.get(first) - 1);
      if (treeMap.get(first) == 0)
        treeMap.remove(first);
    }
    return true;
  }
}
