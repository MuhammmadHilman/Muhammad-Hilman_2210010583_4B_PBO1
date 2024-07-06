
package Perpustakaan;


class Buku {
    private String judul;
    private String penulis;
    private String isbn;

    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("ISBN: " + isbn);
    }
}

class Majalah extends Buku {
    private int edisi;

    public Majalah(String judul, String penulis, String isbn, int edisi) {
        super(judul, penulis, isbn);
        this.edisi = edisi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Edisi: " + edisi);
    }
}
