import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1500;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        int price;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println();
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırılacak Tutarı Giriniz:");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekmek İstediğiniz Miktarı Girin:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeni :" + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
