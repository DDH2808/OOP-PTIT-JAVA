import java.util.ArrayList;
import java.util.Scanner;

public class INHERITANCE007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        System.out.println(t);
        while (t-- >0){
            String s = sc.nextLine();
            if(s.equals("e")){
                Essay e = new Essay(Integer.parseInt(sc.nextLine()));
                System.out.println(s);
                System.out.println(e.getSoDongTrong());
                e.readQuestion(sc.nextLine());
            }
            else{
                MultiChoice m = new MultiChoice();
                System.out.println(s);
                int n = Integer.parseInt(sc.nextLine());
                System.out.println(n);
                m.readQuestion(sc.nextLine());
                for(int i=0;i<n;i++){
                    m.getListAnswer().add(sc.nextLine());
                }
                for(String x : m.getListAnswer()){
                    System.out.println(x);
                }
            }
        }
    }

}

abstract class TestQuestion{
    protected String question;
    protected abstract void readQuestion(String question);
}

class Essay extends TestQuestion {
    private int soDongTrong;
    protected void readQuestion(String question){
        this.question = question;
        System.out.println(question);
    }

    public int getSoDongTrong() {
        return soDongTrong;
    }

    public Essay(int soDongTrong) {
        this.soDongTrong = soDongTrong;
    }
}

class MultiChoice extends TestQuestion{
    private ArrayList<String> listAnswer = new ArrayList<>();

    public ArrayList<String> getListAnswer() {
        return listAnswer;
    }

    @Override
    protected void readQuestion(String question) {
        this.question = question;
        System.out.println(question);
    }
}