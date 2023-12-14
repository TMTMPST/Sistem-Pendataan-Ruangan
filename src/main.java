
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        long[] akun = new long[10];
        long username, password;
        String[] nama = new String[10];
        String pilih, pengguna;

        do {
            System.out.println("=============== SELAMAT DATANG DI SISTEM PERPAJAKAN ===============");
            System.out.println("Silahkan mengetik Login / Daftar");
            System.out.println("Ketik OFF untuk mematikan program\n\n");
            System.out.print("LOGIN / DAFTAR / OFF: ");
            pilih=scan.nextLine();

            if (pilih.equalsIgnoreCase("daftar")) {
                System.out.println("\n\n=======================----PENDAFTARAN----=======================");
                System.out.print("Masukkan nama pengguna                  : ");
                pengguna=sc.nextLine();
                System.out.print("Masukkan username(NIM)                  : ");
                username=sc.nextLong();
                System.out.print("Masukkan password(minimal 4 digit angka): ");
                password=sc.nextLong();
                System.out.println("\n\n=======================------------------=======================");


                int i=0;
                for (;i<akun.length;i++){
                    if (akun[i]==0) {
                        akun[i]=(username+password);
                        nama[i]=pengguna;
                        break;
                    }
                }
                System.out.println("Selamat! Akun anda telah berhasil terdaftar");
                System.out.println();
                System.out.println("Anda berhasil login!");
                System.out.println("Selamat datang "+nama[i]);
                sc.nextLine();
        
            }else if (pilih.equalsIgnoreCase("login")) {
                while (true) {
                    System.out.println("\n\n=======================-------LOGIN-------=======================");
                    System.out.println("LOGIN!");
                    System.out.print("Masukkan username: ");
                    username=sc.nextLong();
                    System.out.print("Masukkan password: ");
                    password=sc.nextLong();
                    sc.nextLine();
                    System.out.println("\n\n=======================------------------=======================");

                    int i = 0;
                    for (; i < akun.length; i++) {
                        if ((username+password)==akun[i]) {
                            break;
                        }
                    }
                    if (i<10) {
                        System.out.println("Anda berhasil login!");
                        System.out.println();
                        System.out.println("Selamat datang "+nama[i]);
                        break;
                    }else {
                        System.out.println("Mohon maaf username/password yang anda masukkan salah!");
                        System.out.println();
                        continue;
                    }
                }
            }else if (pilih.equalsIgnoreCase("off")) {
                System.out.println();
                System.out.println("===========================TERIMA KASIH===========================");
                System.out.println();
                break;
            }else {
                System.out.println("INPUT ERROR!!");
                continue; 
            }                                 
        System.out.println();
        System.out.println("====================================================================================================================");
        System.out.println("   _____ _____  _____ _______ ______ __  __   _____  ______ _____  _____            _         _  __          _   _ ");
        System.out.println("  / ____|_   _|/ ____|__   __|  ____|  \\/  | |  __ \\|  ____|  __ \\|  __ \\ /\\       | |  /\\   | |/ /    /\\   | \\ | |");
        System.out.println(" | (___   | | | (___    | |  | |__  | \\  / | | |__) | |__  | |__) | |__) /  \\      | | /  \\  | ' /    /  \\  |  \\| |");
        System.out.println("  \\___ \\  | |  \\___ \\   | |  |  __| | |\\/| | |  ___/|  __| |  _  /|  ___/ /\\ \\ _   | |/ /\\ \\ |  <    / /\\ \\ | . ` |");
        System.out.println("  ____) |_| |_ ____) |  | |  | |____| |  | | | |    | |____| | \\ \\| |  / ____ \\ |__| / ____ \\| . \\  / ____ \\| |\\  |");
        System.out.println(" |_____/|_____|_____/   |_|  |______|_|  |_| |_|    |______|_|  \\_\\_| /_/    \\_\\____/_/    \\_\\_|\\_\\/_/    \\_\\_| \\_|");
        System.out.println("====================================================================================================================");
        
        while (true) {
            System.out.println("==================================");
            System.out.println("|INPUT  | PILIH MENU             |");
            System.out.println("|1      | INFORMASI              |");
            System.out.println("|2      | Calculator             |");
            System.out.println("|0      | EXIT                   |");
            System.out.println("==================================");

            System.out.print("Masukkan Pilihan Menu : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                int pajak='0';
                System.out.println();
                System.out.println("__________________________________");
                System.out.println("__________________________________");
                System.out.println(" Selamat Datang di Pusat Informasi");
                System.out.println("               Pajak              ");
                System.out.println("      D-IV Teknik Informatika     ");
                System.out.println("               2023               ");
                System.out.println("__________________________________");
                System.out.println("=============================");
                System.out.println("|Input  |Jenis Pajak        |");
                System.out.println("| 1     | PPh               |");
                System.out.println("| 2     | PBB               |");
                System.out.println("| 3     | Pajak Kendaraan   |");
                System.out.println("| 4     | Pajak Bea Cukai   |");
                System.out.println("| 0     | Exit              |");
                System.out.println("=============================");        
                System.out.print("Masukkan jenis pajak: ");
                pajak=sc.nextInt();
            
                if (pajak==1) {
                    String InfoPajak = null;
                    System.out.println("PPh merupakan pajak penghasilan yang wajib dibayarkan oleh para pekerja setiap tahunnya.");
                    System.out.println("Pajak PPh ini sendiri tergantung pada jumlah PKP dan PTKP dari setiap perkerja.");
                    System.out.println("nilai presentase pajak yang dikenakan pada setiap orang berbeda tergantung dari besarnya penghasilan.");
                    System.out.println("Menu informasi:");
                    System.out.println("a. PTKP");
                    System.out.println("b. Tanggungan");
                    System.out.println("c. Presentase");
                    System.out.println("Informasi apa yang ingin anda cari?");
                    InfoPajak = sc.next();

                    InfoPPh(InfoPajak);

                } else if (pajak == 2) {
                    System.out.println();
                    System.out.println("Pajak Bumi dan Bangunan (PBB) merupakan sebuah biaya yang harus disetorkan atas keberadaan tanah dan bangunan \n" +
                                        "yang memberikan keuntungan dan kedudukan sosial ekonomi bagi seseorang ataupun badan. Karena Pajak Bumi dan Bangunan (PBB)\n" +
                                        "bersifat kebendaan, maka besaran tarifnya ditentukan dari keadaan objek bumi atau bangunan yang ada.");
                    System.out.println();
                    System.out.println("Menu Informasi :");
                    System.out.println("a. Objek dan Subjek");
                    System.out.println("b. Bukan Objek");
                    System.out.println("c. Hukum");
                    System.out.println("d. NJOP");
                    System.out.println();
                    System.out.print("Informasi apa yang ingin anda cari? ");
                    String Infor = sc.next();
                    InfoPBB(Infor);

                } else if (pajak == 3){
                    System.out.println("Pajak kendaraan bermotor (PKB) adalah pajak yang dikenakan atas kepemilikan dan/atau penguasaan kendaraan bermotor,\n" + 
                                        "termasuk kendaraan beroda beserta gandengannya yang digunakan di jalan darat dan kendaraan bermotor yang dioperasikan di air .");
                    System.out.println("Menu Informasi :");
                    System.out.println("a. Hukum" );
                    System.out.println("b. Denda");
                    System.out.println("c. Jenis");
                    System.out.println("Informasi apa yang ingin anda cari?");
                    String jensPKBString = sc.next();
                    infoPKB(jensPKBString);
                
                }else if (pajak==0) {
                    System.out.println();
                    System.out.println("==========================TERIMA KASIH==========================");
                    System.out.println();
                    continue;
                }
            }else if (menu==0) {
                break;
            }
        
            if (menu == 2) {
            while (true){                   //perulangan untuk lanjut menghitung atau tidak
                int pajak='0';                                 
                for(;pajak>=5;){            //perulangan pada input pajak
                    Scanner input=new Scanner(System.in);        
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
                    System.out.println("| 4     | Pajak Bea Cukai   |");
                    System.out.println("| 0     | Exit              |");
                    System.out.println("=============================");        
                    System.out.print("Masukkan jenis pajak: ");
                    pajak=input.nextInt();
                        
                    if(pajak==1){
                        int gaji, tanggungan=4500000,PTKP, pribadi=54000000, pkp, totpajak; 
                        double denda=0.02,totPersenDenda;
                        int jmltanggungan,bulanJatuhTempo,tahunJatuhTempo,tahunBayar,bulanBayar,selisihBulan;
                        String status;

                        System.out.print("Apakah anda sudah menikah?: ");
                        status=input.next();
                        
                        if(status.equalsIgnoreCase("iya")){
                            System.out.println("masukkan gaji bersih selama 1 tahun:");
                            gaji=input.nextInt();
                            System.out.println("masukkan jumlah tanggungan");
                            System.out.print("(anak + istri):");
                            jmltanggungan=input.nextInt();
                            System.out.print("Masukkan bulan jatuh tempo: ");
                            bulanJatuhTempo=input.nextInt();
                            System.out.print("Masukkan tahun jatuh tempo: ");
                            tahunJatuhTempo=input.nextInt();
                            System.out.print("Masukkan bulan anda membayar: ");
                            bulanBayar=input.nextInt();
                            System.out.print("Masukkan tahun anda membayar: ");
                            tahunBayar=input.nextInt();

                            PTKP=(jmltanggungan*tanggungan)+pribadi;
                            pkp=gaji-PTKP;
                            selisihBulan=((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                            totPersenDenda=selisihBulan*denda;
                            
                            if(pkp<1){
                                System.out.println("Penghasilan anda tidak dikenakan pajak");
                            }else if(pkp>1){
                                if (selisihBulan>0){
                                    double hasilPajak[] = new double[3];
                                    hasilPajak = pajakDenganDenda(pkp, totPersenDenda);
                                    System.out.println("Total pajak anda: " + hasilPajak[0]);
                                    System.out.println("Total denda anda: "+hasilPajak[1]);
                                    System.out.println("Total yang harus dibayar: "+hasilPajak[2]);
                                }else{
                                    totpajak=pajakTanpaDenda(pkp);
                                    System.out.println("Total pajak anda: " + totpajak);
                                }
                            }
                        }else {
                            System.out.println("masukkan gaji bersih selama 1 tahun:");
                            gaji=input.nextInt();
                            System.out.print("Masukkan bulan jatuh tempo: ");
                            bulanJatuhTempo=input.nextInt();
                            System.out.print("Masukkan tahun jatuh tempo: ");
                            tahunJatuhTempo=input.nextInt();
                            System.out.print("Masukkan bulan anda membayar: ");
                            bulanBayar=input.nextInt();
                            System.out.print("Masukkan tahun anda membayar: ");
                            tahunBayar=input.nextInt();
                            PTKP=(0*tanggungan)+pribadi;
                            pkp=gaji-PTKP;
                            selisihBulan=((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                            totPersenDenda=selisihBulan*denda;

                            if(pkp<1){
                                System.out.println("Penghasilan anda tidak dikenakan pajak");
                            }else if(pkp>1){
                                if (selisihBulan>0){
                                    double hasilPajak[] = new double[3];
                                    hasilPajak = pajakDenganDenda(pkp, totPersenDenda);
                                    System.out.println("Total pajak anda: " + hasilPajak[0]);
                                    System.out.println("Total denda anda: "+hasilPajak[1]);
                                    System.out.println("Total yang harus dibayar: "+hasilPajak[2]);
                                }else{
                                    totpajak=pajakTanpaDenda(pkp);
                                    System.out.println("Total pajak anda: " + totpajak);
                                }
                            }
                        }
                    }else if(pajak==2){
                        long luasTanah, luasBangunan, hargaTanahPerMeter, hargaBangunanPerMeter;
                        int bulan;
                        String telat;

                        System.out.print("Masukkan luas tanah (meter persegi)   : ");
                        luasTanah = input.nextInt();
                        System.out.print("Masukkan luas bangunan (meter persegi): ");
                        luasBangunan = input.nextInt();
                        System.out.print("Masukkan harga tanah per meter        : ");
                        hargaTanahPerMeter = input.nextInt();
                        System.out.print("Masukkan harga bangunan per meter     : ");
                        hargaBangunanPerMeter = input.nextInt();
                        System.out.print("Apakah anda telat membayar pajak (y/n)? ");
                        telat = input.next();
                        System.out.print("Berapa bulan anda tidak membayar pajak: ");
                        bulan = input.nextInt();

                        double[] pajakPBB = perhitunganPBB(bulan ,telat, luasTanah, luasBangunan, hargaTanahPerMeter, hargaBangunanPerMeter);
                        System.out.println("NJOP Bumi        : " + pajakPBB[0]);
                        System.out.println("NJOP Bangunan    : " + pajakPBB[1]);
                        System.out.println("Total NJOP       : " + pajakPBB[2]);
                        System.out.println("NJKP             : " + pajakPBB[3]);
                        System.out.println("PBB              : " + pajakPBB[4]);
                        System.out.println("Denda            : " + pajakPBB[5]);
                        System.out.println("PBB Setelah Denda: " + pajakPBB[6]);


                    }else if(pajak==3){
                        String jenPKB;        
                        do {
                            System.out.print("Masukkan jenis Kendaraan (Motor/Mobil) \t: ");
                            jenPKB=input.next();

                            if(jenPKB.equalsIgnoreCase("motor")){
                                int cc, PKB, koefBobot;
                                int TNKB, terbitSTNK, bulanJatuhTempo, tahunJatuhTempo, bulanBayar, tahunBayar;
                                byte urutKendaraan;
                                
                                
                                System.out.print("Kendaraan ke-                         : ");
                                urutKendaraan=input.nextByte();
                                System.out.print("Masukkan koefisien bobot kendaraan    : ");
                                koefBobot=input.nextInt();
                                System.out.print("Masukkan nilai PKB kendaraan          : ");
                                PKB=input.nextInt();
                                System.out.print("Masukkan cc kendaraan                 : ");
                                cc=input.nextInt();
                                System.out.print("Masukkan biaya pengesahan STNK        : ");
                                TNKB=input.nextInt();
                                System.out.print("Masukkan biaya penerbitan STNK        : ");
                                terbitSTNK=input.nextInt();
                                System.out.print("Masukkan bulan jatuh tempo            : ");
                                bulanJatuhTempo=input.nextInt();
                                System.out.print("Masukkan tahun jatuh tempo            : ");
                                tahunJatuhTempo=input.nextInt();
                                System.out.print("Masukkan bulan anda membayar      : ");
                                bulanBayar=input.nextInt();
                                System.out.print("Masukkan tahun anda membayar      : ");
                                tahunBayar=input.nextInt();

                                double hasilTotPajak[] = new double[3];
                                hasilTotPajak = perhitunganPKBMotor(cc, urutKendaraan, koefBobot, PKB, TNKB, terbitSTNK, bulanJatuhTempo, bulanBayar, tahunJatuhTempo, tahunBayar);

                                System.out.println("Denda Anda                 :" + hasilTotPajak[0]);
                                System.out.println("Total pajak anda             : "+ hasilTotPajak[1]);
                                System.out.println("Total pajak 5 tahunan anda   : "+ hasilTotPajak[2]);
                                
                            } if (jenPKB.equalsIgnoreCase("mobil")) {
                                int cc, PKB;
                                int TNKB, terbitSTNK, bulanJatuhTempo, tahunJatuhTempo, bulanBayar, tahunBayar;
                                byte urutKendaraan;
                                String jenMobil, bahanBakar;

                                System.out.print("Kendaraan ke-                         : ");
                                urutKendaraan=input.nextByte();
                                System.out.print("Masukkan nilai PKB kendaraan          : ");
                                PKB=input.nextInt();
                                System.out.print("Masukkan biaya pengesahan STNK        : ");
                                TNKB=input.nextInt();
                                System.out.print("Masukkan biaya penerbitan STNK        : ");
                                terbitSTNK=input.nextInt();
                                System.out.print("Masukkan bulan jatuh tempo            : ");
                                bulanJatuhTempo=input.nextInt();
                                System.out.print("Masukkan tahun jatuh tempo            : ");
                                tahunJatuhTempo=input.nextInt();
                                System.out.print("Masukkan bulan anda membayar      : ");
                                bulanBayar=input.nextInt();
                                System.out.print("Masukkan tahun anda membayar      : ");
                                tahunBayar=input.nextInt();
                                System.out.print("Masukkan jenis kendaraan listrik / bensin : ");
                                bahanBakar = input.next();
                                System.out.println("\n\nUntuk Kendaraan Berbahan Bakar BENSIN");
                                System.out.println(" Jika Bahan Bakar Listrik KETIK (0)");
                                System.out.print("Masukkan cc kendaraan                 : ");
                                cc=input.nextInt();
                                System.out.print("Masukkan Jenis Kendaraan (Mobil / Truck / bus): ");
                                jenMobil = input.next();
                                double hasilTotPajak[] = new double[3];

                                hasilTotPajak = perhitunganPKBMobil(jenMobil, cc, urutKendaraan, bahanBakar, PKB, terbitSTNK, bulanJatuhTempo, tahunJatuhTempo, bulanBayar, tahunBayar, TNKB);
                                System.out.println("Denda Anda                 :" + hasilTotPajak[0]);
                                System.out.println("Total pajak anda             : "+ hasilTotPajak[1]);
                                System.out.println("Total pajak 5 tahunan anda   : "+ hasilTotPajak[2]);
                            }
                        }while (true);
                            
                    }else if(pajak==4){
                        double hargaBarang, asuransi, biayaKirim;
                        double beaMasuk=0.075, ppn=0.11;
                        int nilaiPabean, BM, nilaiImpor, totalPungutan, kurs=15700;

                        System.out.print("Masukkan harga barang impor (USD)      : ");
                        hargaBarang=input.nextDouble();
                        System.out.print("Masukkan asuransi barang impor (USD)   : ");
                        asuransi=input.nextDouble();
                        System.out.print("Masukkan biaya kirim barang impor (USD): ");
                        biayaKirim=input.nextDouble();
                        
                        nilaiPabean=(int)((hargaBarang+asuransi+biayaKirim)*kurs);
                        BM=(int)(beaMasuk*nilaiPabean);
                        nilaiImpor=(int)((nilaiPabean+BM)*ppn);
                        totalPungutan=BM+nilaiImpor;

                        System.out.println("Total pajak Bea Masuk anda adalah: "+BM);
                        System.out.println("Total yang harus dibayar         : "+totalPungutan);
                    }else if (pajak>4){
                        System.out.println("Maaf input yang anda masukkan salah"); //perulangan pada input pajak
                    }
                }if (pajak==0) {
                    System.out.println("Terima kasih! Semoga harimu senin terus!");
                    System.out.println();
                    break;
                }
            }
        }
    }

    }while(true);
}

    static void InfoPPh (String jenisInfo) {
        if (jenisInfo.equalsIgnoreCase("ptkp")) {
            System.out.println();
            System.out.println("PTKP(Penghasilan Tidak Kena Pajak)");
            System.out.println("tarif Penghasilan Tidak Kena Pajak terbaru yang berlaku saat ini masih berdasarkan PMK 101/2016:");
            System.out.println("    1. PTKP orang pribadi sebesar Rp54.000.000,00;");
            System.out.println("    2. PTKP bagi WP yang kawin mendapat tambahan sebesar Rp4.500.000,00;");
            System.out.println("    3. Tambahan PTKP untuk istri yang penghasilannya dengan penghasilan suami sebesar Rp54.000.000,00;");
            System.out.println("    4. Tambahan PTKP untuk tanggungan, sebesar Rp4.500.000,00.");
            System.out.println();
            System.out.println("besaran PTKP terbaru sesuai status pajak yang dimiliki oleh WP:");
            System.out.println("==================================================================================");
            System.out.println("|Golongan                   |Kode                      |Tarif PTKP               |");
            System.out.println("|Tidak Kawin (TK)           |TK0 (tanpa tanggungan)    |Rp. 54.000.000,00        |");
            System.out.println("|                           |TK1 (1 tanggungan)        |Rp. 58.500.000,00        |");
            System.out.println("|                           |TK2 (2 tanggungan)        |Rp. 63.000.000,00        |");
            System.out.println("|                           |TK3 (3 tanggungan)        |Rp. 67.500.000,00        |");
            System.out.println("|Kawin (K)                  |K0 (tanpa tanggungan)     |Rp. 58.500.000,00        |");
            System.out.println("|                           |K1 (1 tanggungan)         |Rp. 63.000.000,00        |");
            System.out.println("|                           |K2 (2 tanggungan)         |Rp. 67.500.000,00        |");
            System.out.println("|                           |K3 (3 tanggungan)         |Rp. 72.000.000,00        |");
            System.out.println("|Kawin dengan penghasilan   |K/I/0 (tanpa tanggungan)  |Rp. 112.500.000,00       |");
            System.out.println("|istri digabung (K/I)       |K/I/1 (1 tanggungan)      |Rp. 117.000.000,00       |");
            System.out.println("|                           |K/I/2 (2 tanggungan)      |Rp. 121.500.000,00       |");
            System.out.println("|T                          |K/I/3 (3 tanggungan)      |Rp. 126.000.000,00       |");
            System.out.println("==================================================================================");
        }else if (jenisInfo.equalsIgnoreCase("tanggungan")) {
            System.out.println();
            System.out.println("Menjadi tanggungan sepenuhnya menurut UU PPh berdasarkan keadaan yang dapat nyata terlihat yakni:");
            System.out.println("    a. Tinggal bersama-sama dengan Wajib Pajak");
            System.out.println("    b. Tidak mempunyai penghasilan sendiri");
            System.out.println("    c. Ditanggung oleh orang tuanya sendiri");
            System.out.println("Maksimal tanggungan dalam PTKP adalah 3 anak, meskipun memiliki lebih dari 3 anak.");
        }else if (jenisInfo.equalsIgnoreCase("presentase")) {
            System.out.println();
            System.out.println("Berikut tarif progresif PPh pasal 21 atau penghasilan kena pajak penghasilan:");
            System.out.println("============================================================");
            System.out.println("|Lapisan Tarif  |Penghasilan Kena Pajak       |PPh 21      |");
            System.out.println("|I              |Rp. 0 - 60 juta              |5%          |");
            System.out.println("|II             |Rp. 0 - 60 juta              |15%         |");
            System.out.println("|III            |Rp. 0 - 60 juta              |25%         |");
            System.out.println("|IV             |Rp. 0 - 60 juta              |30%         |");
            System.out.println("|V              |Rp. 0 - 60 juta              |35%         |");
            System.out.println("============================================================");
        }
    }

    static double[] pajakDenganDenda (int pkp, double totPersenDenda) {
        double[] pajak = new double[3];
        if(pkp<50000000){
            pajak[0]=(int)(pkp*0.05);
            pajak[1]=(int)(pajak[0]*totPersenDenda);
            pajak[2]=pajak[0]+pajak[1];
        }else if(pkp>=50_000_000&&pkp<250_000_000){
            pajak[0]=(int)(pkp*0.15);
            pajak[1]=(int)(pajak[0]*totPersenDenda);
            pajak[2]=pajak[0]+pajak[1];
        }else if(pkp>=250_000_000&&pkp<500_000_000){
            pajak[0]=(int)(pkp*0.25);
            pajak[1]=(int)(pajak[0]*totPersenDenda);
            pajak[2]=pajak[0]+pajak[1];
        }else if(pkp>=500_000_000){
            pajak[0]=(int)(pkp*0.3);
            pajak[1]=(int)(pajak[0]*totPersenDenda);
            pajak[2]=pajak[0]+pajak[1];
        }
        return pajak;
    }

    static int pajakTanpaDenda (int pkp) {
        int pajak=0;
        if(pkp<50000000){
            pajak=(int)(pkp*0.05);
        }else if(pkp>=50_000_000&&pkp<250_000_000){
            pajak=(int)(pkp*0.15);
        }else if(pkp>=250_000_000&&pkp<500_000_000){
            pajak=(int)(pkp*0.25);
        }else if(pkp>=500_000_000){
            pajak=(int)(pkp*0.3);
        }
        return pajak;
    }

    static void InfoPBB (String jenisInfor) {
        if (jenisInfor.equalsIgnoreCase("a")) {
            System.out.println();
            System.out.println("Definisi dari objek Pajak Bumi dan Bangunan (objek PBB) sendiri merupakan tanah atau bangunan yang wajib untuk dipungut pajak. \n" +
                                "bumi dalam Pajak Bumi dan Bangunan meliputi:");
            System.out.println("    1. Sawah");
            System.out.println("    2. Ladang");
            System.out.println("    3. Kebun");
            System.out.println("    4. Tanah");
            System.out.println("    5. Pekarangan");
            System.out.println("    6. Tambang");
            System.out.println();
            System.out.println("Sedangkan, untuk objek bangunan dalam Pajak Bumi dan Bangunan meliputi:");
            System.out.println("    1. Rumah Tinggal");
            System.out.println("    2. Bangunan Usaha");
            System.out.println("    3. Gedung Bertingkat");
            System.out.println("    4. Pusat Perbelanjaan");
            System.out.println("    5. Pagar Mewah");
            System.out.println("    6. Kolam Renang");
            System.out.println("    7. Jalan Tol");
            System.out.println();
        } else if (jenisInfor.equalsIgnoreCase("b")) {
            System.out.println();
            System.out.println("Setelah mengetahui apa saja yang menjadi objek dari Pajak Bumi dan Bangunan (PBB),\n" +
                                "sebenarnya tidak setiap tanah dan bangunan yang ada dapat menjadi objek dalam Pajak Bumi dan Bangunan (PBB),\n" +
                                "ada beberapa juga yang tidak masuk ke dalam objek Pajak Bumi dan Bangunan (PBB),\n" +
                                "yaitu dapat dikelompokkan berdasarkan penggunaannya:");
            System.out.println();
            System.out.println("1. Dipergunakan untuk kepentingan umum dan tidak memperoleh keuntungan di bidang:");
            System.out.println("    - Sosial");
            System.out.println("    - Ibadah");
            System.out.println("    - Kesehatan");
            System.out.println("    - Kebudayaan");
            System.out.println("    - Pendidikan");
            System.out.println("    - Sejarah");
            System.out.println();
            System.out.println("2. Dipergunakan untuk menjaga flora dan fauna:");
            System.out.println("    - Hutan Suaka Alam");
            System.out.println("    - Hutan Lindung");
            System.out.println("    - Taman Nasional");
            System.out.println();
            System.out.println("3. Dipergunakan oleh perwakilan negara atau organisasi internasional:");
            System.out.println("    - Konsulat");
            System.out.println("    - Kedutaan");
            System.out.println();
        } else if (jenisInfor.equalsIgnoreCase("c")) {
            System.out.println();
            System.out.println("Pajak Bumi dan Bangunan (PBB) pada dasarnya diatur dalam beberapa Undang-Undang di Indonesia, yaitu:");
            System.out.println("1. Undang-Undang (UU) No.12 Tahun 1994 Tentang Perubahan atas Undang-Undang (UU) No. 12 Tahun 1985 terkait Pajak Bumi dan");
            System.out.println("   Bangunan (PBB) yang mengatur semua tentang pungutan atas Pajak Bumi dan Bangunan (PBB)");
            System.out.println("2. Undang-Undang (UU) No. 28 Tahun 2009 Tentang Pajak dan Retribusi Daerah yang menjelaskan:");
            System.out.println("   - Bahwa pemerintah kabupaten atau pemerintah kota memiliki wewenang dalam melakukan pemungutan atas Pajak Bumi dan Bangunan");
            System.out.println("     (PBB) di sektor pedesaan dan perkotaan (PBB-P2)");
            System.out.println("   - Bahwa pemerintah atau pusat memiliki wewenang terhadap sektor Pertambangan, Perhutanan, dan Perkebunan (PBB-P3)");
            System.out.println();
        } else if (jenisInfor.equalsIgnoreCase("d")) {
            System.out.println();
            System.out.println("Nilai Jual Objek Pajak (NJOP) dan dihitung berdasarkan harga rata-rata atau harga pasar pada saat melakukan transaksi jual beli.\n" +
                                "Dasar pengenaan pungutan ini ditetapkan oleh Menteri Keuangan (Menkeu)");
            System.out.println();
            System.out.println("Namun, setiap daerah memiliki Nilai Jual Objek Pajak (NJOP) yang berbeda-beda dikarenakan adanya pengaruh dari beberapa dasar penetapan untuk objek bumi dan bangunan, yaitu:");
            System.out.println("    1. Bahan yang digunakan dalam banguann tersebut");
            System.out.println("    2. Letak");
            System.out.println("    3. Rekayasa");
            System.out.println("    4. Kondisi Lingkungan");
            System.out.println("    5. Pemanfaatan");
            System.out.println("    6. Peruntukan");
            System.out.println();
        }
    }

    static void infoPKB (String jensPKB){
        Scanner sc=new Scanner(System.in);
        if (jensPKB.equalsIgnoreCase("hukum")) {
            System.out.println("Hukum Hukum Yang mengatur PKB (Pajak Kendaraan Bermotor)");
            System.out.println("- Undang-Undang Nomor 28 Tahun 2009 tentang Pajak Daerah dan Retribusi Daerah\r\n" + //
                    "- Peraturan Pemerintah Nomor 65 Tahun 2015 tentang Pajak Kendaraan Bermotor\r\n" + //
                    "- Peraturan Menteri Dalam Negeri Nomor 1 Tahun 2021 tentang Penghitungan Dasar Pengenaan Pajak Kendaraan Bermotor dan Bea Balik Nama Kendaraan Bermotor Tahun 2021");
            System.out.println("Apakah Ingin info selengkapnya");
            System.out.print("(y/n) :");
            String info = sc.next();

            if (info.equalsIgnoreCase("y")) {
                System.out.println("\nUndang-Undang Nomor 28 Tahun 2009 merupakan peraturan perundang-undangan yang mengatur secara umum tentang pajak daerah dan retribusi daerah. Dalam undang-undang ini, pajak kendaraan bermotor didefinisikan sebagai pajak atas kepemilikan dan/atau penguasaan kendaraan bermotor yang dioperasionalkan di wilayah Negara Kesatuan Republik Indonesia.\r\n" + //
                        "\r\n" + //
                        "Peraturan Pemerintah Nomor 65 Tahun 2015 merupakan peraturan pelaksana dari Undang-Undang Nomor 28 Tahun 2009. Peraturan pemerintah ini mengatur secara lebih rinci tentang pajak kendaraan bermotor, termasuk dasar pengenaan, tarif, dan tata cara pemungutan.\r\n" + //
                        "\r\n" + //
                        "Peraturan Menteri Dalam Negeri Nomor 1 Tahun 2021 merupakan peraturan yang mengatur tentang penghitungan dasar pengenaan pajak kendaraan bermotor dan bea balik nama kendaraan bermotor tahun 2021. Peraturan menteri ini mengatur tentang cara menghitung dasar pengenaan pajak kendaraan bermotor, termasuk untuk kendaraan bermotor yang baru diproduksi, kendaraan bermotor bekas, dan kendaraan bermotor yang mengalami perubahan.\r\n" + //
                        "\r\n" + //
                        "Selain ketiga peraturan perundang-undangan tersebut, pajak kendaraan bermotor juga diatur dalam peraturan daerah provinsi dan kabupaten/kota. Peraturan daerah ini mengatur tentang hal-hal yang belum diatur dalam peraturan perundang-undangan yang lebih tinggi, seperti tarif pajak kendaraan bermotor, tata cara pembayaran pajak kendaraan bermotor, dan sanksi atas pelanggaran pajak kendaraan bermotor.");
            } if (info.equalsIgnoreCase("n")) {
                System.out.println("");
            }
        } if (jensPKB.equalsIgnoreCase("Denda")) {
            System.out.println("Denda pajak kendaraan bermotor di Indonesia diatur dalam Peraturan Pemerintah Nomor 76 Tahun 2020 tentang Pajak Kendaraan Bermotor. Denda tersebut dikenakan kepada pemilik kendaraan bermotor yang terlambat membayar pajak.\r\n" + //
                    "\r\n" + 
                    "Berikut adalah list denda pajak kendaraan bermotor:\r\n" + 
                    "\r\n" + 
                    "- Keterlambatan 2 hari hingga 1 bulan: Denda sebesar 25% dari Pajak Kendaraan Bermotor (PKB).\r\n" + 
                    "- Keterlambatan 2 bulan hingga 1 tahun: Denda sebesar 25% dari PKB ditambah dengan sanksi administratif berupa bunga sebesar 2% per bulan dari jumlah pajak yang terutang.\r\n" + //
                    "- Keterlambatan lebih dari 1 tahun: Denda sebesar 25% dari PKB ditambah dengan sanksi administratif berupa bunga sebesar 2% per bulan dari jumlah pajak yang terutang, dan tunggakan pajak kendaraan bermotor dianggap sebagai tunggakan pajak daerah lainnya.");
        } if (jensPKB.equalsIgnoreCase("Jenis")) {
            System.out.println("1. Jenis Kendaraan Yang Tekena Pajak");
            System.out.println("2. Jenis Kendaraan Yang Tidak Tekena Pajak");
            System.out.println("Masukkan Input          : ");
            int inp = sc.nextInt();
            if (inp == 1) {
                System.out.println("Kendaraan yang Terkena Pajak");
                System.out.println("- Mobil pribadi");
                System.out.println("- Sepeda Motor");
                System.out.println("- Bus");
                System.out.println("- Truk");
            } if (inp == 2) {
                System.out.println("Kendaraan yang Tidak Terkena Pajak");
                System.out.println("- Kereta Api");
                System.out.println("- Kendaraan bermotor yang semata-mata digunakan untuk keperluan pertahanan dan keamanan negara, seperti tank, pesawat tempur");
                System.out.println("- Kendaraan bermotor yang digunakan untuk kepentingan sosial, keagamaan, dan kemanusiaan, seperti ambulans, pemadam kebakaran, mobil jenazah");
                System.out.println("- Kendaraan bermotor yang dimiliki oleh pemerintah pusat dan daerah, seperti mobil dinas, mobil patroli");
            }
        }
    }

    static double[] perhitunganPKBMotor (int cc, byte urutKendaraan, int koefBobot, int PKB, int TNKB, int terbitSTNK, int bulanJatuhTempo, int bulanBayar, int tahunJatuhTempo, int tahunBayar){
        int operasi1;
        int administrasi=50000, totPajak1, totPajak2;
        float progresif=0.5f, presentase;
        double denda;
        double totpajak[] = new double[3];
        if(cc<250){
            presentase=((urutKendaraan*progresif)+1)/100;
            operasi1  =((PKB/2)*100)*koefBobot;
            totPajak1 =(int)(operasi1*presentase)+32000;
            totPajak2 = totPajak1+TNKB+terbitSTNK+35000+administrasi+32000;
            if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
            } else {
                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 35000;
            }
            totpajak[0] = denda;
            totpajak[1] = denda + totPajak1;
            totpajak[2] = totPajak2;
        } else {
            presentase=(urutKendaraan*progresif)+1;
            operasi1=((PKB/2)*100)*koefBobot;
            totPajak1=(int)(operasi1*presentase)+80000;
            totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+80000;
            if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
            } else {
                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
            }
            totpajak[0] = denda;
            totpajak[1] = denda + totPajak1;
            totpajak[2] = totPajak2;
        }
        return totpajak;
    }

    static double[] perhitunganPKBMobil(String jenMobil, int cc, byte urutKendaraan, String bahanBakar, int PKB, int terbitSTNK, int bulanJatuhTempo, int tahunJatuhTempo, int bulanBayar, int tahunBayar, int TNKB){
        int operasi1;
        int totPajak1, totPajak2 ;
        int administrasi=50000;
        float progresif=0.5f, presentase;
        double denda;
        double totpajak[] = new double[3];
        if (bahanBakar.equalsIgnoreCase("listrik")) {
            operasi1= PKB * 10/100;
            totPajak1=(int)(operasi1);
            totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi;
            if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
            } else {
                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
            }
            totpajak[0] = denda;
            totpajak[1] = denda + totPajak1;
            totpajak[2] = totPajak2;
        } if (bahanBakar.equalsIgnoreCase("bensin")) {
            if (cc >= 2400) {
                if (jenMobil.equalsIgnoreCase("mobil")) {
                    presentase=(urutKendaraan*progresif)+1.5f;
                    operasi1=((PKB/2)*100);
                    totPajak1=(int)(operasi1*presentase)+143000;
                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+143000;
                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                    } else {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
                    }
                    totpajak[0] = denda;
                    totpajak[1] = denda + totPajak1;
                    totpajak[2] = totPajak2;
                } if (jenMobil.equalsIgnoreCase("Truck")) {
                    presentase=(urutKendaraan*progresif)+1.5f;
                    operasi1=((PKB/2)*100);
                    totPajak1=(int)(operasi1*presentase)+163000;
                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+163000;
                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                    } else {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
                    }
                    totpajak[0] = denda;
                    totpajak[1] = denda + totPajak1;
                    totpajak[2] = totPajak2;
                }
            } if (cc >= 1600) {
                if (jenMobil.equalsIgnoreCase("mobil")) {
                    presentase=(urutKendaraan*progresif)+1.5f;
                    operasi1=((PKB/2)*100);
                    totPajak1=(int)(operasi1*presentase)+73000;
                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+73000;
                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                    } else {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
                    }
                    totpajak[0] = denda;
                    totpajak[1] = denda + totPajak1;
                    totpajak[2] = totPajak2;
                } if (jenMobil.equalsIgnoreCase("truck")) {
                    presentase=(urutKendaraan*progresif)+1.5f;
                    operasi1=((PKB/2)*100);
                    totPajak1=(int)(operasi1*presentase)+90000;
                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+90000;
                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                    } else {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 73000;
                    }
                    totpajak[0] = denda;
                    totpajak[1] = denda + totPajak1;
                    totpajak[2] = totPajak2;
                } if (jenMobil.equalsIgnoreCase("bus")) {
                    presentase=(urutKendaraan*progresif)+1.5f;
                    operasi1=((PKB/2)*100);
                    totPajak1=(int)(operasi1*presentase)+90000;
                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+90000;
                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                    } else {
                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 73000;
                    }
                    totpajak[0] = denda;
                    totpajak[1] = denda + totPajak1;
                    totpajak[2] = totPajak2;
                }
            }
        }
        return totpajak;
    }


    static double[] perhitunganPBB(int bulan,String telat, long luasTanah, long luasBangunan, long hargaBangunanPerMeter, long hargaTanahPerMeter){
        long NJOPBumi, NJOPBangunan;
        double denda = 0.02, tetapan1 = 0.005, tetapan2 = 0.4, tetapan3 = 0.2, NJOP, NJKP, PBB, hasil, totDenda, PBBSetDenda;      
        long NJOPTKP = 12000000;
        double[] totpajakPBB = new double[7];
        
        NJOPBumi = luasTanah * hargaTanahPerMeter;
        NJOPBangunan = luasBangunan * hargaBangunanPerMeter;
        NJOP = NJOPBumi + NJOPBangunan;
        
        if(NJOP > 1000000000) {
            NJKP = tetapan2 * (NJOP - NJOPTKP);
        } else {
            NJKP = tetapan3 * (NJOP - NJOPTKP);
        }
        PBB = tetapan1 * NJKP;
        if (telat.equalsIgnoreCase("y")) {
            hasil = denda * bulan;
            totDenda = PBB * hasil;
            PBBSetDenda = PBB + totDenda;
        } else {
            totDenda = 0;
            PBBSetDenda = PBB;
        }
        totpajakPBB[0] = NJOPBumi;
        totpajakPBB[1] = NJOPBangunan;
        totpajakPBB[2] = NJOP;
        totpajakPBB[3] = NJKP;
        totpajakPBB[4] = PBB;
        totpajakPBB[5] = denda;
        totpajakPBB[6] = PBBSetDenda;

        return totpajakPBB;
    }
    
}
