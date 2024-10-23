package defaultPackage;


public class StuffedCrust extends Pizza {
	
	// can make current pizza stuffed crust
	private Boolean StuffedCrust;
	private Integer CheeseQuantityToAdd; // how many cheese added (1-3) ( This is added to compensate for the confusing directions)
	
	
	public StuffedCrust(String PizzaName, Integer NumberOfPizza, Boolean StuffedCrust, Integer CheeseQuantityToAdd) {
		super(PizzaName, NumberOfPizza); // Initialize parent class attribute
		
		this.StuffedCrust = StuffedCrust;
		
		this.CheeseQuantityToAdd = CheeseQuantityToAdd;
	
	}


	public Boolean getStuffedCrust() {
		return StuffedCrust;
	}


	public void setStuffedCrust(Boolean stuffedCrust) {
		StuffedCrust = stuffedCrust;
	}


	public Integer getCheeseQuantityToAdd() {
		return CheeseQuantityToAdd;
	}


	public void setCheeseQuantityToAdd(Integer cheeseQuantityToAdd) {
		CheeseQuantityToAdd = cheeseQuantityToAdd;
	}


	@Override
	public String toString() {
		return super.toString() + "\t" + StuffedCrust + "\t" + CheeseQuantityToAdd + "\n";
	}
	
	
	
	public boolean equals(StuffedCrust stuffedCrustParam) {
		
		// Return false if this current object super (this) does not equal to the stuff crust parameter 
		if (!super.equals(stuffedCrustParam)) {
			return false;
		}
		// evaluate if this is equal to stuffed crust parameter boolean
		return this.StuffedCrust.equals(stuffedCrustParam.StuffedCrust);
	}

}
