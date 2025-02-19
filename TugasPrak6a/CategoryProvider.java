package TugasPrak6a;

public class CategoryProvider {
    public static Category[] getCategories() {
        Category[] category = new Category[7];
        category[0] = new Category("Cerpen", "Cerpen adalah fiksi cerita pendek");
        category[1] = new Category("Novel", "Novel adalah cerita fiksi dalam buku");
        category[2] = new Category("Saga", "Saga atau epos adalah cerita-cerita lama dari epos terkenal");
        category[3] = new Category("Komik", "Buku dengan cerita bergambar");
        category[4] = new Category("Biografi", "Biografi adalah cerita yang berdasarkan cerita seseorang");
        category[5] = new Category("Karya Ilmiah", "Berisi perihal karya-karya ilmiah baik bidang pengetahuan alam maupun sosial");
        category[6] = new Category("Pemberitaan", "Kategori ini terdiri dari Arsip Koran dan Majalah");
        return category;
    }
}
