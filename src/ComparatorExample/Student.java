package ComparatorExample;

/**
 * The Student class represents a student with an id and name.
 * It implements the Comparable interface to allow comparison based on the student's id.
 */
public class Student implements Comparable<Student> {

    private int studentId;
    private String studentName;

    /**
     * Constructs a new Student with the specified id and name.
     *
     * @param studentId   The id of the student.
     * @param studentName The name of the student.
     */
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    /**
     * Returns the id of the student.
     *
     * @return The id of the student.
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Sets the id of the student.
     *
     * @param studentId The id to set.
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Returns the name of the student.
     *
     * @return The name of the student.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the name of the student.
     *
     * @param studentName The name to set.
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * Returns a string representation of the student.
     *
     * @return A string representation of the student.
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    /**
     * Compares this student to another student based on their id.
     *
     * @param otherStudent The student to compare to.
     * @return A negative integer, zero, or a positive integer as this student's id is less than, equal to, or greater than the other student's id.
     */
    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.studentId, otherStudent.studentId);
    }
}
