import java.util.Scanner;

class main{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String name;
	
		
		System.out.print("masukkan nama anda : ");
        name = input.nextLine();
        
      

		proses e = new proses();
		e.setNama(name);
	
		e.pilihan();
		e.pembayaran();
		e.cetak();
	
	}
}