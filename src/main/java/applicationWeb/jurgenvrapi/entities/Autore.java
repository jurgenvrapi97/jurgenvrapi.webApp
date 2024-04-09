package applicationWeb.jurgenvrapi.entities;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Autore {
    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiNascita;
    private String avatar;

    // getters and setters
}
