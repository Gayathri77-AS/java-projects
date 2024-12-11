class Main {
    public static void main(String[] args) {
        String s = "Try programizzzzzzz.pro";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.print(result.toString());
    }
}


// Output -- T1r1y1 1p1r1o1g1r1a1m1i1z6.1p1r1o1

------------------------------------------------------------

//Swap string without 3rd variable

public class Main {
    public static void main(String[] args) {
        String s = "Try Programiz Pro ";
        String t = "Hope For Best";
        
        // Concatenate s and t
        s = s + t;  // s = "Try Programiz Pro Hope For Best"
        
        // Extract original value of s
        t = s.substring(0, s.length() - t.length());  // t = "Try Programiz Pro "
        
        // Extract original value of t
        s = s.substring(t.length());  // s = "Hope For Best"
        
        // Print the results
        System.out.println(s);  // "Hope For Best"
        System.out.println(t);  // "Try Programiz Pro "
    }
}

'''
 Output : Hope For Best 
          Try Programiz Pro
'''
------------------------------------------------------------



