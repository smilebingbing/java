package pojo;

import java.util.ArrayList;
import java.util.List;
/**327路公交车的停站信息      手动输入 */
public class PortList327 {

	public static List<BusPort> list = new ArrayList<BusPort>();
	
	public PortList327() {
		
		list.add(new BusPort(123.401621, 41.798062, 1, "沈阳站南"));
		list.add(new BusPort(123.407905, 41.790266, 2, "体育广场"));
		list.add(new BusPort(123.405339, 41.787189, 3, "铁路中学"));
		list.add(new BusPort(123.401621, 41.798062, 4, "新华广场"));
		list.add(new BusPort(123.401013, 41.782323, 5, "南京街南十"));
		list.add(new BusPort(123.398507, 41.772635, 6, "南京街砂阳路"));
		list.add(new BusPort(123.399404, 41.770436, 7, "工农桥北"));
		list.add(new BusPort(123.405739, 41.757851, 8, "工农桥南"));
		list.add(new BusPort(123.408213, 41.751698, 9, "长白港湾站"));
		list.add(new BusPort(123.410913, 41.744717, 10, "中海国际社区"));
		list.add(new BusPort(123.4135,   41.738229, 11, "沙岗子"));
		list.add(new BusPort(123.414843, 41.734866, 12, "上夹河"));
		list.add(new BusPort(123.417511, 41.728046, 13, "浑南汽车城东"));
		list.add(new BusPort(123.413094, 41.716031, 14, "王士村"));
		list.add(new BusPort(123.405467, 41.702501, 15, "上河湾"));
		list.add(new BusPort(123.402645, 41.697581, 16, "沈阳卷烟厂"));
		list.add(new BusPort(123.399123, 41.692793, 17, "恒大名都"));
		list.add(new BusPort(123.392903, 41.684481, 18, "华府丹郡"));
		list.add(new BusPort(123.383911, 41.687673, 19, "沈阳市工业技术学校"));
		list.add(new BusPort(123.377982, 41.6902,   20, "银杏路雪莲街"));
		list.add(new BusPort(123.375302, 41.688034, 21, "可济药业"));
		list.add(new BusPort(123.371359, 41.682812, 22, "大官房"));
		list.add(new BusPort(123.369072, 41.677999, 23, "木材防腐厂"));
		list.add(new BusPort(123.36998,  41.674228, 24, "十里锦城"));
		list.add(new BusPort(123.355936, 41.672129, 25, "玫瑰街北九路"));
		list.add(new BusPort(123.358981, 41.668758, 26, "苏家屯火车站"));
		list.add(new BusPort(123.343862, 41.666065, 27, "香杨路青年桥"));
		list.add(new BusPort(123.35158,  41.663621, 28, "大润发苏家屯店"));
		list.add(new BusPort(123.343862, 41.666065, 29, "枫杨路青年桥"));
		list.add(new BusPort(123.335773, 41.664678, 30, "苏家屯工商局"));
		list.add(new BusPort(123.335791, 41.657435, 31, "丁香街沙柳路"));
		list.add(new BusPort(123.33665,  41.654492, 32, "碧桂园凤凰城"));
	}
	
	public static int[] getLonglongitudelatitudeGridByIndex(int index) {
		int[] resu = new int[2];
		for(int i = 0;i < list.size();i ++) {
			if(list.get(i).getIndex() == index) {
				resu = util.GridToLatt.getGrid(list.get(i).getLongtitude(), list.get(i).getLatitude());
			}
		}
		return resu;
	}
}