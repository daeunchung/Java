package try_catch;

public class Main {
    public static void main(String[] args) {
        String sentenceToCheck = null;
        StringChecker checker = new StringChecker();
        if(checker.endingWithSemicolon(sentenceToCheck)) {
            System.out.println("�� ������ �����ݷ����� ������.");
        } else {
            System.out.println("�� ������ �����ݷ����� ������ �ʴ´�.");
        }
    }


}
