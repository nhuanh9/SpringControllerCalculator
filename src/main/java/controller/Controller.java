package controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/calculate")
    public String calculate(@RequestParam(name = "firstNum", required = false, defaultValue = "0") double firstNum,
                            @RequestParam(name = "secondNum", required = false, defaultValue = "0") double secondNum,
                            @RequestParam(name = "operator", required = false, defaultValue = "+") String operator,
                            ModelMap model) {
        double result = 0;
        switch (operator) {
            case "+": {
                result = firstNum + secondNum;
                break;
            }
            case "-": {
                result = firstNum - secondNum;
                break;
            }
            case "*": {
                result = firstNum * secondNum;
                break;
            }
            case "/": {
                result = firstNum / secondNum;
                break;
            }
        }
        model.addAttribute("result", result);
        model.addAttribute("firstNum", firstNum);
        model.addAttribute("secondNum", secondNum);
        return "index";
    }
}
