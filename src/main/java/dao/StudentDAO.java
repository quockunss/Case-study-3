package dao;

import model.Classroom;
import model.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/studentmanager?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "kuns123458";

    private static final String INSERT_STUDENT_SQL = "INSERT INTO student" + "  (name, email, phoneNumber, dateOfBirth) VALUES " +
            " (?, ?, ?, ?);";
    private static final String SELECT_STUDENT_BY_ID = "select * from student where id =?";
    private static final String SELECT_ALL_STUDENT = "select * from student";
    private static final String DELETE_STUDENT_SQL = "delete from student where id = ?;";
    private static final String UPDATE_STUDENT_SQL = "update student set name =?, email =?, phoneNumber =?, dateOfBirth =?, theoryMark =?, caseStudyMark =?, practiceMark =?, module =?, classRoomId = ?  where id = ?;";
    private static final String SELECT_STUDENT_BY_ID_CLASS = "select * from student join classroom on student.classRoomId = classroom.classRoomId where id = ?;";
    public StudentDAO(){}

    protected Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }

    public void insertStudent(Student student) throws SQLException{
        System.out.println(INSERT_STUDENT_SQL);
        System.out.println(student.getName());
        try(Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT_SQL)){
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getEmail());
            preparedStatement.setString(3,student.getPhoneNumber());
            preparedStatement.setString(4,student.getDateOfBirth());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            printSQLException(e);
        }
    }

    public Student selectStudent(int id){
        Student student = null;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STUDENT_BY_ID);){
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                String dateOfBirth = rs.getString("dateOfBirth");
                double theoryMark = Double.parseDouble(rs.getString("theoryMark"));
                double caseStudyMark = Double.parseDouble(rs.getString("caseStudyMark"));
                double practiceMark = Double.parseDouble(rs.getString("practiceMark"));
                String module = rs.getString("module");
                String name = rs.getString("name");
                student = new Student(id,name,email,phoneNumber,dateOfBirth,theoryMark,caseStudyMark,practiceMark,module);
            }
        } catch (SQLException e){
            printSQLException(e);
        }
        return student;
    }
    public Student selectStudentClass(int id){
        Student student = null;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_STUDENT_BY_ID_CLASS);){
            preparedStatement.setInt(1,id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                String dateOfBirth = rs.getString("dateOfBirth");
                double theoryMark = Double.parseDouble(rs.getString("theoryMark"));
                double caseStudyMark = Double.parseDouble(rs.getString("caseStudyMark"));
                double practiceMark = Double.parseDouble(rs.getString("practiceMark"));
                String module = rs.getString("module");
                String name = rs.getString("name");
                String className = rs.getString("className");
                String tutor = rs.getString("tutor");
                String instructor = rs.getString("instructor");
                String coach = rs.getString("coach");
                String status = rs.getString("status");
                Classroom classroom = new Classroom(className,tutor,instructor,coach,status);
                student = new Student(id,name,email,phoneNumber,dateOfBirth,theoryMark,caseStudyMark,practiceMark,module);
                student.setClassroom(classroom);
            }
        } catch (SQLException e){
            printSQLException(e);
        }
        return student;
    }

    public List<Student> selectAllStudent(){
        List<Student> students = new ArrayList<>();
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_STUDENT); ){
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phoneNumber = rs.getString("phoneNumber");
                String dateOfBirth = rs.getString("dateOfBirth");
                students.add(new Student(id,name,email,phoneNumber,dateOfBirth));
            }
        } catch (SQLException e){
            printSQLException(e);
        }
        return students;
    }

    public boolean deleteStudent(int id) throws SQLException{
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_STUDENT_SQL);){
            statement.setInt(1,id);
            rowDeleted = statement.executeUpdate()>0;
        }
        return rowDeleted;
    }

    public boolean updateStudent(Student student) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_STUDENT_SQL);) {
            statement.setString(1, student.getName());
            statement.setString(2, student.getEmail());
            statement.setString(3, student.getPhoneNumber());
            statement.setString(4, student.getDateOfBirth());
            statement.setDouble(5, student.getTheoryMark());
            statement.setDouble(6, student.getCaseStudyMark());
            statement.setDouble(7, student.getPracticeMark());
            statement.setString(8, student.getModule());
            statement.setInt(9, student.getClassRoomId());


            statement.setInt(10, student.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
