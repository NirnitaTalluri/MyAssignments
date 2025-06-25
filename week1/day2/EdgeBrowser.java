package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser browserObj = new Browser();
		
		System.out.println(browserObj.launchBrowser("Chrome"));
		browserObj.loadUrl();
	}

}
