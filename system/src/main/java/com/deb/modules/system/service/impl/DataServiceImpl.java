/*
 *  Copyright 2019-2020 Deb
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.deb.modules.system.service.impl;

import lombok.RequiredArgsConstructor;
import com.deb.modules.system.domain.Dept;
import com.deb.modules.system.service.DataService;
import com.deb.modules.system.service.RoleService;
import com.deb.modules.system.service.dto.RoleSmallDto;
import com.deb.modules.system.service.dto.UserDto;
import com.deb.utils.enums.DataScopeEnum;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * @author Deb
 * @website https://cnff.xyz
 * @description 数据权限服务实现
 * @date 2020-05-07
 **/
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = "data")
public class DataServiceImpl implements DataService {

    private final RoleService roleService;

}
