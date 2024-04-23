package chatGPT;

public class BookExample {

	public static void main(String[] args) {
		Book b1=new Book("어린왕자",12000);
		
		System.out.println(b1.BookInfo());
	}
	
}


class Book{
	String title;
	int price;
	
	Book(String title, int price){
		this.title=title;
		this.price=price;
	}
	
	String BookInfo() {
		return "제목: "+title+"\n가격: "+price;
	}
}
