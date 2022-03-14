package interfaces2;
//classlar birden fazla interfaceleri implements edebilir
//classlar sadece 1 tane extends edebilir
public class MySqlCustomerDal implements ICustomerDal , IRepository{

	@Override
	public void add() {
System.out.println("My sql eklendi");		
	}

}
