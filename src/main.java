public class main {

    public static void main(String[] args) {
<<<<<<< HEAD

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
=======
        System.out.println("====================================================================================================================");
        System.out.println("   _____ _____  _____ _______ ______ __  __   _____  ______ _____  _____            _         _  __          _   _ ");
        System.out.println("  / ____|_   _|/ ____|__   __|  ____|  \\/  | |  __ \\|  ____|  __ \\|  __ \\ /\\       | |  /\\   | |/ /    /\\   | \\ | |");
        System.out.println(" | (___   | | | (___    | |  | |__  | \\  / | | |__) | |__  | |__) | |__) /  \\      | | /  \\  | ' /    /  \\  |  \\| |");
        System.out.println("  \\___ \\  | |  \\___ \\   | |  |  __| | |\\/| | |  ___/|  __| |  _  /|  ___/ /\\ \\ _   | |/ /\\ \\ |  <    / /\\ \\ | . ` |");
        System.out.println("  ____) |_| |_ ____) |  | |  | |____| |  | | | |    | |____| | \\ \\| |  / ____ \\ |__| / ____ \\| . \\  / ____ \\| |\\  |");
        System.out.println(" |_____/|_____|_____/   |_|  |______|_|  |_| |_|    |______|_|  \\_\\_| /_/    \\_\\____/_/    \\_\\_|\\_\\/_/    \\_\\_| \\_|");
        System.out.println("====================================================================================================================");
>>>>>>> 85e2740b699c565a92bc15df1e065c22a3d35d48
    }
}
