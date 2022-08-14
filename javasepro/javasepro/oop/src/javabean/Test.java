package javabean;

public class Test {
    public static void main(String[] args) {
        User u1= new User();
        u1.name="章北海";
        u1.age=18;
        u1.salary=10000;
        System.out.println(u1.getName());
        System.out.println(u1.getAge()+"岁");
        System.out.println(u1.getSalary()+"元");

        User u2 = new User("胜利主义",0,1000000);
        System.out.println(u2.getName());
        System.out.println(u2.getAge()+"岁");
        System.out.println(u2.getSalary()+"元");
    }
}
