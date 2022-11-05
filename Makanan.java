package tugas02;

public class Makanan extends Barang {
    private int harga;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    static void display(){
        System.out.println("nama makanan :");
        System.out.println("\t1.cheetos");
        System.out.println("\t2.pocky");
        System.out.println("\t3.chiki");
    }

    @Override
    public int getStokBarang() {
        return super.getStokBarang();
    }

    @Override
    public void setStokBarang(int stokBarang) {
        super.setStokBarang(stokBarang);
    }

    @Override
    public void setNoMakanan(int noMakanan) {
        super.setNoMakanan(noMakanan);
    }

    @Override
    public int getNoMakanan() {
        return super.getNoMakanan();
    }
}
