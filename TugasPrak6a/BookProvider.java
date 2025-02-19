package TugasPrak6a;

public class BookProvider {
    // Metode untuk mendapatkan data buku sesuai dengan sistem yang diberikan
    public static Book[] getDataBook(Category[] categories) {
        Book[] book = new Book[11];
        book[0] = new Book("Mein Kampf", "Adolf Hitler", "1925", categories[4]); // Biografi
        book[1] = new Book("Laskar Pelangi", "Andrea Hirata", "2007", categories[1]); // Novel
        book[2] = new Book("MAHABARATA", "Byasa", "1990", categories[2]); // Saga
        book[3] = new Book("Mengais Asa", "Ramdani Koernia", "2018", categories[0]); // Cerpen
        book[4] = new Book("Attack On Titan Vol 1", "Hajime Isayama", "2010", categories[3]); // Komik
        book[5] = new Book("Habibie & Ainun", "Habibie", "2013", categories[4]); // Biografi
        book[6] = new Book("ONE PIECE Vol 1", "Eichiro Oda", "1998", categories[3]); // Komik
        book[7] = new Book("Penggunaan Metode X pada Sample Y", "Prof. Wira", "2019", categories[5]); // Karya Ilmiah
        book[8] = new Book("Koran Jawa Pos April 2021", "Jawa Pos", "2021", categories[6]); // Pemberitaan
        book[9] = new Book("Koran SINDO Maret 2021", "SINDO", "2021", categories[6]); // Pemberitaan
        book[10] = new Book("Tabloid Jalar", "Penerbit Lajar", "2000", categories[6]); // Pemberitaan
        return book;
    }
}