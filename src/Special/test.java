package Special;

public class test {
    public static void main(String[] args) {
        char[] selectedOperators = {'+', '+', '*', '*', '*', '*'}; // 1 + 5
        int contiguousCount = 1;
        int bonusPoint = 0;

        for (int i = 0; i < selectedOperators.length ; i++) {
            // 같은 문자가 연속적으로 발생
            if (i < selectedOperators.length - 1 && selectedOperators[i] == selectedOperators[i + 1]) {
                contiguousCount++;
            } else {
                // 연속된 문자 수 -> 2
                if (contiguousCount == 2) {
                    switch (selectedOperators[i]) {
                        case '+':
                            bonusPoint += 1;
                            break;
                        case '-':
                            bonusPoint -= 1;
                            break;
                        case '*':
                            bonusPoint += 2;
                            break;
                    }
                    // 연속된 문자 수 -> 3
                } else if (contiguousCount >= 3) {
                    switch (selectedOperators[i]) {
                        case '+':
                            bonusPoint += 3;
                            break;
                        case '-':
                            bonusPoint -= 3;
                            break;
                        case '*':
                            bonusPoint += 5;
                            break;
                    }
                }

                contiguousCount = 1;
            }

            // 언제 bonus point를 계산 해야 될까요?
        }

        System.out.println(bonusPoint);


    }
}
