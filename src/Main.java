import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;

        System.out.println("Kullanıcı Adı Giriniz : ");
        userName = input.nextLine();

        System.out.println("Şifre Giriniz : ");
        password = input.nextLine();

        if (userName.equals("erdem") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Yanlış Giriş yaptınız, Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");
            String resetChoice = input.nextLine();

            if (resetChoice.equalsIgnoreCase("Evet")) {
                boolean passwordChanged = false;
                while (!passwordChanged) {
                    System.out.println("Yeni Şifre Giriniz: ");
                    String newPassword = input.nextLine();

                    if (newPassword.equals(password)) {
                        System.out.println("Yeni şifre, eski şifre ile aynı olamaz. Lütfen farklı bir şifre girin.");
                    } else if (newPassword.equals("java123")) {
                        System.out.println("Yeni şifre, eski şifre ile aynı olamaz. Lütfen farklı bir şifre girin.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        passwordChanged = true;
                    }
                }
            } else {
                System.out.println("İşlem iptal edildi.");
            }
        }
    }
}
