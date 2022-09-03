package sajjad.tacos.data;

import org.springframework.data.repository.CrudRepository;
import sajjad.tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {



}
