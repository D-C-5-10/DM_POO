package ENSIM.DM_POO.Model.AdresseJSON;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Geometry {
    public String type;
    public double coordinates[];
}