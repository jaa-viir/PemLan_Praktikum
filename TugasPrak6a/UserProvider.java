    package TugasPrak6a;

    public class UserProvider {
        public static User[] getDataUsers() {
            User[] data = new User[6];
            data[0] = new User("User 1", "user1@gmail.com", "PasswordUser1");
            data[1] = new User("User 2", "user2@gmail.com", "PasswordUser2");
            data[2] = new User("User 3", "user3@gmail.com", "PasswordUser3");
            data[3] = new User("User 4", "user4@gmail.com", "PasswordUser4");
            data[4] = new User("User 5", "user5@gmail.com", "PasswordUser5");
            data[5] = new User("Test", "???", "???"); // ini akun bwt shortcut "Test"
            return data;
        }
    }
