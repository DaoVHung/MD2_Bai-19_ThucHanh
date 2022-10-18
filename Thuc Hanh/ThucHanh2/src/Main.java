import java.util.Scanner;

public class Main {
    private static AccountExample accountExample;
    public static void main(String[] args) {
        accountExample = new AccountExample();
        System.out.println("Nhap vao 1 day de kiem tra : ");
        Scanner sc = new Scanner(System.in);
        String acc = sc.nextLine();
        boolean isvalid = accountExample.validate(acc);
        if(isvalid){
            System.out.println("Dang ky thanh cong");
        }else {
            System.out.println("Sai dinh dang !");
        }


    }
}