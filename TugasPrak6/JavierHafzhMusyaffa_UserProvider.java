    package TugasPrak6;

    public class JavierHafzhMusyaffa_UserProvider {
        public static JavierHafzhMusyaffa_User[] getDataUsers() {
            JavierHafzhMusyaffa_User[] data = new JavierHafzhMusyaffa_User[6];
            data[0] = new JavierHafzhMusyaffa_User("User 1", "user1@gmail.com", "PasswordUser1");
            data[1] = new JavierHafzhMusyaffa_User("User 2", "user2@gmail.com", "PasswordUser2");
            data[2] = new JavierHafzhMusyaffa_User("User 3", "user3@gmail.com", "PasswordUser3");
            data[3] = new JavierHafzhMusyaffa_User("User 4", "user4@gmail.com", "PasswordUser4");
            data[4] = new JavierHafzhMusyaffa_User("User 5", "user5@gmail.com", "PasswordUser5");
            data[5] = new JavierHafzhMusyaffa_User("Test", "???", "???"); // ini akun bwt shortcut "Test"
            return data;
        }
    }
