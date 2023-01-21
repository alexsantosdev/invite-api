package br.com.alex.invite.request;

import br.com.alex.invite.companion.Companion;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuestRequest {
    private String name;
    private Integer age;
    private String document;
    private ArrayList<Companion> companions;
}
