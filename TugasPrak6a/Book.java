package TugasPrak6a;

public class Book {
    private String name;
    private String authorName;
    private String tahunRilis;
    private Category category;
    private boolean isBorrowed = false;;
    private User user;

    // Constructor
    public Book(String name, String authorName, String tahunRilis, Category category) {
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

    public Category getCategory() {
        return category;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
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
