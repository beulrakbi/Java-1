package operator;

public class Assign1 {
    /*
    * 축약 대입 연산자
    * +=
    * -=
    * *=
    * /=
    * %=
    * */

    public static void main(String[] args) {
        int a = 5;
        a +=3; //a=a+3; 과 같다.
        System.out.println("a = " + a);
        a -=2;
        System.out.println("a = " + a);
        a*=4;
        System.out.println("a = " + a);
        a/=3;
        System.out.println("a = " + a);
        a%=5;
        System.out.println("a = " + a);
    }
}
