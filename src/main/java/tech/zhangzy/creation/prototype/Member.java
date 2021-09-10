package tech.zhangzy.creation.prototype;

import lombok.Data;
import lombok.ToString;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 深拷贝
 * 原理：利用序列化和反序列化
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/10
 */
@ToString
@Data
public class Member implements Serializable {
    private static final long serialVersionUID = -5590276302865733962L;
    private String memberNo;

    private String name;

    private List<String> bindPlatform = new ArrayList<>();

    /**
     * 对象深拷贝
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Member deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(byteOut);
        //序列化
        objOut.writeObject(this);
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream objIn = new ObjectInputStream(byteIn);
        //反序列化
        return (Member) objIn.readObject();
    }
}
