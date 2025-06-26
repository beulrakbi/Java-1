package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 14;

        if(age <= 7){
            System.out.println("미취학");
        } else if (age<=13){
            System.out.println("초등학생");
        } else if (age <=16){
            System.out.println("중학생");
        } else if (age <=19){
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        /*
        * 처음 조건에서 7살이 이하는 것을 알았기 때문에
        * 두 번째 조건에서 13살 이하만 확인한다.
        * 불필요한 중복 조건을 확인하지 않을 수 있다.
        *
        * if문만 사용했을 경우 전체 조건을 다 확인해야 코드가 끝이 났는데
        * 조건이 참인 경우 코드를 실행하고 if문 블록을 아예 빠져나온다.
        * 하지만 서로 조건이 영향을 주지 않고 각각 작성해야 할 때는 else if를 사용하지 않는다.*/
    }
}
