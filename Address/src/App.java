
public class App {

	public static void main(String[] args) {
		Address someonesAddress=new Address();
		someonesAddress.fullName = "John";
		someonesAddress.postalCode = 808080;
		
		Client carlos = new Client();
		carlos.name="Carlos";
		carlos.surname="Gil";
		carlos.address.addressLine1="Carrer Llull 32";
	}
	

}
