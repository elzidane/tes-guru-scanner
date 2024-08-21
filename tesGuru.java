import java.util.Scanner;

public class tesGuru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama: ");
        String nama = in.nextLine();
        System.out.println("Mapel: ");
        String mapel = in.nextLine();
        System.out.println("Alamat: ");
        String alamat = in.nextLine();
        System.out.println("id: ");
        int id = in.nextInt();
        
        guru aulia = new guru();
        guru munif = new guru();
        guru firdaus = new guru();

        aulia.id = 20;
        aulia.nama = "Aulia masadah";
        aulia.mapel = "RPL";
        aulia.alamat = "Malang";

        munif.id = 26;
        munif.nama = "Aulia masadah";
        munif.mapel = "RPL";
        munif.alamat = "Malang";

        firdaus.id = 12;
        firdaus.nama = "Firdaus";
        firdaus.mapel = "Rpl";
        firdaus.alamat = "Surabaya";

        System.out.println("Data diri bu aulia: ");
        System.out.println("id: " + aulia.id);
        System.out.println("nama: " + aulia.nama);
        System.out.println("Mapel: " + aulia.mapel);
        System.out.println("Alamat: " + aulia.alamat);
        System.out.println("Data diri pak munif: ");
        System.out.println("id: " + munif.id);
        System.out.println("nama: " + munif.nama);
        System.out.println("Mapel: " + munif.mapel);
        System.out.println("Alamat: " + munif.alamat);
        System.out.println("Data diri pak firdaus: ");
        System.out.println("id: " + firdaus.id);
        System.out.println("nama: " + firdaus.nama);
        System.out.println("Mapel: " + firdaus.mapel);
        System.out.println("Alamat: " + firdaus.alamat);

        
    }
}
