
function Destaca(evt){
	evt.target.setAttribute("fill", "red");
}

function Normal(evt){
	evt.target.setAttribute("fill", "yellow");
}

function Info(evt){
	alert(evt.target.getAttribute("id"));
}

function Redireciona(servlet, cidade, nome, estado, nomeEstado){  
  location.href = servlet+"?"+cidade+"="+nome+"="+estado+"="+nomeEstado;  
} 