public class Fib {
    public static void main(String[] args) {
        int first = 0,second = 1, next;
        System.out.println(first);
        System.out.println(second);

        for (int i =2; i < 10; i++){
          next = first + second;
            System.out.println(next);
            first = second;
            second = next;

            //adding up to get the value(0,1,1,2,3,5)used for calculating number of bees
        }
    }
}
