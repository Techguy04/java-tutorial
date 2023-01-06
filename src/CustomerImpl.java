import java.math.BigDecimal;
import java.math.BigInteger;

public class CustomerImpl implements  CustomerService{

    @Override
    public void createCustomer(customer customer) {
        customer.getCustomerId();
        customer.getCustomerName();
        customer.getLastName();
        customer.getAccountNumber();
        customer.toString();;
    }

    @Override
    public String deleteCustomer(Long id, customer customer) {
        return null;
    }

    @Override
    public void updateCustomer(long id, customer customer) {

    }

    @Override
    public String transfer(BigDecimal amount, BigInteger accountNo) {
        return null;
    }

    @Override
    public String checkBalance() {
        return null;
    }

    @Override
    public String withdrawal(BigInteger pin, BigDecimal Amount) {
        return null;
    }

    @Override
    public String deposit(int Amount) {
        return null;
    }
}
