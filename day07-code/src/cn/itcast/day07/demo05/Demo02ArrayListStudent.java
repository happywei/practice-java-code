package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历。

思路：
1. 自定义Student学生类，四个部分。
2. 创建一个集合，用来存储学生对象。泛型：<Student>
3. 根据类，创建4个学生对象。
4. 将4个学生对象添加到集合中：add
5. 遍历集合：for、size、get
 */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();

        Student s1 = new Student("shandongwa", 1);
        Student s2 = new Student("luhao",2);
        Student s3 = new Student("huanian", 3);
        Student s4 = new Student("liuwei ", 4);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        for(int i = 0; i < arr.size(); i++){
            Student s = arr.get(i);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }

}
