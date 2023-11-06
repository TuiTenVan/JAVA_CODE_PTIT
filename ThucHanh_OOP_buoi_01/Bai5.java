package ThucHanh_OOP_buoi_01;

import java.util.*;

class Student implements Comparable<Student> {
    private String id, name, team, school;
    public Student(int t, String name, String team, String school) {
        String id = String.valueOf(t);
        while(id.length() != 3) id = "0" + id;
        this.id = "C" + id;
        this.name = name;
        this.team = team;
        this.school = school;
    }
    public void show(){
        System.out.println(id + " " + name + " " + team + " " + school);
    }
    public int compareTo(Student o){
        if(this.name.compareTo(o.name) > 0)    return 1;
        return -1;
    }
}
public class Bai5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<String> lst1 = new ArrayList<>();
        List<String> lst2 = new ArrayList<>();
        while(n -- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            lst1.add(s1);
            lst2.add(s2);
        }
        int m = sc.nextInt();
        sc.nextLine();
        List<Student> lst = new ArrayList<Student>();
        for(int t = 1; t <= m; t++){
            String name = sc.nextLine();
            String team = sc.nextLine();
            int z = Integer.parseInt(team.substring(4));
            lst.add(new Student(t, name, lst1.get(z - 1), lst2.get(z - 1)));
        }
        Collections.sort(lst);
        lst.forEach(x -> x.show());
    }
}
