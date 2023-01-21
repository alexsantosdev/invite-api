package br.com.alex.invite.request;

import br.com.alex.invite.companion.Companion;
import br.com.alex.invite.guest.Guest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
@CrossOrigin
public class RequestController {
    private final RequestService request;

    @GetMapping("/guests")
    public List<Guest> listGuests() {
        return request.listGuests();
    }

    @GetMapping("/companions")
    public List<Companion> listCompanions() {
        return request.listCompanions();
    }

    @PostMapping("/guest/create")
    public ResponseEntity<String> createGuest(@RequestBody GuestRequest guest) {
        request.createGuest(guest);
        return ResponseEntity.ok("Guest created");
    }
}
