package br.com.alex.invite.companion;

import br.com.alex.invite.guest.Guest;
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
@Table(name = "_companion")
public class Companion {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    @Column(length = 14)
    private String document;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Guest guest;
    private String email;
    private String phone;
}
