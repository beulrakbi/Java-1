package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        //무한 반복
        while(true) {
            sum = sum +i;
            if(sum>10){
                System.out.println("합이 10보다 크면 종료 i = " +i +"sum=" +sum );
                break; //무한 반복을 break문을 통해 탈출
            }
            i++;
        }
    }
}
