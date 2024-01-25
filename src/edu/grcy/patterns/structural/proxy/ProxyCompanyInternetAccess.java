package edu.grcy.patterns.structural.proxy;

public class ProxyCompanyInternetAccess implements CompanyInternetNetwork {
    CompanyInternetNetwork internetNetwork;

    @Override
    public void getAccess(String username) {
        if(isEmployee(username)) {
            internetNetwork = new PrivateCompanyInternetNetwork(username);
        } else {
            internetNetwork = new PublicCompanyInternetNetwork(username);
        }
        internetNetwork.getAccess(username);
    }

    private boolean isEmployee(String username) {
        return CompanyEmployees.isActiveEmployee(username);
    }

}
