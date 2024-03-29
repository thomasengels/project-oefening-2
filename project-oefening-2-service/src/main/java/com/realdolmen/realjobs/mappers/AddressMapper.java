package com.realdolmen.realjobs.mappers;

import com.realdolmen.realjobs.models.Address;
import com.realdolmen.realjobs.dto.AddressDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;

@Mapper(config = AddressMapperConfig.class, componentModel = "spring")
public abstract class AddressMapper {
    @InheritConfiguration(name = "toAddressDTO")
    abstract AddressDTO mapToDTO(Address address);
    @InheritConfiguration(name = "mapToModel")
    abstract Address mapToModel(AddressDTO addressDTO);
}
