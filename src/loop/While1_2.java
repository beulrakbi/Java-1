package loop;

public class While1_2 {
    public static void main(String[] args) {
        /*
        * while(조건식) {
        * 코드
        * }
        * 조건이 거짓이 될때까지 계속 수행한다.*/

        int count = 0;
        while (count < 3) {
            //반복되야하는 문장이 중괄호 안에 있어야 함
            count = count + 1;
            System.out.println("현재 숫자는 : " + count);
        }

    }
}
