package Part_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q2_User {
    private String name;
    private int age;

    public Q2_User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Q2_ArrayListUser {
    private ArrayList<Q2_User> users;

    public Q2_ArrayListUser() {
        users = new ArrayList<>();
    }

    public void addUser(Q2_User user) {
        users.add(user);
    }

    public void displayUsers() {
        System.out.println("List of Users:");
        for (Q2_User user : users) {
            System.out.println(user);
        }
    }

    public void sortByAge() {
        Collections.sort(users, Comparator.comparingInt(Q2_User::getAge));
    }
}

class Q2_Driver {
    public static void main(String[] args) {
        Q2_ArrayListUser userList = new Q2_ArrayListUser();

        // Add users
        userList.addUser(new Q2_User("John", 25));
        userList.addUser(new Q2_User("Alice", 22));
        userList.addUser(new Q2_User("Bob", 30));
        userList.addUser(new Q2_User("Emma", 19));

        // Display original list
        System.out.println("Original list:");
        userList.displayUsers();

        // Sort by age and display
        userList.sortByAge();
        System.out.println("\nSorted by age:");
        userList.displayUsers();
    }
}

/*
Output:
Original list:
List of Users:
User{name='John', age=25}
User{name='Alice', age=22}
User{name='Bob', age=30}
User{name='Emma', age=19}

Sorted by age:
List of Users:
User{name='Emma', age=19}
User{name='Alice', age=22}
User{name='John', age=25}
User{name='Bob', age=30}
*/ 