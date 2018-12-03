package com.utils;
import java.awt.AWTException;  
import java.awt.Desktop;  
import java.awt.Dimension;  
import java.awt.Rectangle;  
import java.awt.Robot;  
import java.awt.Toolkit;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.OutputStream;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
import javax.swing.filechooser.FileSystemView;  
  
import com.sun.image.codec.jpeg.JPEGCodec;  
import com.sun.image.codec.jpeg.JPEGEncodeParam;  
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class SnapshotUtil {
	    private static Toolkit toolkit;  
	    private static Robot robot;  
	    private static BufferedImage bufferedImage = null;  
	      
	    public static void shot() throws AWTException, IOException {  
	          
	        toolkit = Toolkit.getDefaultToolkit();  
	        robot = new Robot();  
	        Dimension screenDimension = toolkit.getScreenSize();  
	          
	        bufferedImage = robot.createScreenCapture(new Rectangle(screenDimension));  
	          
	        String path = String.valueOf(FileSystemView.getFileSystemView().getHomeDirectory());  
	        //System.out.println(path);  
	          
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmddHHmmss");    
	        String name = sdf.format(new Date());    
	        name = name+".jpg";  
	        File file = new File(path +"\\"+ name);  
	        OutputStream output = new FileOutputStream(file);  
	        bufferedImage = bufferedImage.getSubimage(0, 0, screenDimension.width,screenDimension.height);  
	  
	        JPEGEncodeParam param = JPEGCodec.getDefaultJPEGEncodeParam(bufferedImage);  
	        param.setQuality(0.7F, false);  
	        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(output, param);  
	        encoder.encode(bufferedImage);  
	        encoder.getOutputStream().close();  
	          
	        Desktop.getDesktop().open(new File(path));  
	        Runtime.getRuntime().exec("cmd /c " + path + name);
	  
	          
	    }  
	      
	      
	      
	    public static void main(String[] args) throws AWTException, IOException {  
	        shot();
	          
	    }  
}
