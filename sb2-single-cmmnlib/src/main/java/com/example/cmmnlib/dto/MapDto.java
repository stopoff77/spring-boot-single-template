/**
 * Copyright 2020 장동선.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * */
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
