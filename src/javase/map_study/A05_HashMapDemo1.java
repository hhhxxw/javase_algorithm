package javase.map_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 一只咸鱼的大厂梦-hxw
 * @date 2025-07-03 11:26
 */
public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王五",18);
        Student stu4 = new Student("赵六",18);

        // 添加元素
        hashMap.put(stu1, "江苏");
        hashMap.put(stu2, "浙江");
        hashMap.put(stu3, "福建");
        hashMap.put(stu4, "山东");

        // 遍历
        Set<Student> students = hashMap.keySet();
        for(Student key : students){
            String value = hashMap.get(key);
            System.out.println(key + " = " +value);
        }

        System.out.println("------------------------------");
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        for(Map.Entry<Student, String> entry : entries){
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println("------------------------------");
        hashMap.forEach(( key, value) -> System.out.println(key + " = " + value));
    }
}
