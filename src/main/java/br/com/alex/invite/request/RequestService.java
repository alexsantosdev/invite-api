package br.com.alex.invite.request;

import br.com.alex.invite.companion.Companion;
import br.com.alex.invite.companion.CompanionRepository;
import br.com.alex.invite.guest.Guest;
import br.com.alex.invite.guest.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestService {
    private final GuestRepository guestRepository;
    private final CompanionRepository companionRepository;

    public List<Guest> listGuests() {
        return guestRepository.findAll();
    }

    public List<Companion> listCompanions() {
        return companionRepository.findAll();
    }

    public void createGuest(GuestRequest g) {
        var guest = Guest.builder()
                .name(g.getName())
                .age(g.getAge())
                .document(g.getDocument())
                .build();
        guestRepository.save(guest);

        if(!g.getCompanions().isEmpty()) {
            for(int i = 0; i < g.getCompanions().size(); i++) {
                var companion = Companion.builder()
                        .name(g.getCompanions().get(i).getName())
                        .age(g.getCompanions().get(i).getAge())
                        .document(g.getCompanions().get(i).getDocument())
                        .guest(guest)
                        .build();
                companionRepository.save(companion);
            }
        }
    }
}
