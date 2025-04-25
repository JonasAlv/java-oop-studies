package world;

public class Person {

	private String name;
	private String cpf;
	private String adress;
	
	public Person(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public String getCpf() {
		return cpf;
	}
	
	
}
