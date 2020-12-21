package Repository;

import Model.Supervisor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface SupervisorRepository extends CrudRepository<Supervisor, Serializable> {
}
