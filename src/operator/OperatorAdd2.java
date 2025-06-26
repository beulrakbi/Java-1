package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a =1;
        int b = 0;
        //전위 증감 연산자
        b= ++a; //a의 값을 먼저 증가시키고 b에 대입
        System.out.println("a = " + a);
        //후위 증감 연산자
        b= a++; //a의 값을 먼저 대입하고 a 값 증가
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        /*
        * b= ++a;
        *
        * ->
        * a=a+1;
        * b=a;
        * 증감 연산자를 활용하면 두 줄의 코드를 한 줄로 줄일 수 있다.
        * */
    }
}