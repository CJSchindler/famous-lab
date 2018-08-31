package co.grandcircus.famouslab;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.PersonResult;

@Controller
public class LabController {

	@RequestMapping("/")
	public ModelAndView showTiny() {
		ModelAndView mav = new ModelAndView("tiny");
		
		// Create RestTemplate
			RestTemplate restTemplate = new RestTemplate();

		// Make the Request.
			ResponseEntity<PersonResult> response = restTemplate.exchange("https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", HttpMethod.GET,
						new HttpEntity<>(null), PersonResult.class);
				
		// Extract body from response.
			PersonResult result = response.getBody();
			
			mav.addObject("tinyPerson", result.getTiny()); //sending to jsp and calling it "tinyPerson"	
			
		return mav;
	}
	
	@RequestMapping("/complete")
	public ModelAndView showComplete() {
		ModelAndView mav = new ModelAndView("complete");
		
		// Create RestTemplate
			RestTemplate restTemplate = new RestTemplate();

		// Make the Request.
			ResponseEntity<PersonResult> response = restTemplate.exchange("https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json", 
					HttpMethod.GET, new HttpEntity<>(null), PersonResult.class);
				
		// Extract body from response.
			PersonResult result = response.getBody();
			
			mav.addObject("completePerson", result.getComplete()); //sending to jsp and calling it "completePerson"	
			
		return mav;
	}
	
	
}
