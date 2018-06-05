package de.walter;

import org.junit.Test;

import de.hs_furtwangen.informatik.meldeauskunft.domain.Resident;
import de.hs_furtwangen.informatik.meldeauskunft.repository.ResidentRepositoryStub;
import de.hs_furtwangen.informatik.meldeauskunft.service.BaseResidentService;

import static org.junit.Assert.*; 


public class BaseResidentServiceTest {
	@Test
	public void Test1() { 
		
	    BaseResidentService a = new BaseResidentService();
	    a.setResidentRepository(new ResidentRepositoryStub()); // Erstellte datenabnk
	    
	    // 3 getFilteredResidentsList() 
	    Resident r = new Resident(); // Filter resident 
	    r.setGivenName("Ma*");
	    
	    a.getFilteredResidentsList(r);// filter übergeben
	    
		assertEquals("Die Objekte sind Gleich", a.getFilteredResidentsList(r), filteredResidents) 
		
		// 3 getUniqueResident() 
		
	}

}
