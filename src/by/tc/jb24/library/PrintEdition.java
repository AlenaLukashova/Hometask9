package by.tc.jb24.library;

public class PrintEdition {
	 private String title;  
	 private String publisher;
	 
	 public PrintEdition(){
	 }
	 
	 public PrintEdition(String title, String publisher) {
		 this.title = title;   
		 this.publisher=publisher;
		 } 
	 
	 public PrintEdition(String title) {
		 this.title = title;   
		 } 
	 	 
	 public String getTitle() {
		 return title; 
		 }  
	 
	 public void setTitle(String title) {
		 this.title = title; 
		 }  
	 
	 public String getPublisher() {
		 return publisher; 
		 }  
	 
	 public void setPublisher(String publisher) {
		 this.publisher = publisher; 
		 }  	 

}
