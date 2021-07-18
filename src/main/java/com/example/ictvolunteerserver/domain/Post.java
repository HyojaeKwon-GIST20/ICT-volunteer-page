package com.example.ictvolunteerserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private String description;

    private String category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

}
