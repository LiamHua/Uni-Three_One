
package team.bug.chat.dao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addFriendMsgResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addFriendMsgResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addFriendMsgResponse", propOrder = {
    "_return"
})
public class AddFriendMsgResponse {

    @XmlElement(name = "return")
    protected int _return;

    /**
     * 获取return属性的值。
     * 
     */
    public int getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     */
    public void setReturn(int value) {
        this._return = value;
    }

}