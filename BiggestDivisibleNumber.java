public class BiggestDivisibleNumber {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        for(int i = b; i>= 2; i --){
            if((a%i == 0) && (b%i==0)) {
                System.out.println(i);
                break;
            }
        }
    }
}
