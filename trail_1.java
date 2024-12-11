//Count of occurence of each characters in sequence
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

/*
Output : Hope For Best 
         Try Programiz Pro
*/

------------------------------------------------------------
//Remove space from the given string
class Main {
    public static void main(String[] args) {
        String s = "Try programiz pro";
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                result.append(s.charAt(i));
            }
        }        
        System.out.print(result.toString());
    }
}

//Output : Tryprogramizpro

------------------------------------------------------------
//Printing charcters in even index
class Main { 
    public static void main(String[] args) {
		String s = "Try programiz.pro"; 
		for(int i=0; i<s.length();i++){
			if(i%2==0){ 
			System.out.print(s.charAt(i));
			}
		} 
	} 
}

//Output:Typormzpo

------------------------------------------------------------
//Print each letter twice from the string
class Main { 
    public static void main(String[] args) {
		String s = "Try programiz.pro"; 
		StringBuilder result = new StringBuilder();
		for(int i=0; i<s.length();i++){
			result.append(s.charAt(i)).append(s.charAt(i));
		} 
		System.out.println(result);
	} 
}

//Output: TTrryy  pprrooggrraammiizz..pprroo

------------------------------------------------------------
// Leapyear checks without using modulus operator
class Main { 
    public static void main(String[] args) {
		int year = 2000; 
		if(year / 4 * 4 == year && (year / 100 * 100 != year || year / 400 * 400 == year)){
		    System.out.println(year + " is a leap year.");
		}else {
            System.out.println(year + " is not a leap year.");
        }
	} 
}

//Output: 2000 is a leap year.

// Leapyear checks using modulus operator
class Main { 
    public static void main(String[] args) {
		int year = 2010; 
		if(year % 4 == year && (year % 100 != year || year % 400 == year)){
		    System.out.println(year + " is a leap year.");
		}else {
            System.out.println(year + " is not a leap year.");
        }
	} 
}

//Output: 2000 is not a leap year.

/*
Hint : (year divisible by 4 AND (year not divisible by 100 or year divisible by 400))
*/

------------------------------------------------------------
// base raised to exponent without using built in power function
class Main { 
    public static void main(String[] args) {
		int base = 2;
		int exponent =3;
		int result =1;
		if(exponent==0)
		{
		  System.out.print(1);
		}else{
		  for(int i=1;i<=exponent;i++)  {
		      result *=base;
		  }
		}
		System.out.print(result);
	} 
}

//Output: 8

// base raised to exponent using built in power function
class Main { 
    public static void main(String[] args) {
		int base = 2;
		int exponent =3;
		double result = Math.pow(base,exponent);
		System.out.print(result);
	}
}

//Output: 8

------------------------------------------------------------
//Reverse a string in Java without using built-in string reversal functions

class Main { 
    public static void main(String[] args) {
		String s = "Try programiz.pro"; 
		char[] chararray = s.toCharArray();
		int left = 0;
		int right = chararray.length - 1;
		while(left<right){
		    char temp = chararray[left];
		    chararray[left] = chararray[right];
		    chararray[right] = temp;
		    
		    left ++;
		    right--;
		}
		System.out.println(String(chararray));
	} 
}

//Output: orp.zimargorp yrT

//Reverse a string in Java using built-in string reversal functions
public class Main {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = new StringBuilder(original).reverse().toString();
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}

//Output: orp.zimargorp yrT

------------------------------------------------------------
