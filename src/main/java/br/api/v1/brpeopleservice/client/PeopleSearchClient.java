package br.api.v1.brpeopleservice.client;

import br.api.v1.brpeopleservice.model.dto.PeopleResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("https://randomuser.me/api")
public interface PeopleSearchClient {
    @Get("?nat=br")
    PeopleResponse searchPeopleFromBrazil();
}
