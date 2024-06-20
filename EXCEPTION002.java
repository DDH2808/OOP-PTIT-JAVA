import java.util.Scanner;

public class EXCEPTION002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            try {
                CheckFileExtension(sc.nextLine());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void CheckFileExtension(String fileName) throws Exception{
        if(fileName.endsWith(".java")){
            System.out.println(1);
        }
        else if(fileName.isEmpty()){
            throw new Exception("Not java file exception.Mark is -1");
        }
        else System.out.println(0);
    }
}