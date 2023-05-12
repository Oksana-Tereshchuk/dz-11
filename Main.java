import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        try
        {
            bankApplication.process("accountId000",50,"USD");
        }
        catch (WrongAccountException wrongAccountException)
        {
            System.out.println("Such account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException)
        {
        System.out.println("Account has another currency");
        }
        catch (WrongOperationException wrongOperationException)
        {
            System.out.println("There are not enough funds in the account");
        }
        catch (Exception e)
        {
            System.out.println("A processing error occurred, please try again");
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("Thank for using our service");
        }
        try
        {
            bankApplication.process("accountId003",250,"HRV");
        }
        catch (WrongAccountException wrongAccountException)
        {
            System.out.println("Such account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException)
        {
            System.out.println("Account has another currency");
        }
        catch (WrongOperationException wrongOperationException)
        {
            System.out.println("There are not enough funds in the account");
        }
        catch (Exception e)
        {
            System.out.println("A processing error occurred, please try again");
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("Thank for using our service");
        }try
        {
            bankApplication.process("accountId001",50,"EUR");
        }
        catch (WrongAccountException wrongAccountException)
        {
            System.out.println("Such account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException)
        {
            System.out.println("Account has another currency");
        }
        catch (WrongOperationException wrongOperationException)
        {
            System.out.println("There are not enough funds in the account");
        }
        catch (Exception e)
        {
            System.out.println("A processing error occurred, please try again");
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("Thank for using our service");
        }
        try
        {
            bankApplication.process("accountId001",50,"USD");
        }
        catch (WrongAccountException wrongAccountException)
        {
            System.out.println("Such account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException)
        {
            System.out.println("Account has another currency");
        }
        catch (WrongOperationException wrongOperationException)
        {
            System.out.println("There are not enough funds in the account");
        }
        catch (Exception e)
        {
            System.out.println("A processing error occurred, please try again");
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("Thank for using our service");
        }
        try
        {
            bankApplication.process("accountId001",50,"USD");
        }
        catch (WrongAccountException wrongAccountException)
        {
            System.out.println("Such account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException)
        {
            System.out.println("Account has another currency");
        }
        catch (WrongOperationException wrongOperationException)
        {
            System.out.println("There are not enough funds in the account");
        }
        catch (Exception e)
        {
            System.out.println("A processing error occurred, please try again");
            throw new RuntimeException(e);
        }
        finally
        {
            System.out.println("Thank for using our service");
        }
        }
}
