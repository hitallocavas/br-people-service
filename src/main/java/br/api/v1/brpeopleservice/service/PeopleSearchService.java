package br.api.v1.brpeopleservice.service;

import br.api.v1.brpeopleservice.client.PeopleSearchClient;
import br.api.v1.brpeopleservice.client.PostalCodeSearchClient;
import br.api.v1.brpeopleservice.model.dto.PeopleResponse;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class PeopleSearchService {

    private final PeopleSearchClient peopleSearchClient;
    private final PostalCodeSearchClient postalCodeSearchClient;

    @Inject
    public PeopleSearchService(
            @Singleton PeopleSearchClient peopleSearchClient,
            @Singleton PostalCodeSearchClient postalCodeSearchClient
    ) {
        this.peopleSearchClient = peopleSearchClient;
        this.postalCodeSearchClient = postalCodeSearchClient;
    }

    public PeopleResponse searchPeopleByCPF(String cpf){
        var response = this.peopleSearchClient.searchPeopleFromBrazil();

        response.getResults().get(0).getId().setValue(cpf);
        response.getResults().get(0).getLocation().setPostcode(
                Long.valueOf(this.postalCodeSearchClient.generateCep().getCep())
        );

        return response;
    }
}
