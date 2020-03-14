package example.service.impl;


import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;


/**
 * 继承XmlAdapter,根据具体需求做转换
 * 泛型一： cxf能接收的类型 String[]
 * 泛型二: cxf不能接收的类型（要转换成的类型） Map<String, Object>
	 需要实现两个方法
 *
 */
public class MapListAdatper extends XmlAdapter<String[], Map<String, Object>> {

	/**
	 * 数组转map
	 */
	@Override
	public Map<String, Object> unmarshal(String[] v) throws Exception {
		Map<String,Object> map = new HashMap<>();

		for (int i = 0; i < v.length; i++) {
			map.put("data-"+i, v[i]);
		}

		return map;
	}

	
	/**
	 * map转数组
	 */
	@Override
	public String[] marshal(Map<String, Object> v) throws Exception {
		String[] roles=new String[v.size()];
        int i=0;
        for(String key:v.keySet()){
            roles[i] = (String)v.get(key);
            i++;
        }
        return roles;
	}
}