package mk.springframework.services;

import mk.springframework.domain.Recipe;

import java.util.Set;

public interface RecipeService{
    Set<Recipe> getRecipes();
}
