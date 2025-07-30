class Config {
    static String DB_URL;

    static {
        // Simulate fetching from a config file
        DB_URL = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block: DB_URL initialized");
    }

    public static void main(String[] args) {
        System.out.println("Using DB: " + DB_URL);
    }
}
