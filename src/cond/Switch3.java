package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;
        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                /*break 가 없음 다음 case문까지 읽어버림 break 주의하기*/
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급받은 쿠폰" + coupon);

    }
}
