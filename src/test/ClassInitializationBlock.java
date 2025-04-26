package test;

class Config {
    static String logLevel;

    // 클래스 초기화 블록 -> 클래스가 처음 로딩될 때 한 번만 실행
    static {
        logLevel = "INFO";
        System.out.println("로깅 설정 완료 (레벨: " + logLevel + ")");
    }
}

public class ClassInitializationBlock {
    public static void main(String[] args) {
        System.out.println("현재 로깅 레벨: " + Config.logLevel);

        // 클래스 초기화 블록은 클래스가 처음 사용될 때
        // 단 한 번만 실행된다
        System.out.println("다시 접근: " + Config.logLevel);
    }
}
