/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhaimi.message.demo.dataevent.mapper.impl;

import com.zhaimi.message.demo.dataevent.entity.Order;
import com.zhaimi.message.demo.dataevent.mapper.OrderMapper;
import org.springframework.stereotype.Repository;

/**
 * @author caie
 * @since 1.2
 */
@Repository
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Integer insertOrder(Order order) {
        // sqlSessionTemplate.insert("OrderMapper.insert", order);
        return 1;

    }

    @Override
    public Integer updateOrder(Order order) {
        // sqlSessionTemplate.update("OrderMapper.update", order);
        return 1;
    }

}
