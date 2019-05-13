import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to my Caesar Cipher");
        System.out.println("============================");

        System.out.println("Encrypt your message by entering it in the next line");
        String input = myScanner.nextLine();
        System.out.println("============================");

        System.out.println("Enter a key");
        int key = myScanner.nextInt();
        System.out.println("============================");

        System.out.println("Encrypted message: " + Encrypt.encrypt(input, key));
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("============================");

        System.out.println("To decrypt a message enter it below");
        String sema = myScanner.nextLine();
        System.out.println("============================");

        System.out.println("Enter the key you used");
        int namba = myScanner.nextInt();
        System.out.println("============================");

        System.out.println("Decrypted message: " + Decrypt.decrypt(sema, namba));
        System.out.println("============================");
    }
}