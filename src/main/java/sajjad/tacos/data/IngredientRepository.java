package sajjad.tacos.data;

import org.springframework.data.repository.CrudRepository;
import sajjad.tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
