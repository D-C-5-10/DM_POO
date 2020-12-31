package ENSIM.DM_POO.Model.MeteoJSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Coordinates {
    public double lat;
    public double lon;
}
