package lec240920.Drill240920;

public class LogicalOperatorNot {
    public static void main(String[] args) {
        // 예제: 가게 영업 여부 확인

        // 조건: 가게가 닫혀 있지 않으면(열려 있으면) 방문함
        // 가게가 닫혀 있지 않다는 것은 열려 있다는 의미임

        boolean isClosed = false; // 가게가 닫혀있지 않다

        // 가게가 닫혀 있지 않으면(true) 방문
        boolean visitStore = !isClosed;

        System.out.println("Visit the store:" + visitStore);
    }   // isClosed의 not이니까 true로 출력된다
    

}
