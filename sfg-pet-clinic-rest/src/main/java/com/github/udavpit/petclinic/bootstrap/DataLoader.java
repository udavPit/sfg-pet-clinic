package com.github.udavpit.petclinic.bootstrap;

import com.github.udavpit.petclinic.models.Owner;
import com.github.udavpit.petclinic.models.Vet;
import com.github.udavpit.petclinic.services.OwnerService;
import com.github.udavpit.petclinic.services.VetService;
import com.github.udavpit.petclinic.services.map.OwnerServiceMap;
import com.github.udavpit.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Vasia");
        owner1 .setLastName("Pupkin");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Valera");
        owner2 .setLastName("Peshkur");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Alex");
        vet1.setLastName("Zyl");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("John");
        vet2.setLastName("Dou");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
