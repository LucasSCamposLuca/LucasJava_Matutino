package javaJDBC;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/?autoReconnect=true&useSSL=false"; // Substitua pelo seu URL do banco de dados String user = "root"; // Substitua pelo seu usuário String password = "senaigama"; // Substitua pela sua senha try (Connection connection = (Connection) DriverManager.getConnection(url, user, password)) {
        System.out.println("Conexão estabelecida com sucesso!");
        // Aqui você pode adicionar mais código para realizar operações no banco de dados } catch (SQLException e) {
        System.err.println("Erro ao conectar: " + e.getMessage());
    }
}

