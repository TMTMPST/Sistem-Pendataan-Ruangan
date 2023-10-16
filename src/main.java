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
        String lanjut=null;
        do{                                 //perulangan untuk lanjut menghitung atau tidak
            for(int pajak='0';pajak>=4;){ //perulangan pada input pajak
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
            System.out.println("=============================");        
            System.out.print("Masukkan jenis pajak: ");
            pajak=input.nextInt();
                
            if(pajak==1){
                int gaji, tanggungan=4500000,PTKP, pribadi=54000000, pkp, totpajak,totDenda, totBayar;
                double[] PPh={0.05,0.15,0.25,0.3}; 
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
                            if(pkp<50000000){
                                totpajak=(int)(pkp*PPh[0]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }else if(pkp>=50_000_000&&pkp<250_000_000){
                                totpajak=(int)(pkp*PPh[1]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }else if(pkp>=250_000_000&&pkp<500_000_000){
                                totpajak=(int)(pkp*PPh[2]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }else if(pkp>=500_000_000){
                                totpajak=(int)(pkp*PPh[3]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }
                        }else{
                            if(pkp<50000000){
                                totpajak=(int)(pkp*PPh[0]);
                                System.out.println("Total pajak anda: " + totpajak);
                            }else if(pkp>=50_000_000&&pkp<250_000_000){
                                totpajak=(int)(pkp*PPh[1]);
                                System.out.println("Total pajak anda: " + totpajak);
                            }else if(pkp>=250_000_000&&pkp<500_000_000){
                                totpajak=(int)(pkp*PPh[2]);
                                System.out.println("Total pajak anda: " + totpajak);
                            }else if(pkp>=500_000_000){
                                totpajak=(int)(pkp*PPh[3]);
                                System.out.println("Total pajak anda: " + totpajak);;
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
                        
                        if (selisihBulan>0){
                            if(pkp<50000000){
                                totpajak=(int)(pkp*PPh[0]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }else if(pkp>=50_000_000&&pkp<250_000_000){
                                totpajak=(int)(pkp*PPh[1]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }else if(pkp>=250_000_000&&pkp<500_000_000){
                                totpajak=(int)(pkp*PPh[2]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }else if(pkp>=500_000_000){
                                totpajak=(int)(pkp*PPh[3]);
                                totDenda=(int)(totpajak*totPersenDenda);
                                totBayar=totpajak+totDenda;
                                System.out.println("Total pajak anda: " + totpajak);
                                System.out.println("Total denda anda: "+totDenda);
                                System.out.println("Total yang harus dibayar: "+totBayar);
                            }
                        }else{
                            if(pkp<50000000){
                                totpajak=(int)(pkp*PPh[0]);
                                System.out.println("Total pajak anda: " + totpajak);
                            }else if(pkp>=50_000_000&&pkp<250_000_000){
                                totpajak=(int)(pkp*PPh[1]);
                                System.out.println("Total pajak anda: " + totpajak);
                            }else if(pkp>=250_000_000&&pkp<500_000_000){
                                totpajak=(int)(pkp*PPh[2]);
                                System.out.println("Total pajak anda: " + totpajak);
                            }else if(pkp>=500_000_000){
                                totpajak=(int)(pkp*PPh[3]);
                                System.out.println("Total pajak anda: " + totpajak);;
                            }
                        }
                    }
                }
            }else if(pajak==2){

            long luasTanah, luasBangunan, hargaTanahPerMeter, hargaBangunanPerMeter;
            long NJOPBumi, NJOPBangunan;
            double denda = 0.2, tetapan1 = 0.005, tetapan2 = 0.4, tetapan3 = 0.2, NJOP, NJKP, PBB, totDenda, PBBSetDenda;      
            long NJOPTKP = 12000000;
            int bulan;

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

            //System.out.print("Apakah anda telat membayar pajak: ");
            //denda = in.nextDouble();
            
            System.out.print("Berapa bulan anda tidak membayar pajak: ");
            bulan = input.nextInt();

            totDenda = denda * bulan;
            PBBSetDenda = PBB - totDenda;
            
            System.out.println("NJOP Bumi: " + NJOPBumi);
            System.out.println("NJOP Bangunan: " + NJOPBangunan);
            System.out.println("Total NJOP: " + (long) NJOP);
            System.out.println("NJKP: " + (long) NJKP);
            System.out.println("PBB: " + (long) PBB);
            System.out.println("Denda: " + (float) totDenda);
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
                            totPajak1=(int)(operasi1*presentase);
                            totPajak2= totPajak1+TNKB+terbitSTNK+35000+administrasi;
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
                            totPajak1=(int)(operasi1*presentase);
                            totPajak2= totPajak1+TNKB+terbitSTNK+83000+administrasi;
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
                            //mobil
                    }else {
                        System.out.println("Jenis Kendaraan tidak valid. Silahkan Masukkan kembali");
                    }
                }while (true);
                    
            }else{
                System.out.println("Maaf input yang anda masukkan salah"); //perulangan pada input pajak
            }
            System.out.print("Apakah anda ingin lanjut?: ");    //perulangan untuk lanjut menghitung
            lanjut=input.next();
        }
    }
    while(lanjut.equalsIgnoreCase("iya"));
    }
}