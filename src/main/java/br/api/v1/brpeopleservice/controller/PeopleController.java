package br.api.v1.brpeopleservice.controller;

import br.api.v1.brpeopleservice.model.dto.PeopleResponse;
import br.api.v1.brpeopleservice.service.PeopleSearchService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Controller("/api/v1/people")
public class PeopleController {

    private final PeopleSearchService peopleSearchService;

    @Inject
    public PeopleController(@Singleton PeopleSearchService peopleSearchService) {
        this.peopleSearchService = peopleSearchService;
    }


    @Get("{cpf}")
    public PeopleResponse peopleResponse(@PathVariable String cpf){
        return this.peopleSearchService.searchPeopleByCPF(cpf);
    }

}
