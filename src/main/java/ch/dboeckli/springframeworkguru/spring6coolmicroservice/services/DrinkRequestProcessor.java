package ch.dboeckli.springframeworkguru.spring6coolmicroservice.services;

import ch.guru.springframework.spring6restmvcapi.events.DrinkRequestEvent;

public interface DrinkRequestProcessor {

    void processDrinkRequest(DrinkRequestEvent event);
    
}
