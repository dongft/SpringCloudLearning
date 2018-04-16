package com.dft;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Class Name MyFilter
 * @Author dongfuting
 * @Create In 2018-04-16 23:44
 */
@Component
public class MyFilter extends ZuulFilter {
    private Logger logger= LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        logger.info(String.format("%s >>> %s ",request.getMethod(),request.getRequestURL().toString()));
        Object accessToken=request.getParameter("token");
        if (accessToken == null) {
            String info="token is empty.";
            logger.warn(info);
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write(info);
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        logger.info("ok");
        return null;
    }
}
