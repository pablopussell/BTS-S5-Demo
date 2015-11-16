
public class App {

	public static void main(String[] args) {

		String helloWorld = "        Hello World            ";
		
		String start = trimStart(helloWorld);
		String end = trimEnd(helloWorld);
		String all = trim(helloWorld);
		
		System.out.println(start);
		System.out.println(end);
		System.out.println(all);
		
		//for(int i=0; i<helloWorld.length(); i++){
			//char c=helloWorld.charAt(i);
		//}
	}
		
	private static String trimStart(String helloWorld) {
		int space = 0;
		for (int i=0; i<=helloWorld.length(); i++) {
			char c=helloWorld.charAt(i);
			if (c==' ') {
				space++;
				continue;
			}
			break;
		}
		return helloWorld.substring(space);
	}
	
	private static String trimEnd (String helloWorld) {
		for (int i=helloWorld.length()-1; i>=0;i--) {
			if (helloWorld.charAt(i)=' ') {
				continue;
			}
			break;
		}
		return helloWorld.substring(0, helloWorld.length() - i);
	}
	
	private static String trim (String helloWorld) {
		String result = "";
		result = trimStart(helloWorld);
		result = trimEnd(result);
		return result;
		
	}

}
