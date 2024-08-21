public class guru2 {
    int id;
    String nama;
    String mapel;
    String alamat;

    public guru2() {
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    }
    //constructor parameter
    public guru2 (int id, String nama, String mapel, String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

    public void print() {
        System.out.println("Data diri guru: ");
        System.out.println("id: " + id);
        System.out.println("nama: " + nama);
        System.out.println("mapel: " + mapel);
        System.out.println("alamat: " + alamat);
    }
}
