import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public interface CustomerService {
    public void createCustomer(customer customer);
    public List<customer> allCustomer = new ArrayList<>();
    public String deleteCustomer(Long id, customer customer);
    public void updateCustomer(long id, customer customer);

    //account functions

    public String transfer(BigDecimal amount, BigInteger accountNo);
    public String checkBalance();
    public String withdrawal(BigInteger pin, BigDecimal Amount);

    public String deposit(int Amount);
}
