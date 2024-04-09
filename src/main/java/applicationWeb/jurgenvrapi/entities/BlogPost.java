package applicationWeb.jurgenvrapi.entities;

import lombok.Data;

@Data
public class BlogPost {
    private Long id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private Integer tempoDiLettura;


}