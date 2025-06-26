package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if(age<=7){
            System.out.println("미취학");
        }
        if (age>=8 && age<16){
            System.out.println("초등학생");
        }
        if (age>=14 && age<=16){
            System.out.println("중학생");
        }
        if (age>=17 && age<=19){
            System.out.println("고등학생");
        }
        if(age>=20){
            System.out.println("성인입니다.");
        }

        /*
        * - 첫 조건을 성공해도 나머지 if문을 다 확인하는 단점이 있음
        * - 조건을 중복체크하게 된다.
        * - else if를 활용하면
        * 단점을 해결할 수 있음
        * */
    }
}
