package TugasPrak6;

public class JavierHafzhMusyaffa_Book {
    private String name;
    private String authorName;
    private String tahunRilis;
    private JavierHafzhMusyaffa_Category category;
    private boolean isBorrowed = false;;
    private JavierHafzhMusyaffa_User user;

    // Constructor
    public JavierHafzhMusyaffa_Book(String name, String authorName, String tahunRilis, JavierHafzhMusyaffa_Category category) {
        this.name = name;
        this.authorName = authorName;
        this.tahunRilis = tahunRilis;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTahunRilis() {
        return tahunRilis;
    }

    public JavierHafzhMusyaffa_Category getCategory() {
        return category;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void setUser(JavierHafzhMusyaffa_User user) {
        this.user = user;
    }

    public JavierHafzhMusyaffa_User getUser() {
        return user;
    }

    public void simpleDesc() {
        System.out.println("\tJudul buku\t: " + getName());
        System.out.println("\tAuthor\t\t: " + getAuthorName());
        System.out.println("\tRilis pada\t: " + getTahunRilis());
        return;
    }

    public void longDesc() {
        System.out.println("Judul\t\t\t: " + getName());
        System.out.println("Author\t\t\t: " + getAuthorName());
        System.out.println("Rilis pada\t\t: " + getTahunRilis());
        System.out.println("Kategori\t\t: " + getCategory().getName());
        System.out.println("Deskripsi dari kategori\t: " + getCategory().getGeneralDescription());
    }
}
