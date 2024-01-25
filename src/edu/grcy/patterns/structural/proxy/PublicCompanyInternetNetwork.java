package edu.grcy.patterns.structural.proxy;

class PublicCompanyInternetNetwork implements CompanyInternetNetwork {
    private String username;

    public PublicCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("Granted PUBLIC network access for " + username);
    }
}
