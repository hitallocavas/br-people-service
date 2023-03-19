package br.api.v1.brpeopleservice.client;

import br.api.v1.brpeopleservice.model.dto.CepResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("https://geradornv.com.br/wp-json/api/cep")
public interface PostalCodeSearchClient {
    @Get("/random-by-states?state=PE")
    CepResponse generateCep();
}
