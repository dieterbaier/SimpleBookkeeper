package dieterbaier.sbk.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @Column(name="accountNumber")
    private String accountNumber;

    @Column(name="accountName", nullable = false)
    private String accountName;
}
