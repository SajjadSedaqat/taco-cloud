package sajjad.tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import sajjad.tacos.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sajjad.tacos.data.IngredientRepository;


@Component
public class IngredientByIdConverter  implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
