function showBool() {
	var boolean = true;
	
	x=document.getElementById("demo");  // 找到元素
	x.innerHTML=boolean;    // 改变内容
}

function showNumber() {
	var number = 1.2e-5;
	alert(typeof number);
	x=document.getElementById("demo");  // 找到元素
	x.innerHTML=number;    // 改变内容
}

function showArray() {
	var languages = new Array("cpp", "java", "javaScript");
	
	x=document.getElementById("demo");  // 找到元素
	x.innerHTML=languages;    // 改变内容
}

function showObject() {
	var object = {name:"blabla", age:"25", mood:"sad"};
	
	x=document.getElementById("demo");  // 找到元素
	x.innerHTML=object.name + object;    // 改变内容
}

function showUndefined() {
	var object;
	alert(typeof object);
	
	x=document.getElementById("demo");  // 找到元素
	x.innerHTML=object;    // 改变内容
}

function showStringLength() {
	var myString = "theString";
	
	x=document.getElementById("demo");  // 找到元素
	x.innerHTML=myString + "'s length: " + myString.length;    // 改变内容
}