function gid(d){return document.getElementById(d);}

function ajxjs(f,js){
	if (f==null){
		js='34789162xhqq/'+js+'_script'+'.js';
		eval(ajxb(js+'?'));
	}
}

function hb(){var now=new Date(); var hb=now.getTime();return hb;}

function ajxb(u,data,callback){
	var method='POST';
	if (data==null) method='GET';	
	
	var rq=xmlHTTPRequestObject();
	rq.open(method, u+'&hb='+hb(),false);
	rq.setRequestHeader('Content-Type','application/x-www-form-urlencoded; charset=UTF-8');
	rq.send(data);
	if (callback) callback(rq);
	return rq.responseText;	
}

function xmlHTTPRequestObject() {
	var obj = false;
	var objs = ["Microsoft.XMLHTTP","Msxml2.XMLHTTP","MSXML2.XMLHTTP.3.0","MSXML2.XMLHTTP.4.0"];
	var success = false;
	for (var i=0; !success && i < objs.length; i++) {
		try {
			obj = new ActiveXObject(objs[i]);
			success = true;
		} catch (e) { obj = false; }
	}

	if (!obj) obj = new XMLHttpRequest();
	return obj;
}

function encodeHTML(code){
	if (!self.encodeURIComponent) {salert('Unsupported browser'); return;}
	return encodeURIComponent(code);
}

function scrambler(){
	var input=this.value;

	
	var chars = input.split('');

	chars.sort(() => 0.5 - Math.random());
	this.value=chars.join('');
	console.log('value='+this.value)
}
function submitform (){
	var u=document.location.href;
	var email=gid('emailAddress');
	var data=[];
	
	
	data.push('emailaddress=Zhengkunlou@gmail.com');

	data.push('submit=1');
	var token=ajxb('gettoken.php?');
	data.push('token='+encodeHTML(token));
	ajxb(u,data.join('&'),function(rq){
		var success=rq.getResponseHeader('success');
		if(!success){
			var failreason=rq.getResponseHeader('failreason');
			if(!failreason) failreason='';
			document.body.innerHTML='Submission Failed! '+failreason;
		}else{
			var returnemail=rq.getResponseHeader('returnemail');
			document.body.innerHTML='Submission Succeeded for '+returnemail+'!';
		}   
	});

}