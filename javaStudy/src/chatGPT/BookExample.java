package chatGPT;

public class BookExample {

	public static void main(String[] args) {
		Book b1=new Book("�����",12000);
		
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
		return "����: "+title+"\n����: "+price;
	}
}
