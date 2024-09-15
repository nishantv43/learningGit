package org.ubs.kart;

public class User {
    private Long Id;
    private String Name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public User(Long id, String name) {
        Id = id;
        Name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
