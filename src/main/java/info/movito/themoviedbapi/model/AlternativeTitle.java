package info.movito.themoviedbapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.model.core.AbstractJsonMapping;


public class AlternativeTitle extends AbstractJsonMapping {

    @JsonProperty("iso_3166_1")
    private String country;
    @JsonProperty("title")
    private String title;

    @JsonProperty("type")
    private String type;


    public String getCountry() {
        return country;
    }


    public String getTitle() {
        return title;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
