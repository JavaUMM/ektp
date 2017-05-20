/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ektp;
import java.util.*;

/**
 *
 * @author Muhammad Fikri
 */
public class pendaftaran {
    boolean run;
    String ktp[] = new String [100];
    String pilih, baca;
    int inPilihan, inJumlah;
    
    public void daftar(){
        attribute_ektp att = new attribute_ektp();
        ArrayList<HashMap<String, String>> arrList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hash = new HashMap<String,String>();
	Scanner in = new Scanner(System.in);
        run = true;

        while (run){
		System.out.println("\nMenu :");
		System.out.println("1. Iputan Data eKTP ");
		System.out.println("2. List Data eKTP ");
		System.out.println("3. Sorting Data eKTP ");
		System.out.println("4. exit ");
		System.out.print("Pilih :");
		try{
			inPilihan = in.nextInt();	
		}
		catch(java.util.InputMismatchException a){
			System.out.println("Maaf inan tidak valid " +a);
			break;
		}
		switch(inPilihan){
		case 1:
			System.out.println("===Iputkan Data eKTP===");
			System.out.print("Jumlah Inputan Data eKTP :");
			try{
				inJumlah = in.nextInt();
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Maaf inan tidak valid " +e);
				break;
			}	
			try{
				for (int i = 0; i < inJumlah;i++){
					System.out.println("Data ke-"+(i+1));
					System.out.print("NIK :");
					att.nik = in.next();
					hash.put(att.nik, att.nik);
					
					System.out.print("Nama :");
					att.nama = in.next();				
					hash.put(att.nama, att.nama);
					
					System.out.print("Tempat/Tgl Lahir :");
					att.ttl = in.next();
					hash.put(att.ttl, att.ttl);
					
					System.out.print("Jenis Kelamin :");
					att.jenisKelamin = in.next();
					hash.put(att.jenisKelamin, att.jenisKelamin);
					
					System.out.print("Alamat :"); 
					att.alamat = in.next();
					hash.put(att.alamat, att.alamat);
									
					System.out.print("Kabupaten :");
					att.kabupaten = in.next();
					hash.put(att.kabupaten, att.kabupaten);
                                        
                                        System.out.print("Kecamatan :");
					att.kecamatan = in.next();
					hash.put(att.kecamatan, att.kecamatan);
                                        
					System.out.print("RT:");
					att.rt = in.next();
					hash.put(att.rt, att.rt);
					
					System.out.print("RW:");
					att.rw = in.next();
					hash.put(att.rw, att.rw);
                                        
                                        System.out.print("Kode Pos:");
					att.kodePos = in.next();
					hash.put(att.kodePos, att.kodePos);
					
                                        System.out.print("Agama :");
					att.noKk = in.next();
					hash.put(att.noKk, att.noKk);
                                        
					System.out.print("Agama :");
					att.agama = in.next();
					hash.put(att.agama, att.agama);
					
					System.out.print("Status Perkawinan :");
					att.statusNikah = in.next();
					hash.put(att.statusNikah, att.statusNikah);
					
					System.out.print("Pekerjaan :");
					att.pekerjaan = in.next();
					hash.put(att.pekerjaan, att.pekerjaan);
					
					System.out.print("Kewarganegaraan :");
					att.jenisWarga = in.next();
					hash.put(att.jenisWarga, att.jenisWarga);
					
					System.out.print("Masa Berlaku :");
					att.masaBerlaku = in.next();
					hash.put(att.masaBerlaku, att.masaBerlaku);
					
					arrList.add(hash);
					
					ktp[i] = (i+1) + 
							"\n NIK                 =" +arrList.get(i).get(att.nik) +
							"\n Nama                =" +arrList.get(i).get(att.nama)  +
							"\n Tempat/Tgl Lahir    =" +arrList.get(i).get(att.ttl)+
							"\n Alamat              =" +arrList.get(i).get(att.alamat)+
							"\n RT/RW               =" +arrList.get(i).get(att.rt)+" - "+arrList.get(i).get(att.rw)+
							"\n Desa                =" +arrList.get(i).get(att.kabupaten)+
							"\n Kecamatan		=" +arrList.get(i).get(att.kecamatan)+
                                                        "\n Kecamatan		=" +arrList.get(i).get(att.kodePos)+
                                                        "\n Kecamatan		=" +arrList.get(i).get(att.noKk)+
							"\n Agama       	 =" +arrList.get(i).get(att.agama)+
							"\n Status Perkawinan	 =" +arrList.get(i).get(att.statusNikah)+
							"\n Pekerjaan		 =" +arrList.get(i).get(att.pekerjaan)+
							"\n Kewarganegaraan	 =" +arrList.get(i).get(att.jenisWarga)+
							"\n Masa Berlaku		 =" +arrList.get(i).get(att.masaBerlaku)+ "\n";
					
				}
			}
			catch(java.util.InputMismatchException a){
				System.out.println("Maaf inan tidak valid ");
			}
			catch(ArrayIndexOutOfBoundsException a){
				System.out.println("Maaf inan data ektp sudah penuh");
				System.out.println("Ingin mencoba kembali ? Y/N :");
				try{
					pilih = in.next();
				}
				catch(Exception e){
					System.out.println("Maaf data tidak valid");
				}
				if(pilih=="n" || pilih=="N"){
					break;
				}
			}
			break;
			case 2:
				System.out.println("\n===List Data eKTP===");
				
				if(ktp[0] != null){
					try{
						for (int i = 0; i < inJumlah ; i++){
							System.out.println(ktp[i]);
						}
					}
					catch(ArrayIndexOutOfBoundsException e){
						System.out.println("Maaf data yang di inattkan salah");
					}
					
				}
				else{
					System.out.println("Data kosong\n");
				}
				System.out.println("Menu :");
				System.out.println("1. Back ");
				System.out.println("2. Exit ");
				try{
					inPilihan = in.nextInt();	
				}
				catch(java.util.InputMismatchException a){
					System.out.println("Maaf inan tidak valid " +a);
					break;   
				}
				if(inPilihan==1){
					run = true;

				}else{
					System.exit(0);
					}
				break;
			
			case 3:
				int i = 1;
				System.out.println("===Cari Data eKTP===\n");
				System.out.println("Masukkan Data Yang Ingin Dicari :");
				baca = in.nextLine();
					
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Maaf, menu yang anda pilih tidak ada");
		
		
			}
		}
        
    }
}
