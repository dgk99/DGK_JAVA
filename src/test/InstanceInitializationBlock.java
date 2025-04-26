package test;

class User {
    private String name;
    private String grade;

    { // 인스턴스 초기화 블록 -> 모든 사용자에게 공통 적용
        grade = "일반";
        System.out.println("기본 등급 설정 완료!");
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
        this.name = "이름없음";
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 등급: " + grade);
    }
}

public class InstanceInitializationBlock {
    public static void main(String[] args) {
        User u1 = new User("철수");
        User u2 = new User();
        u1.printInfo();
        u2.printInfo();
    }
}