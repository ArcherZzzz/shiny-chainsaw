package com.zsp.finance.controller;

import com.zsp.finance.bean.BankCard;
import com.zsp.finance.bean.FundProduct;
import com.zsp.finance.bean.User;
import com.zsp.finance.service.BankCardService;
import com.zsp.finance.service.FundProductService;
import com.zsp.finance.service.UserFundProductService;
import com.zsp.finance.service.UserService;
import com.zsp.finance.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserFundProductController {

    @Autowired
    private UserService userService;
    @Autowired
    private FundProductService fundProductService;
    @Autowired
    private UserFundProductService userFundProductService;
    @Autowired
    private BankCardService bankCardService;
    @PostMapping("/user/buyFundProduct")
    @ResponseBody
    public JsonUtils buyFundProduct(@RequestParam("fundProductId") Integer fundProductId,
                                    @RequestParam("userId") Integer userId,
                                    @RequestParam("passWord") Integer password) {
        try {
            User user = userService.selectUserById(userId);
            List<BankCard> list = bankCardService.selectAllBankCardByUserId(userId);
            if (list==null||list.size()==0)
                return JsonUtils.failNu();
            if (user.getPaypwd()==null)
                return JsonUtils.failPs();
            if (user.getPaypwd().equals(password)) {
                FundProduct fundProduct = fundProductService.selectFundProductById(fundProductId);
                try {
                    userFundProductService.buyFundProduct(userId,fundProduct);
                } catch (Exception e) {
                    e.printStackTrace();
                    return JsonUtils.failEx();
                }
                return JsonUtils.success();
            } else {
                return JsonUtils.fail();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.fail();
        }

    }
}
