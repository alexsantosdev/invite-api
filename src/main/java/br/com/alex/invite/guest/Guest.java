package br.com.alex.invite.guest;

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
@Table(name = "_guest")
public class Guest {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    @Column(length = 14)
    private String document;
    private String email;
    private String phone;
}
