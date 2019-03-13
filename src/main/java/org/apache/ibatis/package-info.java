/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * The MyBatis data mapper framework makes it easier to use a relational database with object-oriented applications.
 */
package org.apache.ibatis;

//
/*
        基础支持层:
        反射          类型转换      日志模块   资源加载     解析器模块
        reflection   type        logging   io         parsing
        数据源        事务管理      缓存模块   Binding模块
        datasource   transaction cache     annotations
        核心处理层:
        SQL执行       结果集映射 插件

        配置解析 参数映射  SQL解析
        builder         scripting
        mapping
        接口层:
        SqlSession
*/

/*
       异常
       exceptions
*/
