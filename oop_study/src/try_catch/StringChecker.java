package try_catch;

public class StringChecker {
    public boolean endingWithSemicolon(String sentence) {
        try {
            System.out.println("endingWithSemicolon 연산 시작.");
        try {
            System.out.println("Arithmetic 연산 시작.");
            int zero = 0;
            int dividedByZero = 3/zero;
            System.out.println("Arithmetic 연산 종료.");
            return dividedByZero > 1;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생!");
        } finally {
            System.out.println("ArithmeticException finally 실행.");
        }
        System.out.println("endingWithSemicolon 연산 리턴 시도.");
        return sentence.endsWith(";");
    } catch (NullPointerException e) {
        System.out.println("endingWithSemicolon 예외 발생!");
        return false;
    } finally {
        mustRun();
    }
}

    private void mustRun() {
        System.out.println("이 메서드는 무조건 실행되어야 한다.");
    }
}

