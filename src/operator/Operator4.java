package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2*2+3*3;
        int sum4 = (2*2)+(3*3); //괄호를 사용하지 않아도 상관 없지만 코드의 가독성에 괄호를 사용하는게 더 편함
        System.out.println("sum4 = " + sum4);
        System.out.println("sum3 = " + sum3);

        /*
        * 실무 개발자는 우선순위를 외우는 사람이 없음
        * 연산자 우선순위는 딱 2가지만 기억
        * 1. 상식선에서 우선순위 사용하기
        * 2. 대입연산자를 당연히 계산하고 하기 때문에
        * 상식적으로 접근해야지 공부하듯이 외울 필요 없음
        * 애매하거나 보기 편하게 괄호를 이용하자 */
    }


}
