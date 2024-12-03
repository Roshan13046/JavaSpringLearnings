package BuilderDesignPattern;

public class Director {

    //Builder design pattern don't support dynamic object creation
    //We have to create class of such object
    //while decorator design pattern supports dynamic object creation
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineerStudentBuilder){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    public Student createEngineeringStudent(){
        //no of parameter can differ
        return studentBuilder.setRoolNo(1).setAge(21).setSubject().build();
    }

    public Student createMBAStudent(){
        return studentBuilder.setRoolNo(2).setAge(26).setFatherName("Rakesh").setMotherName("Savita").setSubject().build();
    }
}
