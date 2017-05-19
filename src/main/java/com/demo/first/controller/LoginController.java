package com.demo.first.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.demo.first.view.JsonView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户登录Controller
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {


    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public ModelAndView signin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login/signin");
        return modelAndView;
    }

    @RequestMapping(value = "/default", method = RequestMethod.POST)
    public String defaultPage(Model model) {

        model.addAttribute("aa", "bb");
        return "/login/defaultPage";
    }

    @RequestMapping(value = "/chartPie", method = RequestMethod.GET)
    public ModelAndView chartPie() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("chart/chartPie");
        return modelAndView;
    }

    @RequestMapping(value = "/chartRadar", method = RequestMethod.GET)
    public ModelAndView chartRadar() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("chart/chartRadar");
        return modelAndView;
    }

    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public ModelAndView tablePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("table/tablePage");
        return modelAndView;
    }

    @RequestMapping(value = "/gridTable", method = RequestMethod.POST)
    public JsonView tableData() {
        Map<String, Object> result = new HashMap<String, Object>();
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "zhangsan");
        jsonObject.put("sex", "nan");
        jsonObject.put("age", "20");
        jsonArray.add(jsonObject);
        result.put("result", jsonArray);
        return new JsonView(result);
    }

}
