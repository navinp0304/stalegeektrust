package com.example.geektrust;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class CorporationCalculator  {
	@NonNull
	ApartmentConfig aptConfig;
	@NonNull
	Apartment apt;


	public  RateSummary getCost() {
		Double litres = apt.getResidents() * aptConfig.getPersonLitresMonth() * apt.getRatioCORPORATIONBOREWELL();
		Double cost = litres * aptConfig.getCorporationRate();
		return new RateSummary(litres, cost);
	}
}
