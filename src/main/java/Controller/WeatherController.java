package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CS310_WEATHERAPP.repo.WeatherRepo;

import Model.Weather;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired WeatherRepo wRepo;
	
	
	@GetMapping("/weatherlist")
	public List<Weather> listweather() {
		return wRepo.findAll();
	}
	
	
}
