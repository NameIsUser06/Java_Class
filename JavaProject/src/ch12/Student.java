package ch12;

public class Student {
    String name;
    int num;

    Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            if (this.num == ((Student) obj).num) {
                return true;
            }
            return false;
        }
        return false;
    }
}
