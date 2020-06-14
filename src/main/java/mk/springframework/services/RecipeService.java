package mk.springframework.services;

import mk.springframework.commands.RecipeCommand;
import mk.springframework.domain.Recipe;

import java.util.Set;

public interface RecipeService{
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
