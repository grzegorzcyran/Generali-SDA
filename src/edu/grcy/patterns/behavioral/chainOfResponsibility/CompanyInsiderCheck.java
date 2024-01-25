package edu.grcy.patterns.behavioral.chainOfResponsibility;

//company employee
public class CompanyInsiderCheck extends AccessCheck {


    @Override
    public boolean doCheck(String username) {

        System.out.println("CompanyInsiderCheck start for " + username);
        if(!Employees.checkEmployee(username)){
            //sprawdzany człowiek nie pracuje w firmie
            System.out.println(getClass().getCanonicalName() + " do_Check FAILED");
            return false;
        }
        //sprawdzany człowiek jest z firmy
        System.out.println(getClass().getCanonicalName() + " do_Check PASSED");
        //człowiek przeszedł test na pracownika, teraz (ewentualny) kolejny
        return checkNextElement(username);
    }
}
