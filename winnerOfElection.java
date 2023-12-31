import java.util.TreeMap;

public class winnerOfElection {
     static String[] WinnerOfElection(String[] a, int n) {
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
        for (String s : a) {
            treeMap.put(s, treeMap.getOrDefault(s, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        String res = null;
        for (String s : treeMap.keySet()) {
            if (treeMap.get(s) > max) {
                max = treeMap.get(s);
                res = s;
            }
        }
        String[] output = { res, String.valueOf(max) };
        return output;
    }

    public static void main(String args[]) {
        String a[] = {"Saurabh", "Rahul", "Vinayak", "Saurabh", "Vinayak", "John","John","Raghav"};
        String res[] = WinnerOfElection(a, 4);
        System.out.println(res[0] + " " + res[1]);
    }
}