package Advance;

public class BrokenLinks {
	public static void main(String[] args) {
		String url;
		WebDriver driver =Browser.OpenBrowser("https://vctcpune.com/");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		Iterator<WebElement> i= links.iterator();
		
		while(i.hasNext()) {
			url = i.next().getAttribute("href");
			if(url == null || url.isEmpty()) {
				System.out.println("url is missing");
				continue;
			}
			try {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());

				huc.setRequestMethod("HEAD");

				huc.connect();

				int respCode = huc.getResponseCode();
				
				if(respCode>=400) {
					System.out.println(url+" is a broken link");
				}
				else{
					System.out.println(url+" is a valid link");
					}
				

			}catch(MalformedURLException e) {
				e.printStackTrace();
				continue;
			}
			catch(IOException e) {
				e.printStackTrace();
				continue;
			}
		}
}
}
