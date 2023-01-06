import java.math.BigInteger;

public class customer {
    private Long customerId;
    private String customerName;
    private String lastName;
    private BigInteger accountNumber;

    public customer(Long customerId, String customerName, String lastName, BigInteger accountNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public customer(){}

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(BigInteger accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
