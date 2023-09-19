import java.util.Scanner;
public class main {
    public static void main(String[] args) {

Scanner input=new Scanner(System.in);
        int pajak;
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.println(" Selamat Datang di Kalkulator");
        System.out.println("            Pajak            ");
        System.out.println("    D-IV Teknik Informatika  ");
        System.out.println("             2023            ");
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.print("Masukkan jenis pajak: ");
        pajak=input.nextInt();

        if(pajak==1){
            Scanner sc= new Scanner(System.in);
            int gaji, tanggungan=4500000,PTKP, pribadi=54000000;
            double PPh=0.05, totpajak;
            byte jmltanggungan;

            System.out.println("masukkan gaji bersih selama 1 tahun:");
            gaji=sc.nextInt();
            System.out.println("masukkan jumlah tanggungan");
            System.out.print("(anak + istri):");
            jmltanggungan=sc.nextByte();

            PTKP=(jmltanggungan*tanggungan)+pribadi;
            totpajak=(gaji-PTKP)*PPh;
            System.out.println("Total pajak anda: " + totpajak);
        }
    }
}
