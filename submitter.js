submit=function(){
	var u=document.location.href;
	var email=gid('emailaddress');
	var data=[];
	data.push('emailaddress='+encodeHTML(email));
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