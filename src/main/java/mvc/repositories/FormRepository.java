package mvc.repositories;

import mvc.models.Form;
import org.springframework.data.repository.CrudRepository;

public interface FormRepository extends CrudRepository<Form, Integer> {
}
