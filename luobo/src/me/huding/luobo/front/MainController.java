/**
 * Copyright (c) 2015-2016, Silly Boy 胡建洪(1043244432@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.huding.luobo.front;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import me.huding.luobo.BaseController;

/**
 *
 *
 * @author JianhongHu
 * @version 1.0
 * @date 2016年10月28日
 */
public class MainController extends BaseController {
	/**
	 * 日志记录器
	 */
	public static final Logger LOG = LoggerFactory.getLogger(MainController.class);

	/**
	 * 
	 */
	public void index(){
		getBaseURL();
	}
	
}
