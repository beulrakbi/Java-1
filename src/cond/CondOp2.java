package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age>=18)? "성인" : "미성년자";
        /*
        * 삼항연산자를 사용했을 때 if문을 사용하는 경우보다 훨씬 간결하게 작성할 수 있음
        * 하지만 단순한 조건만 처리할 수 있음
        * */
        System.out.println("age = " + age + "status = " + status);
    }
}
