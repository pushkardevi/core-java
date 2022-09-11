package jaxb;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class EmployeeJAXB {
	
	
	
	
	public void marshall() {
		
		Employee e = new Employee();
		e.setFirstName("Pushkar");
		e.setId(1);
		e.setLastName("Devi");
		e.setIncome(40000);
	
		try {
		
			JAXBContext jc1 = JAXBContext.newInstance(Employee.class);
			Marshaller m = jc1.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter sw = new StringWriter();
			m.marshal(e, sw);
			System.out.println(sw.toString());
			System.out.println();
			
			JAXBContext jc2 = JAXBContext.newInstance(Employee.class);
			Unmarshaller um = jc2.createUnmarshaller();
			StringReader sr = new StringReader(sw.toString());
			System.out.println(um.unmarshal(sr));
			
			
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
