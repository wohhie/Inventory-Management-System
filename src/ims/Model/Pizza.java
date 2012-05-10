package ims.Model;
import java.util.ArrayList;

/**
 * @author Minh, Kumar, Jean
 * @version 02/17/2012
 */

public class Pizza {
	
	//Declare attributes
	private String pizzaName;
	private String pizzaSize;
        private double cost;
	private ArrayList <Ingredient> ingredients;
	
	/*
	 * Constructor
	 */
	public Pizza (String inName, String inSize, ArrayList <Ingredient> inIngredients)
	{
		this.pizzaName = inName;
		this.pizzaSize = inSize;
		this.ingredients = inIngredients;
	}

	/*
	 * Accessor for pizzaName
	 */
	public String getPizzaName() {
		return pizzaName;
	}
	
	/*
	 * Mutator for pizzaName
	 */
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	/*
	 * Accessor for pizzaSize
	 */
	public String getPizzaSize() {
		return pizzaSize;
	}

	/*
	 * Mutator for pizzaSize
	 */
	public void setPizzaSize(String inSize) {
		this.pizzaSize = inSize;
	}

	/*
	 * Accessor for ingredients
	 */
	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	/*
	 * Mutator for ingredients
	 */
	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }
}
