package variable;

public class Var7 {
    public static void main(String[] args) {
        /*
         * 리터럴: 변수에 넣는 값을 리터럴이라고 한다.
         * int a = 100; <- 리터럴 = 100
         * */
        int a = 100; //정수
        double b = 10.5; //실수
        boolean c = true; //true, false만 가능
        char d = 'A'; //문자 타입 (문자 한 개)
        String e = "Hello Java"; //문자열을 다루기 위한 특별한 타입

        //int z = "백원"; -> 정수형 타입에 문자열 초기화 불가능
        //incompatible types: java.lang.String cannot be converted to int


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
