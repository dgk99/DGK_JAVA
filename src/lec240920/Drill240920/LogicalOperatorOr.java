package lec240920.Drill240920;

public class LogicalOperatorOr {
    public static void main(String[] args) {
        // 예제: 우산을 가져가야 하는 조건
        //     - 조건: 오늘 비가 오거나, 날씨가 흐리면 우산을 가져감
        //     - 둘 중 하나만 만족해도 우산을 가져감.

        boolean isRaining = false;
        boolean isCloudy = true;

        // 비가 오거나, 날씨가 흐리면 우산을 가져가야 함
        boolean takeUnbrella = isRaining || isCloudy;

        System.out.println("Take an umbrella: " + takeUnbrella);
    }   // isRaining이 false이지만, isCloudy가 true이기에
        // 결과 값은 true로 출력된다.
}
