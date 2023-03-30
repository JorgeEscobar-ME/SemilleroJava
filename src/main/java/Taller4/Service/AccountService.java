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

    public void depositAccount(String identificacion, double money) throws Exception {
        Object account = accountCRUD.find(identificacion);
        if(account == null) {
            throw new Exception("No se encontro la persona");
        }else {
            System.out.println(account);
        }


    }
}
