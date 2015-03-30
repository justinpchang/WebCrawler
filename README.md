# WebCrawler by Justin Chang
###Custom bot written in Java to crawl web pages

WebCrawler is my final project for my AP Computer Science A course.

####Docs:
**Crawler.java**
*public Crawler(URL urlIn)*
constructor for the Crawler class. accepts a java.net.URL object.

*public void activate()*
pulls HTML code from given URL and uses Regex to parse the document. outputs each link URL into an ArrayList

*public ArrayList<String> getLinks()*
returns all link URLs from the page as an ArrayList (should only be called after activate())

*public void print()*
prints all items in the ArrayList holding link URLs

####Changelog:
**March 29, 2015**
* Created intial Crawler.java
  * Object accepts a URL and puts the URLs from links displayed on the page into an ArrayList
