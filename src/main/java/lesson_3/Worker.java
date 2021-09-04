package lesson_3;

public class Worker {
    private String name;
    private String email;
    private int age;
    private String position;

    public Worker(String name, String email, int age, String position){
        this.name = name;
        this.age = age;
        this.email = email;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void infoAboutWorker() {
        System.out.println("Имя работника: " + getName());
        System.out.println("Почта " + getEmail());
        System.out.println("Возраст " + getAge());
        System.out.println("Должность" + getPosition());
    }
}
