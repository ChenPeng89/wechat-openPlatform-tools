package com.renren.kylin.api;

import com.renren.kylin.bean.message.WxOpXmlMessage;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;

import java.util.Map;

/**
 * 微信消息拦截器，可以用来做验证
 *
 * @author Daniel Qian
 */
public interface WxOpMessageInterceptor {

  /**
   * 拦截微信消息
   *
   * @param wxMessage
   * @param context        上下文，如果handler或interceptor之间有信息要传递，可以用这个
   * @param wxOpService
   * @param sessionManager
   * @return true代表OK，false代表不OK
   */
  boolean intercept(WxOpXmlMessage wxMessage,
                    Map<String, Object> context,
                    WxOpService wxOpService,
                    WxSessionManager sessionManager) throws WxErrorException;

}
