import com.sun.javafx.sg.prism.NodePath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class namaberurut {
    public class Nama {
        public void main(String[] args) throws Exception {
            BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
            // Class Buffered menjadi variabel baru bernama kata
            int a; // Mendeklarasikan variable bernama a bertipe data integer
            System.out.println("Jumlah Nama Yang Di Inputkan ;");
            a = Integer.parseInt(kata.readLine()); // mengconvert a yang asalnya

            String[] Array; // mendeklarasikan array yang bertipe data string
            Array = new String[a]; // instansiasi dan inisialisasi variable a
            String temp; // mendeklarasikan variabel temp yang bertipe data string
            // penginputan nama
            for (int i = 0; i < a; i++) {
                System.out.print("Nama " + (i + 1) + " adalah: ");
                NotePath input = null;
            }
            // proses penyortingan
            for (int x = 1; x < a; x++) {
                for (int y = 0; y < a - x; y++) {
                    if (Array[y].compareTo(Array[y + 1]) > 0) {
                        temp = Array[y];//jarnih, togleng, wawan, iqbal, nandar, jamal, zulfan, aji, darul, ulum, ibnu, jamilah, sugeng, sutarip
                        Array[y] = Array[y + 1];///jarnih, togleng, wawan, iqbal, nandar, jamal, zulfan, aji, darul, ulum, ibnu, jamilah, sugeng, sutarip
                        Array[y + 1] = temp; ///jarnih, togleng, wawan, iqbal, nandar, jamal, zulfan, aji, darul, ulum, ibnu, jamilah, sugeng, sutarip
                    }
                }
            }
            // output pengurutan nama
            System.out.println("");
            System.out.println("Urutannya ");

            for (int i = 0; i < a; i++) {
                System.out.println((i + 1) + ". " + Array[i]);
            }
            // output dari jumlah siswa
            System.out.println("Jumlah siswa : " + a);
            System.out.println("nama 2 terbawah : " + Array[a - 2]);
            System.out.println("nama 2 teratas : " + Array[1]);
        }
    }
}