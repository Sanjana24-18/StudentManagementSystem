import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public static void addStudent(String name,int age,String course,String email){

        try{

            Connection con = DBConnection.getConnection();

            String query="INSERT INTO students(name,age,course,email) VALUES(?,?,?,?)";

            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1,name);
            ps.setInt(2,age);
            ps.setString(3,course);
            ps.setString(4,email);

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
