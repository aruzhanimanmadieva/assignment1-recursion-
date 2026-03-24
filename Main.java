import java.util.Scanner;
public class Main {
//PART I. NUMBERS
//Task 1. Print Digits of a Number
public static void Digit(int n){
    if(n==0) return;
    Digit(n/10);
    System.out.println(n%10);
}

// Task2. Average of Elements
public static int Sum(int [] arr,int n){
    if(n==0) return 0;
    return arr[n-1]+Sum(arr,n-1);
    }

//Task3. Prime Number Check
public static boolean Prime(int a,int j){
    if(a<=2) return(a==2);
    if(a%j==0) return false;
    if(j*j>a) return true;
    return Prime(a,j+1);
}

//Task4. Factorial
public static int fact(int n) {
    if (n == 0) return 1;
    return n * fact(n - 1);
}

//PART II. Recursion with Sequences
//Task5. Fibonacci Number
public static int fib(int n){
    if(n==0) return 0;
    if(n==1) return 1;
    return fib(n-1)+fib(n-2);
}
//Task6. Power Function
public static int pow(int m,int n){
    if(n==0) return 1;
    return m * pow(m,n-1);
}
//Task7. Reverse Output
public static void reverse(int Arr[],int n){
    if(n==0) return;
    System.out.print(Arr[n-1] + " ");
    reverse(Arr,n-1);
}
//Part 3. Recursion with Strings
//Task8. Check Digits in String
public static boolean strD(String t,int n){
    if(n == t.length()) return true;
    if(t.charAt(n) < '0'|| t.charAt(n)>'9') return false;
    return strD(t,n+1);
}
//Task9. Count Characters in a String
public static int Count(String t){
    if(t.equals("")) return 0;
    return 1+Count(t.substring(1));
}
// Task 10. Greatest Common Divisor (GCD)
public static int GCD(int x,int y){
    if(y==0) return x;
    return GCD(y,x%y);
}
public static void main(String[] args) {
        Digit(5481);
        int[] arr={3,2,4,1};
        int a=Sum(arr,arr.length);
        System.out.println("average:" + (double)a/arr.length);
        System.out.println(Prime(7,2)? "Prime": "Composite");
        System.out.println(fact(5));
        System.out.println(fib(5));
        System.out.println(pow(2,10));
        int[] Arr={1,4,6,2};
        reverse(Arr,Arr.length);
        System.out.println(strD("123456",0) ? "Yes" : "No");
        System.out.println(Count("hello"));
        System.out.println(GCD(32,48));
    }
}