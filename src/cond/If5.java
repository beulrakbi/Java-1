package cond;

public class If5 {
    /*아이템 가격이 10000원 이상일 때, 1000원 할인
    * 나이가 10살 이하일 때 1000원 할인*/

    public static void main(String[] args) {
        /*else문을 사용하면
        * 어린이가 만원 이상 구매한 경우 할인 혜택을 놓칠 수 있음
        * */
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price>=10000){
            discount = discount + 1000;
            System.out.println("만원 이상 구매, 1000원 할인");
        }

        if(age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액" + discount + "입니다.");
    }
}
