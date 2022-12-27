package Level01;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = x;

        for(int i = 0; i < n; i++){
            answer[i] = sum;
            sum += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        x만큼간격이있는n개의숫자 c = new x만큼간격이있는n개의숫자();
        System.out.println(c.solution(2, 5));
    }
}
