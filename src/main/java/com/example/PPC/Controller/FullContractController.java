package com.example.PPC.Controller;

import com.example.PPC.Dto.FullContractDto;

import com.example.PPC.Exception.FullContractIsExitException;
import com.example.PPC.Exception.FullContractNotFoundException;
import com.example.PPC.Model.FullContract;
import com.example.PPC.Service.FullContractService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fullcontracts")
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
public class FullContractController {

    @Autowired
    private FullContractService fullContractService;

    @PostMapping("/add")
    public ResponseEntity addFullContract(@Valid @RequestBody FullContractDto fullContractDto){
        fullContractService.addFullContract(fullContractDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<FullContract>> getAllFullContracts(){
        List<FullContract> fullContracts = fullContractService.getAllFullContracts();
        if(fullContracts.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(fullContracts);
        }
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity deleteFullContractById(@PathVariable Long id){
        try {
            fullContractService.deleteFullContractById(id);
            return ResponseEntity.ok().build();
        } catch (FullContractNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("FullContract not found with ID: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting FullContract");
        }
    }
}
