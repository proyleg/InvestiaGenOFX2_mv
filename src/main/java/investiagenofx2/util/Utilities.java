/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.util;

import com.sun.jna.platform.win32.Advapi32Util;
import static com.sun.jna.platform.win32.WinReg.HKEY_CLASSES_ROOT;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import ofx.OFX;

/**
 *
 * @author Pierre
 */
public class Utilities {

    public static DateTimeFormatter myDateFormat() {
        return DateTimeFormatter.ofPattern("yyyyMMdd");
    }

    public static void genOFXFile(OFX ofx, String fileName) {
        String strFile;
        strFile = "OFXHEADER:100\r\nDATA:OFXSGML\r\nVERSION:102\r\nSECURITY:NONE\r\nENCODING:USASCII\r\nCHARSET:1252\r\nCOMPRESSION:NONE\r\nOLDFILEUID:NONE\r\nNEWFILEUID:NONE\r\n\r";

        OutputStream os = null;
        PrintStream printStream = null;
        try {
            os = new FileOutputStream(fileName);
            printStream = new PrintStream(os);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        printStream.print(strFile);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(OFX.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(ofx, os);
        } catch (JAXBException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
        printStream.close();
    }

    public static void launchFile(String file) throws IOException {
        Process pr;
        String quickenCmd = Advapi32Util.registryGetStringValue(HKEY_CLASSES_ROOT, "qfxfile\\shell\\Open\\command", "");
        String command = quickenCmd.substring(0, quickenCmd.lastIndexOf(" ")) + " \"" + new File(file).getAbsolutePath() + "\"";
        try {
            pr = Runtime.getRuntime().exec(command);
            pr.waitFor(10, TimeUnit.SECONDS);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
