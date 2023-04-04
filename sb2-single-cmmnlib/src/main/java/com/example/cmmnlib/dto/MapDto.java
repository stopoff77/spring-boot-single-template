package com.example.cmmnlib.dto;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.collections.map.ListOrderedMap;
import org.apache.commons.lang3.StringUtils;


public class MapDto extends ListOrderedMap {

    private static final long serialVersionUID = -5354101794266218602L;


    public MapDto() {
        super();
    }

    public MapDto(Map<String, Object> map) {
        super(map);
    }


    public String getString(String key) {
        return Objects.isNull(get(key)) ? null : (String)get(key);
    }
    public BigDecimal getBigDecimal(String key) {
        return StringUtils.isEmpty(getString(key)) ? null : new BigDecimal(getString(key));
    }
}
