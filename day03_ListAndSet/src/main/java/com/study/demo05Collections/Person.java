package com.study.demo05Collections;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 自定义比较规则，比较2个人的年龄
     * @param o
     * @return
     */
    @Override
    public int compareTo(Person o) {
//        return o.getAge() - this.getAge();      //降序排序    参数-自己=降序
        return this.getAge() - o.getAge();    //升序排序    自己-参数=升序
    }
}
