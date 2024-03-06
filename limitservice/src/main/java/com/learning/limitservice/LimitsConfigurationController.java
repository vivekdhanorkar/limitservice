package com.learning.limitservice;

import com.learning.limitservice.bean.Configuration;
import com.learning.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {


  @Autowired
  Configuration configuration;

  @GetMapping("/limits")
  public LimitConfiguration getLimitConfigurationData(){
      return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
  }
}
