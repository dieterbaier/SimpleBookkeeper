package dieterbaier.sbk.model.repositories;

import dieterbaier.sbk.model.entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String>{
}
