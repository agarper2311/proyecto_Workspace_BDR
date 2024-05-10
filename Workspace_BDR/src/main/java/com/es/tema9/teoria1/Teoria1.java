package com.es.tema9.teoria1;

import java.sql.*;

public class Teoria1 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/alumnos?user=root&password=";
        try {

            // Establecer la conexión
            Connection connection = DriverManager.getConnection(url);

            // Crear objeto de tipo statement
            Statement statement = connection.createStatement();

            // Lanzar Query
            ResultSet resulset = statement.executeQuery("SELECT * FROM estudiantes");

            // Leer ResulSet
            while(resulset.next()){

               String nombre= resulset.getString("nombre");
                System.out.println("Nombre: "+nombre);

            }

            // Cerrar la conexión
            connection.close();


        }catch (SQLException  e){
            e.printStackTrace();
        }


    }
}
