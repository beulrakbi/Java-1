package loop;

public class While1_1 {
    public static void main(String[] args) {
        int count = 0;

        /*같은 코드를 여러개 반복하는 과정이 비효율적
        * 코드 하나를 바꿔도 전체 코드를 다 바꿔야 함*/

        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
        count = count + 1;
        System.out.println("현재 숫자는 : " + count);
    }
}
