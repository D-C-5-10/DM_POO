package ENSIM.DM_POO.Model.AdresseJSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AdresseEtalab {
    public String type;
    public String version;
    public Feature features[];
    public String attribution;
    public String licence;
    public String query;
    public int limit;
}