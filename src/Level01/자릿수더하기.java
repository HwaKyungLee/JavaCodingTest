package Level01;

public class 자릿수더하기 {
    public int solution(int n){
        int answer = 0;

        while(n > 0) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
    public static void main(String[] args) {

        자릿수더하기 c = new 자릿수더하기();
        System.out.println(c.solution(123));
    }
}
