package ThucHanh_OOP_buoi_02;

import java.util.*;

class User{
    private String username, password;
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public int Equals(User other){
        if(this.username.equals(other.username) && this.password.equals(other.password)){
            return 1;
        }
        return 0;
    }
}
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<User> users = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String []tmp = sc.nextLine().split("\\s+");
            users.add(new User(tmp[0], tmp[1]));
        }
        int m = Integer.parseInt(sc.nextLine());
        int b[] = new int[n];
        while(m -- > 0) {
            String []tmp = sc.nextLine().split("\\s+");
            User u = new User(tmp[0], tmp[1]);
            for(int j = 0; j < n; j++){
                if(users.get(j).Equals(u) == 1){
                    b[j]++;
                }
            }
        }
        for(int j = 0; j < n; j++){
            System.out.print(b[j] + " ");
        }
    }
}
