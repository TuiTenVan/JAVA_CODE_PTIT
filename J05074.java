
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

class Student {
    private String id;
    private String name;
    private String codeClass;
    private int mark;
    private String note;

    public Student(String id, String name, String codeClass) {
        this.id = id;
        this.name = name;
        this.codeClass = codeClass;
        this.mark=10;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    

    public String getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(String codeClass) {
        this.codeClass = codeClass;
    }
    public int getToTal(){
        int c=Collections.frequency(Arrays.asList(this.note.split("")), String.valueOf("v"));
        int d=Collections.frequency(Arrays.asList(this.note.split("")), String.valueOf("m"));
        return this.mark-c*2-d*1;
    }

    public String toString() {
        if(this.getToTal()<=0){
            return this.id+" "+this.name+" "+this.codeClass+" "+0+" KDDK";
        }else{
            return this.id+" "+this.name+" "+this.codeClass+" "+this.getToTal();
        }
    } 
}

public class J05074 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());
       ArrayList<Student> arr=new ArrayList<>();
       for(int i=1;i<=n;i++){
           String id=sc.nextLine();
           String name=sc.nextLine();
           String codeClass=sc.nextLine();
           Student x=new Student(id,name,codeClass);
           arr.add(x);
       }
       for(int i=1;i<=n;i++){
           String s=sc.nextLine();
           String[] a=s.split("\\s+");
           for(Student x: arr){
               if(x.getId().equals(a[0])){
                   x.setNote(a[1]);
               }
           }
       }
       for(Student x: arr){
           System.out.println(x);
       }
       
    }
}

