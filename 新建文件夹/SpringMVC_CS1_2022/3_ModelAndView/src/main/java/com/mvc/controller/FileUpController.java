package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.awt.font.MultipleMaster;
import java.io.File;
import java.io.IOException;
import java.util.UUID;


/**
 * 打开文件上传页
 */

@Controller
public class FileUpController {
    @RequestMapping("fileUpAndDown")
    public String file(){

        return "fileUpAndDown";
    }


    /**
     *
     * @param photo   上传文件对象
     * @param session    获取当前服务器的模块路径
     * @return
     */
    @RequestMapping("upload")
    public String fileUpload(MultipartFile photo, HttpSession session) throws IOException {
        System.out.println((photo.getName()));//form中的name
        System.out.println((photo.getOriginalFilename()));//源文件名称
        /**1.设置文件名
         *  实际场景中，多用户上传同名文件（不同内容）时，文件名要一致
         *  token/pk/uuid/id-->唯一标识文件名
         *
         */
        String fileName= photo.getOriginalFilename();
        //后缀jquery-3.6.1.jpg ---> 最后一个点
        String suffix=fileName.substring(fileName.lastIndexOf("."));
        //UUID
        fileName=UUID.randomUUID().toString()+suffix;

        System.out.println(fileName);
        /**2.设置存储路径
         *    存储方式
         *      A,一般开发中，文件存于服务器路径下：
         *          一般将文件存于linux下的nginx/tomcat目录下
         *          再将上传后的文件String存于数据库（varchar）
         *          打开时，查询文件名fileName
         *              filePath+/+filename
         *
         *          windows下E://dire下
         *      B,存在数据库
         *          二进制文件，binary --》 mysql   BLOG/CLOG
         *
         */
        ServletContext context=session.getServletContext();
        String realPath=context.getRealPath("photo");
        //目录检查，不存在则删除
        File file=new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }
        System.out.println(realPath);//web服务器存储路径
        String finalName ="E:\\download"+File.separator+fileName;//系统自动生成目录分隔符
        /**3.上传
         * 1.未设置目录时：上传到D:DevTools\Java\Tomcat8.5.63\bin
         * 2.IDEA模拟的Tomact的webapp路径
         *
         */

        photo.transferTo(new File(finalName));

        return "success";
    }

}
