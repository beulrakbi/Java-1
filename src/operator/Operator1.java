package operator;

public class Operator1 {
    public static void main(String[] args) {
        /*
        * 연산자 : 1+2 <- +가 연산자
        * 피연산자 : 1+2 <- 1, 2가 피연산자*/

        int a = 5;
        int b = 2;
        
        int sum = a+b;
        System.out.println("a+b = " + sum);
        
        int diff = a - b;
        System.out.println("a-b = " + diff);
        
        int muti = a*b;
        System.out.println("a*b = " + muti);
        
        int div = a/b;
        /*int / int = int
        * 소수점이 출력되지 않는다.*/
        System.out.println("a/b = " + div);

        int mod = a%b; //나머지
        System.out.println("a%b = " + mod);

        //int z = 10/0; // 나누기, 나머지 연산은 0을 피연산자로 사용할 수 없다. 예외발생한다.
    }
}
