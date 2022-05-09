class DynInit {
 public static void main(String args[]) {
 int a = 2, b = 5;
 // c is dynamically initialized
 int c = a*a+b*b+2*a*b;
 System.out.println("(a+b)^2 is " + c);
 }
}