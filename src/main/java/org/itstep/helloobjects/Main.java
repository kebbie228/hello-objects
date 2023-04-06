package org.itstep.helloobjects;

public class Main {
    public static void main(String[] args) {
        User user=new User(1l,"name","pass","email");
        System.out.println(user);
        System.out.println(user.getUsername());
    }
}
