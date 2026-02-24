package week5;
public class Teacher extends Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String departmen;
    private String courses;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDepartment(String departmen) {
        return departmen;
    }
    public void setDepartment(String departmen) {
        this.departmen = departmen;
    }
    public String getCourses(String courses) {
        return courses;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Teacher firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender;
    }
    public boolean equals(Teacher t)
    {
        if(this.firstName.equals(t.firstName) && this.lastName.equals(t.lastName))
        {
            return true;
        }
        else
        {
            return false;
        }   
    }


}