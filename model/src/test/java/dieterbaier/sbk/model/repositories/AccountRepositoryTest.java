package dieterbaier.sbk.model.repositories;

import dieterbaier.sbk.model.Config;
import dieterbaier.sbk.model.entities.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Config.class)
@EnableAutoConfiguration
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    @Transactional
    public void should_insert_one_line_to_empty_db() {
        assertThat(accountRepository.count()).isEqualTo(0);
        assertThat(accountRepository.findAll().iterator().hasNext()).isFalse();

        Account savedAccount = accountRepository.save(new Account("4711", "MeinKonto"));

        assertThat(accountRepository.count()).isEqualTo(1);
        assertThat(accountRepository.findById("4711").get()).isEqualTo(savedAccount);
    }

}
