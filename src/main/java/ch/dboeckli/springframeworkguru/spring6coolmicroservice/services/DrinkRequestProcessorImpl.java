package ch.dboeckli.springframeworkguru.spring6coolmicroservice.services;

import ch.guru.springframework.spring6restmvcapi.events.DrinkRequestEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DrinkRequestProcessorImpl implements DrinkRequestProcessor {
    
    @Override
    public void processDrinkRequest(DrinkRequestEvent event) {
        log.info("### Processing Cool drink request..." + event);
        try {
            Thread.sleep(50);
            log.info("### Processing Cold drink done...");
        } catch (InterruptedException e) {
            log.error("Error processing drink request", e);
        }
    }
}
