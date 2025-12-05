package hvktmm.khoaattt.at20.viDu.Chuong3;

public class MethodChaining {
}
class Person {
    private String name;
    private int age;
    public Person setName(String name) {
        this.name = name;
        return this;
    }
    public Person setAge(int age) {
        this.age = age;
        return this; }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class Main1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nam").setAge(12);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}