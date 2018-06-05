package de.hs_furtwangen.informatik.meldeauskunft.repository;

import java.util.List;

import de.hs_furtwangen.informatik.meldeauskunft.domain.Resident;

public class ResidentRepositoryStub implements ResidentRepository{

	@Override
	public List<Resident> getResidents() {
		
		Resident test1 =null;
		test1.setGivenName("Max");
		
		Resident test2 =null;
		test2.setGivenName("Maximilian");
		
		
		return null;
	}

}
