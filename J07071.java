import java.io.File;
import java.util.List;
import java.util.*;

public class J07071{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<String> list2 = new ArrayList<String>();
        while(t-- > 0) {
            String name = sc.nextLine();
            list2.add(name);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0) {
            String s = sc.nextLine();
            Collections.sort(list2, new Comparator<String>() {
                public int compare(String a, String b) {
                    String[] arr1 = a.split("\\s+");
                    String[] arr2 = b.split("\\s+");
                    if(arr1[arr1.length-1].equals(arr2[arr2.length-1])){
                        return arr1[0].compareTo(arr2[0]);
                    }
                    else{
                        return arr1[arr1.length-1].compareTo(arr2[arr2.length-1]);
                    }
                }
            });
            String[] arr2 = s.split("[.]");
            for(String name : list2) {
                String[] arr = name.split("\\s+");
                int cnt = 0;
                int cnt1 = 0;
                if(arr.length == arr2.length) {
                    for(int i = 0; i < arr.length; i++) {
                        if((arr[i].charAt(0) + "").equals(arr2[i])){
                            cnt++;
                        }
                        if((arr2[i]).equals("*")){
                            cnt1++;
                        }
                    }
                }
                if(cnt1 == 1 && cnt == arr.length - 1) {
                    System.out.println(name);
                }
                if(cnt1 == 0 && cnt == arr.length){
                    System.out.println(name);
                }
            }
        }
        sc.close();
    }
}