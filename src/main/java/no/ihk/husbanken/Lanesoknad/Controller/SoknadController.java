package no.ihk.husbanken.Lanesoknad.Controller;

import java.util.HashMap;
import no.ihk.husbanken.Lanesoknad.soknad.SoknadResponse;
import no.ihk.husbanken.Lanesoknad.soknad.Soknad;
import no.ihk.husbanken.Lanesoknad.soknad.StatusRespons;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SoknadController {
	
	private HashMap<Integer,Soknad> soknadMap = new HashMap<>();
	private int soknadsnummer = 0;
	
	private final static String STATUS_MOTTATT = "MOTTATT"; 
	private final static String STATUS_UKJENT = "UKJENT"; 
	
	/**
	 *
	 * 
	 * @param soknad   Dette er lanesoknaden som sendes inn og lagres
	 * @return         Det returneres soknadsrespons som inneholder soknadsnummer
	 */
	@RequestMapping(value="/post/soknadsnummer", method = RequestMethod.POST)
	public SoknadResponse getForsteSoknad(@RequestBody Soknad soknad) {
		
		soknadsnummer++;
		soknadMap.put(soknadsnummer, soknad);
		
		SoknadResponse response = new SoknadResponse();
		response.setSoknadsnummer(soknadsnummer);
		
		System.out.println(soknad.toString());
		return response;
	}
	
	/**
	 * 
	 * @param soknadsnr   Dette er soknadsnummer som sendes inn for a sjekke hvis soknad finnes
	 * @return            Dette returnerer status pa hvis soknaden finnes eller ikke
	 */
	@RequestMapping(value="/get/status", method = RequestMethod.GET)
	public StatusRespons getSoknadBySoknadsnummer(@RequestParam ("soknadsnummer") int soknadsnr) {
		
		if(soknadMap.containsKey(soknadsnummer)) {
			
			return new StatusRespons(STATUS_MOTTATT);
		} 
		
		return new StatusRespons(STATUS_UKJENT);
	}
	
}
