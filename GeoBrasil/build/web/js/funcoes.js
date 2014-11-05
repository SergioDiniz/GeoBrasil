
function Destaca(evt){
	evt.target.setAttribute("fill", "red");
}

function Normal(evt){
	evt.target.setAttribute("fill", "yellow");
}

function Info(evt){
	alert(evt.target.getAttribute("id"));
}