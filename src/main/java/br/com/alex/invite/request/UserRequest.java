package br.com.alex.invite.request;

import br.com.alex.invite.user.Plan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String user_id;
    private String name;
    private String email;
    private String provider;
}
