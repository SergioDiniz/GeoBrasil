package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import InterfacesDao.MunicipioDao;
import Classes.Municipio;
import Classes.Estado;
import Gerenciador.Gerenciador;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt_br\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<!-- Bootstraps-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\" media=\"screen\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <!-- JavaScripts -->\r\n");
      out.write("    <!--<script src=\"http://code.jquery.com/jquery.js\"></script> -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.js\"></script>     \r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/scrips.js\"></script>\t \r\n");
      out.write("    \r\n");
      out.write("    <title>GeoBrasil</title>\r\n");
      out.write("\t<!--[if lt IE 9] >\r\n");
      out.write("\t\t<script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      ");
 
          request.setAttribute("viewBox", "-38.765374044341 6.02596000671935 3.97167087932262 2.277028389628678");

      
      out.write("\r\n");
      out.write("       \r\n");
      out.write("        <!-- link interno para a seção inicial -->\r\n");
      out.write("       <a id=\"inicio\"></a>\r\n");
      out.write("        <!-- Logo e Menu -->\r\n");
      out.write("        <div class=\"area localMenu\">\r\n");
      out.write("            <div class=\"conteiner\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <!-- Logo -->\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <div id=\"logo\">\r\n");
      out.write("                            GeoBRASIL\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- Menu -->\r\n");
      out.write("                    <div class=\"col-md-offset-2 col-md-6\">\r\n");
      out.write("                        <div id=\"menu\">\r\n");
      out.write("                            <ul class=\"nav nav-pills\">\r\n");
      out.write("                                <li><a href=\"#inicio\">Inicio</a></li>\r\n");
      out.write("                                <li><a href=\"#mapa\">Mapa</a></li>\r\n");
      out.write("                                <li><a href=\"#sobre\">Sobre</a></li>\r\n");
      out.write("                                <li><a href=\"#equipe\">Equipe</a></li>\r\n");
      out.write("                                <li><a href=\"#github\">Github</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>          \r\n");
      out.write("        </div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("        <!-- area inicial, onde mostra algumas informações sobre o sistema -->\r\n");
      out.write("        <div class=\"area localInicial\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"conteiner\">\r\n");
      out.write("                <div class=\"infoGeoBra\">\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("                </div>             \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div class=\"teste\">\r\n");
      out.write("                            <p>#Pesquise informações sobre sua região</p>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- link interno para a seção que apresenta o MAPA -->\r\n");
      out.write("        <a id=\"mapa\"></a>\r\n");
      out.write("        \r\n");
      out.write("        <!-- seção onde sera mostrado o mapa -->\r\n");
      out.write("        <div class=\"area local-mapa-brasil\">\r\n");
      out.write("            <div class=\"conteiner\">\r\n");
      out.write("                 <div id=\"mapa-brasil\">\r\n");
      out.write("                     <p id=\"titulo\">pesquise no mapa</p>\r\n");
      out.write("                     \r\n");
      out.write("                     <div class=\"row\">\r\n");
      out.write("                        <div class=\"campo_de_pesquisa\">\r\n");
      out.write("                         <form action=\"Pesquisar\" method=\"post\">\r\n");
      out.write("                             <div class=\"col-md-6\">\r\n");
      out.write("                                 <input type=\"text\" name=\"campoPesquisa\" class=\"form-control\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                             <div class=\"tipo-pesquisa\">\r\n");
      out.write("                                 <div class=\"col-md-1\">\r\n");
      out.write("                                     <div class=\"input-group\">\r\n");
      out.write("                                         <div class=\"input-group-btn\">\r\n");
      out.write("                                             <select class=\"form-control\" name=\"tipoPesquisa\">\r\n");
      out.write("                                                 <option value=\"municipio\">Municipio</option>\r\n");
      out.write("                                                 <option value=\"estado\">Estado</option>\r\n");
      out.write("                                                 <option value=\"microrregiao\">Microrregião</option>\r\n");
      out.write("                                                 <option value=\"mesorregiao\">Mesorregiao</option>\r\n");
      out.write("                                                 <option value=\"raio\">Em um raio de uma cidade</option>\r\n");
      out.write("                                                 <option value=\"zclimaticas\">Zonas Climaticas</option>\r\n");
      out.write("                                                 <option value=\"aeroportos\">Aeroportos Internacionais</option>\r\n");
      out.write("                                             </select>\r\n");
      out.write("                                             <button class=\"btn btn-primary\" type=\"submit\">Pesquisar</button>\r\n");
      out.write("                                         </div>\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                 </div>                                 \r\n");
      out.write("                             </div>\r\n");
      out.write("                         </form>\r\n");
      out.write("                         </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("\r\n");
      out.write("                     <!--  -->\r\n");
      out.write("                     \r\n");
      out.write("                         \r\n");
      out.write("                     \r\n");
      out.write("                     <p class=\"sub-titulo\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(":</p>\r\n");
      out.write("                     <br/>\r\n");
      out.write("                     <div class=\"geometria\">\r\n");
      out.write("                        <?xml version='1.0' encoding='utf-8' ?>\r\n");
      out.write("\t\t\t<!DOCTYPE svg PUBLIC '-//W3C//DTD SVG 1.1 Basic//EN'\r\n");
      out.write("\t\t\t'http://www.w3.org/Graphics/SVG/1.1/DTD/svg11-basic.dtd'>\r\n");
      out.write("                      ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                     </div>\r\n");
      out.write("                     \r\n");
      out.write("                     \r\n");
      out.write("                 </div>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("        <!-- link interno para a seção que fala sobre o PROJETO -->\r\n");
      out.write("        <a id=\"sobre\"></a>        \r\n");
      out.write("        \r\n");
      out.write("        <!-- seção onde fala detalhes sobre o projeto -->\r\n");
      out.write("        <div class=\"area loca-sobre-projeto\">\r\n");
      out.write("            <div class=\"conteiner\">\r\n");
      out.write("                <div id=\"sobre-projeto\">\r\n");
      out.write("                    <p id=\"titulo\">informações sobre o projeto</p>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-offset-1 col-md-10\">\r\n");
      out.write("                           \r\n");
      out.write("                            <p class=\"sub-titulo\">Resumo:</p>\r\n");
      out.write("                            <p>Sistema desenvolvido como requisito de obtenção parcial da primeira nota da disciplina de Banco de Dados não Convencionais.</p>\r\n");
      out.write("                            Instituição: IFPB - Campus Cajazeiras <br>\r\n");
      out.write("                            Professor: José Barros <br>\r\n");
      out.write("                            Alunos: Fatinha de Sousa <br>\r\n");
      out.write("                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                            Sérgio Diniz Correia\r\n");
      out.write("                            <br><br>\r\n");
      out.write("                            \r\n");
      out.write("                            <p class=\"sub-titulo\">Descrição:</p>\r\n");
      out.write("                            <p>Sistema geográfico para representar graficamente a geometria dos municípios, \r\n");
      out.write("                            estados, microrregiões, mesorregiões e regiões do Brasil.</p> \r\n");
      out.write("                            \r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p class=\"sub-titulo\">Dinâmica do Sistema:</p>\r\n");
      out.write("                            <p>O sistema deverá permitir ao usuário executar consultas previamente estabelecidas, \r\n");
      out.write("                            a resposta é exibida na forma visual (mapa).</p>\r\n");
      out.write("                            \r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p class=\"sub-titulo\">Consultas:</p>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>Município pelo nome; </li>\r\n");
      out.write("                                <li>Estado pelo nome; </li>\r\n");
      out.write("                                <li>Microrregião pelo nome;</li>\r\n");
      out.write("                                <li>Mesorregião pelo nome;</li>\r\n");
      out.write("                                <li>Região pelo nome;</li>\r\n");
      out.write("                                <li>Municípios dentro de um raio, em km, de um ponto informado.</li>\r\n");
      out.write("                                <li>Todas as Zonas Climáticas do Brasil</li>\r\n");
      out.write("                                <li>Todos os Aeroportos Internacionais do Brasil</li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            \r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p class=\"sub-titulo\">Interação com o Mapa:</p>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li>Ao clicar na representação gráfica da geometria, o seu nome deve ser apresentado.</li>\r\n");
      out.write("                                <li>Se a representação gráfica da geometria for de um município, além do nome do município, \r\n");
      out.write("                                    deve ser apresentada a previsão do tempo para os próximos sete dias. Esta informação pode \r\n");
      out.write("                                    ser adquirida em: <i>http://servicos.cptec.inpe.br/XML/cidade/7dias/-22.90/-47.06/previsaoLatLon.xml</i>. \r\n");
      out.write("                                    <br>Maiores informações: <i>http://servicos.cptec.inpe.br/XML/</i>. \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            \r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p class=\"sub-titulo\">Bônus:</p>\r\n");
      out.write("                            <p>Fique à vontade para incrementar funcionalidades!</p>\r\n");
      out.write("                            \r\n");
      out.write("                            <br>\r\n");
      out.write("                            <p class=\"sub-titulo\">Aspectos de Implementação:</p>\r\n");
      out.write("                            <table class=\"table table-striped\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>#</th>\r\n");
      out.write("                                    <th>Ferramentas</th>\r\n");
      out.write("                                    <th>Tecnologias</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>1</td>\r\n");
      out.write("                                    <td>Banco de Dados</td>\r\n");
      out.write("                                    <td>PostgreSQL + PostGis</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>2</td>\r\n");
      out.write("                                    <td>Integração com o Mapa</td>\r\n");
      out.write("                                    <td>JavaScript</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>3</td>\r\n");
      out.write("                                    <td>Linguagem</td>\r\n");
      out.write("                                    <td>Java</td>\r\n");
      out.write("                                </tr>                                \r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>4</td>\r\n");
      out.write("                                    <td>Mapas</td>\r\n");
      out.write("                                    <td>SVG</td>\r\n");
      out.write("                                </tr>                                \r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td>5</td>\r\n");
      out.write("                                    <td>Plataforma</td>\r\n");
      out.write("                                    <td>WEB(Servlet e JSP)</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                \r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    \r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("        \r\n");
      out.write("        <!-- link interno para a seção que mostra a EQUIPE -->\r\n");
      out.write("        <a id=\"equipe\"></a>\r\n");
      out.write("        \r\n");
      out.write("        <!-- seção que mostra a equipe do projeto -->\r\n");
      out.write("        <div class=\"area local-sobre-equipe\">\r\n");
      out.write("            <div class=\"conteiner\">\r\n");
      out.write("                <div id=\"sobre-equipe\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        \r\n");
      out.write("                        <p id=\"titulo\">equipe</p>\r\n");
      out.write("                        \r\n");
      out.write("                            <div id=\"sobre-equipe-imagens\">\r\n");
      out.write("                            <p id=\"sobre-equipe-imagens-info\">GeoBRASIL é desenvolvido e mantido pela <b>F<sub>S</sub> Software</b>. Programadores envolvidos: </p>\r\n");
      out.write("                            <div class=\"col-md-offset-3 col-md-3 \">\r\n");
      out.write("                                <img src=\"img/equipe/sergiod1.jpg\" alt=\"Programador Segio Diniz\" class=\"img-circle\">\r\n");
      out.write("                                <br><br><a href=\"https://github.com/SergioDiniz\" target=\"_blank\">Sergio Diniz</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-md-3\">\r\n");
      out.write("                                <img src=\"img/equipe/fatinha.jpg\" alt=\"Programadora Fatinha de Sousa\" class=\"img-circle\">\r\n");
      out.write("                                <br><br><a href=\"https://github.com/FatimaFerreiradeSousa\" target=\"_blank\">Fatinha de Sousa</a>\r\n");
      out.write("                            </div>                            \r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("                        \r\n");
      out.write("        <!-- link interno para a seção do GITHUB -->\r\n");
      out.write("        <a id=\"github\"></a>\r\n");
      out.write("        \r\n");
      out.write("        <!-- seção do github -->\r\n");
      out.write("        <div class=\"are local-github\">\r\n");
      out.write("            <div class=\"conteiner\">\r\n");
      out.write("                <div id=\"github\">\r\n");
      out.write("                   <div class=\"row\">\r\n");
      out.write("                        \r\n");
      out.write("                        <img id=\"icon-github\" src=\"img/Octocat.png\" alt=\"Logo GitHub\">\r\n");
      out.write("                        \r\n");
      out.write("                        <p id=\"github-titulo\">nosso repositório no <b>GitHub</b></p>\r\n");
      out.write("                        \r\n");
      out.write("                       <p id=\"github-sub-titulo\">contribua com o <b>GeoBRASIL</b></p>\r\n");
      out.write("                       \r\n");
      out.write("                       <p id=\"github-button\">\r\n");
      out.write("                           <a href=\"https://github.com/SergioDiniz/GeoBrasil\" target=\"_blank\">\r\n");
      out.write("                           <button type=\"button\" class=\"btn btn-primary btn-lg\">Pagina no GitHub</button>\r\n");
      out.write("                          </a>\r\n");
      out.write("                       </p>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("                        \r\n");
      out.write("        \r\n");
      out.write("        <!-- seção do roda pé -->\r\n");
      out.write("        <div class=\"area local-rodape\">\r\n");
      out.write("            <div class=\"conteiner\">\r\n");
      out.write("                <div id=\"rodape\">\r\n");
      out.write("                    <img src=\"img/logo-roda-pe.png\" alt=\"Logo FS SoftWare\">\r\n");
      out.write("                    <p>Copyright © 2014 Out 14. Todos os direitos reservados</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                        \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("    \r\n");
        out.write("                        \r\n");
        out.write("                        \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("      \r\n");
        out.write("                        \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("                         \r\n");
        out.write("                        \r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("                         \r\n");
        out.write("                        \r\n");
        out.write("                      ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoPesquisa eq 'municipio'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<svg xmlns='http://www.w3.org/2000/svg'\r\n");
        out.write("\t\t\t     xmlns:xlink='http:www.w3.org/1999/xlink'\r\n");
        out.write("\t\t\t     width='400' height='400' viewBox='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.viewBox}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\t\t\t    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t    <g id='grupo'>\r\n");
        out.write("\t\t\t       <path id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\r\n");
        out.write("\t\t\t    </g>\r\n");
        out.write("\t\t\t</svg>\r\n");
        out.write("                        \r\n");
        out.write("                        \r\n");
        out.write("                        <p class=\"sub-titulo\">Previsão do Tempo</p>\r\n");
        out.write("                                \r\n");
        out.write("                            <table class=\"previsaoDoTempo\">\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <td><h1>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[0].maxima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h1><br>maxima</td> \r\n");
        out.write("                                    <td><h1>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[1].maxima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h1><br>maxima</td> \r\n");
        out.write("                                    <td><h1>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[2].maxima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h1><br>maxima</td> \r\n");
        out.write("                                    <td><h1>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[3].maxima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h1><br>maxima</td> \r\n");
        out.write("                                    <td><h1>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[4].maxima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h1><br>maxima</td> \r\n");
        out.write("                                    <td><h1>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[5].maxima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h1><br>maxima</td> \r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <td><h2>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[0].minima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h2><br>minima</td>\r\n");
        out.write("                                    <td><h2>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[1].minima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h2><br>minima</td>\r\n");
        out.write("                                    <td><h2>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[2].minima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h2><br>minima</td>\r\n");
        out.write("                                    <td><h2>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[3].minima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h2><br>minima</td>\r\n");
        out.write("                                    <td><h2>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[4].minima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h2><br>minima</td>\r\n");
        out.write("                                    <td><h2>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[5].minima}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("º</h2><br>minima</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                <!-- \r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <td>Tempo: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[0].tempo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>Tempo: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[1].tempo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>Tempo: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[2].tempo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>Tempo: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[3].tempo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>Tempo: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[4].tempo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>Tempo: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[5].tempo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                                -->\r\n");
        out.write("                                <tr>\r\n");
        out.write("                                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[0].dia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[1].dia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[2].dia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[3].dia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[4].dia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                    <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.cidade.previsao[5].dia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\r\n");
        out.write("                                </tr>\r\n");
        out.write("                            </table>                                \r\n");
        out.write("                            \r\n");
        out.write("                        </div>\r\n");
        out.write("                        \r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoPesquisa eq 'estado'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<svg xmlns='http://www.w3.org/2000/svg'\r\n");
        out.write("\t\t\t     xmlns:xlink='http:www.w3.org/1999/xlink'\r\n");
        out.write("\t\t\t     width='800' height='800' viewBox='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.viewBox}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\t\t\t    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t    <g id='grupo'>\r\n");
        out.write("\t\t\t       <path id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\r\n");
        out.write("                              \r\n");
        out.write("                               ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                           </g>\r\n");
        out.write("\t\t\t</svg>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_0.setVar("aux");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.municipios}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <path id='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aux.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
          out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aux.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'/>\r\n");
          out.write("                               ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoPesquisa eq 'microrregiao'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<svg xmlns='http://www.w3.org/2000/svg'\r\n");
        out.write("\t\t\t     xmlns:xlink='http:www.w3.org/1999/xlink'\r\n");
        out.write("\t\t\t     width='800' height='800' viewBox='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.viewBox}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\t\t\t    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t    <g id='grupo'>\r\n");
        out.write("\t\t\t       <path id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\r\n");
        out.write("                              \r\n");
        out.write("                               ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                           </g>\r\n");
        out.write("\t\t\t</svg>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_1.setVar("aux");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.municipios}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <path id='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aux.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
          out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aux.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'/>\r\n");
          out.write("                               ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoPesquisa eq 'mesorregiao'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<svg xmlns='http://www.w3.org/2000/svg'\r\n");
        out.write("\t\t\t     xmlns:xlink='http:www.w3.org/1999/xlink'\r\n");
        out.write("\t\t\t     width='800' height='800' viewBox='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.viewBox}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\t\t\t    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t    <g id='grupo'>\r\n");
        out.write("\t\t\t       <path id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\r\n");
        out.write("                              \r\n");
        out.write("                               ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                           </g>\r\n");
        out.write("\t\t\t</svg>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_forEach_2.setVar("aux");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.municipios}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <path id='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aux.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
          out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${aux.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'/>\r\n");
          out.write("                               ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoPesquisa eq 'zclimaticas'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<svg xmlns='http://www.w3.org/2000/svg'\r\n");
        out.write("\t\t\t     xmlns:xlink='http:www.w3.org/1999/xlink'\r\n");
        out.write("\t\t\t     width='800' height='800' viewBox='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.pais.viewBox}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\t\t\t    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t    <g id='grupo'>\r\n");
        out.write("                                <path id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.pais.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.pais.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\r\n");
        out.write("                                \r\n");
        out.write("\t\t\t       <path id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\r\n");
        out.write("                           </g>\r\n");
        out.write("\t\t\t</svg>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoPesquisa eq 'aeroportos'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<svg xmlns='http://www.w3.org/2000/svg'\r\n");
        out.write("\t\t\t     xmlns:xlink='http:www.w3.org/1999/xlink'\r\n");
        out.write("\t\t\t     width='800' height='800' viewBox='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.estado.viewBox}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'>\r\n");
        out.write("\t\t\t    <script type='text/ecmascript' xlink:href='funcoes.js'> </script>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t    <g id='grupo'>\r\n");
        out.write("                                <path id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.estado.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("' fill='green' fill-opacity='0.2' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)' d='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.estado.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("'/>\r\n");
        out.write("                                \r\n");
        out.write("                                <circle id='");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('\'');
        out.write(' ');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria.SVG}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" r=\"0.09\" fill='red' fill-opacity='0.5' stroke='red' stroke-width='0.0002' \r\n");
        out.write("                                onmouseover='Destaca(evt)' onmouseout='Normal(evt)' onclick='Info(evt)'/>\r\n");
        out.write("                           </g>\r\n");
        out.write("\t\t\t</svg>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tipoPesquisa eq 'raio'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                   ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${geometria}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }
}
