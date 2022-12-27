package Level01;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int i = 0;

        while(n > 0){
            answer[i] = (int) (n % 10);
            i++;
            n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 c = new 자연수뒤집어배열로만들기();
        System.out.println(c.solution(12345));
    }
}
