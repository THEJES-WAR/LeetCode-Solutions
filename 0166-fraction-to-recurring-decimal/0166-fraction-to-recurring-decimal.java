class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder res = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            res.append("-");
        }

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);
        res.append(n / d);
        long remainder = n % d;
        if (remainder == 0) return res.toString();

        res.append(".");

        Map<Long, Integer> seen = new HashMap<>();

        while (remainder != 0) {
            if (seen.containsKey(remainder)) {
                int start = seen.get(remainder);
                res.insert(start, "(");
                res.append(")");
                break;
            }

            seen.put(remainder, res.length());

            remainder *= 10;
            res.append(remainder / d);
            remainder %= d;
        }
        return res.toString();
    }
}