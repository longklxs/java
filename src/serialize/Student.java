package serialize;

import java.io.Serializable;

public class Student implements Serializable {
    String stuNo;
    String name;
    boolean sex;
    int age;

    public Student() {
    }

    public Student(String stuNo, String name, boolean sex, int age) {
        this.stuNo = stuNo;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     * @return stuNo
     */
    public String getStuNo() {
        return stuNo;
    }

    /**
     * 设置
     * @param stuNo
     */
    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return sex
     */
    public boolean isSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(boolean sex) {
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
        return "Student{stuNo = " + stuNo + ", name = " + name + ", sex = " + sex + ", age = " + age + "}";
    }
}
