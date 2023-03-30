package Taller4.DAO;

import java.sql.*;
import java.util.List;

public class AccountDAO implements ICRUD{
    private String cadenaConexion;

    public AccountDAO() {
        try {
            DriverManager.registerDriver(new org.sqlite.JDBC());
            cadenaConexion = "jdbc:sqlite:accounts.db";
            createTabla();
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.err.println("Error de conexión con la base de datos: " + e);
        }

    }

    private void createTabla() {
        try (Connection conexion = DriverManager.getConnection(cadenaConexion)) {

            String sql = "CREATE TABLE IF NOT EXISTS accounts (\n"
                    + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                    + " nombre_propietario TEXT NOT NULL,\n"
                    + " tipo_cuenta TEXT NOT NULL,"
                    + " saldo REAL NOT NULL ,\n"
                    + " identificacion TEXT NOT NULL UNIQUE,\n"
                    + " retiros INTEGER DEFAULT 0, \n"
                    + " depositos INTEGER DEFAULT 0 "
                    + ");";

            Statement sentence = conexion.createStatement();
            sentence.execute(sql);

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }

    @Override
    public void save(Object object) {
        try (Connection conexion = DriverManager.getConnection(cadenaConexion)) {
            Account cuenta = (Account) object;
            String sentenciaSql = "INSERT INTO accounts (nombre_propietario, tipo_cuenta, saldo, identificacion) " +
                    " VALUES('" + cuenta.getName() + "', '" + cuenta.getAccountType()
                    + "', '" + cuenta.getBalance()+ "', '" + cuenta.getIdentificacion()+"')";
            Statement sentencia = conexion.createStatement();
            sentencia.execute(sentenciaSql);
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e);
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }
    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Object find(String id) {
        String name;
        try (Connection conexion = DriverManager.getConnection(cadenaConexion)) {
            String sentenciaSql = "SELECT * FROM accounts WHERE identificacion = '" + id + "'";
            PreparedStatement preparedStatement = conexion.prepareStatement(sentenciaSql);
            ResultSet resultSet = preparedStatement.executeQuery();
            name = null;
            if (resultSet.next()) {
                name = resultSet.getString("nombre_propietario");
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return name;
    }

    @Override
    public List show() {
        return null;
    }
}
