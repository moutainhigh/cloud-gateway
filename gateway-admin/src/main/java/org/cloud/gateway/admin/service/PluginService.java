/*
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.cloud.gateway.admin.service;

import org.cloud.gateway.admin.dto.PluginDTO;
import org.cloud.gateway.admin.page.CommonPager;
import org.cloud.gateway.admin.query.PluginQuery;
import org.cloud.gateway.admin.vo.PluginVO;

import java.util.List;

/**
 * this is plugin service.
 *
 * @author jiangxiaofeng(Nicholas)
 */
public interface PluginService {

    /**
     * create or update plugin.
     *
     * @param pluginDTO {@linkplain PluginDTO}
     * @return rows int
     */
    int createOrUpdate(PluginDTO pluginDTO);

    /**
     * delete plugins.
     *
     * @param ids primary key.
     * @return rows int
     */
    int delete(List<String> ids);

    /**
     * find plugin by id.
     *
     * @param id pk.
     * @return {@linkplain PluginVO}
     */
    PluginVO findById(String id);

    /**
     * find page of plugin by query.
     *
     * @param pluginQuery {@linkplain PluginQuery}
     * @return {@linkplain CommonPager}
     */
    CommonPager<PluginVO> listByPage(PluginQuery pluginQuery);


    /**
     * Sync plugin data for mysql.
     *
     * @param pluginId the plugin id
     * @return the int
     */
    int syncPluginData(String pluginId);

    /**
     * sync plugins.
     *
     * @return rows int
     */
    int syncPluginAll();
}
