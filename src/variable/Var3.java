package variable;

public class Var3 {
    public static void main(String[] args) {
        int a; //변수 선언
        a = 10; //변수 초기화 a(10)
        System.out.println(a);
        a = 50; //변수 값 변경 a(10 -> 50)
        System.out.println(a);

        //a에 50이 덮어씌우기 때문에 기존에 있던 10은 없어진다.
    }
}
