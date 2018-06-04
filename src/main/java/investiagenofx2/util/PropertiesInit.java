/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.util;

import investiagenofx2.InvestiaGenOFX;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

/**
 *
 * @author Pierre
 */
public class PropertiesInit {

    private static String investiaURL;
    private static String lastGenUsedDate;
    private static String clientNumList;
    private static Double stageX;
    private static Double stageY;
    private static ArrayList<String> linkAccounts = new ArrayList<>();
    private static ArrayList<String> linkAccountsTransac = new ArrayList<>();

    /**
     *
     */
    public static void getProperties() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(InvestiaGenOFX.class.getSimpleName() + ".properties"));
            if (!(prop.size() == 7)) {
                initProperties();
            }
            investiaURL = prop.getProperty("investiaURL").trim();
            lastGenUsedDate = prop.getProperty("lastGenUsedDate").trim();
            clientNumList = prop.getProperty("clientNumList").trim();
            stageX = Double.parseDouble(prop.getProperty("stageX").trim());
            stageY = Double.parseDouble(prop.getProperty("stageY").trim());
            linkAccounts = stringToArrayList(prop.getProperty("linkAccounts"));
            linkAccountsTransac = stringToArrayList(prop.getProperty("linkAccountsTransac"));
        } catch (IOException ex) {
            initProperties();
        }

    }

    private static void initProperties() {
        investiaURL = "https://clientportal.investia.ca";
        lastGenUsedDate = "2015-01-01";
        clientNumList = "";
        stageX = 640.0;
        stageY = 150.0;
        setProperties();
        getProperties();
    }

    /**
     *
     */
    public static void setProperties() {
        Properties prop = new Properties();
        try {
            prop.setProperty("investiaURL", investiaURL);
            prop.setProperty("lastGenUsedDate", lastGenUsedDate);
            prop.setProperty("clientNumList", clientNumList);
            stageX = InvestiaGenOFX.getPrimaryStage().getX();
            stageY = InvestiaGenOFX.getPrimaryStage().getY();
            prop.setProperty("stageX", stageX.toString());
            prop.setProperty("stageY", stageY.toString());
//            String[] accounts = accountsToString(linkAccounts, linkAccountsTransac);
//            prop.setProperty("linkAccounts", accounts[0]);
//            prop.setProperty("linkAccountsTransac", accounts[1]);
            removeUnknownAccounts();
            prop.setProperty("linkAccounts", arraylistToString(linkAccounts));
            prop.setProperty("linkAccountsTransac", arraylistToString(linkAccountsTransac));
            prop.store(new FileOutputStream(InvestiaGenOFX.class.getSimpleName() + ".properties"), null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static String arraylistToString(ArrayList<String> arrayList) {
        if (arrayList.size() < 1) {
            return "";
        }
        StringBuilder theString = new StringBuilder(arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            theString.append(",").append(arrayList.get(i));
        }
        return theString.toString();
    }

    public static Double getStageX() {
        return stageX;
    }

    public static Double getStageY() {
        return stageY;
    }

    private static String[] accountsToString(ArrayList<String> linkAccounts, ArrayList<String> linkAccountsTransac) {
        String[] accounts = new String[2];
        Arrays.fill(accounts, "");
        if (linkAccounts.size() < 1) {
            return accounts;
        }
        for (int i = 0; i < linkAccounts.size(); i++) {
            if (linkAccounts.get(i).contains("Unknown")) {
                continue;
            }
            if (accounts[0].length() > 0) {
                accounts[0] = accounts[0] + ",";
                accounts[1] = accounts[1] + ",";
            }
            accounts[0] = accounts[0] + linkAccounts.get(i);
            accounts[1] = accounts[1] + linkAccountsTransac.get(i);
        }
        return accounts;
    }

    private static ArrayList<String> stringToArrayList(String theString) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (theString.length() > 0) {
            String[] token = theString.split(",");
            arrayList.addAll(Arrays.asList(token));
        }
        return arrayList;
    }

    /**
     * @return the investiaURL
     */
    public static String getInvestiaURL() {
        return investiaURL;
    }

    /**
     * @param aInvestiaURL the investiaURL to set
     */
    public static void setInvestiaURL(String aInvestiaURL) {
        investiaURL = aInvestiaURL;
    }

    /**
     * @return the lastGenUsedDate
     */
    public static String getLastGenUsedDate() {
        return lastGenUsedDate;
    }

    /**
     * @param aLastGenUsedDate the lastGenUsedDate to set
     */
    public static void setLastGenUsedDate(String aLastGenUsedDate) {
        lastGenUsedDate = aLastGenUsedDate;
    }

    /**
     * @return the clientNumList
     */
    public static String getClientNumList() {
        return clientNumList;
    }

    /**
     * @param aClientNumList the clientNumList to set
     */
    public static void setClientNumList(String aClientNumList) {
        clientNumList = aClientNumList;
    }

    public static int getLinkAccountIndex(String account) {
        if (linkAccounts.indexOf(account) < 0) {
            linkAccounts.add(account);
            linkAccountsTransac.add("NotAssigned");
        }
        return linkAccounts.indexOf(account);
    }

    /**
     * @return the linkAccounts
     */
    public static ArrayList<String> getLinkAccounts() {
        return linkAccounts;
    }

    /**
     * @return the linkAccountsTransac
     */
    public static ArrayList<String> getLinkAccountsTransac() {
        return linkAccountsTransac;
    }

    public static void removeUnknownAccounts() {
        for (int i = linkAccounts.size() - 1; i > -1; i--) {
            if (linkAccounts.get(i).contains("Unknown")) {
                linkAccounts.remove(i);
                linkAccountsTransac.remove(i);
            }
        }
    }
}
