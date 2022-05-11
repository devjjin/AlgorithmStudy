import java.util.Scanner;

public class Quiz1{
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()) if(x==t) answer++;

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == t) answer++;
//        }
        return answer;
    }

    public static void main(String[] arg){
        Quiz1 T = new Quiz1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        System.out.print(T.solution(str,t));
    }
}