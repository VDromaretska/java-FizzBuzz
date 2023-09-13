public class FizzBuzzer {
    private int count;

    public FizzBuzzer() {
        //initializing counter to 0
        count = 0;
    }

    public void next() {
        count++;
        if (count%3 == 0 && count%5==0) {
            System.out.println("FizzBuzz");
        } else if (count%3 == 0) {
            System.out.println("Fizz");
        } else if (count%5 == 0) {
            System.out.println("Buzz");
        } else System.out.println(count);
    }

    public void reset() {
        count = 1;
    }
    public static void main(String[] args) {
        FizzBuzzer myFizzBuzz = new FizzBuzzer();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.next();
        myFizzBuzz.reset();
        myFizzBuzz.next();
    }
}


