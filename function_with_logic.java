public class function_with_logic {
    static void ageCheck(int age){
        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("No Adult");
        }
    }

    public static void main(String[] args) {
        ageCheck(17);
    }
}
