package genericity.demo1;

class MyClass<T>{
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}


public class GenerictyDemo1 {
    public static void main(String[] args) {
        MyClass<String> mc =new MyClass<>();
        mc.setObj("黑马");
        System.out.println(mc.getObj());
    }
}
