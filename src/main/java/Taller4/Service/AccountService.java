package Taller4.Service;

import Taller4.DAO.Account;
import Taller4.DAO.AccountDAO;
import Taller4.DAO.ICRUD;

import java.util.List;

public class AccountService {
    private ICRUD accountCRUD;

    public AccountService() {
        accountCRUD = new AccountDAO();
    }

    public void saveAccount(Account account){
        accountCRUD.save(account);
    }

    public List<Account> showAccounts(){
        return (List<Account>) accountCRUD.show();
    }

    public Account findAccount(String identificacion) throws Exception {
        Object account=accountCRUD.find(identificacion);
        if(account == null) {
            throw new Exception("No se encontro la persona");
        }
        return (Account) account;
    }
    public void deleteAccount(String identificacion){
        accountCRUD.delete(identificacion);
    }
}
