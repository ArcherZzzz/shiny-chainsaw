package com.zsp.finance.controller;

import com.zsp.finance.bean.BankCard;
import com.zsp.finance.bean.TermFinancial;
import com.zsp.finance.bean.User;
import com.zsp.finance.service.BankCardService;
import com.zsp.finance.service.TermFinancialService;
import com.zsp.finance.service.UserService;
import com.zsp.finance.service.UserTermFinancialService;
import com.zsp.finance.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户-期限理财
 */
@Controller
public class UserTermFinancialController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserTermFinancialService userTermFinancialService;
    @Autowired
    private TermFinancialService termFinancialService;
    @Autowired
    private BankCardService bankCardService;

    @ResponseBody
    @PostMapping("/user/buyTermFinancial")
    public JsonUtils buyTermFinancial(@RequestParam("termFinancialId") Integer termFinancialId,
                                      @RequestParam("userId") Integer userId,
                                      @RequestParam("passWord") Integer password){
        try {
            User user = userService.selectUserById(userId);
            List<BankCard> list = bankCardService.selectAllBankCardByUserId(userId);
            if (list==null||list.size()==0)
                return JsonUtils.failNu();
            if (user.getPaypwd()==null)
                return JsonUtils.failPs();
            if (user.getPaypwd().equals(password)){
                TermFinancial termFinancial = termFinancialService.selectTermFinancialById(termFinancialId);
                try {
                    userTermFinancialService.buyTermFinancial(userId,termFinancial);
                } catch (Exception e) {
                    e.printStackTrace();
                    return JsonUtils.failEx();
                }
                return JsonUtils.success();
            }else {
                 return JsonUtils.fail();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.fail();
        }

    }
}
