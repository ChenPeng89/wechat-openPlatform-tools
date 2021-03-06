package com.renren.kylin.bean.message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.util.xml.XStreamMediaIdConverter;

@XStreamAlias("xml")
public class WxOpXmlOutVoiceMessage extends WxOpXmlOutMessage {

  /**
   *
   */
  private static final long serialVersionUID = 240367390249860551L;
  @XStreamAlias("Voice")
  @XStreamConverter(value = XStreamMediaIdConverter.class)
  private String mediaId;

  public WxOpXmlOutVoiceMessage() {
    this.msgType = WxConsts.XML_MSG_VOICE;
  }

  public String getMediaId() {
    return this.mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

}
