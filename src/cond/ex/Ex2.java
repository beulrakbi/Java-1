package cond.ex;

public class Ex2 {
    public static void main(String[] args) {
        int distance = 100;

        if(distance <=1){
            System.out.println("도보 이용");
        } else if (distance <=10){
            System.out.println("자전거 이용");
        } else if ( distance <=100){
            System.out.println("자동차 이용");
        } else {
            System.out.println("비행기 이용");
        }
    }
}
