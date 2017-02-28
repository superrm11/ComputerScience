package apcs.practiceQuestions;

public class DownloadInfo

{ 
	
	private String title;
	
	private int timesDownloaded = 0;

 /** Creates a new instance with the given unique title and sets the 

 * number of times downloaded to 1.

 * @param title the unique title of the downloaded song

 */ 

 public DownloadInfo(String title) 

 {
	this.title = title; 
 } 

 /** @return the title */ 

 public String getTitle() 

 {
	 return title;
 } 

 /** Increment the number times downloaded by 1 */ 

 public void incrementTimesDownloaded() 

 {
	 this.timesDownloaded++;
 } 

 // There may be instance variables, constructors, and methods that are not shown.

}