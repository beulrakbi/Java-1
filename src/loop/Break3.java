package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;
        //반복 횟수가 정해진 경우에는 for문을 활요하는게 좋음
        for( int i = 1; ;i++){
            sum = sum +i;
            if(sum>=10){
                System.out.println("합이 10보다 크면 종료 i = " +i +"sum=" +sum );
                break; //무한 반복을 break문을 통해 탈출
            }
        }
    }
}
