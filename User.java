package tugas02;

import java.util.Scanner;

public class User {
    private int uang;
    private int noBarang;

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getNoBarang() {
        return noBarang;
    }

    public void setNoBarang(int noBarang) {
        this.noBarang = noBarang;
    }
    final static void user(){
        Scanner in = new Scanner(System.in);
        User usr=new User();
        System.out.println("Masukan uang (kelipatan 5k) : ");
        int uang=in.nextInt();
        usr.getUang();
    }
    public void cetakStruk(){
    }
}
