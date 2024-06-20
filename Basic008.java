public class Basic008 {
    public static void main(String[] args){
        int a = 100;
        int b = 200;
        int sum = 0;
        System.out.println("Numbers between 100 and 200, divisible by 9:");
        for(int i = a; i < b; i++){
            if(i % 9 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);  
    }
}
