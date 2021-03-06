package IntegrativeProject.DentalClinic.Service.impl;

import IntegrativeProject.DentalClinic.Dto.DentistDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DentistServiceTest {

    @Autowired
   private DentistService dentistService;

    @Test


    public void testCreateDentist(){
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setName("Giovanni");
        dentistDTO.setLastname("Vanetta");
        dentistDTO.setRegister(11210);
        dentistService.create(dentistDTO);
        dentistService.findById(1);

        assertTrue(dentistService.findById(1).getName().equals("Giovanni"));
    }

    @Test
    public void testDeleteDentist(){
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setName("Giovanni");
        dentistDTO.setLastname("Vanetta");
        dentistDTO.setRegister(11210);
        dentistService.create(dentistDTO);
        dentistService.deleteById(2);
        DentistDTO dentistTest = dentistService.findById(2);

        assertTrue(dentistTest == null);
    }

    @Test
    public void testFindById() {
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setName("Giovanni");
        dentistDTO.setLastname("Vanetta");
        dentistDTO.setRegister(11210);
        dentistService.create(dentistDTO);
        dentistService.findById(1);

        assertTrue(dentistService.findById(1).getName().equals("Giovanni"));
    }

    @Test
    public void testUpdateDentist(){
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setName("Giovanni");
        dentistDTO.setLastname("Vanetta");
        dentistDTO.setRegister(11210);
        dentistService.create(dentistDTO);
        dentistService.update(dentistDTO);

        assertTrue(dentistService.findById(1).getName().equals("Giovanni"));
    }

    @Test
    public void testFindAll(){
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setName("Giovanni");
        dentistDTO.setLastname("Vanetta");
        dentistDTO.setRegister(11210);
        dentistService.create(dentistDTO);
        dentistService.findAll();

        assertTrue(dentistService.findAll().size()>0);
    }






}