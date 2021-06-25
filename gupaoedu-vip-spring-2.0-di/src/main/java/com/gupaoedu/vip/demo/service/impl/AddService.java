package com.gupaoedu.vip.demo.service.impl;

import com.gupaoedu.vip.demo.service.IAddService;
import com.gupaoedu.vip.demo.service.IModifyService;
import com.gupaoedu.vip.demo.service.IQueryService;
import com.gupaoedu.vip.spring.framework.annotation.GPAutowired;
import com.gupaoedu.vip.spring.framework.annotation.GPService;

@GPService
public class AddService implements IAddService {

   @GPAutowired private IModifyService modifyService;
   @GPAutowired private IQueryService queryService;

}
