package edu.grcy.patterns.structural.proxy;

class PrivateCompanyInternetNetwork implements CompanyInternetNetwork {
    private String username;

    public PrivateCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("Granted PRIVATE network access for " + username);
    }
}
