class Solution {
    public int totalFruit(int[] fruits) {
        int slow = 0, fast = 0;
        int lastChange = 0;
        int max = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[slow] != fruits[i]) {
                fast = i;
                break;
            }
        }

        int x = fruits[slow], y = fruits[fast];

        for (int i = fast; i < fruits.length; i++) {
            if (fruits[i] != x && fruits[i] != y) {
                slow = lastChange;
                x = fruits[slow];
                y = fruits[i];
            }

            if (i > 0 && fruits[i] != fruits[i - 1]) {
                lastChange = i;
            }

            fast++;
            max = Math.max(fast-slow,max);
        }
        return max;
    }
}
