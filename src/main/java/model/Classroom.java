package model;

public class Classroom {
    private int classRoomId;
    private String className;
    private String tutor;
    private String instructor;
    private String coach;
    private String status;

    public Classroom(String className, String tutor, String instructor, String coach, String status) {
        this.className = className;
        this.tutor = tutor;
        this.instructor = instructor;
        this.coach = coach;
        this.status = status;
    }

    public Classroom(int classRoomId, String className, String tutor, String instructor, String coach, String status) {
        this.classRoomId = classRoomId;
        this.className = className;
        this.tutor = tutor;
        this.instructor = instructor;
        this.coach = coach;
        this.status = status;
    }

    public Classroom(){}

    public int getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(int classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
