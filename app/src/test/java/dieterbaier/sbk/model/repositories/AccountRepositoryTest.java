package dieterbaier.sbk.model.repositories;

import dieterbaier.sbk.model.entities.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void should_insert_one_line_to_empty_db() throws InterruptedException {

        Account savedAccount = accountRepository.save(new Account("4711", "MeinKonto"));

        assertThat(accountRepository.count()).isEqualTo(1);
        assertThat(accountRepository.findById("4711").get()).isEqualTo(savedAccount);

    }

}
