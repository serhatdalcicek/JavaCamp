package interfaceAbstractDemo;

import java.rmi.RemoteException;
import java.sql.Date;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.CustomerCheckManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Serhat", "Dalçiçek", "123456789", new Date(1998, 8, 28)));

		Customer starbucksCustomer = new Customer(2, "Mahmut", "Ak", "987654321", new Date(1978, 4, 23));

		BaseCustomerManager starbucksManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		StarbucksCustomerManager starbucskManager;
		starbucskManager.save(starbucksCustomer);

	}

}
