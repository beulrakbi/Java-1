package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b =127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L; //L을 붙여야 함 소문자 l은 숫자로 오해할 수 있어서 대문자 L을 사용할 것

        //실수
        float f = 10.0f; //f를 붙여야 함
        double d = 10.0;

        /*
        * 실무에서 거의 사용하지 않는 타입
        * byte, short, float, char
        * -> 메모리 용량을 약간 절약하기 보다는 개발 속도나 효율에 초점을 맞추는 것이 더 효율적이기 때문에 작은 타입은 X
        * -> 대신에 byte는 파일 복사하거나 파일 전송할 때나 사용한다.
        * -> char 대신 String에 한 글자만 쓰면 된다 굳이 문자형 쓰지 않음
        * */
    }
}
