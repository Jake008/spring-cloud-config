package com.example.swb.com.swb.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
@Component
public class PasswordFilter extends ZuulFilter {

    /**
     * 过滤器类型 pre表示在请求之前进行逻辑操作
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序
     * 当一个请求在同一个阶段存在多个过滤器的时候 过滤器的执行顺序
     */
    @Override
    public int filterOrder() {
        return 1; //优先级设置为1表示在用户名通过检验后进行过滤
    }

    /**
     * 是否开启过滤
     */
    @Override
    public boolean shouldFilter() {
        // 如果前一个过滤器的结果为true，则说明上一个过滤器成功了，
        // 需要进入当前的过滤，如果前一个过滤器的结果为false，则说明上一个过滤器没有成功，则无需进行下面的过滤动作了，直接跳过后面的所有过滤器并返回结果
        RequestContext ctx = RequestContext.getCurrentContext();
        return (boolean) ctx.get("isSuccess");
    }

    @Override
    public Object run() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String passWord = request.getParameter("password");
        if (null !=passWord && passWord.equals("000")) {
            currentContext.setSendZuulResponse(true);
            currentContext.setResponseStatusCode(200);
            currentContext.set("isSuccess", true);
        } else {
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("{\"result\":\"passWord is not correct!\"}");
            currentContext.set("isSuccess", false);
        }
        return null;
    }
}
