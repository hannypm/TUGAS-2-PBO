package tugas02;

public class Minuman extends Barang{
    private int harga;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public void setStokBarang(int stokBarang) {
        super.setStokBarang(stokBarang);
    }

    @Override
    public int getStokBarang() {
        return super.getStokBarang();
    }

    @Override
    public int getNoMinuman() {
        return super.getNoMinuman();
    }

    @Override
    public void setNoMinuman(int noMinuman) {
        super.setNoMinuman(noMinuman);
    }
}
