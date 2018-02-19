import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class JavaXSLT {
    /**
     * @param args
     */
    public static void main(String[] args) {
 
        TransformerFactory tFactory = TransformerFactory.newInstance();
        StreamSource xmlInputFile = new StreamSource(args[0]);
        StreamSource xslTransformationFile = new StreamSource(args[1]);
        StreamResult xmlOutputFile = new StreamResult(args[2]);
        try {
            Transformer transformer = tFactory
                    .newTransformer(xslTransformationFile);
            transformer.transform(xmlInputFile, xmlOutputFile);
 
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}