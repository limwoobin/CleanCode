package Chapter11_System.ex1;

import java.util.Collection;

public interface Bank {
    Collection<Account> getAccounts();
    void setAccounts(Collection<Account> accounts);
}
