package com.example.PPC.Service;

import com.example.PPC.Dto.FullContractDto;
import com.example.PPC.Exception.FullContractIsExitException;
import com.example.PPC.Exception.FullContractNotFoundException;
import com.example.PPC.Model.FullContract;
import com.example.PPC.Repository.FullContractRepo;
import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FullContractService {

    @Autowired
    private FullContractRepo fullContractRepo;


    public List<FullContract> getAllFullContracts(){
        return fullContractRepo.findAll();
    }


    public FullContract addFullContract( FullContractDto fullContractDto){
        FullContract fullContract = new FullContract();
        fullContract.setCustomerName(fullContractDto.getCustomerName());
        fullContract.setYearOfBirth(fullContractDto.getYearOfBirth());
        fullContract.setSsn(fullContractDto.getSsn());
        fullContract.setDateOfContract(fullContractDto.getDateOfContract());
        fullContract.setCustomer_Address(fullContractDto.getCustomer_Address());
        fullContract.setPhoneNumber(fullContractDto.getPhoneNumber());
        fullContract.setDeposit(fullContractDto.getDeposit());
        fullContract.setDateOfContract(fullContractDto.getDateOfContract());
        fullContract.setRemain(fullContractDto.getRemain());
        fullContract.setPrice(fullContractDto.getPrice());
        return fullContractRepo.save(fullContract);
    }

    public void deleteFullContractById(Long id){
        Optional<FullContract> optionalFullContract = fullContractRepo.findById(id);
        if (optionalFullContract.isPresent()) {
            fullContractRepo.deleteById(id);
        } else {
            throw new FullContractNotFoundException("FullContract with ID " + id + " not found");
        }
    }


}
