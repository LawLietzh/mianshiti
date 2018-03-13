package tool;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

///读取 文件夹中所有文本
public class readALLfile 
{
	////文件夹
	public static final String path = "E://数据资料//数据分析//wav";
	public static List<String> listFile = new ArrayList<String>();
	public static void readAllFiles(String path)
	{
		File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!!");
              //  return null;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                   
                        readAllFiles(file2.getAbsolutePath());
                    } else {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        listFile.add(file2.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
		
		//return listFile;
	}
	
	public static void main(String[] args)
	{
		File file = new File(path);
		//file.getName();
		  File[] files = file.listFiles();
		  for(int i = 0;i<files.length;i++)
		  {
			  System.out.println(files[i].getName());
		  }
		  
		/*readAllFiles(path);
		for(String file1 :listFile){
			System.out.println(file1);
		}*/
	}

}
