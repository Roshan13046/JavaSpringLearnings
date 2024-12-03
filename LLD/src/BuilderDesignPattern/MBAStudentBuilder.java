package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String > sub = new ArrayList<>();
        sub.add("Eco");
        sub.add("Audit");
        sub.add("GST");
        sub.add("Tax");
        this.subjects = sub;
        return this;
    }
}
