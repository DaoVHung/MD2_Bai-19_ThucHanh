import java.util.Scanner;

public class Main {
    private static EmailExamole emailExamole;
    public static final String[] validEmail = new String[]{
            "a@gmail.com", "ab@yahoo.com","abc@hotmail.com"
    };
    public static final String[] invalidEmail = new String[] {
      "@gmail.com","ab@gmail.","@#abc@gmail.com"
    };


    public static void main(String[] args) {
            emailExamole =new EmailExamole();
        System.out.println("Nhap vao 1 eMail : ");
//        Scanner sc = new Scanner(System.in);
//        String inputEmail = sc.nextLine();
//        boolean isvalid = emailExamole.validate(inputEmail);
//        System.out.println("Ket qua : " + isvalid);

        for (String email :validEmail) {
            boolean isvalid = emailExamole.validate(email);
            System.out.println("Email is " + email + " is valid: => " + isvalid) ;
        }
        for (String email : invalidEmail
             ) {

            boolean isvalid = emailExamole.validate(email);
            System.out.println("Email is " + email + " is valid: => " + isvalid);
        }


    }
}