package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineerStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String > sub = new ArrayList<>();
        sub.add("DSA");
        sub.add("OS");
        sub.add("CNT");
        sub.add("DBMS");

        this.subjects = sub;

        return this;
    }
}
