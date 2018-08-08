package investiagenofx2.util;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class TransactionType {
    private static final ArrayList<String> transactionType = new ArrayList<>();
    private static final ArrayList<String> investiaType = new ArrayList<>();

    public static void initTransactionType() {
        try {
            File fXmlFile = new File("TransacTypeMap.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            NodeList nList = doc.getElementsByTagName("transactiontype");
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                Element eElement = (Element) nNode;
//                System.out.println("TransactionType : " + eElement.getAttribute("name"));
                for (int j = 0; j < eElement.getElementsByTagName("investiatype").getLength(); j++) {
//                    System.out.println("InvestiaType : " + eElement.getElementsByTagName("investiatype").item(j).getTextContent());
                    transactionType.add(eElement.getAttribute("name"));
                    investiaType.add(eElement.getElementsByTagName("investiatype").item(j).getTextContent());
                }
//                System.out.println();
            }
//            System.out.println(getTransactionType("haha"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getTransactionType(String investiaTypeParm) {
        String toReturn;
        int idx = investiaType.indexOf(investiaTypeParm);
        if (idx==-1) {
            toReturn = "Unknown";
        } else {
            toReturn = transactionType.get(idx);
        }
        return toReturn;
    }
}
