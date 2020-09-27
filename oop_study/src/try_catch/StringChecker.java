package try_catch;

public class StringChecker {
    public boolean endingWithSemicolon(String sentence) {
        try {
            System.out.println("endingWithSemicolon ���� ����.");
        try {
            System.out.println("Arithmetic ���� ����.");
            int zero = 0;
            int dividedByZero = 3/zero;
            System.out.println("Arithmetic ���� ����.");
            return dividedByZero > 1;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException �߻�!");
        } finally {
            System.out.println("ArithmeticException finally ����.");
        }
        System.out.println("endingWithSemicolon ���� ���� �õ�.");
        return sentence.endsWith(";");
    } catch (NullPointerException e) {
        System.out.println("endingWithSemicolon ���� �߻�!");
        return false;
    } finally {
        mustRun();
    }
}

    private void mustRun() {
        System.out.println("�� �޼���� ������ ����Ǿ�� �Ѵ�.");
    }
}

