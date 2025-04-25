package brazil;

public enum States {

	CEARA ("CE", "Ceará", 10),
	SAO_PAULO ("SP", "São Paulo", 11)
	;
	
	private int ibge;
	private String name;
	private String acronym;
	
	private States(String acronym, String name, int ibge) {
		this.acronym = acronym;
		this.name = name;
		this.ibge = ibge;
	}
	
	public int getIbge() {
		return ibge;
	}
	public String getAcronym() {
		return acronym;
	}
	public String getName() {
		return name;
	}
	public String getNameUpperCase() {
		return name.toUpperCase();
	}
}
