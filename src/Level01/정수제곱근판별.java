package Level01;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;

        double a = Math.sqrt(n);

        if(a - (int)a == 0){
            answer = (long)(a+1) * (long)(a+1);
        }else return -1;

        return answer;
    }

    public static void main(String[] args) {
        정수제곱근판별 c = new 정수제곱근판별();
        System.out.println(c.solution(3));
    }
}
