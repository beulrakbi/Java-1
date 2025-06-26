package cond;

public class If2 {
    public static void main(String[] args) {
        /*
        * 만약 나이가 18살 이상이면 성인입니다.
        * 그렇지 않으면 미성년자입니다.*/
        int age = 20;

        if(age>=18){
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

    }
}
