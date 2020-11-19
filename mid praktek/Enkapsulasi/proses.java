import java.util.Scanner;

class proses{
	Scanner input = new Scanner(System.in);

	private String nama;
	private char merek,tipe;
	private int kembalian,totalharga,bayar,jumlahunit;
	private int harga = 0;	
	private boolean loop = true;

	public void setNama(String nama ){
		this.nama = nama;
	
	}

	public String getNama(){
		return nama;
	}
	
	public void pilihan(){
		System.out.println("-------------------------------------");
	    System.out.println("Merk :      Tipe  :      Harga ");
		System.out.println("G           Meja(M)      Rp.  95.000 ");
		System.out.println("            Kursi(K)     Rp. 125.000 ");
		System.out.println("            Lemari(L)    Rp. 450.000 ");
		System.out.println();
		System.out.println("O           Meja(M)      Rp. 115.000 ");
		System.out.println("            Kursi(K)     Rp. 135.000 ");
		System.out.println("            Lemari(L)    Rp. 550.000 ");
		System.out.println("-------------------------------------");
		System.out.print("Masukkan Merek = ");
		merek = input.next().charAt(0);
		while(loop){
		System.out.print("Masukkan tipe = ");
        tipe = input.next().charAt(0);
		

		 switch(tipe)
		 {
		 	case 'm':case 'M'  :
               if (merek =='G')
               {harga = 95000;
               }
               else {harga = 115000;
               }
                loop = false;
                break;
                
           case 'k': case 'K' :
               if (merek =='G')
               {harga = 125000;
               }
               else {harga = 135000;
               }
                loop = false;
                break;
                
		   case 'l':case 'L'  :
               if (merek =='G')
               {harga = 450000;
               }
               else {harga = 550000;
               }
                loop = false;
                break;
                        
           
               default :
                System.out.println("Inputan salah,harap coba lagi");
               
                
        }
        
	  
	}
	}
		

	public void pembayaran(){

		System.out.print("Masukkan jumlah unit yang anda inginkan :");
        jumlahunit = input.nextInt();

    	totalharga = jumlahunit*harga;
    	System.out.println("Total harga adalah: "+totalharga);
    	System.out.println("");
    	System.out.print(" Masukkan Pembayaran = Rp "+"Rp.");
		bayar= input.nextInt();
			
			
		while(bayar<totalharga){
			
			if(bayar<totalharga){
				System.out.println("uang anda kurang mohon masukkan dengan nominal yang lebih besar");
				
	            System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		    
		        bayar= input.nextInt();
			
				}
				else{
			
				System.out.print("Masukkan Jumlah uang dibayarkan : "+"Rp.");
		    
		        bayar= input.nextInt();
			
				}	
}

	
}

 	public void cetak(){
	
	
	System.out.println("");
	System.out.println("=====Cetak Hasil Pembayaran=====");
	System.out.println("--------------------------------");
	System.out.println("Nama pelanggan : " +nama);
	System.out.println("Total harga    : " +totalharga);
	System.out.println("Pembayaran     : " +bayar);
	System.out.println("Kembaliaan     : " +(bayar-totalharga));
	
	}
	
	
}