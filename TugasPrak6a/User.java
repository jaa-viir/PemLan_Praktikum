package TugasPrak6a;

public class User {
    private String name;
    private String username;
    private String password;
    private Book[] borrowedBooks;
    private boolean isBanned = false;
    private int loginAttempts;
    private static final int MAX_LOGIN_ATTEMPTS = 3;

    // Constructor
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.borrowedBooks = new Book[2]; // Maksimal 2 buku yang bisa dipinjam
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public boolean login(String inputUsername, String inputPassword) {
        if (!isBanned) {
            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                loginAttempts = 0;
                return true;
            } else {
                loginAttempts++;
                System.out.println("Username atau password anda tidak sesuai. 1");
                if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
                    isBanned = true;
                    System.out.println("Anda telah dibanned karena melebihi batas percobaan login.");
                }
                return false;
            }
        } else {
            System.out.println("Maaf, Anda telah dibanned.");
            return false;
        }
    }

    public void borrowBook(Book book) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == null) {
                borrowedBooks[i] = book;
                book.setBorrowed(true); // Set status buku menjadi sedang dipinjam
                System.out.println("Buku berhasil dipinjam.");
                return;
            }
        }
        System.out.println("Maaf, Anda sudah mencapai batas maksimal peminjaman.");
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] != null && borrowedBooks[i].equals(book)) {
                borrowedBooks[i] = null;
                book.setBorrowed(false);
                System.out.println("Buku berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Maaf, buku yang ingin Anda kembalikan tidak ditemukan dalam daftar yang dipinjam.");
    }
}
