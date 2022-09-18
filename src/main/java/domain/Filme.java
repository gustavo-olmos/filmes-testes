package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
public class Filme {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String genero;


    @OneToMany
    private List<Ator> atorList;
    private Integer anoLanc;


}
