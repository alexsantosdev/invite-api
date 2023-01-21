package br.com.alex.invite.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 60)
    private String name;
    @Column(length = 60)
    private String email;
    @Column(length = 30)
    private String provider;
}
