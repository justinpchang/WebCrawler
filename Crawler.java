
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.*;
public class Crawler {
	
	private URL myURL;
	private BufferedReader br;
	private String oneLine;
	private String page;
	private ArrayList<String> links = new ArrayList<String>();
	
	public Crawler(URL urlIn) {
		myURL = urlIn;
	}
	
	public void activate() {
		try {
			br = new BufferedReader(new InputStreamReader(myURL.openStream()));
			oneLine = "";
			page = "";
			while(null != (oneLine = br.readLine())) {
				page = page + oneLine;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		

		Pattern linkPattern = Pattern.compile("<a href='(.*?)'>");
		Matcher pageMatcher = linkPattern.matcher(page);
		while(pageMatcher.find()){
		    links.add(pageMatcher.group(1));
		}
	}
	
	public ArrayList<String> getLinks() {
		return links;
	}
	
	public void print() {
		for(String link : links)
			System.out.println(link);
	}
	
}
