package info.movito.themoviedbapi.model.tv;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.model.AlternativeTitle;
import info.movito.themoviedbapi.model.core.AbstractJsonMapping;

import java.util.List;

public class TvAlternativeTitle extends AbstractJsonMapping {

    @JsonProperty("results")
    private List<AlternativeTitle> results;
    @JsonProperty("id")
    private int id;

    public List<AlternativeTitle> getResults() {
        return results;
    }

    public TvAlternativeTitle setResults(List<AlternativeTitle> results) {
        this.results = results;
        return this;
    }

    public int getId() {
        return id;
    }

    public TvAlternativeTitle setId(int id) {
        this.id = id;
        return this;
    }
}
