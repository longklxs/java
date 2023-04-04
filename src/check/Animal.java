package check;

public class Animal {
    private int sex;
    private int age;

    public Animal() {
    }

    public Animal(int sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{sex = " + sex + ", age = " + age + "}";
    }
}
