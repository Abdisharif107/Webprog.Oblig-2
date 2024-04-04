package webprogrammering.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {
    public final List<Billett> billettRegister = new ArrayList<>();


    @PostMapping("/lagre")
    public void lagreKunde(Billett film) {
        billettRegister.add(film);
    }

    @GetMapping("/hentAlt")
    public List<Billett> hentAlt() {
        return billettRegister;
    }

    @GetMapping("/slettBillett")
    public void slettBillett() {
        billettRegister.clear();
    }
}

