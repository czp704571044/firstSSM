package com.ssm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssm.Service.ItemsService;

@Controller

public class ItemsController {
   @Autowired
   private ItemsService itemService;
   
   
}
