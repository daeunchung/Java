package try_catch;

public class Main {
    public static void main(String[] args) {
        String sentenceToCheck = null;
        StringChecker checker = new StringChecker();
        if(checker.endingWithSemicolon(sentenceToCheck)) {
            System.out.println("이 문장은 세미콜론으로 끝난다.");
        } else {
            System.out.println("이 문장은 세미콜론으로 끝나지 않는다.");
        }
    }


}
