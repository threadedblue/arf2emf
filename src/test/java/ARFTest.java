

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.junit.BeforeClass;
import org.junit.Test;

import iox.sds4emf.Deserialize;
import iox.sds4emf.Registrar;
import iox.sds4emf.Serialize;

public class ARFTest {

	private static final Logger log = LogManager.getLogger(ARFTest.class);

	@BeforeClass
	public static void beforeClass() {
		Registrar.associateExtension("xml", new gov.nist.scap.schema.asset.reporting.format._1.util._1ResourceFactoryImpl());
		Registrar.registerPackage(gov.nist.scap.schema.asset.identification._1._1Package.eNS_URI,  gov.nist.scap.schema.asset.identification._1._1Package.eINSTANCE);
		Registrar.registerPackage(gov.nist.scap.schema.asset.reporting.format._1._1Package.eNS_URI,  gov.nist.scap.schema.asset.reporting.format._1._1Package.eINSTANCE);
		Registrar.registerPackage(gov.nist.scap.schema.reporting.core._1._1Package.eNS_URI,  gov.nist.scap.schema.reporting.core._1._1Package.eINSTANCE);
		Registrar.registerPackage(oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package.eNS_URI,  oasis.names.tc.ciq.xsdschema.xAL._2._0._0Package.eINSTANCE);
		Registrar.registerPackage(oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eNS_URI,  oasis.names.tc.ciq.xsdschema.xNL._2._0._0Package.eINSTANCE);
		Registrar.registerPackage(org.mitre.cpe.naming._2._2Package.eNS_URI,  org.mitre.cpe.naming._2._2Package.eINSTANCE);
		Registrar.registerPackage(org.w3.xml._1998.namespace.NamespacePackage.eNS_URI,  org.w3.xml._1998.namespace.NamespacePackage.eINSTANCE);
	}
	
	@Test
	public void testDe_Serialize() {
		String[] ss = getFile("arf.xml");
		StringReader reader = new StringReader(ss[1]);
		EObject eObject = Deserialize.it(reader, ss[0]);
		assertNotNull(eObject);
		String s = Serialize.it(eObject, ss[0]);
		assertNotNull(s);
	}
	
	  private String[] getFile(String resourceName) {
		  
		  	
			StringBuilder result = new StringBuilder("");

			//Get file from resources folder
			ClassLoader classLoader = getClass().getClassLoader();
			URL url = classLoader.getResource(resourceName);
			File file = new File(url.getFile());

			try (Scanner scanner = new Scanner(file)) {

				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					result.append(line).append("\n");
				}

				scanner.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
			String[] ss = {url.toString(), result.toString()};
			return ss;
		  }
}
