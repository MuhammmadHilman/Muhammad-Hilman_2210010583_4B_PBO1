
package Perpustakaan;


public class perpustakaan {
    public static void main(String[] args) {
        Buku[] koleksiBuku = new Buku[10];
        int jumlahBuku = 0;

        Buku buku1 = new Buku("Pemrograman Java", "Budi", "22100");
        Buku buku2 = new Buku("Desain Sistem", "Mamat", "23100");
        Majalah majalah1 = new Majalah("Majalah Teknologi", "Joko", "24100", 2024);

        koleksiBuku[jumlahBuku++] = buku1;
        koleksiBuku[jumlahBuku++] = buku2;
        koleksiBuku[jumlahBuku++] = majalah1;

        System.out.println("Koleksi Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            koleksiBuku[i].displayInfo();
            System.out.println();
        }

        System.out.print("Masukkan ISBN untuk mencari buku: ");
        char[] inputChars = new char[20];
        int length = 0;
        try {
            while (true) {
                int ch = System.in.read();
                if (ch == '\n' || ch == '\r') break;
                inputChars[length++] = (char) ch;
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        }
        String isbnCari = new String(inputChars, 0, length).trim();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahBuku; i++) {
            if (koleksiBuku[i].getIsbn().equals(isbnCari)) {
                System.out.println("Buku ditemukan:");
                koleksiBuku[i].displayInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku dengan ISBN " + isbnCari + " tidak ditemukan.");
        }


        System.out.println("\nDaftar Judul Buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println((i + 1) + ". " + koleksiBuku[i].getJudul());
        }

       
        System.out.println("\nData koleksi buku:");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println(koleksiBuku[i].getJudul() + ", " + koleksiBuku[i].getPenulis() + ", " + koleksiBuku[i].getIsbn());
        }
    }
}

