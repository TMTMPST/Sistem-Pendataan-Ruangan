import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        System.out.println("====================================================================================================================");
        System.out.println("   _____ _____  _____ _______ ______ __  __   _____  ______ _____  _____            _         _  __          _   _ ");
        System.out.println("  / ____|_   _|/ ____|__   __|  ____|  \\/  | |  __ \\|  ____|  __ \\|  __ \\ /\\       | |  /\\   | |/ /    /\\   | \\ | |");
        System.out.println(" | (___   | | | (___    | |  | |__  | \\  / | | |__) | |__  | |__) | |__) /  \\      | | /  \\  | ' /    /  \\  |  \\| |");
        System.out.println("  \\___ \\  | |  \\___ \\   | |  |  __| | |\\/| | |  ___/|  __| |  _  /|  ___/ /\\ \\ _   | |/ /\\ \\ |  <    / /\\ \\ | . ` |");
        System.out.println("  ____) |_| |_ ____) |  | |  | |____| |  | | | |    | |____| | \\ \\| |  / ____ \\ |__| / ____ \\| . \\  / ____ \\| |\\  |");
        System.out.println(" |_____/|_____|_____/   |_|  |______|_|  |_| |_|    |______|_|  \\_\\_| /_/    \\_\\____/_/    \\_\\_|\\_\\/_/    \\_\\_| \\_|");
        System.out.println("====================================================================================================================");
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
        System.out.println("=============================");
        System.out.println("|Input  |Jenis Pajak        |");
        System.out.println("| 1     | PPh               |");
        System.out.println("| 2     | PBB               |");
        System.out.println("| 3     | Pajak Kendaraan   |");
        System.out.println("=============================");        
        System.out.print("Masukkan jenis pajak: ");
        pajak=input.nextInt();

        if(pajak==1){
            Scanner sc= new Scanner(System.in);
            int gaji, tanggungan=4500000,PTKP, pribadi=54000000;
            double PPh=0.05, totpajak;
            byte jmltanggungan;
            String status;

            System.out.print("Apakah anda sudah menikah?: ");
            status=sc.nextLine();
            
            if(status.equalsIgnoreCase("iya")){
                System.out.println("masukkan gaji bersih selama 1 tahun:");
                gaji=sc.nextInt();
                System.out.println("masukkan jumlah tanggungan");
                System.out.print("(anak + istri):");
                jmltanggungan=sc.nextByte();

                PTKP=(jmltanggungan*tanggungan)+pribadi;
                totpajak=(gaji-PTKP)*PPh;
                System.out.println("Total pajak anda: " + totpajak);

            }else {
                System.out.println("masukkan gaji bersih selama 1 tahun:");
                gaji=sc.nextInt();
                System.out.println("masukkan jumlah tanggungan");
                System.out.print("(anak angkat jika ada):");
                jmltanggungan=sc.nextByte();

                PTKP=(jmltanggungan*tanggungan)+pribadi;
                totpajak=(gaji-PTKP)*PPh;
                System.out.println("Total pajak anda: " + totpajak);
                }

    }else if(pajak==2){
            Scanner scan=new Scanner(System.in);
            int bumi, bangunan;
            int luasbangunan, luasbumi;
            int hargabumi,hargabangunan;
            double tetapan1=0.2, tetapan3=0.4, PBB=0.005;
            double NJOP, NJKP, totPBB, nilaiaset, tetapan2=12000000;

            System.out.print("Masukkan luas bangunan anda  :");
            luasbangunan=scan.nextInt();
            System.out.print("Masukkan luas tanah anda     :");
            luasbumi=scan.nextInt();
            System.out.print("Masukkan harga tanah/meter   :");
            hargabumi=scan.nextInt();
            System.out.print("Masukkan harga bangunan/meter:");
            hargabangunan=scan.nextInt();
            
            bumi=luasbumi*hargabumi;
            bangunan=luasbangunan*hargabangunan;
            NJOP=bumi+bangunan;
            nilaiaset=NJOP-tetapan2;

            if(nilaiaset < 1000000000){
                NJKP=nilaiaset*tetapan1;
                totPBB=NJKP*PBB;
                System.out.println("Total pajak anda: " + totPBB);
            }else{
                NJKP=nilaiaset*tetapan3;
                totPBB=NJKP*PBB;
                System.out.println("Total pajak anda: " + totPBB);
            }
    }else if(pajak==3){

    }
}
}

