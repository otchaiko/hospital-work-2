package com.solvd.json;

import com.solvd.mapper.AddressMapper;
import com.solvd.mapper.SqlExecutor;
import com.solvd.model.Address;

public class AddressWriter {

    public void readToFileById(String filePath, Long id) {
        JsonParser<Address> jsonParser = new JsonParser<>();
        AddressMapper addressMapper = SqlExecutor.getAddressMapper();

        Address address = addressMapper.getAddressById(id);
        jsonParser.marchallToFile(address, filePath);
    }

    public void writeToDb(String filePath) {
        JsonParser<Address> jsonParser = new JsonParser<>();
        AddressMapper addressMapper = SqlExecutor.getAddressMapper();

        Address address = jsonParser.unmarshall(filePath, Address.class);
        addressMapper.create(address);
    }
}
