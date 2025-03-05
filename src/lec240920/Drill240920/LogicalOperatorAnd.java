package lec240920.Drill240920;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        // 예제: 영화관 입장 조건
        //      - 조건: 18세 이상이고, 티켓이 있어야 입장 가능
        //      - 두 조건 모두 만족해야 입장할 수 있음.

        int age = 20;
        boolean hasTicket = true;

        // 나이가 18세 이상이고, 티켓을 가지고 있어야 입장 가능
        boolean canEnter = (age >= 18) && hasTicket;

        System.out.println("Can enter the movie theater: " + canEnter);
        // age가 18이상 이면서, hasTicket이 true 이기 때문에
        // canEnter가 true로 출력된다.
    }
}
