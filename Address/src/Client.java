
public class Client {
	String name = "";
	String surname = "";
	Address address = new Address();
	
	public String getFullName() {
		String fullName = surname + ", " + name;
		return fullName;
	}
	
	public void setFullName(String fullName) {
		String[] parts = fullName.split(",");
		surname= parts[0].trim();
		name=parts[1].trim();
	}
}
