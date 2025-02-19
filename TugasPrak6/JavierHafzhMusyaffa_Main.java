package TugasPrak6;

import java.util.Scanner;

public class JavierHafzhMusyaffa_Main {
    public static void main(String[] args) {
        // ini bwt import "Database" kita yak
        JavierHafzhMusyaffa_User[] users = JavierHafzhMusyaffa_UserProvider.getDataUsers();
        JavierHafzhMusyaffa_Category[] categories = JavierHafzhMusyaffa_CategoryProvider.getCategories();
        JavierHafzhMusyaffa_Book[] books = JavierHafzhMusyaffa_BookProvider.getDataBook(categories);

        // Memulai loop menu
        Scanner in = new Scanner(System.in);
        boolean isLoggedIn = false;
        JavierHafzhMusyaffa_User currentUser = null;

        boolean systemLoop = true;
        while (systemLoop) {
            while (!isLoggedIn) {
                System.out.println("\u001B[34m+=-----------------------------=+\u001B[0m");
                System.out.print("Masukkan username: ");
                String username = in.nextLine();
                if (username.equals("Test")) { // shortcut test
                    isLoggedIn = true;
                    currentUser = users[5];
                    break;
                }
                System.out.print("Masukkan password: ");
                String password = in.nextLine();
                // Melakukan login dengan memeriksa setiap user
                for (JavierHafzhMusyaffa_User user : users) {
                    if (user.getUsername().equals(username)) {
                        if (user.login(username, password)) {
                            if (user.isBanned()) {
                                System.out.println("Maaf, Akun anda telah dibanned.");
                                return;
                            } else {
                                isLoggedIn = true;
                                currentUser = user;
                                break;
                            }
                        } else
                            break;
                    } else {
                        System.out.println("Username atau password anda tidak sesuai.");
                        break;
                    }
                }
            }
            Boolean cekOpenPertama = true; // bwt line 46 (klo gk pindah wkwk)
            boolean isRunning = true;
            // loop menu
            while (isRunning) {
                isRunning = true;
                System.out
                        .println("\u001B[34m+=--------------------------[Menu]---------------------------=+\u001B[0m");
                if (cekOpenPertama) {
                    System.out.println("Selamat datang pada perpustakaan virtual, \u001B[32m" + currentUser.getName()
                            + "\u001B[0m!!\r\n");
                    cekOpenPertama = false;
                }
                System.out.println("Silahkan memilih menu di sini!");
                System.out.println("1. Melihat semua daftar katalog buku");
                System.out.println("2. Melihat detail suatu buku");
                System.out.println("3. Mencari dengan sortir kategori");
                System.out.println("4. Melihat data user saat ini");
                System.out.println("5. Meminjam suatu buku");
                System.out.println("6. Mengembalikan suatu buku");
                System.out.println("7. Keluar dari system");

                System.out.print("\u001B[34m>> \u001B[0m");
                int choice = 0;
                try {
                    choice = in.nextInt();
                } catch (Exception e) {

                }
                in.nextLine();

                System.out
                        .println("\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
                switch (choice) {
                    case 1:
                        viewAllBooks(books);
                        break;
                    case 2:
                        viewBookDetail(books, in);
                        break;
                    case 3:
                        searchByCategory(categories, books, in);
                        break;
                    case 4:
                        viewCurrentUser(currentUser, books);
                        break;
                    case 5:
                        borrowBook(currentUser, books, in);
                        break;
                    case 6:
                        returnBook(currentUser, books, in);
                        break;
                    case 7:
                        isRunning = false; // Keluar dari loop
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } // menu loop
              // "log out"
            isLoggedIn = false;
            currentUser = null;
            boolean ExitLoop = true;
            while (ExitLoop) {
                System.out.println("Apakah anda ingin keluar? (yes/no)");
                System.out.print("\u001B[34m>> \u001B[0m");
                String choice = "-";
                try {
                    choice = in.nextLine();
                } catch (Exception e) {
                }
                switch (choice.toLowerCase()) {
                    case "yes":
                        in.close();
                        System.out.println("Terimkasih sudah menggunakan aplikasi kami!");
                        System.out.println(
                                "\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
                        systemLoop = false;
                        return;
                    case "no":
                        ExitLoop = false;
                        System.out.println(
                                "\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
                        break;
                    default:
                        System.out.println("Input invalid, coba lagi");
                        System.out.println(
                                "\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
                        break;
                }
            }
        } // system loop
    }

    // 1 1 1 1 1 1
    public static void viewAllBooks(JavierHafzhMusyaffa_Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println("\u001B[32m" + (i + 1) + ". " + books[i].getName() + "\u001B[0m");
            books[i].simpleDesc();
        }
    }

    // 2 2 2 2 2 2
    private static void viewBookDetail(JavierHafzhMusyaffa_Book[] books, Scanner in) {
        viewAllBooks(books);
        System.out.println("\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
        while (true) {
            System.out.println("Pilih buku yang ingin anda lihat detailnya! ");
            System.out.print("\u001B[34m>> \u001B[0m");
            int index = in.nextInt();
            in.nextLine();

            System.out.println("\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
            if (index >= 1 && index <= books.length) {
                JavierHafzhMusyaffa_Book book = books[index - 1];
                System.out.println("\u001B[32mMenunjukkan detail dari buku dengan index " + index + "!\u001B[0m");
                book.longDesc();
                break;
            } else {
                System.out.println("Index buku tidak valid. Silakan coba lagi.");
            }
        }
    }

    // 3 3 3 3 3 3
    private static void searchByCategory(JavierHafzhMusyaffa_Category[] categories, JavierHafzhMusyaffa_Book[] books,
            Scanner in) {
        System.out.println("Daftar Kategori Buku yang Tersedia:");
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i].getName());
        }

        System.out.println("Pilih untuk melakukan sortir buku per category!");
        System.out.print("\u001B[34m>> \u001B[0m");
        int categoryIndex = 0;
        try {
            categoryIndex = in.nextInt();
        } catch (Exception e) {
        }
        in.nextLine();

        if (categoryIndex >= 1 && categoryIndex <= categories.length) {
            JavierHafzhMusyaffa_Category selectedCategory = categories[categoryIndex - 1];
            System.out.println("Kategori yang anda pilih adalah kategori " + selectedCategory.getName());

            System.out.println("\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
            System.out
                    .println("Nenunjukkan buku dari kategori \u001B[32m" + selectedCategory.getName() + "\u001B[0m!!");
            int index = 1;
            for (JavierHafzhMusyaffa_Book book : books) {
                if (book.getCategory().equals(selectedCategory)) {
                    System.out.println("\u001B[32m" + (index) + ". " + books[index - 1].getName() + "\u001B[0m");
                    books[index].simpleDesc();
                }
                index++;
            }
        } else {
            System.out.println("Index kategori tidak valid. Silakan coba lagi.");
        }
    }

    // 4 4 4 4 4 4
    private static void viewCurrentUser(JavierHafzhMusyaffa_User currentUser, JavierHafzhMusyaffa_Book[] books) {
        System.out.println("Data diri Anda");
        System.out.println("Nama\t\t: " + currentUser.getName());
        System.out.println("Username\t: " + currentUser.getUsername());
        System.out.println("Password\t: " + currentUser.getPassword());

        int i = 1;
        Boolean boolPinjam = true;
        for (JavierHafzhMusyaffa_Book book : books) {
            if (book.isBorrowed() && book.getUser().equals(currentUser)) {
                if (boolPinjam) {
                    System.out.println("\r\nBuku yang Anda sedang pinjam:");
                }
                System.out.println("\u001B[32m" + (i) + ". " + book.getName() + "\u001B[0m");
                book.simpleDesc();
                boolPinjam = false;
                i++;
            }
        }
    }

    // 5 5 5 5 5 5
    private static void borrowBook(JavierHafzhMusyaffa_User currentUser, JavierHafzhMusyaffa_Book[] books, Scanner in) {
        System.out.println("Berikut adalah list semua buku :");
        viewAllBooks(books);
        System.out.println("Masukkan nomor buku yang ingin dipinjam: ");

        System.out.print("\u001B[34m>> \u001B[0m");
        int bookIndex = in.nextInt();
        in.nextLine();

        System.out.println("\u001B[34m+=-----------------------------------------------------------=+\u001B[0m");
        if (bookIndex >= 1 && bookIndex <= books.length) {
            JavierHafzhMusyaffa_Book selectedBook = books[bookIndex - 1];
            if (!selectedBook.isBorrowed()) {
                selectedBook.setBorrowed(true);
                selectedBook.setUser(currentUser);
                System.out.println("Buku '" + selectedBook.getName() + "' berhasil dipinjam!");
            } else if (selectedBook.getUser() != currentUser) {
                System.out.println("Maaf, buku ini sudah dipinjam oleh : \u001B[32m" + selectedBook.getUser().getName()
                        + "\u001B[0m!!\r\n");
            } else {
                System.out.println("Buku ini sudah anda pinjam.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
    }

    // 6 6 6 6 6 6
    private static void returnBook(JavierHafzhMusyaffa_User currentUser, JavierHafzhMusyaffa_Book[] books, Scanner in) {

        boolean hasBorrowedBook = false;
        for (JavierHafzhMusyaffa_Book book : books) {
            if (book.isBorrowed() && book.getUser().equals(currentUser)) {
                hasBorrowedBook = true;
            }
        }
        if (!hasBorrowedBook) {
            System.out.println("Anda tidak sedang meminjam buku apapun.");
            return;
        }

        int i = 1;
        System.out.println("Buku yang Anda sedang pinjam:");
        for (JavierHafzhMusyaffa_Book book : books) {
            if (book.isBorrowed() && book.getUser().equals(currentUser)) {
                System.out.println("\u001B[32m" + (i) + ". " + book.getName() + "\u001B[0m");
                book.simpleDesc();
                i++;
            }
        }

        System.out.print("Masukkan nomor buku yang ingin dikembalikan: ");
        int bookIndex = in.nextInt();
        in.nextLine();

        if (bookIndex >= 1 && bookIndex <= books.length) {
            JavierHafzhMusyaffa_Book selectedBook = books[bookIndex - 1];
            if (selectedBook.isBorrowed() && selectedBook.getUser().equals(currentUser)) {
                selectedBook.setBorrowed(false);
                selectedBook.setUser(null);
                System.out.println("Buku '" + selectedBook.getName() + "' berhasil dikembalikan.");
            } else {
                System.out.println("Maaf, Anda tidak sedang meminjam buku ini.");
            }
        } else {
            System.out.println("Nomor buku tidak valid.");
        }
    }
}