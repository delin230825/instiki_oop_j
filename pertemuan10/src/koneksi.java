



 import java.sql.drivermanager;
 import java.sql.Connection;

/**
 *
 * @author del yotia
 * tgl 20 mei 2025
 */
public class koneksi {
    static String JDBC_DRIVER="com.mysql.cj.jdbc,driver";
    static String DB_USER="root";
    static String DB_PASSWORD="";
    static String DB_URI="jdbd:mysql://lokalhost:3306/mahasiswa";
    
    
    
    
    public Connection koneksi (){
        try {
           Class.forname (JDBC_DRIVER);
            return  Drivermanager.getConnection(DB_USER,DB_PASSWORD,DB_URI);
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("gagal koneksi ke database");
        } 
        return null
            
    

 


    }
    
    
}
