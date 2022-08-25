package sajjad.tacos.data;

import org.springframework.data.repository.CrudRepository;
import sajjad.tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
