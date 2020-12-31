package ENSIM.DM_POO.Controller;

import ENSIM.DM_POO.Model.AdresseJSON.AdresseEtalab;
import ENSIM.DM_POO.Model.MeteoJSON.WeatherResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class meteoContoller {
    private final static String APIKey = "0a45591bcf12f8db5f2d58b758284f2c";
    @PostMapping("/meteo")
    public String recAppPost(@RequestParam(name="query", required=true) String adresse, Model model) {
        String url = String.format("https://api-adresse.data.gouv.fr/search/?q=\"%s\"&limit=1", adresse);
        double reponse_gps[] = new RestTemplate().getForObject(url, AdresseEtalab.class).features[0].geometry.coordinates;
        url = String.format("http://api.openweathermap.org/data/2.5/weather?lat=%f&lon=%f&lang=fr&units=metric&appid=%s", reponse_gps[0], reponse_gps[1], meteoContoller.APIKey );
        WeatherResult reponse_meteo = new RestTemplate().getForObject(url, WeatherResult.class);
        String prevision = reponse_meteo.weather[0].description;
        double temperature = reponse_meteo.main.temp;
        model.addAttribute("gps_x", reponse_gps[0]);
        model.addAttribute("gps_y", reponse_gps[1]);
        model.addAttribute("prevision", prevision);
        model.addAttribute("temperature", temperature);
        model.addAttribute("query", adresse);
        return "meteo";
    }
}
