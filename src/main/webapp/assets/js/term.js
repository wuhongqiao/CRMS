// JavaScript Document

function TodayInfo(start) {    
        var WEEKLEN = 7, // 一周7天  
            WEEKDAYS = ["日", "一", "二", "三", "四", "五", "六"],    
            weekInfo = {"week": null, "day": null}, // 初始化返回信息，默认第null周，星期null    
            oneDay = 24 * 60 * 60 * 1000, // 一天的毫秒时长    
            weekLeave, // 开学当天所在周剩余天数    
            weekStart, // 开学当天start是星期几    
            today, // 今天    
            dateDiff, // 今天与开学当天日期差    
            sDate; //开学之日，日期对象    
//      var rDateStr = /\d{4}[\/-]\d{1,2}[\/-]\d{1,2}/g; // 简单的日期格式校验：2013/12/19    
//      if (!rDateStr.test(start)) {    
//          alert("请使用合法的开学日期！！！");    
//          return weekInfo;    
//      }    
        sDate = new Date(start);    
        weekStart = sDate.getDay();    
        weekStart = weekStart === 0 ? 7 : weekStart; // JS中周日的索引为0，这里转换为7，方便计算    
            
        weekLeave = WEEKLEN - weekStart;    
        today = new Date();    
        weekInfo.day = WEEKDAYS[today.getDay()];   
        today = new Date(today.getFullYear() + "/" + (today.getMonth() + 1) + "/" + today.getDate());    
        dateDiff = today - sDate;      
        dateDiff = parseInt(dateDiff / oneDay);    
        weekInfo.week = Math.ceil((dateDiff - weekLeave) / WEEKLEN) + 1;    
        return weekInfo;    
    }
    
    function openStudyDay(){
    	var openStudyinfo={"mf":null,"sf":null};
     	var today = new Date();
    	var marfirst = new Date(today.getFullYear()+"/"+3+"/"+1);
    	var Sepfirst = new Date(today.getFullYear()+"/"+9+"/"+1);
    	tm =today-marfirst
    	if(tm<0){
    		
    	    Sepfirst = new Date((today.getFullYear()-1)+"/"+9+"/"+1);
    	}
    	marfirst.setDate(leastMonday(marfirst))
    	Sepfirst.setDate(leastMonday(Sepfirst));
    	openStudyinfo.mf = marfirst;
    	openStudyinfo.sf = Sepfirst;
    	return openStudyinfo ;
    }
    function leastMonday(a){
    	return (8-a.getDay())%7+1
    }
    function showTime(){ 
		  var show_day=new Array('星期日','星期一','星期二','星期三','星期四','星期五','星期六'); 
		  var time=new Date(); 
		  var year=time.getFullYear(); 
		  var month=time.getMonth(); 
		  var date=time.getDate(); 
		  var day=time.getDay();  
		  month<10?month='0'+month:month; 
		  month++; 
		  var now_time='当前时间：'+year+'年'+month+'月'+date+'日'+' '+show_day[day]; 
		  return now_time;
	}
    function getweek(){
    	var td1 = TodayInfo(openStudyDay().mf)
    	var td2 = TodayInfo(openStudyDay().sf)
//  	alert(td1.week);
//  	alert(td2.week);
//		day =0 拿上年第二学期
//		day =1 拿最新的第一学期
		var today1 =new Date(); 
		var toYear2  = today1.getFullYear();
    	weekInfo = {"week": null, "day": null,"years":null}
    	if(td1.week==0&&td2.week<0){
    		alert("还未开学拿最新学期3月第一周课表")
    		weekInfo.week =1;
    		weekInfo.day =2;
    		weekInfo.years = toYear2-1;
    		return weekInfo;
    		//当前学年=当前年-1
    		//当前学期=2
    	}
    	if(td1.week>0&&td1.week<=20){
    		weekInfo.week =td1.week;
    		weekInfo.day =2;
    		weekInfo.years = today1.getFullYear()-1;
    		return weekInfo;
    		//当前学年=当前年-1
    		//当前学期=2
    	}
    	if(td1.week>20&&td2.week<=0){
    		alert("还未开学拿最新学期9月第一周课表")
    		weekInfo.week =1;
    		weekInfo.day = 1;
    		weekInfo.years = today1.getFullYear();
    		return weekInfo;
    		//当前学年=当前年
    		//当前学期=1
    	}
    	if(td2.week>0&&td2.week<=20){
    		weekInfo.week =td2.week;
    		weekInfo.day = 1;
    		if(today1.getMonth()<9){
    			weekInfo.years = today1.getFullYear()-1;
    		}else{
    			weekInfo.years = today1.getFullYear();
    		}
    		return weekInfo;
    		//当前学年=当前年
    		//if(当前月<9) 当前学年--
    		//当前学期=2
    	}
    	if(td2.week>20&&td1.week<=0){
    		alert("还未开学拿最新学期3月第一周课表")
    		weekInfo.week =1;
    		weekInfo.day =2; 
    		weekInfo.years = today1.getFullYear()-1;
    		return weekInfo;
    		//当前学年=当前年-1
    		//当前学期=2
    	}
    }