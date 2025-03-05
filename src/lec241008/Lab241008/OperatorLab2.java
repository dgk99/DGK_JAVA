package lec241008.Lab241008;

class PermissionManager {
    // 권한 비트 위치 상수 정의
    static final int READ = 0;   // 읽기 권한 비트 위치
    static final int WRITE = 1;  // 쓰기 권한 비트 위치
    static final int EDIT = 2;   // 수정 권한 비트 위치
    static final int DELETE = 3; // 삭제 권한 비트 위치

    private byte permissions = 0; // 초기 권한 설정은 모두 비활성화 (0)

    int mask = 1;
    int result = 0;

    // 권한 설정 메서드
    void setPermissions(int permissions, boolean enable) {
        // 여기에 코드 작성
        if (enable) {
            if (permissions == READ) {
                result = permissions | mask;
            } else if (permissions == WRITE) {
                result = permissions | (mask << 1);
            } else if (permissions == EDIT) {
                result = permissions | (mask << 2);
            } else if (permissions == DELETE) {
                result = permissions | (mask << 3);
            }
        }
    }

    // 권한 확인 메서드
    boolean checkPermissions(int permissions) {
        // permission : 확인하려는 권한 (0번째, 1번째, 2번째, 3번째 비트 자리 중 하나)
        // - permission 위치 비트가 1이면 true, 그렇지 않으면 false를 반환
        // - & 연산과 << 연산을 사용해 비트 값을 확인

        if (permissions == READ) {
            mask = 1;
        } else if (permissions == WRITE) {
            mask = 1 << 1;
        } else if (permissions == EDIT) {
            mask = 1 << 2;
        } else if (permissions == DELETE) {
            mask = 1 << 3;
        }
        boolean check = (result & mask) != 0 ? true : false;

        return check; // 반환값은 예시입니다.
    }

    // 모든 권한 초기화 메서드
    void removeAllPermissions() {
        // permissions 값을 0으로 설정하여 모든 비트를 0으로 만듦
        result &= ~result;
        // 여기에 코드 작성
    }
}
public class OperatorLab2 {
    public static void main(String[] args) {
        PermissionManager pm = new PermissionManager();

        // 읽기, 쓰기, 삭제 권한 설정
        pm.setPermissions(PermissionManager.READ, true);   // 읽기 권한 활성화
        pm.setPermissions(PermissionManager.WRITE, true);  // 쓰기 권한 활성화
        pm.setPermissions(PermissionManager.DELETE, true); // 삭제 권한 활성화

        // 권한 확인
        System.out.println("읽기 권한: " + pm.checkPermissions(PermissionManager.READ));   // 출력: true
        System.out.println("쓰기 권한: " + pm.checkPermissions(PermissionManager.WRITE));  // 출력: true
        System.out.println("수정 권한: " + pm.checkPermissions(PermissionManager.EDIT));   // 출력: false
        System.out.println("삭제 권한: " + pm.checkPermissions(PermissionManager.DELETE)); // 출력: true

        // 모든 권한 제거
        pm.removeAllPermissions();
        System.out.println("읽기 권한: " + pm.checkPermissions(PermissionManager.READ));   // 출력: false
        System.out.println("삭제 권한: " + pm.checkPermissions(PermissionManager.DELETE)); // 출력: false


    }
}
