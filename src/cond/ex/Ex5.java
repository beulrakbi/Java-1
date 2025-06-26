package cond.ex;

public class Ex5 {
    public static void main(String[] args) {
        String grade = "A";

        switch(grade){
            case "A":
                System.out.println("A");
                break ;
            case "B":
                System.out.println("b");
                break ;
            case "C":
                System.out.println("c");
                break ;
            case "D":
                System.out.println("d");
                break ;
            case "E":
                System.out.println("e");
                break;
            default:
                System.out.println("잘못된 성적");
        }
    }
}
