package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while(i<=5){
            if(i ==3){
                i++;
                continue; //다시 while문으로 가기 때문에 3은 출력이 안된다.
            }
            System.out.println(i);
            i++;
        }
    }
}
