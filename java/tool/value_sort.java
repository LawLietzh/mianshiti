package tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//这个类用于实现，hash表按value值排序
public class value_sort
{
	//hash表 按照 vlaue 排序
	public static Map<String, Double> sortMap(Map<String, Double> oldMap)
	{

		ArrayList<Map.Entry<String, Double>> list = new ArrayList<Map.Entry<String, Double>>(oldMap.entrySet());
		Collections.sort(
				list, new Comparator<Map.Entry<String, Double>>()
				{

					public int compare(Entry<java.lang.String, Double> arg0,  Entry<java.lang.String, Double> arg1)
					{
						return (int) (arg1.getValue() - arg0.getValue());
					}

				}
		);
		Map<String, Double> newMap = new LinkedHashMap<String, Double>();
		for (int i = 0; i < list.size(); i++) {
			newMap.put(list.get(i).getKey(), list.get(i).getValue());
		}
		System.out.println("按value 值分类");
		return newMap;
	}
	public static void main(String[] args)
	{
		Map  hashmap = new HashMap();
		hashmap.put("a", 1.1);
		hashmap.put("b", 1.2);
		hashmap.put("c", 1.4);
		hashmap = sortMap(hashmap);
		//遍历hash表
		Iterator iter = hashmap.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<String,Double> entry = (Map.Entry) iter.next();
			Object key = entry.getKey();
			Object val = entry.getValue();
		}


	}

}