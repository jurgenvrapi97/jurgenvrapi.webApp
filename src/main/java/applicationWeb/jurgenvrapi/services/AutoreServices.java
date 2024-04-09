package applicationWeb.jurgenvrapi.services;

import applicationWeb.jurgenvrapi.entities.Autore;
import applicationWeb.jurgenvrapi.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AutoreServices {
    private List<Autore>  autores = new ArrayList<>();

    public AutoreServices(){
        Autore nuovoAutore = new Autore();
        nuovoAutore.setId(1L);
        nuovoAutore.setNome("Marco");
        nuovoAutore.setCognome("Verdi");
        nuovoAutore.setEmail("Marco.Verdi@gmail.com");
        nuovoAutore.setAvatar("ciaoajiaoa");
        nuovoAutore.setDataDiNascita(LocalDate.of(2002, 3, 3));
    }

    public List<Autore> getAllAutori() {
        return new ArrayList<>(autores);
    }

    public Autore getBlogAutori(Long id) {
        Optional<Autore> autori = autores.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();

        return autori.orElse(null);
    }

    public Autore createAutore(Autore autore) {
        autores.add(autore);
        return autore;
    }

    public Autore updateAutore(Long id, Autore updateAutore) {
        for (int i = 0; i < autores.size(); i++) {
            if (autores.get(i).getId().equals(id)) {
                autores.set(i, updateAutore);
                return updateAutore;
            }
        }
        return null;
    }

    public void deleteAutore(Long id) {
        autores.removeIf(b -> b.getId().equals(id));
    }
}

