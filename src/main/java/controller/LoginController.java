package controller;

import com.sun.deploy.net.HttpRequest;
import pojo.CardDTO;
import util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author yohoyes
 * @date 2021/5/30 16:49
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getParameter("code");
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        String s = HttpUtil.sendGet(url, "appid=wx7502e3f671961939&secret=abbed4208eb811b88720e068c2733abd&js_code=" + code + "&grant_type=authorization_code");
        System.out.println(s);
    }
}
