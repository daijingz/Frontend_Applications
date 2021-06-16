
function canMove(size){//判断当前格盘是否还可以移动，实现为遍历格盘，所有格子上下左右的值都与它不同时则不可移动
	for(var i=1;i<=size;i++){
		for(var j=1;j<=size;j++){
			var id ="t"+i+""+j;//检查的格子id
			var idU = "t"+(i-1)+""+j;//它上面，即使是null对象也没事
			var idD = "t"+(i+1)+""+j;
			var idL = "t"+i+""+(j-1);
			var idR = "t"+i+""+(j+1);
            //以下！=null的判断保证边界格子不跨界比较
			if($('#'+idU).html()!=null&&$('#'+idU).html()==$('#'+id).html()){
				console.log(id+" "+idU);
				return true;
			}
			if($('#'+idD).html()!=null&&$('#'+idD).html()==$('#'+id).html()){
				console.log(id+" "+idD);
				return true;
			}
			if($('#'+idL).html()!=null&&$('#'+idL).html()==$('#'+id).html()){
				console.log(id+" "+idL);
				return true;
			}
			if($('#'+idR).html()!=null&&$('#'+idR).html()==$('#'+id).html()){
				console.log(id+" "+idR);
				return true;
			}
		}
	}
	return false;
}
 
function getFontColor(hexStr){//在hexStr背景色吓字体颜色为白还是黑
	if(hexStr.charAt(0) == "#" )
		hexStr = hexStr.substring(1, 7);
	var r = parseInt(hexStr.substring(0, 2), 16);
	var g = parseInt(hexStr.substring(2, 4), 16);
	var b = parseInt(hexStr.substring(4, 6), 16);
	if((r+g+b)/3>190)return "#776e65";
	else return "#ffffff";
}
 
function setColor (num,id) {//设置该id的背景颜色，num为该格子要画的数字
    var colorMap = new Map();
    colorMap.set(0,"#cdc1b4");
    colorMap.set(2,"#eee4da");
    colorMap.set(4,"#ede0c8");
    colorMap.set(8,"#f2b179");
	colorMap.set(16,"#f59563");
	colorMap.set(32,"#f67c5f");
	colorMap.set(64,"#f65e3b");
	colorMap.set(128,"#edcf72");
    colorMap.set(256,"#edcc61");
	colorMap.set(512,"#edc850");
	colorMap.set(1024,"#edc53f");
	colorMap.set(2048,"#edc22e");
	var fontColor = getFontColor(colorMap.get(num));
	document.getElementById(id).style.background = colorMap.get(num);
	if(num!=0){
		document.getElementById(id).style.color=fontColor;
	    document.getElementById(id).innerHTML=num;
	}
}
 
function paintPoint(size,num,val){//画一个随机点，size表示格盘size，4*4时为4，num表示要画的格子数目，val表示要画的格子里面的值
var rad;//Math.random()：得到一个0到1之间的随机数
var ax;
var ay;
for(var i=0;i<num;i++){
do{
	 rad = Math.random();
	 ax = Math.ceil(rad * size);
	 rad = Math.random();
	 ay = Math.ceil(rad * size);
	 var value = document.getElementById("t"+ax+""+ay).innerHTML;
}while(value!='');
setColor(val,("t"+ax+""+ay));
}
}
 
function clearOnePoint(i,j){//清除i,j位置的内容
	var id="t"+i+""+j;
	document.getElementById(id).innerHTML="";
	setColor(0,id);
}
 
