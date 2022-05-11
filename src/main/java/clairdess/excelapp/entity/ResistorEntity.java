package clairdess.excelapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResistorEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    //TODO add entity resistor

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
