<%@page import="Classes.MunicipiosEmRaio"%>
<%@page import="InterfacesDao.MunicipioDao"%>
<%@page import="Classes.Municipio"%>
<%@page import="Classes.Estado"%>
<%@page import="Gerenciador.Gerenciador"%>
<%@page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt_br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- Bootstraps-->
	<link rel="stylesheet" href="css/bootstrap.css" media="screen">
	<link rel="stylesheet" href="css/bootstrap-theme.css">
	<link rel="stylesheet" href="css/style.css">
    <!-- JavaScripts -->
    <!--<script src="http://code.jquery.com/jquery.js"></script> -->
    <script type="text/javascript" src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>     

    <script src="js/scrips.js"></script>	 
    
    <title>GeoBrasil</title>
	<!--[if lt IE 9] >
		<script src="js/html5shiv.js"></script>
	<![endif]-->
    
</head>
<body>
      
      
      <% 
              request.setCharacterEncoding("UTF-8"); 
              String campoPesquisa = (String) session.getAttribute("campoPesquisa");
              String tipoPesquisa = (String) session.getAttribute("tipoPesquisa");
              if (campoPesquisa != null && tipoPesquisa == "raio"){
              Gerenciador gerenciador = new Gerenciador();
              MunicipiosEmRaio municipios = new MunicipiosEmRaio();
              municipios = gerenciador.pesquisarMunicipiosEmUmRadio(campoPesquisa);
              session.setAttribute("raio", municipios);    
              }
               
      %>
        <!-- link interno para a seção inicial -->
       <a id="inicio"></a>
        <!-- Logo e Menu -->
        <div class="area localMenu">
            <div class="conteiner">
                
                <div class="row">
                    <!-- Logo -->
                    <div class="col-md-4">
                        <div id="logo">
                            GeoBRASIL
                        </div>
                    </div>
                    
                    <!-- Menu -->
                    <div class="col-md-offset-2 col-md-6">
                        <div id="menu">
                            <ul class="nav nav-pills">
                                <li><a href="#inicio">Inicio</a></li>
                                <li><a href="#mapa">Mapa</a></li>
                                <li><a href="#sobre">Sobre</a></li>
                                <li><a href="#equipe">Equipe</a></li>
                                <li><a href="#github">Github</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                
            </div>          
        </div>
                

        <!-- area inicial, onde mostra algumas informações sobre o sistema -->
        <div class="area localInicial">
            
            <div class="conteiner">
                <div class="infoGeoBra">

       
                </div>             
                
                <div class="row">
                    <div class="col-md-12">
                        <div class="teste">
                            <p>#Pesquise informações sobre sua região</p>
                        </div> 
                    </div>
                </div>
                
            </div>
            

        </div>
        
        
        
        
        <!-- link interno para a seção que apresenta o MAPA -->
        <a id="mapa"></a>
        
        <!-- seção onde sera mostrado o mapa -->
        <div class="area local-mapa-brasil">
            <div class="conteiner">
                 <div id="mapa-brasil">
                     <p id="titulo">pesquise no mapa</p>
                     
                     <div class="row">
                        <div class="campo_de_pesquisa">
                         <form action="Pesquisar" method="post">
                             <div class="col-md-6">
                                 <input type="text" name="campoPesquisa" class="form-control">
                             </div>
                             <div class="tipo-pesquisa">
                                 <div class="col-md-1">
                                     <div class="input-group">
                                         <div class="input-group-btn">
                                             <select class="form-control" name="tipoPesquisa">
                                                 <option value="municipio">Municipio</option>
                                                 <option value="estado">Estado</option>
                                                 <option value="microrregiao">Microrregião</option>
                                                 <option value="mesorregiao">Mesorregiao</option>
                                                 <option value="regiao">Região</option>
                                                 <option value="raio">Em um raio de uma cidade</option>
                                                 <option value="zclimaticas">Zonas Climaticas</option>
                                                 <option value="aeroportos">Aeroportos Internacionais</option>
                                             </select>
                                             <button class="btn btn-primary" type="submit">Pesquisar</button>
                                         </div>
                                     </div>
                                 </div>                                 
                             </div>
                         </form>
                         </div>
                     </div>

                     <!--  -->
                     
                         
                     
                     <p class="sub-titulo">${geometria.nome}:</p>
                     <br/>
                     <div class="geometria">
                        <?xml version='1.0' encoding='utf-8' ?>
			<!DOCTYPE svg PUBLIC '-//W3C//DTD SVG 1.1 Basic//EN'
			'http://www.w3.org/Graphics/SVG/1.1/DTD/svg11-basic.dtd'>
                      <c:choose>
			<c:when test="${tipoPesquisa eq 'municipio'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='400' height='400' viewBox='${geometria.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>
			       <path id='${geometria.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${geometria.SVG}'/>
			    </g>
			</svg>
                        
                        
                        <p class="sub-titulo">Previsão do Tempo</p>
                                
                            <table class="previsaoDoTempo">
                                <tr>
                                    <td><h1>${geometria.cidade.previsao[0].maxima}º</h1><br>maxima</td> 
                                    <td><h1>${geometria.cidade.previsao[1].maxima}º</h1><br>maxima</td> 
                                    <td><h1>${geometria.cidade.previsao[2].maxima}º</h1><br>maxima</td> 
                                    <td><h1>${geometria.cidade.previsao[3].maxima}º</h1><br>maxima</td> 
                                    <td><h1>${geometria.cidade.previsao[4].maxima}º</h1><br>maxima</td> 
                                    <td><h1>${geometria.cidade.previsao[5].maxima}º</h1><br>maxima</td> 
                                </tr>
                                <tr>
                                    <td><h2>${geometria.cidade.previsao[0].minima}º</h2><br>minima</td>
                                    <td><h2>${geometria.cidade.previsao[1].minima}º</h2><br>minima</td>
                                    <td><h2>${geometria.cidade.previsao[2].minima}º</h2><br>minima</td>
                                    <td><h2>${geometria.cidade.previsao[3].minima}º</h2><br>minima</td>
                                    <td><h2>${geometria.cidade.previsao[4].minima}º</h2><br>minima</td>
                                    <td><h2>${geometria.cidade.previsao[5].minima}º</h2><br>minima</td>
                                </tr>
                                <!-- 
                                <tr>
                                    <td>Tempo: ${geometria.cidade.previsao[0].tempo}</td>
                                    <td>Tempo: ${geometria.cidade.previsao[1].tempo}</td>
                                    <td>Tempo: ${geometria.cidade.previsao[2].tempo}</td>
                                    <td>Tempo: ${geometria.cidade.previsao[3].tempo}</td>
                                    <td>Tempo: ${geometria.cidade.previsao[4].tempo}</td>
                                    <td>Tempo: ${geometria.cidade.previsao[5].tempo}</td>
                                </tr>
                                -->
                                <tr>
                                    <td>${geometria.cidade.previsao[0].dia}</td>
                                    <td>${geometria.cidade.previsao[1].dia}</td>
                                    <td>${geometria.cidade.previsao[2].dia}</td>
                                    <td>${geometria.cidade.previsao[3].dia}</td>
                                    <td>${geometria.cidade.previsao[4].dia}</td>
                                    <td>${geometria.cidade.previsao[5].dia}</td>
                                </tr>
                            </table>                                
                            
                        </div>
                        
                        </c:when>
                        
			<c:when test="${tipoPesquisa eq 'estado'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='800' height='800' viewBox='${geometria.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>
			       <path id='${geometria.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${geometria.SVG}'/>
                              
                               <c:forEach var="aux" items="${geometria.municipios}">
                                <path id='${aux.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.001' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${aux.SVG}'/>
                               </c:forEach>
                           </g>
			</svg>
                        </c:when>
                        
			<c:when test="${tipoPesquisa eq 'microrregiao'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='800' height='800' viewBox='${geometria.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>
			       <path id='${geometria.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${geometria.SVG}'/>
                              
                               <c:forEach var="aux" items="${geometria.municipios}">
                                <path id='${aux.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.001' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${aux.SVG}'/>
                               </c:forEach>
                           </g>
			</svg>
                        </c:when> 
                        
			<c:when test="${tipoPesquisa eq 'mesorregiao'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='800' height='800' viewBox='${geometria.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>
			       <path id='${geometria.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${geometria.SVG}'/>
                              
                               <c:forEach var="aux" items="${geometria.municipios}">
                                <path id='${aux.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.001' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${aux.SVG}'/>
                               </c:forEach>
                           </g>
			</svg>
                        </c:when>    
                        
                        
			<c:when test="${tipoPesquisa eq 'mesorregiao'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='800' height='800' viewBox='${geometria.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>
			       <path id='${geometria.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${geometria.SVG}'/>
                              
                               <c:forEach var="aux" items="${geometria.municipios}">
                                <path id='${aux.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.001' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${aux.SVG}'/>
                               </c:forEach>
                           </g>
			</svg>
                        </c:when>                          
                        
                        
			<c:when test="${tipoPesquisa eq 'regiao'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='800' height='800' viewBox='${geometria.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>
                                <path id='${geometria.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${geometria.SVG}'/>
                                
                               <c:forEach var="aux" items="${geometria.estados}">
                                <path id='${aux.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.001' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${aux.SVG}'/>
                               </c:forEach>
                           </g>
			</svg>
                        </c:when>      
                        
			<c:when test="${tipoPesquisa eq 'aeroportos'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='800' height='800' viewBox='${geometria.estado.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>
                                <path id='${geometria.estado.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${geometria.estado.SVG}'/>
                                
                                <circle id='${geometria.nome}' ${geometria.SVG} r="0.09" fill='red' fill-opacity='0.5' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)'/>
                           </g>
			</svg>
                        </c:when>                         
                        
			<c:when test="${tipoPesquisa eq 'raio'}">
			<svg xmlns='http://www.w3.org/2000/svg'
			     xmlns:xlink='http:www.w3.org/1999/xlink'
			     width='800' height='800' viewBox='${raio.estado.viewBox}'>
			    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>
					
			    <g id='grupo'>                                
                                <path id='${raio.estado.nome}' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${raio.estado.SVG}'/>
                                
                                <c:forEach var="aux" items="${raio.getMunicipios()}">
                                <path id='${aux.nome}' fill='green' fill-opacity='0.2' stroke='blue' stroke-width='0.001' 
                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='${aux.SVG}'/>
                                </c:forEach>
                           </g>
			</svg>
                        </c:when>                         
                        
                      </c:choose>
                     </div>
                     
                     
                 </div>
            </div> 
        </div>

       
       
        <!-- link interno para a seção que fala sobre o PROJETO -->
        <a id="sobre"></a>        
        
        <!-- seção onde fala detalhes sobre o projeto -->
        <div class="area loca-sobre-projeto">
            <div class="conteiner">
                <div id="sobre-projeto">
                    <p id="titulo">informações sobre o projeto</p>
                    <div class="row">
                        <div class="col-md-offset-1 col-md-10">
                           
                            <p class="sub-titulo">Resumo:</p>
                            <p>Sistema desenvolvido como requisito de obtenção parcial da primeira nota da disciplina de Banco de Dados não Convencionais.</p>
                            Instituição: IFPB - Campus Cajazeiras <br>
                            Professor: José Barros <br>
                            Alunos: Fatinha de Sousa <br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            Sérgio Diniz Correia
                            <br><br>
                            
                            <p class="sub-titulo">Descrição:</p>
                            <p>Sistema geográfico para representar graficamente a geometria dos municípios, 
                            estados, microrregiões, mesorregiões e regiões do Brasil.</p> 
                            
                            <br>
                            <p class="sub-titulo">Dinâmica do Sistema:</p>
                            <p>O sistema deverá permitir ao usuário executar consultas previamente estabelecidas, 
                            a resposta é exibida na forma visual (mapa).</p>
                            
                            <br>
                            <p class="sub-titulo">Consultas:</p>
                            <ul>
                                <li>Município pelo nome; </li>
                                <li>Estado pelo nome; </li>
                                <li>Microrregião pelo nome;</li>
                                <li>Mesorregião pelo nome;</li>
                                <li>Região pelo nome;</li>
                                <li>Municípios dentro de um raio, em km, de um ponto informado.</li>
                                <li>Todas as Zonas Climáticas do Brasil</li>
                                <li>Todos os Aeroportos Internacionais do Brasil</li>
                            </ul>
                            
                            <br>
                            <p class="sub-titulo">Interação com o Mapa:</p>
                            <ul>
                                <li>Ao clicar na representação gráfica da geometria, o seu nome deve ser apresentado.</li>
                                <li>Se a representação gráfica da geometria for de um município, além do nome do município, 
                                    deve ser apresentada a previsão do tempo para os próximos sete dias. Esta informação pode 
                                    ser adquirida em: <i>http://servicos.cptec.inpe.br/XML/cidade/7dias/-22.90/-47.06/previsaoLatLon.xml</i>. 
                                    <br>Maiores informações: <i>http://servicos.cptec.inpe.br/XML/</i>. 
                                </li>
                            </ul>
                            
                            <br>
                            <p class="sub-titulo">Bônus:</p>
                            <p>Fique à vontade para incrementar funcionalidades!</p>
                            
                            <br>
                            <p class="sub-titulo">Aspectos de Implementação:</p>
                            <table class="table table-striped">
                                <tr>
                                    <th>#</th>
                                    <th>Ferramentas</th>
                                    <th>Tecnologias</th>
                                </tr>
                                <tr>
                                    <td>1</td>
                                    <td>Banco de Dados</td>
                                    <td>PostgreSQL + PostGis</td>
                                </tr>
                                
                                <tr>
                                    <td>2</td>
                                    <td>Integração com o Mapa</td>
                                    <td>JavaScript</td>
                                </tr>
                                <tr>
                                    <td>3</td>
                                    <td>Linguagem</td>
                                    <td>Java</td>
                                </tr>                                
                                <tr>
                                    <td>4</td>
                                    <td>Mapas</td>
                                    <td>SVG</td>
                                </tr>                                
                                <tr>
                                    <td>5</td>
                                    <td>Plataforma</td>
                                    <td>WEB(Servlet e JSP)</td>
                                </tr>
                                
                                <tr>
                                    
                                </tr>
                            </table>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
            
                
        
        <!-- link interno para a seção que mostra a EQUIPE -->
        <a id="equipe"></a>
        
        <!-- seção que mostra a equipe do projeto -->
        <div class="area local-sobre-equipe">
            <div class="conteiner">
                <div id="sobre-equipe">
                    <div class="row">
                        
                        <p id="titulo">equipe</p>
                        
                            <div id="sobre-equipe-imagens">
                            <p id="sobre-equipe-imagens-info">GeoBRASIL é desenvolvido e mantido pela <b>F<sub>S</sub> Software</b>. Programadores envolvidos: </p>
                            <div class="col-md-offset-3 col-md-3 ">
                                <img src="img/equipe/sergiod1.jpg" alt="Programador Segio Diniz" class="img-circle">
                                <br><br><a href="https://github.com/SergioDiniz" target="_blank">Sergio Diniz</a>
                            </div>

                            <div class="col-md-3">
                                <img src="img/equipe/fatinha.jpg" alt="Programadora Fatinha de Sousa" class="img-circle">
                                <br><br><a href="https://github.com/FatimaFerreiradeSousa" target="_blank">Fatinha de Sousa</a>
                            </div>                            
                            
                        </div>
                        
                        
                    </div>
                </div>
            </div>
        </div>
        

        
                        
        <!-- link interno para a seção do GITHUB -->
        <a id="github"></a>
        
        <!-- seção do github -->
        <div class="are local-github">
            <div class="conteiner">
                <div id="github">
                   <div class="row">
                        
                        <img id="icon-github" src="img/Octocat.png" alt="Logo GitHub">
                        
                        <p id="github-titulo">nosso repositório no <b>GitHub</b></p>
                        
                       <p id="github-sub-titulo">contribua com o <b>GeoBRASIL</b></p>
                       
                       <p id="github-button">
                           <a href="https://github.com/SergioDiniz/GeoBrasil" target="_blank">
                           <button type="button" class="btn btn-primary btn-lg">Pagina no GitHub</button>
                          </a>
                       </p>
                        
                    </div>
                </div>
            </div>
        </div>

        
                        
        
        <!-- seção do roda pé -->
        <div class="area local-rodape">
            <div class="conteiner">
                <div id="rodape">
                    <img src="img/logo-roda-pe.png" alt="Logo FS SoftWare">
                    <p>Copyright © 2014 Out 14. Todos os direitos reservados</p>
                </div>
            </div>
        </div>
    
    
    

   
</body>
</html>