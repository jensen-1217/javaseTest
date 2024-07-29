package genericity.demo10;

import java.util.Optional;

public class OptionalDemo {
    private String name ;

    public OptionalDemo() {
    }

    public OptionalDemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OptionalDemo{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
OptionalDemo a=new OptionalDemo();

a.setName("lisi");
        String name = a.getName();
        boolean result = Optional.ofNullable(name).isPresent();
        if(result){
            System.out.println("有效数据");
        }

        String stu = Optional.ofNullable(name).get();
        System.out.println(stu);

    }
}
