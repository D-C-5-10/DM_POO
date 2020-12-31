package ENSIM.DM_POO.Model.MeteoJSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Wind {
    public double speed;
    public int deg;
    public double gust;
}