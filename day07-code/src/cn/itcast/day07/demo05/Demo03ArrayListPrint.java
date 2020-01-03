package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
格式参照 {元素@元素@元素}。

System.out.println(list);       [10, 20, 30]
printArrayList(list);           {10@20@30}
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("liuwei");
        arr.add("huanian");
        arr.add("shandongwa");
        arr.add("luhao");

        printArrayList(arr);
    }

    public static void printArrayList(ArrayList<String> arr){
        System.out.print("{");
        for(int i = 0; i < arr.size(); i++){
            String s = arr.get(i);
            if(i == arr.size() - 1)
                System.out.print(s + "}");
            else
                System.out.print(s + "@");
        }
    }

}
