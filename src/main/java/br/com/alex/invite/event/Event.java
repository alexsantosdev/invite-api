package br.com.alex.invite.event;

import br.com.alex.invite.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_event")
public class Event {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 60)
    private String name;
    private String description;
    @Column(length = 100)
    private String address;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "event_type_id")
    private EventType event_type;
    private Boolean has_email;
    private Boolean has_phone;
    private Boolean has_document;
    private Boolean has_age;
    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;
    private String organizer;
    private String theme_color;
    private String text_color;
    private String button_color;
}