function clearFrame(size){//清除整个格盘
	for(var i=1;i<=size;i++){
		for(var j=1;j<=size;j++){
			clearOnePoint(i,j);
 
		}
	}
	document.getElementById('score').innerHTML=0;
}
 
 
function merge(direct,size){//合并操作
	var change = false;//表明合并过程中格盘是否有变化
	var score = parseInt(document.getElementById("score").innerHTML, 10);
	if(direct==0){//上
		for(var i=1;i<=size-1;i++){
			for(var j=1;j<=size;j++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				var next_id = "t"+(i+1)+j;
				var next_val = document.getElementById(next_id).innerHTML;
				if(value!=''&&next_val!=null&&value==next_val){
					score=score+value*2;
					setColor(parseInt(value,10)*2,id);
				    clearOnePoint(i+1,j);
				    change = true;
				}
				}
			}
	}
	else if(direct==1){//下
		for(var i=size;i>1;i--){
			for(var j=1;j<=size;j++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				var next_id = "t"+(i-1)+j;
				var next_val = document.getElementById(next_id).innerHTML;
				if(value!=''&&next_val!=null&&value==next_val){
					score=score+value*2;
					setColor(parseInt(value,10)*2,id);
				    clearOnePoint(i-1,j);
				    change = true;
				}
				}
			}
	}
	else if(direct==2){//左
		for(var j=1;j<size;j++){
			for(var i=1;i<=size;i++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				var next_id = "t"+i+(j+1);
				var next_val = document.getElementById(next_id).innerHTML;
				if(value!=''&&next_val!=null&&value==next_val){
					score=score+value*2;
					setColor(parseInt(value,10)*2,id);
				    clearOnePoint(i,j+1);
				    change = true;
				}
				}
			}
	}
	else if(direct==3){//右
		for(var j=size;j>1;j--){
			for(var i=1;i<=size;i++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				var next_id = "t"+i+(j-1);
				var next_val = document.getElementById(next_id).innerHTML;
				if(value!=''&&next_val!=null&&value==next_val){
					score=score+value*2;
					setColor(parseInt(value,10)*2,id);
				    clearOnePoint(i,j-1);
				    change = true;
				}
				}
			}
	}
	document.getElementById("score").innerHTML=score;
	return change;
}
 
function move(i,j,direct,size){//i,j格子以direct方向移动直到不能移动为止，采用递归
	//alert("in Move: i="+i+" j="+j+" direct="+direct+" size="+size);
	var change = false;
	if(i==0||j==0||i==size+1||j==size+1)return 0;
	var id ="t"+ i+""+j;
	var value = document.getElementById(id).innerHTML;
	switch (direct) {
		case 0://上
		if(i-1==0)return 0;
			var next_id="t"+(i-1)+""+j;
			var next = document.getElementById(next_id).innerHTML;
			if(next==null||next==''){
				setColor(parseInt(value,10),next_id);
				clearOnePoint(i,j);
				change = true;
				move(i-1,j,0,size);
			}
			break;
		case 1://下
		if(i==size)return 0;
		    var next_id="t"+(i+1)+""+j;
			var next = document.getElementById(next_id).innerHTML;
			if(next==null||next==''){
				setColor(parseInt(value,10),next_id);
				clearOnePoint(i,j);
				move(i+1,j,1,size);
				change = true;
			}
			break;
		case 2://左
		if(j==1)return 0;
		    var next_id="t"+i+""+(j-1);
			var next = document.getElementById(next_id).innerHTML;
			if(next==null||next==''){
				setColor(parseInt(value,10),next_id);
				clearOnePoint(i,j);
				move(i,j-1,2,size);
				change = true;
			}
			break;
		case 3://右
		if(j==size)return 0;
		    var next_id="t"+i+""+(j+1);
			var next = document.getElementById(next_id).innerHTML;
			if(next==null||next==''){
				setColor(parseInt(value,10),next_id);
				clearOnePoint(i,j);
				move(i,j+1,3,size);
				change = true;
			}
			break;
		default:
		  alert("error");break;
	}
	return change;
}
 
function align (direct,size) {//对齐操作
	var change = false;
	if(direct==0){
		for(var i=2;i<=size;i++){
			for(var j=1;j<=size;j++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				if (value!=null&&value!=""){
					var c = move(i,j,direct,size);
					if(c)change = true;
				}
			}
		}
	}
	else if(direct==1){
		for(var i=size-1;i>=1;i--){
			for(var j=1;j<=size;j++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				if (value!=null&&value!=""){
					var c = move(i,j,direct,size);
					if(c)change = true;
				}
			}
		}
	}
	else if(direct==2){
		for(var j=2;j<=size;j++){
			for(var i=1;i<=size;i++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				if (value!=null&&value!=""){
					var c = move(i,j,direct,size);
					if(c)change = true;
				}
			}
		}
	}
	else if(direct==3){
		for(var j=size-1;j>=1;j--){
			for(var i=1;i<=size;i++){
				var id="t"+i+""+j;
				var value = document.getElementById(id).innerHTML;
				if (value!=null&&value!=""){
					var c = move(i,j,direct,size);
					if(c)change = true;
				}
			}
		}
	}
	return change;
}
 
function dealMove(direct,size) {//处理一次移动操作
	var a,b,c;//记录每次移动是否有格子移动
	a=align(direct,size);//对齐
	b=merge(direct,size);//相邻合并
	c=align(direct,size);//对齐
	return(a||b||c);
}