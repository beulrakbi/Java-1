package cond;

public class If6 {
    public static void main(String[] args) {
        /*
        * 이런 경우가 else if를 사용하면 안되는 경우*/
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price>=10000){
            discount = discount + 1000;
            System.out.println("만원 이상 구매, 1000원 할인");
        } else if(age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액" + discount + "입니다.");

        //if문에서 문장 하나일 때 중괄호 생략 가능
        if(true) System.out.println("if문에서 실행됨");

        /*
        * 중괄호를 사용하면
        * 가독성 증가
        * 유지보수성 향상
        * */
    }
}
