import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("_____________________________");
        System.out.println("_____________________________");
        System.out.println(" Pendataan Ruangan Di Gedung ");
        System.out.println("             JTI             ");
        System.out.println("    D-IV Teknik Informatika  ");
        System.out.println("             2023            ");
        System.out.println("_____________________________");
        System.out.println("_____________________________");

        Scanner input=new Scanner(System.in);

        int lantai;

        System.out.println("masukkan lantai tujuan");
        lantai=input.nextInt();

        if(lantai==5){           
            Scanner scanner=new Scanner(System.in);
        String ruangan;
            System.out.println("      pilih ruangan       ");
            System.out.println("input | ruangan         | ");
            System.out.println("B1    | RT1             | ");
            System.out.println("B2    | RT2             | ");
            System.out.println("B3    | RT3             | ");
            System.out.println("B4    | RT4             | ");
            System.out.println("B5    | RT5             | ");
            System.out.println("B6    | RT6             | ");
            System.out.println("B7    | RT7             | ");
            System.out.println("B8    | LPY1            | ");
            System.out.println("__________________________");

            System.out.print(" masukkan ruangan tujuan: ");
            ruangan=scanner.nextLine();
            System.out.println("ruangan ini kosong");

        }else if (lantai==6){
        String ruangan;
        Scanner sc=new Scanner(System.in);
            System.out.println("      pilih ruangan       ");
            System.out.println("input | ruangan         | ");
            System.out.println("T1    | LSI1            | ");
            System.out.println("T2    | LPY2            | ");
            System.out.println("T3    | LSI2            | ");
            System.out.println("T4    | LPY3            | ");
            System.out.println("T5    | LSI3            | ");
            System.out.println("__________________________");

            System.out.print(" masukkan ruangan tujuan: ");
            ruangan=sc.nextLine();
            System.out.println("ruangan ini kosong");
        }
    }
}