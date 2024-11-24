public class logicalParameter {


        static void checkAge(int age) {

            if (age < 18) {
                System.out.println("Access denied - You are not old enough!");

            } else {
                System.out.println("Access granted - You are old enough!");
            }

        }
    static void checkYear(int year) {

        if (year < 2000) {
            System.out.println("Access denied - You are not old enough!");

        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }
        public static void main(String[] args) {

        checkAge(20);
        checkYear(2022);

        }

}
