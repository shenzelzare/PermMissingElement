public class FroqJump {
    private int solution(int X,int Y,int D) {
        int distance = Y-X;
        int count = (int)Math.ceil(distance/(double)D);
        return count;

    }

    public static void main(String[] args) {
        FroqJump froqJump = new FroqJump();
        System.out.println(froqJump.solution(10,85,30));

    }
}
