package com.realdolmen.realjobs.mappers;

import com.realdolmen.realjobs.dto.AddressDTO;
import com.realdolmen.realjobs.persistence.models.Address;
import org.mapstruct.MapperConfig;
import org.mapstruct.MappingTarget;

@MapperConfig
public interface AddressMapperConfig {
    void toAddressDTO(Address address, @MappingTarget AddressDTO addressDTO);
    void toAddressModel(AddressDTO addressDTO, @MappingTarget Address address);
}
