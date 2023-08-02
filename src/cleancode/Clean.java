package cleancode;

public class Clean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User obj=new User();
		obj.userLogin("meghana","megha@123");
		Book obj1=new Book();
		obj1.display_book_details("laws","Erric",50);
		Payment obj2=new Payment();
		obj2.amount(50);
		Order obj3=new Order();
		obj3.placeorder("laws",50);
		Cart obj4= new Cart();
		obj4.items_in_cart("laws");
	}

}
