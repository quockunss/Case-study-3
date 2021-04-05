package model;

public class Student {
    protected int id;
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected String dateOfBirth;
    protected double theoryMark;
    protected double caseStudyMark;
    protected double practiceMark;
    protected String module;
    protected int classRoomId;

    public int getClassRoomId() {
        return classroom.getClassRoomId();
    }

    public void setClassRoomId(int classRoomId) {
        this.classRoomId = classRoomId;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    protected Classroom classroom;

    public Student(String name, String email, String phoneNumber, String dateOfBirth){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String name, String email, String phoneNumber, String dateOfBirth, double theoryMark, double caseStudyMark, double practiceMark, String module) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.theoryMark = theoryMark;
        this.caseStudyMark = caseStudyMark;
        this.practiceMark = practiceMark;
        this.module = module;
    }

    public Student(int id, String name, String email, String phoneNumber, String dateOfBirth, double theoryMark, double caseStudyMark, double practiceMark, String module) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.theoryMark = theoryMark;
        this.caseStudyMark = caseStudyMark;
        this.practiceMark = practiceMark;
        this.module = module;

    }

    public Student(int id, String name, String email, String phoneNumber, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getTheoryMark() {
        return theoryMark;
    }

    public void setTheoryMark(double theoryMark) {
        this.theoryMark = theoryMark;
    }

    public double getCaseStudyMark() {
        return caseStudyMark;
    }

    public void setCaseStudyMark(double caseStudyMark) {
        this.caseStudyMark = caseStudyMark;
    }

    public double getPracticeMark() {
        return practiceMark;
    }

    public void setPracticeMark(double practiceMark) {
        this.practiceMark = practiceMark;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

}
