package cond;

public class If1 {
    public static void main(String[] args) {
        /*if문은 특정 조건을 확인하고
        * 참인 경우에만 블럭 안에 코드를 수행한다.*/
        int age = 20; //사용자 나이

        if(age >= 18){
            System.out.println("성인입니다.");
        }

        if(age < 18){
            System.out.println("미성년자입니다.");
        }

    }
}
