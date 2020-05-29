/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shiki.database.demo.common.core.constant;

/**
 * @author shiki
 * @date 2020/5/28 上午10:21
 */
public interface ConfigConstants {
    /**
     * 默认的redis-session过期时间 默认每分钟执行一次
     */
    String DEFAULT_CLEANUP_CRON = "0 * * * * *";

    /**
     * 默认的redis-session命名空间
     */
    String DEFAULT_NAMESPACE = "live:session";
}
