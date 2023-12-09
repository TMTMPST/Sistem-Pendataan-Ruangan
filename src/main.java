import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long[] akun = new long[10];
        long username, password;
        String[] nama = new String[10];
        String pilih, pengguna;

        do {
            System.out.println("=============== SELAMAT DATANG DI SISTEM PERPAJAKAN ===============");
            System.out.println("Silahkan mengetik Login / Daftar");
            System.out.println("Ketik OFF untuk mematikan program\n\n");
            System.out.print("LOGIN / DAFTAR / OFF: ");
            pilih=sc.nextLine();

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
                System.out.println("==========================TERIMA KASIH==========================");
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

            System.out.println("Masukkan Pilihan Menu : ");
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
                                    int hasilPajak[] = new int[3];
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
                                    int hasilPajak[] = new int[3];
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
                        long NJOPBumi, NJOPBangunan;
                        double denda = 0.02, tetapan1 = 0.005, tetapan2 = 0.4, tetapan3 = 0.2, NJOP, NJKP, PBB, hasil, totDenda, PBBSetDenda;      
                        long NJOPTKP = 12000000;
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
            
                        NJOPBumi = luasTanah * hargaTanahPerMeter;
                        NJOPBangunan = luasBangunan * hargaBangunanPerMeter;
                        NJOP = NJOPBumi + NJOPBangunan;
            
                        if(NJOP > 1000000000) {
                            NJKP = tetapan2 * (NJOP - NJOPTKP);
                        } else {
                            NJKP = tetapan3 * (NJOP - NJOPTKP);
                        }
            
                        PBB = tetapan1 * NJKP;
            
                        do {
                            System.out.print("Apakah anda telat membayar pajak (y/n)? ");
                            telat = input.next();
                        } while (!telat.equalsIgnoreCase("y") && !telat.equalsIgnoreCase("n"));
            
                        if (telat.equalsIgnoreCase("y")) {
                            do {
                                System.out.print("Berapa bulan anda tidak membayar pajak: ");
                                bulan = input.nextInt();
                            } while (bulan <= 0);
                            hasil = denda * bulan;
                            totDenda = PBB * hasil;
                            PBBSetDenda = PBB + totDenda;
                        } else {
                            totDenda = 0;
                            PBBSetDenda = PBB;
                        }
                        
                        System.out.println("NJOP Bumi        : " + NJOPBumi);
                        System.out.println("NJOP Bangunan    : " + NJOPBangunan);
                        System.out.println("Total NJOP       : " + (long) NJOP);
                        System.out.println("NJKP             : " + (long) NJKP);
                        System.out.println("PBB              : " + (long) PBB);
                        System.out.println("Denda            : " + (long) totDenda);
                        System.out.println("PBB Setelah Denda: " + (long) PBBSetDenda );


                    }else if(pajak==3){
                        String jenPKB;        
                        do {
                            System.out.print("Masukkan jenis\t\t\t\t: ");
                            jenPKB=input.next();

                            if(jenPKB.equalsIgnoreCase("motor")){
                                int cc, PKB, koefBobot, operasi1;
                                int TNKB, administrasi=50000, terbitSTNK, totPajak1, totPajak2, bulanJatuhTempo, tahunJatuhTempo, bulanBayar, tahunBayar;
                                float progresif=0.5f, presentase;
                                byte urutKendaraan;
                                double denda;
                                
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
                                if(cc<250){
                                    presentase=((urutKendaraan*progresif)+1)/100;
                                    operasi1=((PKB/2)*100)*koefBobot;
                                    totPajak1=(int)(operasi1*presentase)+32000;
                                    totPajak2= totPajak1+TNKB+terbitSTNK+35000+administrasi+32000;
                                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                                    } else {
                                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 35000;
                                    }
                                    System.out.println("Denda anda                   : "+ denda);
                                    System.out.println("Total pajak anda             : "+ totPajak1);
                                    System.out.println("Total pajak 5 tahunan anda   : "+ totPajak2);

                                }else{
                                    presentase=(urutKendaraan*progresif)+1;
                                    operasi1=((PKB/2)*100)*koefBobot;
                                    totPajak1=(int)(operasi1*presentase)+80000;
                                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+80000;
                                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                                    } else {
                                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
                                    }
                                    System.out.println("Denda Anda                 :");
                                    System.out.println("Total pajak anda             : "+ totPajak1);
                                    System.out.println("Total pajak 5 tahunan anda   : "+ totPajak2);
                                }
                                break;
                            }if (jenPKB.equalsIgnoreCase("mobil")){
                                int cc, PKB, operasi1;
                                int TNKB, terbitSTNK, totPajak1, totPajak2, bulanJatuhTempo, tahunJatuhTempo, bulanBayar, tahunBayar;
                                int administrasi=50000;
                                float progresif=0.5f, presentase;
                                byte urutKendaraan;
                                double denda;
                                String jenMobil, bahanBakar;
                                
                                System.out.print("Kendaraan ke-                         : ");
                                urutKendaraan=input.nextByte();
                                System.out.print("Masukkan jenis kendaraan listrik / bensin : ");
                                bahanBakar = input.next();
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

                                if (bahanBakar.equalsIgnoreCase("listrik")) {
                                    operasi1= PKB * 10/100;
                                    totPajak1=(int)(operasi1);
                                    totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi;
                                    if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                                    } else {
                                        denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
                                    }
                                    System.out.println("Denda Anda                 :");
                                    System.out.println("Total pajak anda             : "+ totPajak1);
                                    System.out.println("Total pajak 5 tahunan anda   : "+ totPajak2);
                                } else if (bahanBakar.equalsIgnoreCase("bensin")) {
                                    System.out.print("Masukkan cc kendaraan                 : ");
                                    cc=input.nextInt();
                                    if (cc >= 2400) {
                                        System.out.println("Masukkan jenis Mobil (biasa / truck)");
                                        jenMobil = input.next();
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
                                            System.out.println("Denda Anda                 :");
                                            System.out.println("Total pajak anda             : "+ totPajak1);
                                            System.out.println("Total pajak 5 tahunan anda   : "+ totPajak2);

                                        } else if (jenMobil.equalsIgnoreCase("truck")) {
                                            presentase=(urutKendaraan*progresif)+1.5f;
                                            operasi1=((PKB/2)*100);
                                            totPajak1=(int)(operasi1*presentase)+163000;
                                            totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+163000;
                                            if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                                                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                                            } else {
                                                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 83000;
                                            }
                                            System.out.println("Denda Anda                 :");
                                            System.out.println("Total pajak anda             : "+ totPajak1);
                                            System.out.println("Total pajak 5 tahunan anda   : "+ totPajak2);

                                        }
                                    } else if (cc >= 1600) {
                                        System.out.println("Masukkan jenis Mobil (mobil / bus)");
                                        jenMobil = input.next();
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
                                            System.out.println("Denda Anda                 :");
                                            System.out.println("Total pajak anda             : "+ totPajak1);
                                            System.out.println("Total pajak 5 tahunan anda   : "+ totPajak2);

                                        } else if (jenMobil.equalsIgnoreCase("bus")){
                                            presentase=(urutKendaraan*progresif)+1.5f;
                                            operasi1=((PKB/2)*100);
                                            totPajak1=(int)(operasi1*presentase)+90000;
                                            totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi+90000;
                                            if (((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) <= 1) {
                                                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo);
                                            } else {
                                                denda = PKB * 0.25 * ((tahunBayar-tahunJatuhTempo)*12)+(bulanBayar-bulanJatuhTempo) + 73000;
                                            }
                                            System.out.println("Denda Anda                 :");
                                            System.out.println("Total pajak anda             : "+ totPajak1);
                                            System.out.println("Total pajak 5 tahunan anda   : "+ totPajak2);
                                        }
                                    }
                                }                        
                            }else {
                                System.out.println("Jenis Kendaraan tidak valid. Silahkan Masukkan kembali");
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

    static int[] pajakDenganDenda (int pkp, double totPersenDenda) {
        int[] pajak = new int[3];
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
}

            