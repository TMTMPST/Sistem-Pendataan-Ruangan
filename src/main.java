
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        double[][] akun = new double[10][8];
        long username, password;
        String[] nama = new String[10];
        String pilih, pengguna;

        do {
            System.out.println("=============== SELAMAT DATANG DI SISTEM PERPAJAKAN ===============");
            System.out.println("Silahkan mengetik Login / Daftar");
            System.out.println("Ketik OFF untuk mematikan program\n\n");
            System.out.print("LOGIN / DAFTAR / OFF: ");
            pilih=scan.nextLine();

            int i=0;
            if (pilih.equalsIgnoreCase("daftar")) {
                System.out.println("\n\n=======================----PENDAFTARAN----=======================");
                System.out.print("Masukkan nama pengguna                  : ");
                pengguna=sc.next();
                System.out.print("Masukkan username(NIM)                  : ");
                username=sc.nextLong();
                System.out.print("Masukkan password(minimal 4 digit angka): ");
                password=sc.nextLong();
                System.out.println("\n\n=======================------------------=======================");


                for (;i<akun.length;i++){
                    if (akun[i][0]==0) {
                        akun[i][0]=(username+password);
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

                    for (; i < akun.length; i++) {
                        if ((username+password)==akun[i][0]) {
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
            System.out.println("|2      | CALCULATOR             |");
            System.out.println("|3      | CEK REKAP NILAI PAJAK  |");
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
                    System.out.println();
                    System.out.println("PPh merupakan pajak penghasilan yang wajib dibayarkan oleh para pekerja setiap tahunnya.");
                    System.out.println("Pajak PPh ini sendiri tergantung pada jumlah PKP dan PTKP dari setiap perkerja.");
                    System.out.println("nilai presentase pajak yang dikenakan pada setiap orang berbeda tergantung dari besarnya penghasilan.");
                    System.out.println();
                    System.out.println("Menu informasi:");
                    System.out.println("a. PTKP");
                    System.out.println("b. Tanggungan");
                    System.out.println("c. Presentase");
                    System.out.println();
                    System.out.print("Informasi apa yang ingin anda cari? ");
                    InfoPajak = sc.next();

                    InfoPPh(InfoPajak);

                } else if (pajak == 2) {
                    System.out.println();
                    System.out.println("Pajak Bumi dan Bangunan (PBB) merupakan sebuah biaya yang harus disetorkan atas keberadaan tanah dan bangunan yang memberikan \n" +
                                        "keuntungan dan kedudukan sosial ekonomi bagi seseorang ataupun badan. Karena Pajak Bumi dan Bangunan (PBB) bersifat kebendaan, \n" +
                                        "maka besaran tarifnya ditentukan dari keadaan objek bumi atau bangunan yang ada.");
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
                    System.out.println();
                    System.out.println("Pajak kendaraan bermotor (PKB) adalah pajak yang dikenakan atas kepemilikan dan/atau penguasaan kendaraan bermotor, \n" + 
                                        "termasuk kendaraan beroda beserta gandengannya yang digunakan di jalan darat dan kendaraan bermotor yang dioperasikan di air.");
                    System.out.println();
                    System.out.println("Menu Informasi :");
                    System.out.println("a. Hukum" );
                    System.out.println("b. Denda");
                    System.out.println("c. Jenis");
                    System.out.println();
                    System.out.print("Informasi apa yang ingin anda cari? ");
                    String jensPKBString = sc.next();
                    infoPKB(jensPKBString);

                } else if (pajak == 4) {
                    System.out.println();
                    System.out.println("Bea cukai adalah istilah yang memiliki makna setiap satu suku katanya. Bea sendiri berarti sebuah pungutan oleh negara \n" +
                                        "terhadap barang yang diekspor atau impor . Bea merujuk pada ongkos barang yang masuk dan keluar pada suatu negara.\n" +
                                        "\n" +
                                        "Sementara itu, cukai berarti pungutan negara pada sebuah barang yang memiliki karakteristik sesuai pada \n" +
                                        "perundang-undangan cukai yang ditetapkan. Artinya, jika digabungkan, bea cukai adalah tindakan pungutan negara pada \n" +
                                        "barang ekspor impor serta barang yang telah ditentukan di undang-undang cukai.");
                    System.out.println();
                    System.out.println("Menu Informasi :");
                    System.out.println("a. Karakteristik");
                    System.out.println("b. Jenis");
                    System.out.println("c. Tarif");
                    System.out.println("d. Kurs");
                    System.out.println();
                    System.out.print("Informasi apa yang ingin anda cari? ");
                    String Info = sc.next();
                    InfoBeaCukai(Info);
                
                }else if (pajak==0) {
                    System.out.println();
                    System.out.println("==========================TERIMA KASIH==========================");
                    System.out.println();
                    continue;
                }
            }else if (menu==3) {
                rekapPajak(i, akun);
                continue;
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
                            System.out.print("masukkan gaji bersih selama 1 tahun: ");
                            gaji=input.nextInt();
                            System.out.println("masukkan jumlah tanggungan");
                            System.out.print("(anak + istri)                     : ");
                            jmltanggungan=input.nextInt();
                            System.out.print("Masukkan bulan jatuh tempo         : ");
                            bulanJatuhTempo=input.nextInt();
                            System.out.print("Masukkan tahun jatuh tempo         : ");
                            tahunJatuhTempo=input.nextInt();
                            System.out.print("Masukkan bulan anda membayar       : ");
                            bulanBayar=input.nextInt();
                            System.out.print("Masukkan tahun anda membayar       : ");
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
                                    akun[i][1] = hasilPajak[2];
                                    System.out.println("Total pajak anda: " + hasilPajak[0]);
                                    System.out.println("Total denda anda: "+hasilPajak[1]);
                                    System.out.println("Total yang harus dibayar: "+hasilPajak[2]);
                                }else{
                                    totpajak=pajakTanpaDenda(pkp);
                                    akun[i][1] = totpajak;
                                    System.out.println("Total pajak anda: " + totpajak);
                                }
                            }
                        }else {
                            System.out.print("masukkan gaji bersih selama 1 tahun: ");
                            gaji=input.nextInt();
                            System.out.print("Masukkan bulan jatuh tempo         : ");
                            bulanJatuhTempo=input.nextInt();
                            System.out.print("Masukkan tahun jatuh tempo         : ");
                            tahunJatuhTempo=input.nextInt();
                            System.out.print("Masukkan bulan anda membayar       : ");
                            bulanBayar=input.nextInt();
                            System.out.print("Masukkan tahun anda membayar       : ");
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
                                    akun[i][1] = hasilPajak[2];
                                    System.out.println("Total pajak anda: " + hasilPajak[0]);
                                    System.out.println("Total denda anda: "+hasilPajak[1]);
                                    System.out.println("Total yang harus dibayar: "+hasilPajak[2]);
                                }else{
                                    totpajak=pajakTanpaDenda(pkp);
                                    akun[i][1] = (double)totpajak;
                                    System.out.println("Total pajak anda: " + totpajak);
                                }
                            }
                        }
                    }else if(pajak==2){
                        long luasTanah, luasBangunan, hargaTanahPerMeter, hargaBangunanPerMeter;
                        int[] bulan = new int[5];

                        System.out.print("Masukkan luas tanah (meter persegi)   : ");
                        luasTanah = input.nextInt();
                        System.out.print("Masukkan luas bangunan (meter persegi): ");
                        luasBangunan = input.nextInt();
                        System.out.print("Masukkan harga tanah per meter        : ");
                        hargaTanahPerMeter = input.nextInt();
                        System.out.print("Masukkan harga bangunan per meter     : ");
                        hargaBangunanPerMeter = input.nextInt();
                        System.out.print("Masukkan bulan jatuh tempo            : ");
                        bulan[0]=input.nextInt();
                        System.out.print("Masukkan tahun jatuh tempo            : ");
                        bulan[1]=input.nextInt();
                        System.out.print("Masukkan bulan anda membayar          : ");
                        bulan[2]=input.nextInt();
                        System.out.print("Masukkan tahun anda membayar          : ");
                        bulan[3]=input.nextInt();

                        double[] pajakPBB = perhitunganPBB(bulan , luasTanah, luasBangunan, hargaTanahPerMeter, hargaBangunanPerMeter);
                        akun[i][2] = pajakPBB[6];
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
                            System.out.print("Masukkan jenis Kendaraan (Motor/Mobil): ");
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
                                System.out.print("Masukkan bulan anda membayar          : ");
                                bulanBayar=input.nextInt();
                                System.out.print("Masukkan tahun anda membayar          : ");
                                tahunBayar=input.nextInt();

                                double hasilTotPajak[] = new double[3];
                                hasilTotPajak = perhitunganPKBMotor(cc, urutKendaraan, koefBobot, PKB, TNKB, terbitSTNK, bulanJatuhTempo, bulanBayar, tahunJatuhTempo, tahunBayar);
                                akun[i][3] = hasilTotPajak[1];
                                akun[i][4] = hasilTotPajak[2];

                                System.out.println("Denda Anda                            : "+ hasilTotPajak[0]);
                                System.out.println("Total pajak anda                      : "+ hasilTotPajak[1]);
                                System.out.println("Total pajak 5 tahunan anda            : "+ hasilTotPajak[2]);
                                break;
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
                                System.out.print("Masukkan bulan anda membayar          : ");
                                bulanBayar=input.nextInt();
                                System.out.print("Masukkan tahun anda membayar          : ");
                                tahunBayar=input.nextInt();
                                System.out.println();
                                System.out.print("Masukkan jenis kendaraan listrik / bensin     : ");
                                bahanBakar = input.next();
                                System.out.println("\nUntuk Kendaraan Berbahan Bakar BENSIN");
                                System.out.println(" Jika Bahan Bakar Listrik KETIK (0)");
                                System.out.print("Masukkan cc kendaraan                         : ");
                                cc=input.nextInt();
                                System.out.print("Masukkan Jenis Kendaraan (Mobil / Truck / bus): ");
                                jenMobil = input.next();
                                double hasilTotPajak[] = new double[3];

                                hasilTotPajak = perhitunganPKBMobil(jenMobil, cc, urutKendaraan, bahanBakar, PKB, terbitSTNK, bulanJatuhTempo, tahunJatuhTempo, bulanBayar, tahunBayar, TNKB);
                                akun[i][5] = hasilTotPajak[1];
                                akun[i][6] = hasilTotPajak[2];

                                System.out.println("Denda Anda                   : "+ hasilTotPajak[0]);
                                System.out.println("Total pajak anda             : "+ hasilTotPajak[1]);
                                System.out.println("Total pajak 5 tahunan anda   : "+ hasilTotPajak[2]);
                                break;
                            }
                        }while (true);
                            
                    }else if(pajak==4){
                        double[] totalPajakBea = new double[2];
                        double hargaBarang, asuransi, biayaKirim;

                        System.out.print("Masukkan harga barang impor (USD)      : ");
                        hargaBarang=input.nextDouble();
                        System.out.print("Masukkan asuransi barang impor (USD)   : ");
                        asuransi=input.nextDouble();
                        System.out.print("Masukkan biaya kirim barang impor (USD): ");
                        biayaKirim=input.nextDouble();

                        totalPajakBea = pajakBeaCukai(hargaBarang, asuransi, biayaKirim);
                        akun[i][7] = totalPajakBea[1];

                        System.out.println("Total pajak Bea Masuk anda adalah      : "+totalPajakBea[0]);
                        System.out.println("Total yang harus dibayar               : "+totalPajakBea[1]);
                    }else if (pajak>4){
                        System.out.println("Maaf input yang anda masukkan salah"); //perulangan pada input pajak
                    }
                }if (pajak==0) {
                    rekapPajak(i, akun);
                    break;
                }
            }
        }
    }

    }while(true);
}

    static void InfoPPh (String jenisInfo) {
        if (jenisInfo.equalsIgnoreCase("a")) {
            System.out.println();
            System.out.println("PTKP(Penghasilan Tidak Kena Pajak)");
            System.out.println("Tarif Penghasilan Tidak Kena Pajak terbaru yang berlaku saat ini masih berdasarkan PMK 101/2016:");
            System.out.println("    1. PTKP orang pribadi sebesar Rp54.000.000,00;");
            System.out.println("    2. PTKP bagi WP yang kawin mendapat tambahan sebesar Rp4.500.000,00;");
            System.out.println("    3. Tambahan PTKP untuk istri yang penghasilannya dengan penghasilan suami sebesar Rp54.000.000,00;");
            System.out.println("    4. Tambahan PTKP untuk tanggungan, sebesar Rp4.500.000,00.");
            System.out.println();
            System.out.println("Besaran PTKP terbaru sesuai status pajak yang dimiliki oleh WP:");
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
            System.out.println();
        }else if (jenisInfo.equalsIgnoreCase("b")) {
            System.out.println();
            System.out.println("Menjadi tanggungan sepenuhnya menurut UU PPh berdasarkan keadaan yang dapat nyata terlihat yakni:");
            System.out.println("    a. Tinggal bersama-sama dengan Wajib Pajak");
            System.out.println("    b. Tidak mempunyai penghasilan sendiri");
            System.out.println("    c. Ditanggung oleh orang tuanya sendiri");
            System.out.println("Maksimal tanggungan dalam PTKP adalah 3 anak, meskipun memiliki lebih dari 3 anak.");
            System.out.println();
        }else if (jenisInfo.equalsIgnoreCase("c")) {
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
            System.out.println();
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
            System.out.println("Setelah mengetahui apa saja yang menjadi objek dari Pajak Bumi dan Bangunan (PBB), sebenarnya tidak setiap tanah dan bangunan \n" +
                                "yang ada dapat menjadi objek dalam Pajak Bumi dan Bangunan (PBB), ada beberapa juga yang tidak masuk ke dalam objek Pajak Bumi \n" +
                                "dan Bangunan (PBB), yaitu dapat dikelompokkan berdasarkan penggunaannya:");
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
            System.out.println("1. Undang-Undang (UU) No.12 Tahun 1994 Tentang Perubahan atas Undang-Undang (UU) No. 12 Tahun 1985 terkait Pajak Bumi dan ");
            System.out.println("   Bangunan (PBB) yang mengatur semua tentang pungutan atas Pajak Bumi dan Bangunan (PBB)");
            System.out.println("2. Undang-Undang (UU) No. 28 Tahun 2009 Tentang Pajak dan Retribusi Daerah yang menjelaskan:");
            System.out.println("   - Bahwa pemerintah kabupaten atau pemerintah kota memiliki wewenang dalam melakukan pemungutan atas Pajak Bumi dan Bangunan ");
            System.out.println("     (PBB) di sektor pedesaan dan perkotaan (PBB-P2)");
            System.out.println("   - Bahwa pemerintah atau pusat memiliki wewenang terhadap sektor Pertambangan, Perhutanan, dan Perkebunan (PBB-P3)");
            System.out.println();
        } else if (jenisInfor.equalsIgnoreCase("d")) {
            System.out.println();
            System.out.println("Nilai Jual Objek Pajak (NJOP) dan dihitung berdasarkan harga rata-rata atau harga pasar pada saat melakukan transaksi jual beli.\n" +
                                "Dasar pengenaan pungutan ini ditetapkan oleh Menteri Keuangan (Menkeu)");
            System.out.println();
            System.out.println("Namun, setiap daerah memiliki Nilai Jual Objek Pajak (NJOP) yang berbeda-beda dikarenakan adanya pengaruh dari beberapa dasar \n" +
                                "penetapan untuk objek bumi dan bangunan, yaitu:");
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
        if (jensPKB.equalsIgnoreCase("a")) {
            System.out.println();
            System.out.println("Hukum Hukum Yang mengatur PKB (Pajak Kendaraan Bermotor)");
            System.out.println("- Undang-Undang Nomor 28 Tahun 2009 tentang Pajak Daerah dan Retribusi Daerah\r\n" + //
                                "- Peraturan Pemerintah Nomor 65 Tahun 2015 tentang Pajak Kendaraan Bermotor\r\n" + //
                                "- Peraturan Menteri Dalam Negeri Nomor 1 Tahun 2021 tentang Penghitungan Dasar Pengenaan Pajak Kendaraan Bermotor dan Bea Balik Nama Kendaraan Bermotor Tahun 2021");
            System.out.println();
            System.out.println("Apakah Ingin info selengkapnya");
            System.out.print("(y/n) : ");
            String info = sc.next();

            if (info.equalsIgnoreCase("y")) {
                System.out.println();
                System.out.println("\nUndang-Undang Nomor 28 Tahun 2009 merupakan peraturan perundang-undangan yang mengatur secara umum tentang pajak daerah dan \n" +
                                    "retribusi daerah. Dalam undang-undang ini, pajak kendaraan bermotor didefinisikan sebagai pajak atas kepemilikan dan/atau \n" +
                                    "penguasaan kendaraan bermotor yang dioperasionalkan di wilayah Negara Kesatuan Republik Indonesia.\r\n" +
                                    "\r\n" +
                                    "Peraturan Pemerintah Nomor 65 Tahun 2015 merupakan peraturan pelaksana dari Undang-Undang Nomor 28 Tahun 2009. Peraturan \n" +
                                    "pemerintah ini mengatur secara lebih rinci tentang pajak kendaraan bermotor, termasuk dasar pengenaan, tarif, dan tata \n" +
                                    "cara pemungutan.\r\n" +
                                    "\r\n" + 
                                    "Peraturan Menteri Dalam Negeri Nomor 1 Tahun 2021 merupakan peraturan yang mengatur tentang penghitungan dasar pengenaan pajak \n" +
                                    "kendaraan bermotor dan bea balik nama kendaraan bermotor tahun 2021. Peraturan menteri ini mengatur tentang cara menghitung \n" +
                                    "dasar pengenaan pajak kendaraan bermotor, termasuk untuk kendaraan bermotor yang baru diproduksi, kendaraan bermotor bekas, \n" +
                                    "dan kendaraan bermotor yang mengalami perubahan.\r\n" + 
                                    "\r\n" + 
                                    "Selain ketiga peraturan perundang-undangan tersebut, pajak kendaraan bermotor juga diatur dalam peraturan daerah provinsi dan \n" +
                                    "kabupaten/kota. Peraturan daerah ini mengatur tentang hal-hal yang belum diatur dalam peraturan perundang-undangan yang lebih \n" +
                                    "tinggi, seperti tarif pajak kendaraan bermotor, tata cara pembayaran pajak kendaraan bermotor, dan sanksi atas pelanggaran \n" +
                                    "pajak kendaraan bermotor.");
                System.out.println();
            } if (info.equalsIgnoreCase("n")) {
                System.out.println("");
            }
        } if (jensPKB.equalsIgnoreCase("b")) {
            System.out.println();
            System.out.println("Denda pajak kendaraan bermotor di Indonesia diatur dalam Peraturan Pemerintah Nomor 76 Tahun 2020 tentang Pajak Kendaraan \n" +
                                "Bermotor. Denda tersebut dikenakan kepada pemilik kendaraan bermotor yang terlambat membayar pajak.\r\n" + 
                                "\r\n" + 
                                "Berikut adalah list denda pajak kendaraan bermotor:\r\n" + 
                                "\r\n" + 
                                "- Keterlambatan 2 hari hingga 1 bulan: Denda sebesar 25% dari Pajak Kendaraan Bermotor (PKB).\r\n" + 
                                "- Keterlambatan 2 bulan hingga 1 tahun: Denda sebesar 25% dari PKB ditambah dengan sanksi administratif berupa bunga sebesar 2% per bulan dari jumlah pajak yang terutang.\r\n" + 
                                "- Keterlambatan lebih dari 1 tahun: Denda sebesar 25% dari PKB ditambah dengan sanksi administratif berupa bunga sebesar 2% per bulan dari jumlah pajak yang terutang," +
                                "dan tunggakan pajak kendaraan bermotor dianggap sebagai tunggakan pajak daerah lainnya.");
            System.out.println();
        } if (jensPKB.equalsIgnoreCase("c")) {
            System.out.println();
            System.out.println("1. Jenis Kendaraan Yang Tekena Pajak");
            System.out.println("2. Jenis Kendaraan Yang Tidak Tekena Pajak");
            System.out.println();
            System.out.print("Masukkan Input          : ");
            int inp = sc.nextInt();
            if (inp == 1) {
                System.out.println();
                System.out.println("Kendaraan yang Terkena Pajak");
                System.out.println("- Mobil pribadi");
                System.out.println("- Sepeda Motor");
                System.out.println("- Bus");
                System.out.println("- Truk");
                System.out.println();
            } if (inp == 2) {
                System.out.println();
                System.out.println("Kendaraan yang Tidak Terkena Pajak");
                System.out.println("- Kereta Api");
                System.out.println("- Kendaraan bermotor yang semata-mata digunakan untuk keperluan pertahanan dan keamanan negara, seperti tank, pesawat tempur");
                System.out.println("- Kendaraan bermotor yang digunakan untuk kepentingan sosial, keagamaan, dan kemanusiaan, seperti ambulans, pemadam kebakaran, \n" +
                                    "mobil jenazah");
                System.out.println("- Kendaraan bermotor yang dimiliki oleh pemerintah pusat dan daerah, seperti mobil dinas, mobil patroli");
                System.out.println();
            }
        }
    }

    static void InfoBeaCukai (String JenisBeaCukai){
        if (JenisBeaCukai.equalsIgnoreCase("a")) {
            System.out.println();
            System.out.println("Karakteristik barang kena cukai telah tertuang pada UU No. 35 Tahun 2007. Karakteristik inilah yang kemudian menjadi pembeda \n" +
                                "pungutan bea cukai dengan pungutan produk dagang yang lainnya. Berdasarkan peraturan undang-undang tersebut, karakteristik \n" +
                                "barang yang terkena bea cukai adalah:");
            System.out.println("- Barang yang dalam pengedarannya membutuhkan pengawasan.");
            System.out.println("- Barang yang apabila dipakai akan menimbulkan beberapa dampak negatif pada masyarakat dan lingkungan hidup.");
            System.out.println("- Barang yang pengonsumsiannya perlu dikendalikan.");
            System.out.println("- Barang yang pemakaiannya memerlukan pembebanan pungutan negara demi keseimbangan dan keadilan, atau barang yang dikenakan \n" +
                                "cukai karena undang-undang.");
            System.out.println();
        } else if (JenisBeaCukai.equalsIgnoreCase("b")) {
            System.out.println();
            System.out.println("Jenis-jenis barang yang terkena bea cukai antara lain adalah produk yang terdiri dari:");
            System.out.println("- Etanol atau etil alkohol yang dalam proses pembuatannya tidak memperhatikan bahan.");
            System.out.println("- Minuman dengan kandungan etil alkohol berapapun kadarnya yang dalam tidak mengindahkan proses pembuatannya serta bahan yang \n" +
                                "digunakan. Konsentrat dengan kandungan etil alkohol juga termasuk dalam jenis ini.");
            System.out.println("- Hasil tembakau termasuk rokok, sigaret, cerutu, tembakau iris, rokok daun, serta hasil dari olahan tembakau yang lainnya. Hal \n" +
                                "ini akan terkena bea cukai apabila tidak mengindahkan digunakan tidaknya bahan pembantu atau bahan pengganti dalam pembuatannya.");
            System.out.println();
        } else if (JenisBeaCukai.equalsIgnoreCase("c")) {
            System.out.println();
            System.out.println("Tarif Barang yang Terkena Bea Cukai");
            System.out.println();
            System.out.println("1. Barang Hasil Tembakau");
            System.out.println("- Barang hasil tembakau yang dibuat di Indonesia: 5% dari harga awal jika harga yang digunakan adalah harga jual ecer. Dan 275% \n" +
                                "dari harga awal jika harga yang digunakan adalah harga jual pabrik.");
            System.out.println("- Barang hasil tembakau yang dibuat untuk impor: 57% dari harga awal jika harga yang digunakan adalah harga jual eceran. Dan \n" +
                                "275% dari harga awal jika harga yang digunakan adalah nilai pabean yang sudah ditambah bea masuk.");
            System.out.println();
            System.out.println("2. Barang Cukai yang Lain");
            System.out.println("- Barang yang dibuat di Indonesia: 80% dari harga awal jika harga yang digunakan adalah harga jual ecer. Dan 1.150% dari harga \n" +
                                "awal jika harga yang digunakan adalah harga jual pabrik.");
            System.out.println("- Barang yang dibuat untuk impor: 80% dari harga awal jika harga yang digunakan adalah harga jual eceran. Dan 1.150% dari harga \n" +
                                "awal jika harga yang digunakan adalah nilai pabean yang sudah ditambah bea masuk.");
            System.out.println();
            System.out.println("Tarif Normal pada Pajak Impor");
            System.out.println();
            System.out.println("- 15% sampai 20% untuk tas");
            System.out.println("- 15% sampai 25% untuk sepatu");
            System.out.println("- PPN 10% untuk produk tekstil");
            System.out.println("- PPh pasal 22 impor sebanyak 7,5% sampai 10%");
            System.out.println();
        } else if (JenisBeaCukai.equalsIgnoreCase("d")) {
            System.out.println();
            System.out.println("Kurs pajak bea cukai adalah nilai dari kurs yang digunakan dalam bertransaksi perpajakan di Indonesia. Setiap terdapat transaksi\n" +
                                "antarnegara dengan menggunakan mata asing, maka akan menerapkan sistem ini.");
            System.out.println();
            System.out.println("Tujuan digunakannya kurs pajak bea cukai yakni sebagai dasar acuan dalam penetapan pajak transaksi kegiatan ekspor maupun impor.\n" +
                                "Adapun pembayaran yang terkait dengan kurs ini diantaranya adalah:");
            System.out.println("- PPN atau Pajak Pertambahan Nilai barang serta jasa");
            System.out.println("- Bea masuk serta bea keluar");
            System.out.println("- PPh atau Pajak Penghasilan atas adanya pemasukan barang");
            System.out.println("- Pajak penjualan barang mewah");
            System.out.println();
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


    static double[] perhitunganPBB(int[] bulanDenda, long luasTanah, long luasBangunan, long hargaBangunanPerMeter, long hargaTanahPerMeter){
        long NJOPBumi, NJOPBangunan;
        double denda = 0.02, tetapan1 = 0.005, tetapan2 = 0.4, tetapan3 = 0.2, NJOP, NJKP, PBB, hasil, totDenda, PBBSetDenda;      
        long NJOPTKP = 12000000, objekKenaPajak;
        double[] totpajakPBB = new double[7];
        
        NJOPBumi = luasTanah * hargaTanahPerMeter;
        NJOPBangunan = luasBangunan * hargaBangunanPerMeter;
        NJOP = NJOPBumi + NJOPBangunan;
        objekKenaPajak = (long)(NJOP - NJOPTKP);
        bulanDenda[4]=((bulanDenda[3]-bulanDenda[1])*12)+(bulanDenda[2]-bulanDenda[0]);
        
        if (objekKenaPajak<0) {
            if(NJOP > 1000000000) {
                NJKP = tetapan2 * (NJOP);
            } else {
                NJKP = tetapan3 * (NJOP);
            }
            PBB = tetapan1 * NJKP;
            if (bulanDenda[4]>0) {
                hasil = denda * bulanDenda[4];
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
        }else {
            if(NJOP > 1000000000) {
                NJKP = tetapan2 * (NJOP - NJOPTKP);
            } else {
                NJKP = tetapan3 * (NJOP - NJOPTKP);
            }
            PBB = tetapan1 * NJKP;
            if (bulanDenda[4]>0) {
                hasil = denda * bulanDenda[4];
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
        }
        return totpajakPBB;
    }

    static double[] pajakBeaCukai(double hargaBarang, double asuransi, double biayaKirim) {
        double beaMasuk=0.075, ppn=0.11;
        double nilaiPabean, nilaiImpor, kurs=15700;
        double[] pajakBea = new double[2];

        nilaiPabean=(int)((hargaBarang+asuransi+biayaKirim)*kurs);
        pajakBea[0]=(int)(beaMasuk*nilaiPabean);
        nilaiImpor=(int)((nilaiPabean+pajakBea[0])*ppn);
        pajakBea[1]=pajakBea[0]+nilaiImpor;

        return pajakBea;
    }
    
    public static void rekapPajak(int i, double[][] akun) {
        System.out.println();
        System.out.println("Terima kasih! Berikut rekap nilai pajak anda!");
        System.out.println("1. Pajak PPh            : " + akun[i][1]);
        System.out.println("2. Pajak PBB            : " + akun[i][2]);
        System.out.println("3. Pajak Kendaraan Bermotor");
        System.out.println("    a. Motor ");
        System.out.println("       Pajak tahunan    : " + akun[i][3]);
        System.out.println("       Pajak 5 tahunan  : " + akun[i][4]);
        System.out.println("    b. Mobil ");
        System.out.println("       Pajak tahunan    : " + akun[i][5]);
        System.out.println("       Pajak 5 tahunan  : " + akun[i][6]);
        System.out.println("4. Pajak Bea Cukai      : " + akun[i][7]);
        System.out.println();
    }
}
