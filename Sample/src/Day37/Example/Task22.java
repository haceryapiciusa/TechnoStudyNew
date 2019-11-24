package Day37.Example;
//from teacher
// create a class which will have 3 attributes
// all attributes should be also classes!!!
// in every class you need to have at least 2 attributes

// Hint: student, school, profile, grade
class School {
    public String schoolName;
    public String address;
}

class Profile {
    public String fullName;
    public int age;
}

class Grade {
    public int gradeLevel;
    public String gradeName;
}

class Student {
    public School school;
    public Grade grade;
    public Profile profile;
}

public class Task22 {

}