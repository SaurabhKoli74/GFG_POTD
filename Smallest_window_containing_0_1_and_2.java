class Smallest_window_containing_0_1_and_2{
    public static int smallestSubstring(String s) {
        // Code here
        int mini = Integer.MAX_VALUE, x = -1, y = -1, z = -1, n = s.length();
        
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '0')     
                x = i;
            else if(s.charAt(i) == '1')
                y = i;
            else if(s.charAt(i) == '2')
                z = i;
                
            if(x == -1 || y == -1 || z == -1)
                continue;
                
            int maxL = Math.max(x, Math.max(y, z));
            int minL = Math.min(x, Math.min(y, z));
            mini = Math.min(mini, maxL - minL + 1);
        }
        
        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
    public static void main(String[] args) {
        String s = "10212";
        System.out.println(smallestSubstring(s));
    }
}