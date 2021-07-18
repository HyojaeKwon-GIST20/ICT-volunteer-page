package com.example.ictvolunteerserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;
x
    private String name;

    private String password;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.posts = posts;
    }
}
