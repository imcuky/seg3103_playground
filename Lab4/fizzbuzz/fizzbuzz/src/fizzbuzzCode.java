public class fizzbuzzCode {

    public fizzbuzzCode(){

    }
    

    public void printFizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }
}