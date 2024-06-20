class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
    
    }
    
    public String getName(){
        return this.name;
    }
}
public class ELAB2303 {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        // a.
        if (m1.getName() == m2.getName()){
            System.out.println("value compared: same");
        }
        else{
            System.out.println("value compared: different");
        }


        if (m2.equals(m1)) {
            System.out.println("reference compared: same");
        } else {
            System.out.println("reference compared: different");
        }
    }
}
