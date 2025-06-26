package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        //==은 동등연산자 동등하면 true 아니면 false 반환
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        //결과를 boolean 변수에 담을 수 있음
        boolean result = a == b;
        System.out.println("result = " + result);
    }
}
