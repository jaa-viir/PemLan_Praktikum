package TugasPrak6;

public class JavierHafzhMusyaffa_CategoryProvider {
    public static JavierHafzhMusyaffa_Category[] getCategories() {
        JavierHafzhMusyaffa_Category[] category = new JavierHafzhMusyaffa_Category[7];
        category[0] = new JavierHafzhMusyaffa_Category("Cerpen", "Cerpen adalah fiksi cerita pendek");
        category[1] = new JavierHafzhMusyaffa_Category("Novel", "Novel adalah cerita fiksi dalam buku");
        category[2] = new JavierHafzhMusyaffa_Category("Saga", "Saga atau epos adalah cerita-cerita lama dari epos terkenal");
        category[3] = new JavierHafzhMusyaffa_Category("Komik", "Buku dengan cerita bergambar");
        category[4] = new JavierHafzhMusyaffa_Category("Biografi", "Biografi adalah cerita yang berdasarkan cerita seseorang");
        category[5] = new JavierHafzhMusyaffa_Category("Karya Ilmiah", "Berisi perihal karya-karya ilmiah baik bidang pengetahuan alam maupun sosial");
        category[6] = new JavierHafzhMusyaffa_Category("Pemberitaan", "Kategori ini terdiri dari Arsip Koran dan Majalah");
        return category;
    }
}
