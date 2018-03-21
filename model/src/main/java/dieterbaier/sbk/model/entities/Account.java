package dieterbaier.sbk.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @Column(name="ACCOUNT_NUMBER")
    private String accountNumber;

    @Column(name="ACCOUNT_NAME", nullable = false)
    private String accountName;
}
