package com.web.community.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User {
    @Id
    @Column(name = "user_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private LocalDateTime created_date;
    @Column
    private LocalDateTime updated_date;

    @Builder
    public User(String name, String password, String email, LocalDateTime created_date, LocalDateTime updated_date) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.created_date = created_date;
        this.updated_date = updated_date;
    }
}
